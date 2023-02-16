package com.pablotelles.springjwt.services;

import com.pablotelles.springjwt.repositorys.UserRepository;

//import jakarta.transaction.Transactional;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;
import org.springframework.web.server.ResponseStatusException;

import com.pablotelles.springjwt.models.User;

import java.util.Optional;

@Service
public class UserService {
    
    private final UserRepository userRepository;

    UserService(final UserRepository userRepository){
        this.userRepository = userRepository;
    }

    //Get Users
    public Iterable<User> getUsers(){
        return userRepository.findAll();
    }

    //Get User by his id
    public User getUserById(Long id){
        Optional<User> optionalUser = userRepository.findById(id);

        if(!optionalUser.isPresent()){
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST);
        }

        User user = optionalUser.get();
        return user;
    }

    //Create User
    public User addUser(User user){
        validateUsername(user);
        User newUser = userRepository.save(user);
        return newUser;
    }

    //Validate User
    private void validateUsername(User user){
        validateName(user.getUsername());
        Optional<User> optionalUser = userRepository.findByUsername(user.getUsername());
        if(optionalUser.isPresent()){
            throw new ResponseStatusException(HttpStatus.CONFLICT);
        }
    }

    //Validates if the displayName is empty or not
    private void validateName(String displayName){
        if(ObjectUtils.isEmpty(displayName)){
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST);
        }
    }

    /*
     * 
     
    //Update user
    @Transactional
    public void updateUser(String username, String firstName, String lastName, Integer age, String email, String password){
        Optional<User> optionalUser = userRepository.findByUser(username);

        if(!optionalUser.isPresent()){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }

        User userToUpdate = optionalUser.get();
        if(username!=null){
            userToUpdate.setUser(username);
        }
        if(firstName!=null){
            userToUpdate.setFirstName(firstName);
        }
        if(lastName!=null){
            userToUpdate.setLastname(lastName);
        }
        if(age!=null){
            userToUpdate.setAge(age);
        }
        if(email!=null){
            userToUpdate.setEmail(email);
        }
        if(password!=null){
            userToUpdate.setPassword(password);
        }
    }

    //Delete user by username
    public void deleteUserByUsername(String usernameString){
        Optional<User> optionalUser = userRepository.findByUser(usernameString);
        if(!optionalUser.isPresent()){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
        User userToDelete = optionalUser.get();
        userRepository.delete(userToDelete);
    }

    */
}
