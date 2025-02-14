package org.example.base.repository;

import lombok.RequiredArgsConstructor;
import org.example.base.model.BaseEntity;
import org.hibernate.Session;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
public abstract class BaseRepositoryImpl<ID extends Serializable, T extends BaseEntity<ID>>
        implements BaseRepository<ID, T> {

    private final Class<T> entityClass;

    @Override
    public T save(Session session, T entity) {
        session.persist(entity);
        return entity;
    }

    @Override
    public List<T> findAll(Session session) {
        return session.createQuery("from " + entityClass.getName(), entityClass)
                .list();
    }

    @Override
    public Optional<T> findById(Session session, ID id) {
        return session.byId(entityClass)
                .loadOptional(id);
    }

    @Override
    public int delete(Session session, ID id) {
        return session
                .createMutationQuery("DELETE FROM " + entityClass.getName() + " e WHERE e.id = :id")
                .setParameter("id", id)
                .executeUpdate();
    }

}
