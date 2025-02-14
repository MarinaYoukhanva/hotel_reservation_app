package org.example.repository;

import org.example.base.repository.BaseRepository;
import org.example.entity.Room;
import org.example.entity.Ticket;
import org.hibernate.Session;

import java.time.LocalDate;
import java.util.List;

public interface TicketRepository extends BaseRepository<Long, Ticket> {

    List<Room> notAvailableRooms (Session session,
                                  LocalDate checkinDate, LocalDate checkoutDate);
}
