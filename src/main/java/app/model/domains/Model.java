package app.model.domains;

public class Model {
	int modelId;
	Brand brand;
	BasePlan basePlan;
	
	public Model(int modelId, Brand brand, BasePlan basePlan) {
		super();
		this.modelId = modelId;
		this.brand = brand;
		this.basePlan = basePlan;
	}
	
	public int getModelId() {
		return modelId;
	}
	public void setModelId(int modelId) {
		this.modelId = modelId;
	}
	public Brand getBrandId() {
		return brand;
	}
	public void setBrandId(Brand brand) {
		this.brand = brand;
	}
	public BasePlan getBasePlan() {
		return basePlan;
	}
	public void setBasePlan(BasePlan basePlan) {
		this.basePlan = basePlan;
	}
}