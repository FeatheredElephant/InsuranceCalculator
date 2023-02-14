package app.model.dao.daoclasses;
import app.model.dao.daointerfaces.IDao;
import app.model.domains.Agent;

public class AgentDAO extends InsuranceCalculatorDao<Agent> implements IDao<Agent> {
	AgentDAO(Class<Agent> defaultClass){
		super(defaultClass);
	}
	AgentDAO(){
		super(Agent.class);
	}
}