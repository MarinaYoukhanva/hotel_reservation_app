package org.example.service.impl;

import org.example.base.service.BaseServiceImpl;
import org.example.entity.User;
import org.example.repository.UserRepository;
import org.example.service.UserService;
import org.hibernate.Session;

public class UserServiceImpl extends BaseServiceImpl<Long, User, UserRepository>
        implements UserService {
    public UserServiceImpl(UserRepository repository) {
        super(repository);
    }

    @Override
    public void updateColumns(User entity, User foundEntity) {

    }

    @Override
    public void infoLogicCheck(Session session, User entity) {

    }
}
