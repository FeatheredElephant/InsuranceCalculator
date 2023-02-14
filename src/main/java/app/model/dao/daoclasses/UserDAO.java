package app.model.dao.daoclasses;

import app.model.dao.daointerfaces.IDao;
import app.model.domains.User;

public class UserDAO extends InsuranceCalculatorDao<User> implements IDao<User> {

	public UserDAO(Class<User> defaultClass) {
		super(defaultClass);
	}
	
	public UserDAO() {
		super(User.class);
	}
}