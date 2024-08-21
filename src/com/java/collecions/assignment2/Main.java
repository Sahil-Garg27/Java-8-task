package com.java.collecions.assignment2;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        // Create dummy data
        TechStack javaTechStack = new TechStack(1, "Java", "Java Programming");
        TechStack pythonTechStack = new TechStack(2, "Python", "Python Programming");
        TechStack sqlTechStack = new TechStack(3, "SQL", "Database Query Language");
        TechStack htmlTechStack = new TechStack(4, "HTML", "Hypertext Markup Language");
        TechStack cssTechStack = new TechStack(5, "CSS", "Cascading Style Sheets");

        Answer ans1 = new Answer("Java is a programming language", true);
        Answer ans2 = new Answer("Java is a coffee", false);
        List<Answer> answers1 = Arrays.asList(ans1, ans2);
        Question q1 = new Question(1, answers1, "Java is a programming language", 10, 1, 1);

        Answer ans3 = new Answer("Python is a programming language", true);
        Answer ans4 = new Answer("Python is a snake", false);
        List<Answer> answers2 = Arrays.asList(ans3, ans4);
        Question q2 = new Question(2, answers2, "Python is a programming language", 10, 2, 2);

        List<Question> questions = Arrays.asList(q1, q2);

        Assignment assignment1 = new Assignment(1, "Java Basics", "Basic Java Assignment", new Date(), questions);
        Assignment assignment2 = new Assignment(2, "Python Basics", "Basic Python Assignment", new Date(), questions);

        Student rohan = new Student(1, "Rohan", "rohan@example.com", "1234567890");
        Student prashant = new Student(2, "Prashant", "prashant@example.com", "0987654321");
        Student anil = new Student(3, "Anil", "anil@example.com", "1122334455");
        Student neha = new Student(4, "Neha", "neha@example.com", "2233445566");
        Student maya = new Student(5, "Maya", "maya@example.com", "3344556677");
        Student akash = new Student(6, "Akash", "akash@example.com", "4455667788");
        Student ritu = new Student(7, "Ritu", "ritu@example.com", "5566778899");
        Student sonia = new Student(8, "Sonia", "sonia@example.com", "6677889900");
        Student nikhil = new Student(9, "Nikhil", "nikhil@example.com", "7788990011");
        Student raj = new Student(10, "Raj", "raj@example.com", "8899001122");

        Trainer john = new Trainer(1, "John", "john@example.com", "1122334455", Arrays.asList(javaTechStack, sqlTechStack));
        Trainer jane = new Trainer(2, "Jane", "jane@example.com", "5566778899", Arrays.asList(pythonTechStack, htmlTechStack));
        Trainer alice = new Trainer(3, "Alice", "alice@example.com", "9988776655", Arrays.asList(cssTechStack));

        Result result1 = new Result(1, rohan, assignment1, john, 85, "Good job", new Date());
        Result result2 = new Result(2, prashant, assignment1, jane, 55, "Needs Improvement", new Date());
        Result result3 = new Result(3, anil, assignment2, john, 90, "Excellent work", new Date());
        Result result4 = new Result(4, neha, assignment2, alice, 65, "Satisfactory", new Date());
        Result result5 = new Result(5, maya, assignment2, jane, 70, "Good effort", new Date());
        Result result6 = new Result(6, akash, assignment1, john, 45, "Below Expectations", new Date());
        Result result7 = new Result(7, ritu, assignment1, alice, 80, "Well done", new Date());
        Result result8 = new Result(8, sonia, assignment2, john, 75, "Good", new Date());
        Result result9 = new Result(9, nikhil, assignment2, jane, 60, "Average", new Date());
        Result result10 = new Result(10, raj, assignment2, alice, 85, "Great job", new Date());

        ResultsData resultsData = new ResultsData();
        resultsData.addResult(result1);
        resultsData.addResult(result2);
        resultsData.addResult(result3);
        resultsData.addResult(result4);
        resultsData.addResult(result5);
        resultsData.addResult(result6);
        resultsData.addResult(result7);
        resultsData.addResult(result8);
        resultsData.addResult(result9);
        resultsData.addResult(result10);

        // Calculate highest performing student
        Map<Student, Integer> studentScores = resultsData.getStudentScores();
        Student highestPerformingStudent = studentScores.entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .orElse(null);

        System.out.println("Highest Performing Student: " + highestPerformingStudent);

        // Calculate second-highest performing student
        List<Map.Entry<Student, Integer>> sortedScores = studentScores.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .collect(Collectors.toList());

        Student secondHighestPerformingStudent = sortedScores.size() > 1 ? sortedScores.get(1).getKey() : null;
        System.out.println("Second Highest Performing Student: " + secondHighestPerformingStudent);

        // Overall ranking of students
        System.out.println("Overall Ranking of Students:");
        studentScores.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));

        // Get students who need improvement
        List<Student> studentsNeedingImprovement = resultsData.getStudentsNeedingImprovement();
        System.out.println("Students Needing Improvement: " + studentsNeedingImprovement);

        // Get all results for a student named "Rohan"
        List<Result> rohanResults = resultsData.getResultsByStudentName("Rohan");
        System.out.println("Results for Rohan: " + rohanResults);

        // Get all results and scores
        Map<Student, Integer> allStudentScores = resultsData.getAllStudentScores();
        System.out.println("All Student Scores: " + allStudentScores);
    }
}


