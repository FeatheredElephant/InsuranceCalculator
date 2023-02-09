package app.model.domains;

import java.util.Objects;

public class Vehicle extends Domain{
	int vin;
	int year;
	float mileage;
	int modelId;
	InsurancePlan insurancePlan;
	
	public Vehicle(int vin, int year, float mileage, int modelId, InsurancePlan insurancePlan) {
		super();
		this.vin = vin;
		this.year = year;
		this.mileage = mileage;
		this.modelId = modelId;
		this.insurancePlan = insurancePlan;
	}
	
	public int getVin() {
		return vin;
	}
	public void setVin(int vin) {
		this.vin = vin;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public float getMileage() {
		return mileage;
	}
	public void setMileage(float mileage) {
		this.mileage = mileage;
	}
	public int getModelId() {
		return modelId;
	}
	public void setModelId(int modelId) {
		this.modelId = modelId;
	}
	public InsurancePlan getInsurancePlan() {
		return insurancePlan;
	}
	public void setInsurancePlan(InsurancePlan insurancePlan) {
		this.insurancePlan = insurancePlan;
	}

	@Override
	public int hashCode() {
		return Objects.hash(vin);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vehicle other = (Vehicle) obj;
		return vin == other.vin;
	}

	@Override
	public String toString() {
		return "Vehicle [vin=" + vin + ", year=" + year + ", mileage=" + mileage + ", model=" + modelId
				+ ", insurancePlan=" + insurancePlan + "]";
	}
	
}