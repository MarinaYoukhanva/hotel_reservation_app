package org.example.repository.impl;

import org.example.base.repository.BaseRepositoryImpl;
import org.example.entity.Room;
import org.example.entity.Ticket;
import org.example.repository.TicketRepository;
import org.hibernate.Session;

import java.time.LocalDate;
import java.util.List;

public class TicketRepositoryImpl extends BaseRepositoryImpl<Long, Ticket>
implements TicketRepository {
    public TicketRepositoryImpl(Class<Ticket> entityClass) {
        super(entityClass);
    }

    public List<Room> notAvailableRooms (Session session,
                                         LocalDate checkinDate, LocalDate checkoutDate) {
        return session.createQuery("SELECT room FROM Ticket WHERE checkInDate >= :checkinDate AND checkOutDate <= :checkoutDate",
                 Room.class)
                .setParameter("checkinDate", checkinDate)
                .setParameter("checkoutDate", checkoutDate)
                .list();

    }
}
