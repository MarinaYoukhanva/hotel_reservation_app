package org.example.base.config;

import org.example.entity.*;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SessionFactoryInstance {

    public static SessionFactory sessionFactory;

    static {
        sessionFactory = new Configuration()
                .configure()
                .addAnnotatedClass(Hotel.class)
                .addAnnotatedClass(Ticket.class)
                .addAnnotatedClass(User.class)
                .addAnnotatedClass(Room.class)
                .buildSessionFactory();
    }

}
