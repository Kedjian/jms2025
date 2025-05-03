package dev.lpa;

import dev.lpa.domain.Employee;
import dev.lpa.domain.EmployeeComparator;
import dev.lpa.domain.StoreEmployee;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>(List.of(
                new Employee(10001, "Ralph", 2015),
                new Employee(10002, "Agathe", 2021),
                new Employee(10003, "Robert", 2013),
                new Employee(10004, "Bartholomew", 197)));

        employees.sort(new Employee.EmployeeComparator<>("yearStarted").reversed());

        for (Employee e : employees) {
            System.out.println(e);
        }

        System.out.println("Store Members");

        List<StoreEmployee> storeEmployees = new ArrayList<>(List.of(
                new StoreEmployee(10015, "Caroline", 2013, "Walmart "),
                new StoreEmployee(10016, "David", 2007, "Frog Store "),
                new StoreEmployee(10017, "Gordon", 2005, "Pokemon Center "),
                new StoreEmployee(10019, "Skipping numbers, huh?", 2001, "Malicious Plushies Store ")
        ));

        var comparator = new StoreEmployee().new StoreComparator<>();
        storeEmployees.sort(comparator);
        for (StoreEmployee e : storeEmployees) {
            System.out.println(e);
        }
    }
}
