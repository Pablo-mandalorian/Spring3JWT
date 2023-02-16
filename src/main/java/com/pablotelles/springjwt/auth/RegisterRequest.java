package com.pablotelles.springjwt.auth;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RegisterRequest {


    private String user;
    private String firstName;
    private String lastname;
    private Integer age;
    private String email;
    private String password;

}
