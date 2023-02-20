package app.model.domains;

public class Brand {

	int id;
	String name;
	int vehicleId;

	public Brand(int id, String name, int vehicleId) {
		this.id = id;
		this.name = name;
		this.vehicleId = vehicleId;
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

	public int getVehicleId() {
		return vehicleId;
	}

	public void setVehicleId(int vehicleId) {
		this.vehicleId = vehicleId;
	}

	@Override
	public String toString() {
		return "Brand{" +
				"id=" + id +
				", name='" + name + '\'' +
				", vehicleId=" + vehicleId +
				'}';
	}
}
