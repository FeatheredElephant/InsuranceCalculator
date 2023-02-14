package app.model.dao.daoclasses;
import app.model.dao.daointerfaces.IDao;
import app.model.domains.Driver;

public class DriverDAO extends InsuranceCalculatorDao<Driver> implements IDao<Driver> {
	DriverDAO(Class<Driver> defaultClass){
		super(defaultClass);
	}
	DriverDAO(){
		super(Driver.class);
	}
}
