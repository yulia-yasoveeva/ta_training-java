package com.epam.training.student_iulia_iasoveeva.java_classes.main_task;

import com.github.javafaker.Faker;

public class StudentCreator {

    private StudentCreator() {
    }

    public static Student[] createArrayOfStudents(int quantity) {
        Student[] students = new Student[quantity];
        Faker faker = new Faker();
        for (int i = 0; i < quantity; i++) {
            Student student = new Student();
            student.setStudentId(i);
            student.setName(faker.name().firstName());
            student.setLastName(faker.name().lastName());
            student.setFartherName(faker.name().name());
            student.setDateOfBirth(faker.date().birthday());
            student.setPhoneNumber(faker.phoneNumber().phoneNumber());
            student.setAddress(faker.address().fullAddress());
            student.setCourse(faker.random().nextInt(1, 5));
            student.setGroup(faker.random().nextInt(2090, 2096));
            student.setFaculty(faker.harryPotter().house());
            students[i] = student;
        }
        return students;
    }
}
