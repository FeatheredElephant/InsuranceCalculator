package app.view;

import app.IOManager;
import app.controller.Calculate;
import app.exceptions.InvalidOptionSelectedException;
import app.model.dao.daoclasses.*;
import app.model.domains.*;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class CustomerMenu implements IMenu {

    private static IOManager IO = IOManager.getInstance();

    private List<Option> options = Arrays.asList(
            new Option("1", "View policy details", this::viewPolicyDetails),
            new Option("2", "View driver information", this::viewDriverInformation),
            new Option("3", "Change driver information", this::changeDriverInformation),
            new Option("4", "Report a claim", this::reportAClaim),
            new Option("5", "Make payment", this::makeAPayment),
            new Option("6", "View policy history", this::viewPolicyHistory),
            new Option("7", "Contact customer support", this::contactCustomerSupport),
            new Option("8", "Calculate monthly insurance", this::calculateInsurance),
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

    private void viewPolicyDetails() {
    }

    private void viewDriverInformation() {
    }

    private void changeDriverInformation() {
    }

    private void reportAClaim() {
    }

    private void makeAPayment() {
    }

    private void viewPolicyHistory() {
    }

    private void contactCustomerSupport() {
    }

    public void calculateInsurance() {
        Scanner input = new Scanner(System.in);
        BigDecimal yearlyRate;

        IO.println("Enter vehicle id:");
        int vehicleId = Integer.parseInt(input.nextLine());
        VehicleDAO vehicleDAO = new VehicleDAO();
        Vehicle vehicle = vehicleDAO.read(vehicleId);

        DriverDAO driverDAO = new DriverDAO();
        List<Driver> drivers = driverDAO.readAll();

        TicketDAO ticketDAO = new TicketDAO();
        List<Ticket> tickets = ticketDAO.readAll();

        AccidentDAO accidentDAO = new AccidentDAO();
        List<Accident> accidents = accidentDAO.readAll();

        // yearlyRate = Calculate.calculate(vehicle, drivers, accidents, tickets);
        // IO.println("The yearly rate is " + yearlyRate);
    }
}
