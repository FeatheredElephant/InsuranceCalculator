package app.model.domains;

import java.math.BigDecimal;
import java.util.Objects;

public class Payment extends Domain{
	private int paymentId;
	private int customerId;
	private String paymentDate;
	private BigDecimal amount;

	public Payment(){}
	
	public Payment(int paymentId, int customerId, String paymentDate, BigDecimal amount) {
		super();
		this.paymentId = paymentId;
		this.customerId = customerId;
		this.paymentDate = paymentDate;
		this.amount = amount;
	}

	public int getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(int paymentId) {
		this.paymentId = paymentId;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
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
		return "Payment [paymentId=" + paymentId + ", customer=" + customerId + ", paymentDate=" + paymentDate
				+ ", amount=" + amount + "]";
	}
}
