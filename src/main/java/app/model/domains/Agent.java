package app.model.domains;

public class Agent extends User{
	private int agentId;
	
	public Agent(int userId, int agentId, String email, String password, String name) {
		super(userId, email, password, name);
		this.agentId = agentId;
	}

	public int getAgentId() {
		return agentId;
	}
	public void setAgentId(int agentId) {
		this.agentId = agentId;
	}
}