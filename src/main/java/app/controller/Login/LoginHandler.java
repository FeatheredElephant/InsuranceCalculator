package app.controller.Login;

import app.IOManager;
import app.model.dao.daoclasses.AgentDAO;
import app.model.dao.daoclasses.CustomerDAO;
import app.model.dao.daoclasses.UserDAO;
import app.model.domains.Agent;
import app.model.domains.Customer;
import app.model.domains.User;

import java.util.NoSuchElementException;
import java.util.Optional;

public class LoginHandler {
    public static User login(String username, String password) {
        try {
            UserDAO uDao = new UserDAO();
            Optional<User> u = uDao.readAll().parallelStream()
                    .filter(user -> user.getUsername().equals(username) && user.getPassword().equals(password))
                    .findAny();
            return u.get();
        } catch (NoSuchElementException e) {
            IOManager.getInstance().println("Incorrect username or password.");
        }
        return null;
    }

    public static void addCustomer(int userId, String username, String password, String firstName, String lastName, String phone, int customerId) {
        User user = new User(userId, username, password, firstName, lastName, phone);
        Customer customer = new Customer(customerId, userId);

        UserDAO uDAO = new UserDAO();
        CustomerDAO cDAO = new CustomerDAO();

        uDAO.create(user);
        cDAO.create(customer);
    }

    public static void addAgent(int userId, String username, String password, String firstName, String lastName, String phone, int agentId) {
		User user = new User(userId, username, password, firstName, lastName, phone);
		Agent agent = new Agent(agentId, userId);

		UserDAO uDAO = new UserDAO();
		AgentDAO aDAO = new AgentDAO();

		uDAO.create(user);
		aDAO.create(agent);
    }
}