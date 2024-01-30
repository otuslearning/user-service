package com.example.userservice.api;

public interface UserService {
    void createUser(CreateUserDto userDto);

    UserDto findUserById(Long id);

    void deleteUser(Long id);

    void updateUser(Long id, UpdateUserDto userDto);
}
