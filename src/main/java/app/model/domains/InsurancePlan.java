package app.model.domains;

public class InsurancePlan {

	int id;
	String name;
	String description;
	double deductible;
	double coverageAmount;

	public InsurancePlan(int id, String name, String description, double deductible, double coverageAmount) {
		this.id = id;
		this.name = name;
		this.description = description;
		this.deductible = deductible;
		this.coverageAmount = coverageAmount;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getDeductible() {
		return deductible;
	}

	public void setDeductible(double deductible) {
		this.deductible = deductible;
	}

	public double getCoverageAmount() {
		return coverageAmount;
	}

	public void setCoverageAmount(double coverageAmount) {
		this.coverageAmount = coverageAmount;
	}

	@Override
	public String toString() {
		return "InsurancePlan{" +
				"id=" + id +
				", name='" + name + '\'' +
				", description='" + description + '\'' +
				", deductible=" + deductible +
				", coverageAmount=" + coverageAmount +
				'}';
	}
}
