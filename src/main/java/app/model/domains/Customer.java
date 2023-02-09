package app.model.domains;

public class Customer extends User{
	
	int customerId;
	
	public Customer(int userId, String email, String password, String name, int customerId){
		super(userId, email, password, name);
	}
	
	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	@Override
	public String toString() {
		return "Customer [getId()=" + getId() + ", getEmail()=" + getEmail() + ", getPassword()=" + getPassword()
				+ ", getName()=" + getName() + ", hashCode()=" + "]";
	}
}