package org.example;

import org.example.base.config.ApplicationContext;
import org.example.base.config.SessionFactoryInstance;
import org.example.entity.Hotel;
import org.example.entity.Room;
import org.example.entity.User;
import org.example.repository.TicketRepository;
import org.example.service.HotelService;
import org.example.service.UserService;
import org.hibernate.Session;

import java.time.LocalDate;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        HotelService hotelService = ApplicationContext.getHotelService();
        ApplicationContext.getRoomService();
        UserService userService = ApplicationContext.getUserService();
        ApplicationContext.getTicketService();

//        Hotel hotel = new Hotel("a", "b", "c", null);
//        hotelService.save(hotel);
//
//        hotel.setName("aa");
//        hotelService.update(hotel);

//        User user = new User("aaaa","bb", "cc", "dd");
//        User signedUp = userService.signup(user);
//
//        User loggedIn = userService.login(signedUp.getUsername(), signedUp.getPassword());
//        User loggedIn2 = userService.login("222", "bb");
        try (Session session = SessionFactoryInstance.sessionFactory.openSession()) {
            {
                List<Room> rooms = ApplicationContext.getTicketRepository()
                        .availableRooms(session,
                                LocalDate.of(2025, 2, 14),
                                LocalDate.of(2025, 2, 17));
                rooms.forEach(System.out::println);
            }
        }
    }
}