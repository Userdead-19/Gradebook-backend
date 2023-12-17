package com.example.Gradebook.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Courseinfo")
public class Courseinfo {
    private String courseid;
    private String coursename;
    private String instructor;
    private String semester;
    private int credits;

    public Courseinfo() {
    }

    public String getCourseid() {
        return courseid;
    }

    public void setCourseid(String courseid) {
        this.courseid = courseid;
    }

    public String getCoursename() {
        return coursename;
    }

    public void setCoursename(String coursename) {
        this.coursename = coursename;
    }

    public String getInstructor() {
        return instructor;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    @Override
    public String toString() {
        return "Courseinfo [courseid=" + courseid + ", coursename=" + coursename + ", instructor=" + instructor
                + ", semester=" + semester + ", credits=" + credits + "]";
    }

}
