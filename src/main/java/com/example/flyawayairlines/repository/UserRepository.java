package com.example.flyawayairlines.repository;

import com.example.flyawayairlines.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
