package edu.aitu.oop3.db.repository;

import edu.aitu.oop3.db.DatabaseConnection;
import edu.aitu.oop3.db.IDB;
import edu.aitu.oop3.db.entity.course;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class CourseRepositoryImpl implements CourseRepository {
    private final IDB db;

    public CourseRepositoryImpl(IDB db) {
        this.db = db;
    }

    @Override
    public course save(course course) {
        String sql = "INSERT INTO courses (title, description, instructor_id, archived) " +
                "VALUES (?, ?, ?, ?) RETURNING id";
        try (Connection conn = db.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {

            ps.setString(1, course.getTitle());
            ps.setString(2, course.getDescription());
            ps.setInt(3, course.getInstructorId());
            ps.setBoolean(4, course.isArchived());

            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                course.setId(rs.getInt(1));  // ← sets auto-generated ID back to object
            }
            return course;
        } catch (SQLException e) {
            throw new RuntimeException("Failed to save course: " + e.getMessage(), e);
        }
    }

    @Override
    public course findById(Integer id) {
        String sql = "SELECT * FROM courses WHERE id = ?";
        try (Connection conn = db.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                course c = new course();
                c.setId(rs.getInt("id"));
                c.setTitle(rs.getString("title"));
                c.setDescription(rs.getString("description"));
                c.setInstructorId(rs.getInt("instructor_id"));
                c.setArchived(rs.getBoolean("archived"));
                return c;
            }
            throw new RuntimeException("Course not found with id: " + id);
        } catch (SQLException e) {
            throw new RuntimeException("Failed to find course", e);
        }
    }

    @Override
    public List<course> findAll() {
        List<course> list = new ArrayList<>();
        String sql = "SELECT * FROM courses ORDER BY id";
        try (Connection conn = db.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                course c = new course();
                c.setId(rs.getInt("id"));
                c.setTitle(rs.getString("title"));
                c.setDescription(rs.getString("description"));
                c.setInstructorId(rs.getInt("instructor_id"));
                c.setArchived(rs.getBoolean("archived"));
                list.add(c);
            }
        } catch (SQLException e) {
            throw new RuntimeException("Failed to list courses", e);
        }
        return list;
    }

    @Override
    public void deleteById(Integer id) {
        String sql = "DELETE FROM courses WHERE id = ?";
        try (Connection conn = db.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, id);
            int rows = ps.executeUpdate();

            if (rows == 0) {
                
                System.out.println("Warning: No course found with id " + id + " to delete.");
                
            }
        } catch (SQLException e) {
            throw new RuntimeException("Failed to delete course: " + e.getMessage(), e);
        }
    }


    @Override
    public List<course> findByInstructorId(int instructorId) {
        List<course> list = new ArrayList<>();
        String sql = "SELECT * FROM courses WHERE instructor_id = ? AND archived = false";
        try (Connection conn = db.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, instructorId);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                course c = new course();
                c.setId(rs.getInt("id"));
                c.setTitle(rs.getString("title"));
                c.setDescription(rs.getString("description"));
                c.setInstructorId(rs.getInt("instructor_id"));
                c.setArchived(rs.getBoolean("archived"));
                list.add(c);
            }
        } catch (SQLException e) {
            throw new RuntimeException("Failed to find courses by instructor", e);
        }
        return list;
    }
}
