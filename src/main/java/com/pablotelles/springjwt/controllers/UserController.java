package com.pablotelles.springjwt.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.pablotelles.springjwt.models.User;

import java.util.List;
import java.util.ArrayList;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/users")
public class UserController {

    /*
     * $(document).ready(function(){
     *  $('dataTable').DataTable();
     * });
     */
    
    @GetMapping
    public List<User> getUser(@PathVariable Long id) {
        List<User> usuarios = new ArrayList<>();
        User newUser = new User();
        newUser.setId(1L);
        newUser.setUsername("Revan");
        newUser.setFirstName("Kevin");
        newUser.setLastname("Telles");
        newUser.setAge(23);
        newUser.setEmail("PabloTelles@gmail.com");
        newUser.setPassword("spartan");

        User usuario2 = new User();
        newUser.setId(1L);
        newUser.setUsername("Revan");
        newUser.setFirstName("Kevin");
        newUser.setLastname("Telles");
        newUser.setAge(23);
        newUser.setEmail("PabloTelles@gmail.com");
        newUser.setPassword("spartan");

        User usuario3 = new User();
        newUser.setId(1L);
        newUser.setUsername("Revan");
        newUser.setFirstName("Kevin");
        newUser.setLastname("Telles");
        newUser.setAge(23);
        newUser.setEmail("PabloTelles@gmail.com");

        usuarios.add(newUser);
        usuarios.add(usuario2);
        usuarios.add(usuario3);
        return usuarios;
    }

    @DeleteMapping("/{id}")
    public User deleteUser(){
        User newUser = new User();
        newUser.setId(1L);
        newUser.setUsername("Revan");
        newUser.setFirstName("Pablo");
        newUser.setLastname("Telles");
        newUser.setAge(23);
        newUser.setEmail("PabloTelles@gmail.com");
        newUser.setPassword("spartan");
        return newUser;
    }


    

}
