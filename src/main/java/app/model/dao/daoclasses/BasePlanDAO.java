package app.model.dao.daoclasses;
import app.model.dao.daointerfaces.IDao;
import app.model.domains.BasePlan;
import java.math.BigDecimal;

public class BasePlanDAO extends InsuranceCalculatorDao<BasePlan> implements IDao<BasePlan> {
	
	public BasePlanDAO(Class<BasePlan> defaultClass){
		super(defaultClass);
	}
	public BasePlanDAO(){
		super(BasePlan.class);
	}

    public BigDecimal getMonthlyCost(String planName) {
        return null;
    }

    public BigDecimal getCoverageAmount(String planName) {
        return null;
    }
}
