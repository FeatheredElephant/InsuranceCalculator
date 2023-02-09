package app.controller.Login;

import app.IOManager;
import app.model.domains.Agent;
import app.model.domains.Customer;
import app.model.domains.User;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

public class LoginHandler {
    private static List<User> loginSystem = new ArrayList<>();
    
    public static User login(String email, String password) {
    	Optional<User> u = loginSystem.parallelStream()
    		.filter(user -> user.getEmail().equals(email) && user.getPassword().equals(password))
    		.findAny();
    	try {
    		return u.get();
    	}
    	catch (NoSuchElementException e) {
    		IOManager.getInstance().println("Incorrect username or password.");
    		return null;
    	}
    }
    
    public static void addCustomer(int userId, String email, String password, String name, int customerId) {
    	Customer user = new Customer(userId, email, password, name, customerId);
    	loginSystem.add(user);
    }
    
    public static void addAgent(int userId, String email, String password, String name, int agentId) {
    	Agent user = new Agent(userId, email, password, name, agentId);
    	loginSystem.add(user);
    }
}