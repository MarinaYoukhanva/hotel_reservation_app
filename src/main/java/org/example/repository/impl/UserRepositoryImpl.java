package org.example.repository.impl;

import org.example.base.repository.BaseRepositoryImpl;
import org.example.entity.User;
import org.example.repository.UserRepository;

public class UserRepositoryImpl extends BaseRepositoryImpl<Long, User>
implements UserRepository {
    public UserRepositoryImpl(Class<User> entityClass) {
        super(entityClass);
    }
}
