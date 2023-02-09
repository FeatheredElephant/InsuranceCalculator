package app.model.domains;

import java.math.BigDecimal;
import java.util.Objects;

public class InsurancePlan extends Domain{
	int planId;
	Agent agent;
	String startDate;
	String endDate;
	BigDecimal totalMonthlyCost;

	public InsurancePlan(){}
	
	
	public InsurancePlan(int planId, Agent agent, String startDate, String endDate, BigDecimal totalMonthlyCost) {
		super();
		this.planId = planId;
		this.agent = agent;
		this.startDate = startDate;
		this.endDate = endDate;
		this.totalMonthlyCost = totalMonthlyCost;
	}
	
	public int getPlanId() {
		return planId;
	}
	public void setPlanId(int planId) {
		this.planId = planId;
	}
	public Agent getAgent() {
		return agent;
	}
	public void setAgent(Agent agent) {
		this.agent = agent;
	}
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	public BigDecimal getTotalMonthlyCost() {
		return totalMonthlyCost;
	}
	public void setTotalMonthlyCost(BigDecimal totalMonthlyCost) {
		this.totalMonthlyCost = totalMonthlyCost;
	}

	@Override
	public int hashCode() {
		return Objects.hash(planId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		InsurancePlan other = (InsurancePlan) obj;
		return planId == other.planId;
	}

	@Override
	public String toString() {
		return "InsurancePlan [planId=" + planId + ", agent=" + agent + ", startDate=" + startDate + ", endDate="
				+ endDate + ", totalMonthlyCost=" + totalMonthlyCost + "]";
	}
	
}