package app.controller;

import app.model.domains.*;
import app.view.Year;
import app.view.InterestRate;

import java.util.List;

/**
 * Calculates the insurance rate of a vehicle based on the number of drivers, accidents, and tickets
 */

public class Calculate {
    public static double calculate(InsurancePlan plan, Vehicle vehicle, List<Driver> drivers, List<Accident> accidents, List<Ticket> tickets) {
        double cost = plan.getDeductible();
        double numDrivers = drivers.size();

        int startYear = vehicle.getYear();

        // cost after date
        cost = Math.round(costAfterDate(startYear, numDrivers, cost));

        // cost after number of accidents
        cost = cost + cost * costAfterAccidents(accidents.size());

        // cost after the number of tickets
        cost = cost + cost * costAfterTickets(tickets.size());

        return cost;
    }

    public static double costAfterDate(int startYear, double numDrivers, double monthlyCost) {
        int cutOffYear = Year.CutOffYear.getDate();

        double interestRate = InterestRate.TWENTY.getRate() / numDrivers;

        if (startYear > cutOffYear) {
            monthlyCost += monthlyCost * interestRate;
        } else {
            interestRate = InterestRate.TEN.getRate() / numDrivers;
            monthlyCost += monthlyCost * interestRate;
        }

        return monthlyCost;
    }

    public static double costAfterAccidents(int numOfAccidents) {
        if (numOfAccidents > 5)
            return InterestRate.FOURTY.getRate();
        else if (numOfAccidents < 5 && numOfAccidents > 1)
            return InterestRate.TWENTY_FIVE.getRate();
        return 0;
    }

    public static double costAfterTickets(int numOfTickets) {
        if (numOfTickets > 7)
            return InterestRate.FOURTY.getRate();
        else if (numOfTickets < 7 && numOfTickets > 1)
            return InterestRate.TWENTY.getRate();
        return 0;
    }
}
