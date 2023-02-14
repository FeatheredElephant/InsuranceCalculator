package app.model.dao.daoclasses;
import app.model.dao.daointerfaces.IDao;
import app.model.domains.Vehicle;

public class VehicleDAO extends InsuranceCalculatorDao<Vehicle> implements IDao<Vehicle> {
	VehicleDAO(Class<Vehicle> defaultClass){
		super(defaultClass);
	}
	VehicleDAO(){
		super(Vehicle.class);
	}
}
