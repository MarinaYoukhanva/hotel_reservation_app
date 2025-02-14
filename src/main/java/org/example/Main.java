package org.example;

import org.example.base.config.ApplicationContext;
import org.example.entity.Hotel;
import org.example.repository.TicketRepository;
import org.example.service.HotelService;

public class Main {

    public static void main(String[] args) {
        HotelService hotelService = ApplicationContext.getHotelService();
        ApplicationContext.getRoomService();
        ApplicationContext.getUserService();
        ApplicationContext.getTicketService();

        Hotel hotel = new Hotel("a", "b", "c", null);
//        hotelService.save(hotel);

        hotel.setName("aa");
        hotelService.save(hotel);
    }
}