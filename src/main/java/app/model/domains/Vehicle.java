package app.model.domains;

public class Vehicle {
	int vin;
	int year;
	float mileage;
	Model model;
	InsurancePlan insurancePlan;
	
	public Vehicle(int vin, int year, float mileage, Model model, InsurancePlan insurancePlan) {
		super();
		this.vin = vin;
		this.year = year;
		this.mileage = mileage;
		this.model = model;
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
	public Model getModel() {
		return model;
	}
	public void setModel(Model model) {
		this.model = model;
	}
	public InsurancePlan getInsurancePlan() {
		return insurancePlan;
	}
	public void setInsurancePlan(InsurancePlan insurancePlan) {
		this.insurancePlan = insurancePlan;
	}
}