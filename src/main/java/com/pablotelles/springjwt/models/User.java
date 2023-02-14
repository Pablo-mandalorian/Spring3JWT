package com.pablotelles.springjwt.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
@Entity
public class User {
    
    @Id
    @GeneratedValue
    private Long id;
    
    private String username;
    private String firstName;
    private String lastname;
    private Integer age;
    private String email;
    private String password;

}
