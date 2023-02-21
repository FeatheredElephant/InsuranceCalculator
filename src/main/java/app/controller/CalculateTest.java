package app.controller;
import app.model.domains.*;

import java.math.BigDecimal;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class CalculateTest {
    public static <SimpleDate> void main(String[] args) {
        // list of objects
        List<Driver> drivers = new ArrayList<>();
        List<Ticket> tickets = new ArrayList<>();
        List<Accident> accidents = new ArrayList<>();

        // creating objects to create vehicle
        Agent agent = new Agent(1,1);
        InsurancePlan plan = new InsurancePlan(1, "Blue Cross", "Insurance Plan 1", 500, 4500);
        Vehicle vehicle1 = new Vehicle(1, "SUV", "Land Cruiser", 1999, "198AB5", 1, 1, 1);

        // creating objects to create driver
        Date date;
        Driver driver1 = new Driver(1, "Bob", "Billard", Date.valueOf("1950-08-08"), 1);
        drivers.add(driver1);
        Driver driver2 = new Driver(2, "Molly", "Walbert", Date.valueOf("1975-06-08"), 1);
        drivers.add(driver2);
        Driver driver3 = new Driver(3, "Mike", "Walbert", Date.valueOf("1975-09-05"), 1);
        drivers.add(driver3);

        // creating ticket objects

        Ticket ticket1 = new Ticket(1, Date.valueOf("2015-03-31"), 1,"parking");
        tickets.add(ticket1);
        Ticket ticket2 = new Ticket(2, Date.valueOf("2022-06-01"), 1,"speeding");
        tickets.add(ticket2);
        Ticket ticket3 = new Ticket(3, Date.valueOf("2023-01-06"), 1, "parking");
        tickets.add(ticket3);

        // creating accidents objects
        Accident accident1 = new Accident(1, Date.valueOf("2017-03-06"),1, 1, "fire hydrant destroyed");
        accidents.add(accident1);
        Accident accident2 = new Accident(2, Date.valueOf("2018-04-07"), 2, 1, "collision");
        accidents.add(accident2);
        Accident accident3 = new Accident(3, Date.valueOf("2019-09-08"), 3, 1, "2nd collision");
        accidents.add(accident3);

        double totalCost = Calculate.calculate(plan, vehicle1,drivers, accidents, tickets);
        System.out.println("Total cost for a year: " + totalCost);
    }
}
