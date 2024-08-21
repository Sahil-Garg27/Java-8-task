package com.java.collecions.assignment2;

import java.util.*;

public class Result {
    private int resultId;
    private Student student;
    private Assignment assignment;
    private Trainer trainer;
    private int score;
    private String feedback;
    private Date submissionDate;

    // Constructor
    public Result(int resultId, Student student, Assignment assignment, Trainer trainer, int score, String feedback, Date submissionDate) {
        this.resultId = resultId;
        this.student = student;
        this.assignment = assignment;
        this.trainer = trainer;
        this.score = score;
        this.feedback = feedback;
        this.submissionDate = submissionDate;
    }

    // Getters and Setters
    public int getResultId() { return resultId; }
    public void setResultId(int resultId) { this.resultId = resultId; }

    public Student getStudent() { return student; }
    public void setStudent(Student student) { this.student = student; }

    public Assignment getAssignment() { return assignment; }
    public void setAssignment(Assignment assignment) { this.assignment = assignment; }

    public Trainer getTrainer() { return trainer; }
    public void setTrainer(Trainer trainer) { this.trainer = trainer; }

    public int getScore() { return score; }
    public void setScore(int score) { this.score = score; }

    public String getFeedback() { return feedback; }
    public void setFeedback(String feedback) { this.feedback = feedback; }

    public Date getSubmissionDate() { return submissionDate; }
    public void setSubmissionDate(Date submissionDate) { this.submissionDate = submissionDate; }

    @Override
    public String toString() {
        return student.getName() + " scored " + score + " in " + assignment.getTitle();
    }
}


