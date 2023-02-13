package app.model.dao.daoclasses;
import app.model.dao.daointerfaces.Dao;
import app.model.domains.Ticket;
import java.util.List;

public class TicketDAO extends InsuranceCalculatorDao<Ticket> implements Dao<Ticket> {

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
