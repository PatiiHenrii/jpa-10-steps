package com.learning.jpa.jpa10steps.service;

import com.learning.jpa.jpa10steps.entity.User;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long>{
  
}
