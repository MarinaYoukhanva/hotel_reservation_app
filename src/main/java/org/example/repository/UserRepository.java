package org.example.repository;

import org.example.base.repository.BaseRepository;
import org.example.entity.User;
import org.hibernate.Session;

import java.util.Optional;

public interface UserRepository extends BaseRepository<Long, User> {

    Optional<User> findByUsername (Session session, String username);
}
