package com.pablotelles.springjwt.controllers;

import org.springframework.web.bind.annotation.RestController;

//import com.pablotelles.springjwt.models.User;

//import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
//import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.ResponseStatus;

@RestController
@RequestMapping("/api/v1/demo-controller")
public class UserController {

    @GetMapping
    public ResponseEntity<String> sayHello(){
        return ResponseEntity.ok("Hello from safe endpoit");
    }
    
    /* 
    @GetMapping
    public Iterable<User> getUsersIterable() {
        return userService.getUsers();
    }

    @GetMapping("/{id}")
    public User getUser(@PathVariable("id") Long idLong){
        return userService.getUserById(idLong);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createUser(@RequestBody User user){
        userService.addUser(user);
    }

    @PutMapping("/{username}")
    public void updateUser(@PathVariable("username") String username, @RequestParam(required = false) String firstName, @RequestParam(required = false) String lastName, @RequestParam(required = false) Integer age, @RequestParam(required = false) String email, @RequestParam(required = false) String password){
        userService.updateUser(username, firstName, lastName, age, email, password);
    }

    @DeleteMapping("/{username}")
    public void deleteUser(@PathVariable("username") String username){
        userService.deleteUserByUsername(username);
    }       
    */
}
