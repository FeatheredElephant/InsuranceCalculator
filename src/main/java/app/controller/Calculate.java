package app.controller;

import app.model.domains.*;
import app.view.Date;
import app.view.InterestRate;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Calculates the insurance rate of a vehicle based on the number of drivers, accidents, and tickets
 */

public class Calculate {
    public static double calculate(InsurancePlan plan, Vehicle vehicle, List<Driver> drivers, List<Accident> accidents, List<Ticket> tickets) {
        double cost = plan.getDeductible();
        double numDrivers = drivers.size();

        List<java.sql.Date> startDates = drivers.stream().map(date -> date.getDateOfBirth()).collect(Collectors.toList());

        // cost after date
        cost = Math.round(costAfterDate(startDates, numDrivers, cost));
        System.out.println("Cost is " + cost);

        return cost;
    }

    public static double costAfterDate(List<java.sql.Date> startDates, double numDrivers, double monthlyCost) {
        String cutOffDate = Date.CutOffDate.getDate();
        java.sql.Date costDate = java.sql.Date.valueOf(cutOffDate);

        double interestRate = InterestRate.TWENTY.getRate() / numDrivers;
        System.out.println("interest rate is " + interestRate);
        for (java.sql.Date startDate : startDates) {
            // if start date is after costDate
            if (startDate.compareTo(costDate) > 0) {
                monthlyCost += monthlyCost * interestRate;
                System.out.println("Monthly cost is " + monthlyCost);
            } else {
                interestRate = InterestRate.TEN.getRate() / numDrivers;
                monthlyCost += monthlyCost * interestRate;
            }
        }
        return monthlyCost;
    }
}
