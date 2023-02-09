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
        String user = "customer";

        switch (user) {
            case "customer":
                customerMenu = new CustomerMenu();
                do {
                    customerMenu.view();
                    option = scanner.next();
                    customerMenu.selectOption(option);
                } while (!option.equals("0"));
                io.println("User exits application.");
                break;
            case "agent":
                agentMenu = new AgentMenu();
                do {
                    agentMenu.view();
                    option = scanner.next();
                    agentMenu.selectOption(option);
                } while (!option.equals("0"));
                io.println("User exits application.");
        }


    }
}
