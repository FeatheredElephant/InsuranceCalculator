package app.model.domains;

import java.math.BigDecimal;
import java.util.Objects;

public class BasePlan {
	private String planName;
	private BigDecimal monthlyCost;
	private BigDecimal converageAmount;

	public BasePlan(String planName, BigDecimal monthlyCost, BigDecimal converageAmount) {
		super();
		this.planName = planName;
		this.monthlyCost = monthlyCost;
		this.converageAmount = converageAmount;
	}

	public String getPlanName() {
		return planName;
	}

	public void setPlanName(String planName) {
		this.planName = planName;
	}

	public BigDecimal getMonthlyCost() {
		return monthlyCost;
	}

	public void setMonthlyCost(BigDecimal monthlyCost) {
		this.monthlyCost = monthlyCost;
	}

	public BigDecimal getConverageAmount() {
		return converageAmount;
	}

	public void setConverageAmount(BigDecimal converageAmount) {
		this.converageAmount = converageAmount;
	}

	@Override
	public int hashCode() {
		return Objects.hash(converageAmount, monthlyCost, planName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BasePlan other = (BasePlan) obj;
		return Objects.equals(converageAmount, other.converageAmount) && Objects.equals(monthlyCost, other.monthlyCost)
				&& Objects.equals(planName, other.planName);
	}

	@Override
	public String toString() {
		return "BasePlan [planName=" + planName + ", monthlyCost=" + monthlyCost + ", converageAmount="
				+ converageAmount + "]";
	}

}
