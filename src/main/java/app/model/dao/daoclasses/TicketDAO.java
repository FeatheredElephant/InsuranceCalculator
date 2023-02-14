package app.model.dao.daoclasses;
import app.model.dao.daointerfaces.IDao;
import app.model.domains.Ticket;

public class TicketDAO extends InsuranceCalculatorDao<Ticket> implements IDao<Ticket> {
	TicketDAO(Class<Ticket> defaultClass){
		super(defaultClass);
	}
	TicketDAO(){
		super(Ticket.class);
	}
}
