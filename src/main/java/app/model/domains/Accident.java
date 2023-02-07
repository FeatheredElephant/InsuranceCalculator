package app.model.domains;

import java.math.BigDecimal;
import java.util.Objects;

public class Accident {
	int accidentId;
	BigDecimal damages;
	Vehicle vehicle;
	Driver driver;
	public Accident(int accidentId, BigDecimal damages, Vehicle vehicle, Driver driver) {
		super();
		this.accidentId = accidentId;
		this.damages = damages;
		this.vehicle = vehicle;
		this.driver = driver;
	}
	public int getAccidentId() {
		return accidentId;
	}
	public void setAccidentId(int accidentId) {
		this.accidentId = accidentId;
	}
	public BigDecimal getDamages() {
		return damages;
	}
	public void setDamages(BigDecimal damages) {
		this.damages = damages;
	}
	public Vehicle getVehicle() {
		return vehicle;
	}
	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
	public Driver getDriver() {
		return driver;
	}
	public void setDriver(Driver driver) {
		this.driver = driver;
	}
	@Override
	public int hashCode() {
		return Objects.hash(accidentId);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Accident other = (Accident) obj;
		return accidentId == other.accidentId;
	}
	@Override
	public String toString() {
		return "Accident [accidentId=" + accidentId + ", damages=" + damages + ", vehicle=" + vehicle + ", driver="
				+ driver + "]";
	}
}
