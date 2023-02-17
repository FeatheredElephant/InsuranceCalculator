package app.model.dao.daoclasses;
import app.model.dao.daointerfaces.IDao;
import app.model.domains.Claim;

public class ClaimDAO extends InsuranceCalculatorDao<Claim> implements IDao<Claim> {
	public ClaimDAO(Class<Claim> defaultClass){
		super(defaultClass);
	}
	public ClaimDAO(){
		super(Claim.class);
	}
}
