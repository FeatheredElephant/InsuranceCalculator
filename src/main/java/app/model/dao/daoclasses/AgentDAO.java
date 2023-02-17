package app.model.dao.daoclasses;
import app.model.dao.daointerfaces.IDao;
import app.model.domains.Agent;

public class AgentDAO extends InsuranceCalculatorDao<Agent> implements IDao<Agent> {
	public AgentDAO(Class<Agent> defaultClass){
		super(defaultClass);
	}
	public AgentDAO(){
		super(Agent.class);
	}
}