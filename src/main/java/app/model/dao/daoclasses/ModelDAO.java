package app.model.dao.daoclasses;
import app.model.dao.daointerfaces.IDao;
import app.model.domains.Model;

public class ModelDAO extends InsuranceCalculatorDao<Model> implements IDao<Model> {
	public ModelDAO(Class<Model> defaultClass){
		super(defaultClass);
	}
	public ModelDAO(){
		super(Model.class);
	}
}
