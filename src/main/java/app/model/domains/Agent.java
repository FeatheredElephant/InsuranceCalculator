package app.model.domains;

import app.IOManager;

public class Agent extends User{
	int agentId;
	
	public Agent(int userId, String email, String password, String name, int agentId) {
		super(userId, email, password, name);
	}
	
	public int getAgentId() {
		return agentId;
	}

	public void setAgentId(int agentId) {
		this.agentId = agentId;
	}

	@Override
	public String toString() {
		return "Agent [getId()=" + getId() + ", getEmail()=" + getEmail() + ", getPassword()=" + getPassword()
				+ ", getName()=" + getName() + "]";
	}
	
	
	public static void main(String[] args) {
		Agent a = new Agent(0, "asdf@gmail.com", "abc123", "Abe", 0);
//		IOManager.getInstance().println(a.getClassName());
	}
}