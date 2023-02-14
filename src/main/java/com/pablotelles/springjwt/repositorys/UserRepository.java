package com.pablotelles.springjwt.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pablotelles.springjwt.models.User;

public interface UserRepository extends JpaRepository<User,Long>{
    
}
