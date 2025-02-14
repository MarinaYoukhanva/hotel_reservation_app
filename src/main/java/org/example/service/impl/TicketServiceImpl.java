package org.example.service.impl;

import org.example.base.service.BaseServiceImpl;
import org.example.entity.Ticket;
import org.example.repository.TicketRepository;
import org.example.service.TicketService;
import org.hibernate.Session;

public class TicketServiceImpl extends BaseServiceImpl<Long, Ticket, TicketRepository>
        implements TicketService {
    public TicketServiceImpl(TicketRepository repository) {
        super(repository);
    }

    @Override
    public void updateColumns(Ticket entity, Ticket foundEntity) {

    }

    @Override
    public void infoLogicCheck(Session session, Ticket entity) {

    }
}
