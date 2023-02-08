package app.model.domains;

import java.util.Objects;

public class Ticket {
	private int ticketId;
	private int points;
	private Driver driver;
	private String dateRecieved;
	
	public Ticket(int ticketId, int points, Driver driver, String dateRecieved) {
		super();
		this.ticketId = ticketId;
		this.points = points;
		this.driver = driver;
		this.dateRecieved = dateRecieved;
	}
	
	public int getTicketId() {
		return ticketId;
	}
	public void setTicketId(int ticketId) {
		this.ticketId = ticketId;
	}
	public int getPoints() {
		return points;
	}
	public void setPoints(int points) {
		this.points = points;
	}
	public Driver getDriver() {
		return driver;
	}
	public void setDriver(Driver driver) {
		this.driver = driver;
	}
	public String getDateRecieved() {
		return dateRecieved;
	}
	public void setDateRecieved(String dateRecieved) {
		this.dateRecieved = dateRecieved;
	}
	@Override
	public int hashCode() {
		return Objects.hash(ticketId);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Ticket other = (Ticket) obj;
		return ticketId == other.ticketId;
	}
	@Override
	public String toString() {
		return "Ticket [ticketId=" + ticketId + ", points=" + points + ", driver=" + driver + ", dateRecieved="
				+ dateRecieved + "]";
	}
	
}
