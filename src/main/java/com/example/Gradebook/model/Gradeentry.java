package com.example.Gradebook.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Gradeentry")
public class Gradeentry {
    private String rollno;
    private String courseid;
    private float Assignment1;
    private float Assignment2;
    private float finalmarks;

    private String comments;

    public String getRollno() {
        return rollno;
    }

    public void setRollno(String rollno) {
        this.rollno = rollno;
    }

    public String getCourseid() {
        return courseid;
    }

    public void setCourseid(String courseid) {
        this.courseid = courseid;
    }

    public float getAssignment1() {
        return Assignment1;
    }

    public void setAssignment1(float assignment1) {
        Assignment1 = assignment1;
    }

    public float getAssignment2() {
        return Assignment2;
    }

    public void setAssignment2(float assignment2) {
        Assignment2 = assignment2;
    }

    public float getFinalmarks() {
        return finalmarks;
    }

    public void setFinalmarks(float finalmarks) {
        this.finalmarks = finalmarks;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    @Override
    public String toString() {
        return "Gradeentry [rollno=" + rollno + ", courseid=" + courseid + ", Assignment1=" + Assignment1
                + ", Assignment2=" + Assignment2 + ", finalmarks=" + finalmarks + ", comments=" + comments + "]";
    }

    public Gradeentry() {
    }

    public void setMarks(float finalmarks2) {
    }
}
