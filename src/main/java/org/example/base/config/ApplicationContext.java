package org.example.base.config;

import org.example.entity.*;
import org.example.repository.*;
import org.example.repository.impl.*;
import org.example.service.*;
import org.example.service.impl.*;

public class ApplicationContext {
    private static final Class<User> userClass;
    private static final UserRepository USER_REPOSITORY;
    private static final UserService USER_SERVICE;

    private static final Class<Hotel> hotelClass;
    private static final HotelRepository HOTEL_REPOSITORY;
    private static final HotelService HOTEL_SERVICE;

    private static final Class<Room> roomClass;
    private static final RoomRepository ROOM_REPOSITORY;
    private static final RoomService ROOM_SERVICE;

    private static final Class<Ticket> ticketClass;
    private static final TicketRepository TICKET_REPOSITORY;
    private static final TicketService TICKET_SERVICE;


    static {
        userClass = User.class;
        USER_REPOSITORY = new UserRepositoryImpl(userClass);
        USER_SERVICE = new UserServiceImpl(USER_REPOSITORY);

        hotelClass = Hotel.class;
        HOTEL_REPOSITORY = new HotelRepositoryImpl(hotelClass);
        HOTEL_SERVICE = new HotelServiceImpl(HOTEL_REPOSITORY);

        roomClass = Room.class;
        ROOM_REPOSITORY = new RoomRepositoryImpl(roomClass);
        ROOM_SERVICE = new RoomServiceImpl(ROOM_REPOSITORY);

        ticketClass = Ticket.class;
        TICKET_REPOSITORY = new TicketRepositoryImpl(ticketClass);
        TICKET_SERVICE = new TicketServiceImpl(TICKET_REPOSITORY);

    }
    public static UserService getUserService() {return USER_SERVICE; }
    public static RoomService getRoomService() {return ROOM_SERVICE; }
    public static HotelService getHotelService() {return HOTEL_SERVICE; }
    public static TicketService getTicketService() {return TICKET_SERVICE; }


    public static UserRepository getUserRepository() {return USER_REPOSITORY; }
    public static RoomRepository getRoomRepository() {return ROOM_REPOSITORY; }
    public static HotelRepository getHotelRepository() {return HOTEL_REPOSITORY; }
    public static TicketRepository getTicketRepository() {return TICKET_REPOSITORY; }

}
