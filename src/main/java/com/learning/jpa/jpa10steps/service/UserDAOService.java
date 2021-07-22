package com.learning.jpa.jpa10steps.service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import com.learning.jpa.jpa10steps.entity.User;

import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class UserDAOService {

  @PersistenceContext
  private EntityManager entityManager;

  public long insert(User user) {
    entityManager.persist(user);
    return user.getId();
  }
}
