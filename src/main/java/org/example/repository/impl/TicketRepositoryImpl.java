package org.example.repository.impl;

import org.example.base.repository.BaseRepositoryImpl;
import org.example.entity.Ticket;
import org.example.repository.TicketRepository;

public class TicketRepositoryImpl extends BaseRepositoryImpl<Long, Ticket>
implements TicketRepository {
    public TicketRepositoryImpl(Class<Ticket> entityClass) {
        super(entityClass);
    }
}
