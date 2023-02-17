package app.view;
import app.exceptions.InvalidOptionSelectedException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import app.controller.Login.LoginHandler;
import app.model.domains.User;
import java.util.Scanner;

public class LoginView implements IView {

    private static Logger LOGGER = LogManager.getLogger(LoginView.class.getName());

    public static void main(String[] args) {
        LoginHandler.addCustomer(1, "bob@yahoo.com", "12345", "Bob", 1);
        LoginHandler.addCustomer(2, "alice@rocketmail.com", "password", "Alice", 2);
        LoginHandler.addAgent(3, "brooke@gmail.com", "045", "Brooke", 1);
        login();
    }

    public static void login() {
        Scanner input = new Scanner(System.in);

        LOGGER.info("Enter email:");
        String email = input.nextLine();

        LOGGER.info("Enter password:");
        String password = input.nextLine();

        // input.close();

        User user = LoginHandler.login(email, password);
        if (user == null) {
            login();
            return;
        }

//        IMenu menu = null;
        switch (user.getClass().getSimpleName().toLowerCase()) {
            case "customer" -> MainMenu.displayMenu(UserType.CUSTOMER);
            //                menu = new CustomerMenu();
            case "agent" -> MainMenu.displayMenu(UserType.AGENT);
            //                menu = new AgentMenu();
            default -> {
                try {
                    throw new InvalidOptionSelectedException("invalid user type");
                } catch (InvalidOptionSelectedException e) {
                    LOGGER.error(e);
                }
            }
        }
    }

    @Override
    public void view() {
        // TODO Auto-generated method stub

    }
}