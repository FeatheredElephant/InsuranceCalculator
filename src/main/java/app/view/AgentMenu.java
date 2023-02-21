package app.view;

import app.IOManager;
import app.exceptions.InvalidOptionSelectedException;

import java.util.Arrays;
import java.util.List;


public class AgentMenu implements IMenu {
    private static final IOManager IO = IOManager.getInstance();

    private List<Option> options = Arrays.asList(
            new Option("1", "View active customers", this::viewActiveCustomers),
            new Option("2", "View sales history", this::viewSalesHistory),
            new Option("3", "View policy options", this::viewPolicyOptions),
            new Option("4", "Purchase a policy", this::purchasePolicy),
            new Option("5", "Manage existing policy", this::manageExistingPolicy),
            new Option("0", "Exit", () -> IO.println("Thanks for using our application"))
    );

    @Override
    public void view() {
        for (Option option : options) {
            IO.println(option.getOption() + " - " + option.getDescription());
        }
    }

    @Override
    public boolean selectOption(String option) {
        boolean optionSelected = false;
        for (Option opt : options) {
            if (opt.getOption().equals(option)) {
                if (opt.getDescription().equals("Exit")) {
                    return false;
                }
                opt.getMethod().run();
                optionSelected = true;
                break;
            }
        }
        if (!optionSelected) {
            try {
                throw new InvalidOptionSelectedException("Invalid option selected\n");
            } catch (InvalidOptionSelectedException e) {
                IO.reportError(e);
                return false;
            }
        }
        return true;
    }


    private void viewActiveCustomers() {
    }

    private void viewSalesHistory() {
    }

    private void viewPolicyOptions() {
    }

    private void purchasePolicy() {
    }

    private void manageExistingPolicy() {
    }
}