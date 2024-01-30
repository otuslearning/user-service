package com.example.userservice.api;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateUserDto {
    private String username;
    private String firstname;
    private String lastname;
    private String email;
    private String phone;
}
