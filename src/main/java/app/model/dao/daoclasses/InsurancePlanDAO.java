package app.model.dao.daoclasses;
import app.model.dao.daointerfaces.IDao;
import app.model.domains.InsurancePlan;

public class InsurancePlanDAO extends InsuranceCalculatorDao<InsurancePlan> implements IDao<InsurancePlan> {
	InsurancePlanDAO(Class<InsurancePlan> defaultClass){
		super(defaultClass);
	}
	public InsurancePlanDAO(){
		super(InsurancePlan.class);
	}
}
