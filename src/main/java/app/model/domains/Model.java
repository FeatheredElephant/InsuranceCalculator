package app.model.domains;

public class Model extends Domain{

	int id;
	String name;
	int brandId;

	public Model(int id, String name, int brandId) {
		this.id = id;
		this.name = name;
		this.brandId = brandId;
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

	public int getBrandId() {
		return brandId;
	}

	public void setBrandId(int brandId) {
		this.brandId = brandId;
	}

	@Override
	public String toString() {
		return "Model{" +
				"id=" + id +
				", name='" + name + '\'' +
				", brandId=" + brandId +
				'}';
	}
}