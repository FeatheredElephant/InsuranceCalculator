package app.view;
import app.IOManager;
import java.util.Scanner;

public class MainMenu {

    private static final IOManager io = IOManager.getInstance();
    private static final Scanner scanner = new Scanner(System.in);

    public static void displayMenu(String userType) {
        IMenu menu;
        String option;
        boolean isExit;

        if (userType.equals("customer")) {
            menu = new CustomerMenu();
        } else if (userType.equals("agent")) {
            menu = new AgentMenu();
        } else {
            io.println("Invalid user type.");
            return;
        }

        do {
            menu.view();
            option = scanner.next();
            isExit = menu.selectOption(option);
        } while (isExit);
        io.println("User exits application.");
    }

}
