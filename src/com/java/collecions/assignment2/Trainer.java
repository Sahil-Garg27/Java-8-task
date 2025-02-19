package com.java.collecions.assignment2;

import java.util.*;

public class Trainer {
    private int trainerId;
    private String name;
    private String email;
    private String contactNumber;
    private List<TechStack> techStacks;

    // Constructor
    public Trainer(int trainerId, String name, String email, String contactNumber, List<TechStack> techStacks) {
        this.trainerId = trainerId;
        this.name = name;
        this.email = email;
        this.contactNumber = contactNumber;
        this.techStacks = techStacks;
    }

    // Getters and Setters
    public int getTrainerId() { return trainerId; }
    public void setTrainerId(int trainerId) { this.trainerId = trainerId; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getContactNumber() { return contactNumber; }
    public void setContactNumber(String contactNumber) { this.contactNumber = contactNumber; }

    public List<TechStack> getTechStacks() { return techStacks; }
    public void setTechStacks(List<TechStack> techStacks) { this.techStacks = techStacks; }

    @Override
    public String toString() {
        return name + " (ID: " + trainerId + ")";
    }
}

