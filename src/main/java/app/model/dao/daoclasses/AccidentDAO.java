package app.model.dao.daoclasses;
import app.model.dao.daointerfaces.IDao;
import app.model.domains.Accident;
import java.math.BigDecimal;

public class AccidentDAO extends InsuranceCalculatorDao<Accident> implements IDao<Accident> {

    public AccidentDAO(Class<Accident> defaultClass) {
		super(defaultClass);
	}
    
    public AccidentDAO() {
    	super(Accident.class);
    }

    public BigDecimal getDamage() {
        return null;
    }
}
