package com.java.collecions.employeeDataProcessing;

import java.time.LocalDate;

class Employee {
    private String name;
    private String gender;
    private String department;
    private int age;
    private int salary;
    private LocalDate joinDate;
    private int experience;

    // Constructor, getters, setters, etc.

    public Employee(String name, String gender, String department, int age, int salary, LocalDate joinDate, int experience) {
        this.name = name;
        this.gender = gender;
        this.department = department;
        this.age = age;
        this.salary = salary;
        this.joinDate = joinDate;
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", department='" + department + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", joinDate=" + joinDate +
                ", experience=" + experience +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public LocalDate getJoinDate() {
        return joinDate;
    }

    public void setJoinDate(LocalDate joinDate) {
        this.joinDate = joinDate;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }
}
