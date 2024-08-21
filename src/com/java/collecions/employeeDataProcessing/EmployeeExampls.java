package com.java.collecions.employeeDataProcessing;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class EmployeeExampls {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Alice", "Female", "IT", 30, 5000, LocalDate.of(2015, 6, 15), 6),
                new Employee("Bob", "Male", "HR", 25, 4500, LocalDate.of(2018, 8, 20), 4)
        );

        // Gender count
        Map<String, Long> genderCount = employees.stream()
                .collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));

        System.out.println("Gender Count: " + genderCount);

        // Departments
        Set<String> departments = employees.stream()
                .map(Employee::getDepartment)
                .collect(Collectors.toSet());

        System.out.println("Departments: " + departments);

        // Average age by gender
        Map<String, Double> avgAgeByGender = employees.stream()
                .collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingInt(Employee::getAge)));

        System.out.println("Average Age by Gender: " + avgAgeByGender);

        // Highest and second highest paid employees
        Employee highestPaid = employees.stream()
                .max(Comparator.comparingInt(Employee::getSalary))
                .orElse(null);

        Employee secondHighestPaid = employees.stream()
                .sorted(Comparator.comparingInt(Employee::getSalary).reversed())
                .skip(1)
                .findFirst()
                .orElse(null);

        System.out.println("Highest Paid: " + highestPaid);
        System.out.println("Second Highest Paid: " + secondHighestPaid);

        // Employees joined after 2015
        List<Employee> joinedAfter2015 = employees.stream()
                .filter(e -> e.getJoinDate().isAfter(LocalDate.of(2015, 12, 31)))
                .collect(Collectors.toList());

        System.out.println("Joined After 2015: " + joinedAfter2015);

        // Count of employees in each department
        Map<String, Long> deptCount = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));

        System.out.println("Department Count: " + deptCount);

        // Average salary by department
        Map<String, Double> avgSalaryByDept = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.averagingInt(Employee::getSalary)));

        System.out.println("Average Salary by Department: " + avgSalaryByDept);

        // Most experienced employee
        Employee mostExperienced = employees.stream()
                .max(Comparator.comparingInt(Employee::getExperience))
                .orElse(null);

        System.out.println("Most Experienced: " + mostExperienced);

        // Youngest male employee by department
        Map<String, Optional<Employee>> youngestMaleByDept = employees.stream()
                .filter(e -> "Male".equals(e.getGender()))
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.minBy(Comparator.comparingInt(Employee::getAge))));

        System.out.println("Youngest Male by Department: " + youngestMaleByDept);

        // Average and total salary of the organization
        DoubleSummaryStatistics stats = employees.stream()
                .collect(Collectors.summarizingDouble(Employee::getSalary));

        System.out.println("Average Salary: " + stats.getAverage());
        System.out.println("Total Salary: " + stats.getSum());
    }
}
