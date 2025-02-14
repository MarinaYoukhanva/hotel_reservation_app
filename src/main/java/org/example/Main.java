package org.example;

import org.example.base.config.ApplicationContext;
import org.example.entity.Hotel;
import org.example.entity.User;
import org.example.repository.TicketRepository;
import org.example.service.HotelService;
import org.example.service.UserService;

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

        User user = new User("aaaa","bb", "cc", "dd");
        User signedUp = userService.signup(user);

        User loggedIn = userService.login(signedUp.getUsername(), signedUp.getPassword());
        User loggedIn2 = userService.login("222", "bb");

    }
}