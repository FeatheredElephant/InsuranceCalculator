package app.model.dao.daoclasses;
import app.model.dao.daointerfaces.IDao;
import app.model.domains.Model;

public class ModelDAO extends InsuranceCalculatorDao<Model> implements IDao<Model> {
	ModelDAO(Class<Model> defaultClass){
		super(defaultClass);
	}
	ModelDAO(){
		super(Model.class);
	}
}
