package edu.aitu.oop3.db.usermanagement;

import edu.aitu.oop3.db.repository.Repository;

public interface UserRepository extends Repository<user, Integer> {
    user findByEmail(String email);
}
