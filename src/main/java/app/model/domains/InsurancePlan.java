package app.model.domains;

import java.math.BigDecimal;

public class InsurancePlan {
	int planId;
	Agent agent;
	String startDate;
	String endDate;
	BigDecimal totalMonthlyCost;
	
	
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
}