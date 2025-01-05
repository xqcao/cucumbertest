package com.example01.democomponent.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example01.democomponent.models.User;

public interface UserRepository extends JpaRepository<User, Long> {
}