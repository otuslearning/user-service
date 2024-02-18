package com.example.userservice.service;

import com.example.userservice.api.CreateUserDto;
import com.example.userservice.api.RequestContextService;
import com.example.userservice.api.UpdateUserDto;
import com.example.userservice.api.UserDto;
import com.example.userservice.api.UserService;
import com.example.userservice.converter.UserConvertor;
import com.example.userservice.domain.User;
import com.example.userservice.exception.UserNotFoundException;
import com.example.userservice.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository repository;
    private final UserConvertor convertor;
    private final RequestContextService requestContextService;

    @Override
    public void createUser(CreateUserDto userDto) {
        User user = convertor.convert(userDto);
        user.setAccountGuid(requestContextService.getRequestContext().getAccountGuid());
        repository.save(user);
    }

    @Override
    public UserDto findUserById(Long id) {
        User user = repository.findById(id).orElseThrow(UserNotFoundException::new);
        return convertor.convert(user);
    }

    @Override
    public UserDto getUserByRequestContext() {
        User user = repository.findByAccountGuid(requestContextService.getRequestContext().getAccountGuid())
                .orElseThrow(UserNotFoundException::new);
        return convertor.convert(user);
    }

    @Override
    public void deleteUser(Long id) {
        User user = repository.findById(id).orElseThrow(UserNotFoundException::new);
        repository.delete(user);
    }

    @Override
    public void updateUser(Long id, UpdateUserDto userDto) {
        User user = repository.findById(id).orElseThrow(UserNotFoundException::new);
        convertor.map(userDto, user);
        repository.save(user);
    }

    @Override
    public void updateUser(UpdateUserDto userDto) {
        User user = repository.findByAccountGuid(requestContextService.getRequestContext().getAccountGuid())
                .orElseThrow(UserNotFoundException::new);
        convertor.map(userDto, user);
        repository.save(user);
    }
}
