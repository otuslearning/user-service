package com.example.userservice.api;

public interface UserService {
    void createUser(CreateUserDto userDto);

    UserDto findUserById(Long id);

    UserDto getUserByRequestContext();

    void deleteUser(Long id);

    void updateUser(Long id, UpdateUserDto userDto);

    void updateUser(UpdateUserDto userDto);
}
