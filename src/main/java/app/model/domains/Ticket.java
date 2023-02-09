package app.model.domains;

import java.util.Objects;

public class Ticket extends Domain{
	private int ticketId;
	private int points;
	private int driverId;
	private String dateReceived;
	
	public Ticket(int ticketId, int points, int driverId, String dateReceived) {
		super();
		this.ticketId = ticketId;
		this.points = points;
		this.driverId = driverId;
		this.dateReceived = dateReceived;
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
	public int getDriverId() {
		return driverId;
	}
	public void setDriverId(int driverId) {
		this.driverId = driverId;
	}
	public String getDateReceived() {
		return dateReceived;
	}
	public void setDateReceived(String dateReceived) {
		this.dateReceived = dateReceived;
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
		return "Ticket [ticketId=" + ticketId + ", points=" + points + ", driver=" + driverId + ", dateRecieved="
				+ dateReceived + "]";
	}
	
}
