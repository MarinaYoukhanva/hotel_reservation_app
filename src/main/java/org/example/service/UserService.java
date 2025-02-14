package org.example.service;

import org.example.base.service.BaseService;
import org.example.entity.User;

public interface UserService  extends BaseService<Long, User> {

    User signup(User user);
    User login(String username, String password);
}
