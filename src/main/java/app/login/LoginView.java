package app.login;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Scanner;

public class LoginView {
    private static Logger LOGGER = LogManager.getLogger(LoginView.class.getName());

    public static void main(String[] args) {
        LoginHandler.register(1, "bob@yahoo.com", "12345", "Bob");
        LoginHandler.register(2, "alice@rocketmail.com", "password", "Alice");
        LoginHandler.register(3, "brooke@gmail.com", "045", "Brooke");
        enterCredentials();
    }

    public static void enterCredentials() {
        Scanner input = new Scanner(System.in);

        LOGGER.info("Enter email:");
        String email = input.nextLine();

        LOGGER.info("Enter password:");
        String password = input.nextLine();

        boolean isLogin = LoginHandler.login(email, password);

        if (isLogin) {
            LOGGER.info("You are logged into your account");
        } else {
            LOGGER.info("Wrong username and password combination.");
        }
    }
}
