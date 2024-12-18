package com.example.auth_service_api.service;

import com.example.auth_service_api.commons.entities.UserModel;

public interface UserService {
    UserModel getUser(Long userId);
    UserModel updateUser(Long userId, UserModel userRequest);
    void deleteUser(Long userId);
}
