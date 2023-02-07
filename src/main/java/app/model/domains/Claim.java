package app.model.domains;

public class Claim {
	int claimId;
	Customer customer;
	Accident accident;

	public Claim(int claimId, Customer customer, Accident accident) {
		super();
		this.claimId = claimId;
		this.customer = customer;
		this.accident = accident;
	}

	public int getClaimId() {
		return claimId;
	}

	public void setClaimId(int claimId) {
		this.claimId = claimId;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Accident getAccident() {
		return accident;
	}

	public void setAccident(Accident accident) {
		this.accident = accident;
	}

	@Override
	public String toString() {
		return "Claim [claimId=" + claimId + ", customer=" + customer + ", accident=" + accident + "]";
	}
}