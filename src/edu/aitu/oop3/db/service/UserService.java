package edu.aitu.oop3.db.service;

import edu.aitu.oop3.db.entity.user;
import edu.aitu.oop3.db.repository.UserRepository;

import java.util.List;
import java.util.stream.Collectors;

public class UserService {

    private final UserRepository userRepository = new UserRepository();

    public List<user> getAllUsers() {
        return userRepository.findAll();
    }

    public List<user> getUsersByRole(String role) {
        return userRepository.findAll()
                .stream()
                .filter(u -> u.getRole().equalsIgnoreCase(role))
                .collect(Collectors.toList());
    }

    public user getUserById(int id) {
        return userRepository.findAll()
                .stream()
                .filter(u -> u.getId() == id)
                .findFirst()
                .orElse(null);
    }
}
