package app.model.domains;


import java.sql.Date;

public class Claim {

	int id;
	Date date;
	int customerId;
	int vehicleId;
	double amount;
	String description;

	public Claim(int id, Date date, int customerId, int vehicleId, double amount, String description) {
		this.id = id;
		this.date = date;
		this.customerId = customerId;
		this.vehicleId = vehicleId;
		this.amount = amount;
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

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public int getVehicleId() {
		return vehicleId;
	}

	public void setVehicleId(int vehicleId) {
		this.vehicleId = vehicleId;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}


	@Override
	public String toString() {
		return "Claim{" +
				"id=" + id +
				", date=" + date +
				", customerId=" + customerId +
				", vehicleId=" + vehicleId +
				", amount=" + amount +
				", description='" + description + '\'' +
				'}';
	}
}