package app.model.domains;

public class Agent extends User{
	public Agent(int userId, String email, String password, String name) {
		super(userId, email, password, name);
	}

	@Override
	public String toString() {
		return "Agent [getId()=" + getId() + ", getEmail()=" + getEmail() + ", getPassword()=" + getPassword()
				+ ", getName()=" + getName() + "]";
	}
	
}