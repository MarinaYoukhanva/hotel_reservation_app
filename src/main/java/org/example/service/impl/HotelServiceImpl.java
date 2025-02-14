package org.example.service.impl;

import org.example.base.service.BaseService;
import org.example.base.service.BaseServiceImpl;
import org.example.entity.Hotel;
import org.example.repository.HotelRepository;
import org.example.service.HotelService;
import org.hibernate.Session;

public class HotelServiceImpl extends BaseServiceImpl<Long, Hotel, HotelRepository>
implements HotelService {
    public HotelServiceImpl(HotelRepository repository) {
        super(repository);
    }

    @Override
    public void updateColumns(Hotel hotel, Hotel foundEntity) {
        foundEntity.setName(hotel.getName());
        foundEntity.setAddress(hotel.getAddress());
        foundEntity.setCity(hotel.getCity());
        foundEntity.setRooms(hotel.getRooms());
    }

    @Override
    public void infoLogicCheck(Session session, Hotel entity) {

    }
}
