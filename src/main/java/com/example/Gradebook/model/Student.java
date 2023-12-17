package com.example.Gradebook.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Student")
public class Student {

    private String Rollno;
    private String firstName;
    private String lastName;
    private String dob;
    private String email;

    public String getRollno() {
        return Rollno;
    }

    public void setRollno(String rollno) {
        Rollno = rollno;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Student() {
    }

    @Override
    public String toString() {
        return "Student [Rollno=" + Rollno + ", firstName=" + firstName + ", lastName=" + lastName + ", dob=" + dob
                + ", email=" + email + "]";
    }

}
