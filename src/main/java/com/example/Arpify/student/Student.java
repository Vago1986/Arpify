package com.example.Arpify.student;

import java.time.LocalDate;

public class Student {

    private String name;
    private String lastName;
    private String gender;
    private LocalDate DoB;

    public Student() {
    }

    public Student(String name,
                   String lastName,
                   String gender,
                   LocalDate doB) {
        this.name = name;
        this.lastName = lastName;
        this.gender = gender;
        DoB = doB;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public LocalDate getDoB() {
        return DoB;
    }

    public void setDoB(LocalDate doB) {
        DoB = doB;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gender='" + gender + '\'' +
                ", DoB=" + DoB +
                '}';
    }
}
