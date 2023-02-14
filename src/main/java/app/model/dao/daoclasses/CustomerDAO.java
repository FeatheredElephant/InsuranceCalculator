package app.model.dao.daoclasses;
import app.model.dao.daointerfaces.IDao;
import app.model.domains.Customer;

public class CustomerDAO extends InsuranceCalculatorDao<Customer> implements IDao<Customer> {
	CustomerDAO(Class<Customer> defaultClass){
		super(defaultClass);
	}
	CustomerDAO(){
		super(Customer.class);
	}
}
