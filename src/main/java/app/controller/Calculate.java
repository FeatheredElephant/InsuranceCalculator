package app.controller;

import app.model.domains.*;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Calculate {
    public static BigDecimal calculate(Vehicle vehicle, List<Driver> drivers, List<Accident> accidents, List<Ticket> tickets) {
        BigDecimal monthlyCost = vehicle.getInsurancePlan().getTotalMonthlyCost();
        BigDecimal numDrivers = BigDecimal.valueOf(drivers.size());

        List<String> startDates = new ArrayList<>();
        for (Driver driver : drivers) {
            startDates.add(driver.getStartDate());
        }

        // cost after cut off date
        String cutOffDate = "2015-01-01";
        LocalDate costDate = LocalDate.parse(cutOffDate);
        BigDecimal interestRate = BigDecimal.valueOf(0.20).divide(numDrivers,2,RoundingMode.HALF_UP);
        System.out.println("interest rate is " + interestRate);
        for (String date : startDates) {
            LocalDate startDate = LocalDate.parse(date);
            if (startDate.isAfter(costDate)) {
                monthlyCost = monthlyCost.add(monthlyCost.multiply(interestRate));
            } else {
                interestRate = BigDecimal.valueOf(0.10).divide(numDrivers,2,RoundingMode.HALF_UP);
                monthlyCost = monthlyCost.add(monthlyCost.multiply(interestRate));
            }
        }

        // cost after points
        BigDecimal premiumRate = costAfterPoints(tickets);
        System.out.println("premium rate is " + premiumRate);
        monthlyCost = monthlyCost.add(monthlyCost.multiply(premiumRate));

        // cost after damages
        BigDecimal accidentRate = costAfterDamages(accidents);
        System.out.println("accident rate is " + accidentRate);
        monthlyCost = monthlyCost.add(monthlyCost.multiply(accidentRate));

        MathContext mc = new MathContext(6);
        BigDecimal totalCost = monthlyCost.multiply(BigDecimal.valueOf(12)).setScale(2, RoundingMode.CEILING);

        return totalCost;
    }

    public static BigDecimal costAfterPoints(List<Ticket> tickets) {
        int totalPoints = 0;
        for (Ticket ticket : tickets) {
            totalPoints += ticket.getPoints();
        }

        if (totalPoints > 10) {
            return BigDecimal.valueOf(0.25);
        } else if (totalPoints <= 10 && totalPoints > 5) {
            return BigDecimal.valueOf(0.20);
        }

        return BigDecimal.valueOf(0.10);
    }

    public static BigDecimal costAfterDamages(List<Accident> accidents) {
        BigDecimal totalDamage = BigDecimal.valueOf(0.00);
        for (Accident accident : accidents) {
            totalDamage = totalDamage.add(accident.getDamages());
        }

        if(totalDamage.compareTo(BigDecimal.valueOf(5000)) > 0) {
            return BigDecimal.valueOf(0.40);
        }

        return BigDecimal.valueOf(0.20);
    }
}
