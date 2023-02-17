package app.model.dao.daoclasses;
import app.model.dao.daointerfaces.IDao;
import app.model.domains.Payment;

public class PaymentDAO extends InsuranceCalculatorDao<Payment> implements IDao<Payment> {
	public PaymentDAO(Class<Payment> defaultClass){
		super(defaultClass);
	}
	public PaymentDAO(){
		super(Payment.class);
	}
}
