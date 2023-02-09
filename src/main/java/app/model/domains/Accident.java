package app.model.domains;

import java.math.BigDecimal;
import java.util.Objects;

public class Accident extends Domain{
	int accidentId;
	BigDecimal damages;
	int vehicleId;
	int driverId;

	public Accident(){}

	public Accident(int accidentId, BigDecimal damages, int vehicleId, int driverId) {
		super();
		this.accidentId = accidentId;
		this.damages = damages;
		this.vehicleId = vehicleId;
		this.driverId = driverId;
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
	public int getVehicleId() {
		return vehicleId;
	}
	public void setVehicleId(int vehicleId) {
		this.vehicleId = vehicleId;
	}
	public int getDriverId() {
		return driverId;
	}
	public void setDriverId(int driverId) {
		this.driverId = driverId;
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
		return "Accident [accidentId=" + accidentId + ", damages=" + damages + ", vehicleId=" + vehicleId + ", driverId="
				+ driverId + "]";
	}
}
