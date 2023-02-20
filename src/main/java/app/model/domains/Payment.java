package app.model.domains;

import java.sql.Date;

public class Payment extends Domain{

	int id;
	double amount;
	Date date;
	int customerId;

	public Payment(int id, double amount, Date date, int customerId) {
		this.id = id;
		this.amount = amount;
		this.date = date;
		this.customerId = customerId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
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

	@Override
	public String toString() {
		return "Payment{" +
				"id=" + id +
				", amount=" + amount +
				", date=" + date +
				", customerId=" + customerId +
				'}';
	}
}
