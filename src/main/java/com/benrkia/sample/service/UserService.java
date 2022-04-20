package com.benrkia.sample.service;

import com.benrkia.core.annotation.Component;
import com.benrkia.sample.repository.UserRepository;

import java.util.List;

@Component
public class UserService {
  private final UserRepository userRepository;

  public UserService (UserRepository userRepository) {
    this.userRepository = userRepository;
  }

  public List<String> getUserIds() {
    return userRepository.findAll();
  }
}
