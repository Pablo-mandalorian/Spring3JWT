package com.pablotelles.springjwt.repositorys;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pablotelles.springjwt.models.User;

public interface UserRepository extends JpaRepository<User,Long>{
    Optional<User> findByUsername(String username);
}
