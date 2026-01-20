package edu.aitu.oop3.db.repository;

import edu.aitu.oop3.db.entity.user;

public interface UserRepository extends Repository<user, Integer> {
    user findByEmail(String email);
}
