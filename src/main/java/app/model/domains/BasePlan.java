package app.model.domains;

import java.math.BigDecimal;
import java.util.Objects;

public class BasePlan extends Domain{
	private String planName;
	private BigDecimal monthlyCost;
	private BigDecimal coverageAmount;

	public BasePlan(){}

	public BasePlan(String planName, BigDecimal monthlyCost, BigDecimal coverageAmount) {
		super();
		this.planName = planName;
		this.monthlyCost = monthlyCost;
		this.coverageAmount = coverageAmount;
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

	public BigDecimal getCoverageAmount() {
		return coverageAmount;
	}

	public void setCoverageAmount(BigDecimal coverageAmount) {
		this.coverageAmount = coverageAmount;
	}

	@Override
	public int hashCode() {
		return Objects.hash(coverageAmount, monthlyCost, planName);
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
		return Objects.equals(coverageAmount, other.coverageAmount) && Objects.equals(monthlyCost, other.monthlyCost)
				&& Objects.equals(planName, other.planName);
	}

	@Override
	public String toString() {
		return "BasePlan [planName=" + planName + ", monthlyCost=" + monthlyCost + ", coverageAmount="
				+ coverageAmount + "]";
	}

}
