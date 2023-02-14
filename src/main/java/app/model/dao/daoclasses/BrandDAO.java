package app.model.dao.daoclasses;
import app.model.dao.daointerfaces.IDao;
import app.model.domains.Brand;

public class BrandDAO extends InsuranceCalculatorDao<Brand> implements IDao<Brand> {

	BrandDAO(Class<Brand> defaultClass){
		super(defaultClass);
	}
	BrandDAO(){
		super(Brand.class);
	}
}
