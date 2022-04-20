package com.benrkia.sample.repository;

import com.benrkia.core.annotation.Component;

import java.util.List;

@Component
public class UserRepository {
  public List<String> findAll () {
    return List.of("id1", "id2");
  }
}
