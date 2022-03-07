package com.epam.training.student_iulia_iasoveeva.java_classes.main_task;

import java.util.Date;
import java.util.Objects;

public class Student {
    private int studentId;
    private String name;
    private String lastName;
    private String fartherName;
    private Date dateOfBirth;
    private String faculty;
    private int course;
    private int group;
    private String address;
    private String phoneNumber;

    public Student() {
    }

    public Student(int studentId, String name, String lastName, String fartherName, Date dateOfBirth) {
        this.studentId = studentId;
        this.name = name;
        this.lastName = lastName;
        this.fartherName = fartherName;
        this.dateOfBirth = dateOfBirth;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
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

    public String getFartherName() {
        return fartherName;
    }

    public void setFartherName(String fartherName) {
        this.fartherName = fartherName;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return studentId == student.studentId && course == student.course && group == student.group
                && phoneNumber == student.phoneNumber && name.equals(student.name) && lastName.equals(student.lastName)
                && fartherName.equals(student.fartherName) && dateOfBirth.equals(student.dateOfBirth)
                && faculty.equals(student.faculty) && address.equals(student.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(studentId, name, lastName, fartherName, dateOfBirth, faculty, course, group, address, phoneNumber);
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", faculty='" + faculty + '\'' +
                ", course=" + course +
                ", group=" + group +
                '}';
    }
}
