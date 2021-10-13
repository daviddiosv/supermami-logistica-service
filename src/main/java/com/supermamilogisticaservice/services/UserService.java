package com.supermamilogisticaservice.services;

import com.supermamilogisticaservice.models.User;
import com.supermamilogisticaservice.repositories.IUserRepository;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class UserService {
  @Autowired
  private IUserRepository iUserRepository;

  public User saveUser(User user) {
    return iUserRepository.save(user);
  }
}