package app.model.dao.daoclasses;
import app.model.dao.daointerfaces.IDao;
import app.model.domains.Customer;

public class CustomerDAO extends InsuranceCalculatorDao<Customer> implements IDao<Customer> {
	public CustomerDAO(Class<Customer> defaultClass){
		super(defaultClass);
	}
	public CustomerDAO(){
		super(Customer.class);
	}
}
