package org.example.service.impl;

import org.example.base.config.SessionFactoryInstance;
import org.example.base.service.BaseServiceImpl;
import org.example.entity.User;
import org.example.exception.NotFoundException;
import org.example.exception.UserExistsException;
import org.example.repository.UserRepository;
import org.example.service.UserService;
import org.hibernate.Session;

import java.util.Optional;

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

    @Override
    public User signup(User user) {
        try(Session session = SessionFactoryInstance.sessionFactory.openSession()){
            try{
                session.beginTransaction();
                getRepository().findByUsername(session, user.getUsername())
                        .orElseThrow(UserExistsException::new);
                getRepository().save(session, user);
                session.getTransaction().commit();
            }catch (Exception e){
                session.getTransaction().rollback();
                System.out.println(e.getMessage());
            }
        }
        return user;
    }

    @Override
    public User login(String username, String password) {
        try(Session session = SessionFactoryInstance.sessionFactory.openSession()){
            try {
                User foundUser = getRepository().findByUsername(session, username)
                        .orElseThrow(NotFoundException::new);
                if (!foundUser.getPassword().equals(password))
                    throw new NotFoundException(User.class);
                return foundUser;
            }
            catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
        return null;
    }
}
