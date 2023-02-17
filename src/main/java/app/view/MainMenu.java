package app.view;
import app.IOManager;
import java.util.Scanner;

public class MainMenu {

    private static final IOManager io = IOManager.getInstance();

    public static void displayMenu(UserType userType) {
        Scanner scanner;
        IMenu menu = null;
        String option;
        boolean isExit;

        switch (userType){
            case CUSTOMER:
                menu = new CustomerMenu();
                break;
            case AGENT:
                menu = new AgentMenu();
                break;
            default:
                io.println("Invalid user type");
                break;
        }

        do {
            menu.view();
            scanner = new Scanner(System.in);
            option = scanner.nextLine();
            isExit = menu.selectOption(option);
//            scanner.close();
        } while (isExit);

        io.println("User exits application.");
    }


}
