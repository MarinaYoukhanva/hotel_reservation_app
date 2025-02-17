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

    public List<Room> availableRooms(Session session,
                                        LocalDate checkinDate, LocalDate checkoutDate) {
//        return session.createQuery("""
//                                SELECT t.room FROM Ticket t
//                                WHERE :checkinDate >= t.checkInDate AND :checkinDate < t.checkOutDate
//                                OR :checkinDate < t.checkInDate AND :checkoutDate > t.checkInDate
//                                """,
        return session.createQuery("""
                                SELECT r FROM Room r
                                LEFT JOIN Ticket t
                                ON r.id = t.room.id
                                WHERE t.id IS NULL
                                OR NOT(:checkinDate < t.checkOutDate AND :checkoutDate > t.checkInDate)
                                """,
                        Room.class)
                .setParameter("checkinDate", checkinDate)
                .setParameter("checkoutDate", checkoutDate)
                .list();
    }
}
