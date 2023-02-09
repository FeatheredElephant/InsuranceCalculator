package app.model.domains;

import java.util.Objects;

public class Model extends Domain{
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

	@Override
	public int hashCode() {
		return Objects.hash(modelId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Model other = (Model) obj;
		return modelId == other.modelId;
	}

	@Override
	public String toString() {
		return "Model [modelId=" + modelId + ", brand=" + brand + ", basePlan=" + basePlan + "]";
	}
	
}