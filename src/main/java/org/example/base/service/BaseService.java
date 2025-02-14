package org.example.base.service;

import org.example.base.model.BaseEntity;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

public interface BaseService <ID extends Serializable,T extends BaseEntity<ID>> {

    T save(T entity);
    T update(T entity);
    List<T> findAll();
    Optional<T> findById(ID id);
    void delete(ID id);


}
