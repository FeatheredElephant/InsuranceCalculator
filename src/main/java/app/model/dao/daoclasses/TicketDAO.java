package app.model.dao.daoclasses;
import app.model.dao.daointerfaces.IDao;
import app.model.domains.Ticket;

public class TicketDAO extends InsuranceCalculatorDao<Ticket> implements IDao<Ticket> {
	public TicketDAO(Class<Ticket> defaultClass){
		super(defaultClass);
	}
	public TicketDAO(){
		super(Ticket.class);
	}
}
