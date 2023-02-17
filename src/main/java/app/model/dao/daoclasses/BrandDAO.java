package app.model.dao.daoclasses;
import app.model.dao.daointerfaces.IDao;
import app.model.domains.Brand;

public class BrandDAO extends InsuranceCalculatorDao<Brand> implements IDao<Brand> {

	public BrandDAO(Class<Brand> defaultClass){
		super(defaultClass);
	}
	public BrandDAO(){
		super(Brand.class);
	}
}
