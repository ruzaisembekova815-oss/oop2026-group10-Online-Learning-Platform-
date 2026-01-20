package edu.aitu.oop3.db.repository;

import edu.aitu.oop3.db.DatabaseConnection;
import edu.aitu.oop3.db.entity.user;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserRepository {
    public List<user> findAll() {

        List<user> users = new ArrayList<>();

        String sql = "SELECT * FROM users";

        try (Connection con = DatabaseConnection.getConnection();
             Statement st = con.createStatement();
             ResultSet rs = st.executeQuery(sql)) {

            while (rs.next()) {
                user user = new user(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("email"),
                        rs.getString("role")
                );
                users.add(user);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return users;
    }
}
