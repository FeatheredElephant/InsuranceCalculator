package app.model.dao.daoclasses;
import app.model.dao.daointerfaces.IDao;
import app.model.domains.Vehicle;

public class VehicleDAO extends InsuranceCalculatorDao<Vehicle> implements IDao<Vehicle> {
	public VehicleDAO(Class<Vehicle> defaultClass){
		super(defaultClass);
	}
	public VehicleDAO(){
		super(Vehicle.class);
	}
}
