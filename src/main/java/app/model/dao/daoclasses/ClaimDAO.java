package app.model.dao.daoclasses;
import app.model.dao.daointerfaces.IDao;
import app.model.domains.Claim;

public class ClaimDAO extends InsuranceCalculatorDao<Claim> implements IDao<Claim> {
	ClaimDAO(Class<Claim> defaultClass){
		super(defaultClass);
	}
	ClaimDAO(){
		super(Claim.class);
	}
}
