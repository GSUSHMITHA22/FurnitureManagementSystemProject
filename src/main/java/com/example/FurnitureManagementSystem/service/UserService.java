package com.example.FurnitureManagementSystem.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.example.FurnitureManagementSystem.dto.UserRegistrationDto;
import com.example.FurnitureManagementSystem.model.User;

public interface UserService extends UserDetailsService{
	User save(UserRegistrationDto registrationDto);
}
