package com.learning.jpa.jpa10steps;

import com.learning.jpa.jpa10steps.entity.User;
import com.learning.jpa.jpa10steps.service.UserDAOService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


@Component
public class UserDaoServiceCommandLineRunner implements CommandLineRunner{
  
  private static final Logger log = LoggerFactory.getLogger(UserDaoServiceCommandLineRunner.class);

  @Autowired
  private UserDAOService userDAOService;

  @Override
  public void run(String... args0) throws Exception {
    User user = new User("Jack", "Admin");
    long insert = userDAOService.insert(user);
    log.info("New User is created: " + user);
  }
}
