package com.java.collecions.assignment2;
public class Answer {
    private String answerText;
    private boolean isCorrect;

    // Constructor
    public Answer(String answerText, boolean isCorrect) {
        this.answerText = answerText;
        this.isCorrect = isCorrect;
    }

    // Getters and Setters
    public String getAnswerText() { return answerText; }
    public void setAnswerText(String answerText) { this.answerText = answerText; }

    public boolean isCorrect() { return isCorrect; }
    public void setCorrect(boolean isCorrect) { this.isCorrect = isCorrect; }

    @Override
    public String toString() {
        return answerText;
    }
}
