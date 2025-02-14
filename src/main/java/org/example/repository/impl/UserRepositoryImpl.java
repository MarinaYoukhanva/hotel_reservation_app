package org.example.repository.impl;

import org.example.base.repository.BaseRepositoryImpl;
import org.example.entity.User;
import org.example.repository.UserRepository;
import org.hibernate.Session;

import java.util.Optional;

public class UserRepositoryImpl extends BaseRepositoryImpl<Long, User>
implements UserRepository {
    public UserRepositoryImpl(Class<User> entityClass) {
        super(entityClass);
    }
    public Optional<User> findByUsername (Session session, String username) {
        return session
                .createQuery("FROM User WHERE username =: username",
                        User.class)
                .setParameter("username", username)
                .uniqueResultOptional();
    }

}
