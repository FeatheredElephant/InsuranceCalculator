package app.view;
import app.IOManager;
import app.exceptions.InvalidOptionSelectedException;
import app.model.dao.daoclasses.AgentDAO;
import app.model.dao.daoclasses.CustomerDAO;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import app.controller.Login.LoginHandler;
import app.model.domains.User;
import java.util.Scanner;

public class LoginView implements IView {
    private static IOManager io = IOManager.getInstance();

    public static void main(String[] args) {
        //LoginHandler.addCustomer(1, "bob@yahoo.com", "12345", "Bob", "Harris", "123 456 7890", 1);
        //LoginHandler.addCustomer(2, "alice@rocketmail.com", "password", "Alice", "Wonder", "098 765 4321", 2);
        //LoginHandler.addAgent(3, "brooke@gmail.com", "045", "Brooke", "Boss", "018 723 1470", 1);;
        login();
    }

    public static void login() {
        io.println("\nEnter username:");
        String username = io.requestString();

        io.println("Enter password:");
        String password = io.requestString();

        User user = LoginHandler.login(username, password);
        if (user == null) {
            login();
            return;
        }
        IMenu menu = null;
        if (new AgentDAO().readAll().parallelStream().anyMatch(a -> a.getUserId() == user.getId())){
            menu = new AgentMenu();
        }
        else if (new CustomerDAO().readAll().parallelStream().anyMatch(c -> c.getUserId() == user.getId())){
            menu = new CustomerMenu();
        }

        menu.view();
        menu.selectOption(io.requestString());
    }

    public void view(){}
}