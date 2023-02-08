package app.model.domains;

import java.math.BigDecimal;
import java.util.Objects;

public class Payment {
	private int paymentId;
	private Customer customer;
	private String paymentDate;
	private BigDecimal amount;
	
	public Payment(int paymentId, Customer customer, String paymentDate, BigDecimal amount) {
		super();
		this.paymentId = paymentId;
		this.customer = customer;
		this.paymentDate = paymentDate;
		this.amount = amount;
	}

	public int getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(int paymentId) {
		this.paymentId = paymentId;
	}

	public Customer getCustomerId() {
		return customer;
	}

	public void setCustomerId(Customer customer) {
		this.customer = customer;
	}

	public String getPaymentDate() {
		return paymentDate;
	}

	public void setPaymentDate(String paymentDate) {
		this.paymentDate = paymentDate;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	@Override
	public int hashCode() {
		return Objects.hash(paymentId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Payment other = (Payment) obj;
		return paymentId == other.paymentId;
	}

	@Override
	public String toString() {
		return "Payment [paymentId=" + paymentId + ", customer=" + customer + ", paymentDate=" + paymentDate
				+ ", amount=" + amount + "]";
	}
}
