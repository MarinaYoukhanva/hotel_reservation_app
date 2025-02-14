package org.example.repository.impl;

import org.example.base.repository.BaseRepositoryImpl;
import org.example.entity.Hotel;
import org.example.repository.HotelRepository;

public class HotelRepositoryImpl extends BaseRepositoryImpl<Long, Hotel>
implements HotelRepository {
    public HotelRepositoryImpl(Class<Hotel> entityClass) {
        super(entityClass);
    }
}
