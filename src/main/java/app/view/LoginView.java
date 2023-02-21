package app.view;
import app.IOManager;
import app.exceptions.InvalidOptionSelectedException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import app.controller.Login.LoginHandler;
import app.model.domains.User;
import java.util.Scanner;

public class LoginView implements IView {
    private static IOManager io = IOManager.getInstance();

    public static void main(String[] args) {
        LoginHandler.addCustomer(1, "bob@yahoo.com", "12345", "Bob", "Harris", "123 456 7890", 1);
        LoginHandler.addCustomer(2, "alice@rocketmail.com", "password", "Alice", "Wonder", "098 765 4321", 2);
        LoginHandler.addAgent(3, "brooke@gmail.com", "045", "Brooke", "Boss", "018 723 1470", 1);
        LoginView lv = new LoginView();
        lv.view();
    }

    public void view() {
        io.println("Enter username:");
        String username = io.requestString();

        io.println("Enter password:");
        String password = io.requestString();

        User user = LoginHandler.login(username, password);
        if (user == null) {
            view();
            return;
        }

        IMenu menu = null;
        switch (user.getClass().getSimpleName().toLowerCase()) {
            case "customer" -> MainMenu.displayMenu(UserType.CUSTOMER);
            case "agent" -> MainMenu.displayMenu(UserType.AGENT);
            default -> {
                try {
                    throw new InvalidOptionSelectedException("invalid user type");
                } catch (InvalidOptionSelectedException e) {
                    io.reportError(e);
                }
            }
        }
    }
}