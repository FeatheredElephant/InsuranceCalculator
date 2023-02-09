package app.model.domains;

import app.IOManager;

public class Agent extends User{
	public Agent(int userId, String email, String password, String name) {
		super(userId, email, password, name);
	}

	@Override
	public String toString() {
		return "Agent [getId()=" + getId() + ", getEmail()=" + getEmail() + ", getPassword()=" + getPassword()
				+ ", getName()=" + getName() + "]";
	}
	
	
	public static void main(String[] args) {
		Agent a = new Agent(0, "asdf@gmail.com", "abc123", "Abe");
//		IOManager.getInstance().println(a.getClassName());
	}
}