package app.model.domains;

import java.util.Objects;

public class Model extends Domain{
	int modelId;
	int brandId;
	int basePlanId;

	public Model(){}
	
	public Model(int modelId, int brand, int basePlan) {
		super();
		this.modelId = modelId;
		this.brandId = brand;
		this.basePlanId = basePlan;
	}
	
	public int getModelId() {
		return modelId;
	}
	public void setModelId(int modelId) {
		this.modelId = modelId;
	}
	public int getBrandId() {
		return brandId;
	}
	public void setBrandId(int brandId) {
		this.brandId = brandId;
	}
	public int getBasePlanId() {
		return basePlanId;
	}
	public void setBasePlanId(int basePlanId) {
		this.basePlanId = basePlanId;
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
		return "Model [modelId=" + modelId + ", brand=" + brandId + ", basePlan=" + basePlanId + "]";
	}
	
}