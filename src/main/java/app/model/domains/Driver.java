package app.model.domains;

import java.util.Objects;

public class Driver extends Domain{
	private int driverId;
	private String startDate;
	private int customerId;

	public Driver(){}
	
	public Driver(int driverId, String startDate, int customerId) {
		super();
		this.driverId = driverId;
		this.startDate = startDate;
		this.customerId = customerId;
	}
	
	public int getDriverId() {
		return driverId;
	}
	public void setDriverId(int driverId) {
		this.driverId = driverId;
	}
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	@Override
	public int hashCode() {
		return Objects.hash(driverId);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Driver other = (Driver) obj;
		return driverId == other.driverId;
	}
	@Override
	public String toString() {
		return "Driver [driverId=" + driverId + ", startDate=" + startDate + ", customer=" + customerId + "]";
	}	
}