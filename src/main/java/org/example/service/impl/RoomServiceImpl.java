package org.example.service.impl;

import org.example.base.service.BaseServiceImpl;
import org.example.entity.Room;
import org.example.repository.RoomRepository;
import org.example.service.HotelService;
import org.example.service.RoomService;
import org.hibernate.Session;

public class RoomServiceImpl extends BaseServiceImpl<Long, Room, RoomRepository>
        implements RoomService {
    public RoomServiceImpl(RoomRepository repository) {
        super(repository);
    }
    @Override
    public void updateColumns(Room entity, Room foundEntity) {}

    @Override
    public void infoLogicCheck(Session session, Room entity) {}


}
