package app.view;


import app.IOManager;

import java.util.Scanner;

public class MainMenu {
    public static void main(String[] args) {

        IOManager io = IOManager.getInstance();
        Scanner scanner = new Scanner(System.in);
        CustomerMenu customerMenu;
        AgentMenu agentMenu;
        String option;
        boolean isExit;
        String user = "customer";

        switch (user) {
            case "customer":
                customerMenu = new CustomerMenu();
                do {
                    customerMenu.view();
                    option = scanner.next();
                    isExit = customerMenu.selectOption(option);
                } while (isExit);
                io.println("User exits application.");
                break;
            case "agent":
                agentMenu = new AgentMenu();
                do {
                    agentMenu.view();
                    option = scanner.next();
                    isExit = agentMenu.selectOption(option);
                } while (isExit);
                io.println("User exits application.");
        }


    }
}
