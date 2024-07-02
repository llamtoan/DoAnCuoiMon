package qlsv.it6.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import qlsv.it6.DTO.UserRegistrationDto;
import qlsv.it6.model.User;

public interface UserService extends UserDetailsService {
	User save(UserRegistrationDto registrationDto);
}