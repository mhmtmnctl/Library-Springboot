package com.library.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.library.repository.UserRepository;

@Service
public class UserService {
@Autowired
private UserRepository userRepository;

}
