package app.view;

import app.IOManager;
import app.exception.InvalidOptionSelectedException;

public class CustomerMenu implements IMenu{

    IOManager io = IOManager.getInstance();

    @Override
    public void viewOptions() {
        io.println("1 - View policy details");
        io.println("2 - View driver information");
        io.println("3 - Change driver information");
        io.println("4 - Report a claim");
        io.println("5 - Make payment");
        io.println("6 - View policy history");
        io.println("7 - Contact customer support");
        io.println("0 - exit");
    }

    @Override
    public void selectOption(String option) {
        switch (option){
            case"0":
            io.println("Thanks for using our application!");
            break;
            case"1":
            viewPolicyDetails();
                break;
            case"2":
                viewDriverInformation();
                break;
            case"3":
                changeDriverInformation();
                break;
            case"4":
                reportAClaim();
                break;
            case"5":
                makeAPayment();
                break;
            case"6":
                viewPolicyHistory();
                break;
            case"7":
                contactCustomerSupport();
                break;
            default:
                try {
                    throw new InvalidOptionSelectedException("\nInvalid option selected,please try again\n");
                } catch (InvalidOptionSelectedException e) {
                    io.reportError(e);
                }
        }
    }

    private void viewPolicyDetails(){}
    private void viewDriverInformation(){}
    private void changeDriverInformation(){}
    private void reportAClaim(){}
    private void makeAPayment(){}
    private void viewPolicyHistory(){}
    private void contactCustomerSupport(){}

}
