package app.model.domains;

import java.sql.Date;

public class Accident {

	int id;
	Date date;
	int driverId;
	int vehicleId;
	String description;

	public Accident(int id, Date date, int driverId, int vehicleId, String description) {
		this.id = id;
		this.date = date;
		this.driverId = driverId;
		this.vehicleId = vehicleId;
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

	public int getVehicleId() {
		return vehicleId;
	}

	public void setVehicleId(int vehicleId) {
		this.vehicleId = vehicleId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Accidents{" +
				"id=" + id +
				", date=" + date +
				", driverId=" + driverId +
				", vehicleId=" + vehicleId +
				", description='" + description + '\'' +
				'}';
	}
}
