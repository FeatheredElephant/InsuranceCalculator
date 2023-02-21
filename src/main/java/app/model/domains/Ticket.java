package app.model.domains;


import java.sql.Date;

public class Ticket {

		int id;
		Date date;
		int driverId;
		String description;

	public Ticket(int id, Date date, int driverId, String description) {
		this.id = id;
		this.date = date;
		this.driverId = driverId;
		this.description = description;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public int getDriverId() {
		return driverId;
	}

	public void setDriverId(int driverId) {
		this.driverId = driverId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Ticket{" +
				"id=" + id +
				", date=" + date +
				", driverId=" + driverId +
				", description='" + description + '\'' +
				'}';
	}
}
