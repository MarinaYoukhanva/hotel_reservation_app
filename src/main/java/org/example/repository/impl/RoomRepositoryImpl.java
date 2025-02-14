package org.example.repository.impl;

import org.example.base.repository.BaseRepositoryImpl;
import org.example.entity.Room;
import org.example.repository.RoomRepository;

public class RoomRepositoryImpl extends BaseRepositoryImpl<Long, Room>
implements RoomRepository {
    public RoomRepositoryImpl(Class<Room> entityClass) {
        super(entityClass);
    }
}
