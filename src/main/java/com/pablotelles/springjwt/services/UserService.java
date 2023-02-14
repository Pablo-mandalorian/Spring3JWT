package com.pablotelles.springjwt.services;

import com.pablotelles.springjwt.repositorys.UserRepository;

import org.springframework.stereotype.Service;

import com.pablotelles.springjwt.models.User;

import java.util.Optional;

@Service
public class UserService {
    
    private final UserRepository userRepository;

    UserService(final UserRepository userRepository){
        this.userRepository = userRepository;
    }

    public Iterable<User> getUsers(){
        return userRepository.findAll();
    }

    public void getUserById(Long id){
        Optional<User> optionalUser = userRepository.findById(id);

        if(!optionalUser.isPresent()){
            
        }
    }

}
