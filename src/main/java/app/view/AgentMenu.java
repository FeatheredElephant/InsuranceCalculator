package app.view;
import app.IOManager;
import app.exception.InvalidOptionSelectedException;


public class AgentMenu implements IMenu {

    IOManager io = IOManager.getInstance();

    @Override
    public void viewOptions() {
        io.println("1 - View active customers");
        io.println("2 - View sales history");
        io.println("3 - View policy options");
        io.println("4 - Purchase a policy");
        io.println("5 - Manage existing policy");
        io.println("0 - exit");
    }

    @Override
    public void selectOption(String option) {
        switch (option) {
            case"0":
                io.println("Thanks for using our application");
                break;
            case "1":
                viewActiveCustomers();
                break;
            case "2":
                viewSalesHistory();
                break;
            case "3":
                viewPolicyOptions();
                break;
            case "4":
                purchasePolicy();
                break;
            case "5":
                manageExistingPolicy();
            default:
                try {
                    throw new InvalidOptionSelectedException("\nInvalid option selected\n");
                } catch (InvalidOptionSelectedException e) {
                    io.reportError(e);
                }
        }
    }

    private void viewActiveCustomers(){}
    private void viewSalesHistory(){}
    private void viewPolicyOptions(){}
    private void purchasePolicy(){}
    private void manageExistingPolicy(){}
}
