package com.java.collecions.assignment2;

import java.util.*;
import java.util.stream.Collectors;

public class ResultsData {
    private List<Result> results;

    // Constructor
    public ResultsData() {
        this.results = new ArrayList<>();
    }

    // Add result
    public void addResult(Result result) {
        results.add(result);
    }

    // Get results by student
    public List<Result> getResultsByStudent(Student student) {
        return results.stream()
                .filter(result -> result.getStudent().equals(student))
                .collect(Collectors.toList());
    }

    // Get student scores
    public Map<Student, Integer> getStudentScores() {
        return results.stream()
                .collect(Collectors.groupingBy(Result::getStudent, Collectors.summingInt(Result::getScore)));
    }

    // Get students needing improvement
    public List<Student> getStudentsNeedingImprovement() {
        return results.stream()
                .filter(result -> result.getScore() < 60)
                .map(Result::getStudent)
                .distinct()
                .collect(Collectors.toList());
    }

    // Get results by student name
    public List<Result> getResultsByStudentName(String studentName) {
        return results.stream()
                .filter(result -> result.getStudent().getName().equals(studentName))
                .collect(Collectors.toList());
    }

    // Get all student scores
    public Map<Student, Integer> getAllStudentScores() {
        return results.stream()
                .collect(Collectors.groupingBy(Result::getStudent, Collectors.summingInt(Result::getScore)));
    }
}
