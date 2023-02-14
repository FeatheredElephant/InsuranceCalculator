package app.model.dao.daoclasses;
import app.model.dao.daointerfaces.IDao;
import app.model.domains.Payment;

public class PaymentDAO extends InsuranceCalculatorDao<Payment> implements IDao<Payment> {
	PaymentDAO(Class<Payment> defaultClass){
		super(defaultClass);
	}
	PaymentDAO(){
		super(Payment.class);
	}
}
