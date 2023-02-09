package app.model.domains;

import java.util.Objects;

public class Driver extends Domain{
	private int driverId;
	private String startDate;
	private Customer customer;
	
	public Driver(int driverId, String startDate, Customer customer) {
		super();
		this.driverId = driverId;
		this.startDate = startDate;
		this.customer = customer;
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
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
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
		return "Driver [driverId=" + driverId + ", startDate=" + startDate + ", customer=" + customer + "]";
	}	
}