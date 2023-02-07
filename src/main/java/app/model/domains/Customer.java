package app.model.domains;

public class Customer extends User{
	Customer(int userId, String email, String password, String name, int customerId){
		super(userId, email, password, name);
	}
}
