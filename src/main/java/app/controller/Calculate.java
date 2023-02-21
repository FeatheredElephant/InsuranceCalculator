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
        System.out.println("Cost is " + cost);

        return cost;
    }

    public static double costAfterDate(int startYear, double numDrivers, double monthlyCost) {
        int cutOffYear = Year.CutOffYear.getDate();

        double interestRate = InterestRate.TWENTY.getRate() / numDrivers;
        System.out.println("interest rate is " + interestRate);

        if (startYear > cutOffYear) {
            monthlyCost += monthlyCost * interestRate;
            System.out.println("Monthly cost is " + monthlyCost);
        } else {
            interestRate = InterestRate.TEN.getRate() / numDrivers;
            monthlyCost += monthlyCost * interestRate;
        }

        return monthlyCost;
    }
}
