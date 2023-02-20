package app.controller;

import app.model.domains.*;
import app.view.Date;
import app.view.InterestRate;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

public class Calculate {
//    public static BigDecimal calculate(Vehicle vehicle, List<Driver> drivers, List<Accident> accidents, List<Ticket> tickets) {
//        BigDecimal monthlyCost = vehicle.getInsurancePlan().getTotalMonthlyCost();
//        BigDecimal numDrivers = BigDecimal.valueOf(drivers.size());
//
//        List<String> startDates = drivers.stream().map(date -> date.getStartDate()).collect(Collectors.toList());
//
//        // cost after date
//        monthlyCost = costAfterDate(startDates, numDrivers, monthlyCost);
//
//        // cost after points
//        BigDecimal premiumRate = costAfterPoints(tickets);
//        System.out.println("premium rate is " + premiumRate);
//        monthlyCost = monthlyCost.add(monthlyCost.multiply(premiumRate));
//
//        // cost after damages
//        BigDecimal accidentRate = costAfterDamages(accidents);
//        System.out.println("accident rate is " + accidentRate);
//        monthlyCost = monthlyCost.add(monthlyCost.multiply(accidentRate));
//
//        BigDecimal totalCost = monthlyCost.multiply(BigDecimal.valueOf(12)).setScale(2, RoundingMode.CEILING);
//
//        return totalCost;
//    }
//
//    public static BigDecimal costAfterDate(List<String> startDates, BigDecimal numDrivers, BigDecimal monthlyCost) {
//        String cutOffDate = Date.CutOffDate.getDate();
//        LocalDate costDate = LocalDate.parse(cutOffDate);
//
//        BigDecimal interestRate = BigDecimal.valueOf(InterestRate.TWENTY.getRate()).divide(numDrivers,2,RoundingMode.HALF_UP);
//        System.out.println("interest rate is " + interestRate);
//        for (String date : startDates) {
//            LocalDate startDate = LocalDate.parse(date);
//            if (startDate.isAfter(costDate)) {
//                monthlyCost = monthlyCost.add(monthlyCost.multiply(interestRate));
//            } else {
//                interestRate = BigDecimal.valueOf(InterestRate.TEN.getRate()).divide(numDrivers,2,RoundingMode.HALF_UP);
//                monthlyCost = monthlyCost.add(monthlyCost.multiply(interestRate));
//            }
//        }
//        return monthlyCost;
//    }
//
//    public static BigDecimal costAfterPoints(List<Ticket> tickets) {
//        List<Integer> points = tickets.stream().map(point -> point.getPoints()).collect(Collectors.toList());
//        Integer totalPoints = points.stream().collect(Collectors.summingInt(Integer::intValue));
//
//        if (totalPoints > 10) {
//            return BigDecimal.valueOf(InterestRate.TWENTY_FIVE.getRate());
//        } else if (totalPoints <= 10 && totalPoints > 5) {
//            return BigDecimal.valueOf(InterestRate.TWENTY.getRate());
//        }
//
//        return BigDecimal.valueOf(InterestRate.TEN.getRate());
//    }
//
//    public static BigDecimal costAfterDamages(List<Accident> accidents) {
//        List<BigDecimal> damages = accidents.stream().map(accident -> accident.getDamages()).collect(Collectors.toList());
//        BigDecimal totalDamage = damages.stream().reduce(BigDecimal.ZERO, (p,q) -> p.add(q));
//
//        if(totalDamage.compareTo(BigDecimal.valueOf(5000)) > 0) {
//            return BigDecimal.valueOf(InterestRate.FOURTY.getRate());
//        }
//
//        return BigDecimal.valueOf(InterestRate.TWENTY.getRate());
//    }
}
