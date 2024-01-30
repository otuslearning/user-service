package com.example.userservice.web;

import com.example.userservice.api.CreateUserDto;
import com.example.userservice.api.UpdateUserDto;
import com.example.userservice.api.UserDto;
import com.example.userservice.api.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/user")
public class UserController {
    private final UserService service;

    @PostMapping
    @ResponseStatus(value = HttpStatus.CREATED)
    public void createUser(@RequestBody CreateUserDto userDto) {
        service.createUser(userDto);
    }

    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public UserDto findUserById(@PathVariable Long id) {
        return service.findUserById(id);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(value = HttpStatus.NO_CONTENT)
    public void deleteUser(@PathVariable Long id) {
        service.deleteUser(id);
    }

    @PutMapping("/{id}")
    public void updateUser(@PathVariable Long id, UpdateUserDto userDto) {
        service.updateUser(id, userDto);
    }
}
