package app.model.dao.daoclasses;

import app.model.dao.daointerfaces.ITicketDAO;
import app.model.domains.Ticket;

import java.util.List;

public class TicketDAO implements ITicketDAO {
    @Override
    public void create(Ticket type) {

    }

    @Override
    public Ticket read(int id) {
        return null;
    }

    @Override
    public void update(Ticket type) {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public List<Ticket> readAll() {
        return null;
    }
}
