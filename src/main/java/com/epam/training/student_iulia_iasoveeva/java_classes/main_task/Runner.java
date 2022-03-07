package com.epam.training.student_iulia_iasoveeva.java_classes.main_task;

public class Runner {
    public static void main(String[] args) {
        Student[] students = StudentCreator.createArrayOfStudents(200);
        Student[] studentsByFaculty = StudentsUtils.listOfStudentsByFaculty(students, "Slytherin");
        Student[] studentsByFacultyAndCourse = StudentsUtils
                .listOfStudentsByFacultyAndCourse(students, "Gryffindor", 2);
        Student[] studentByYear = StudentsUtils.listOfStudentsBornAfter(students, 2001);
        Student[] studentByGroup = StudentsUtils.listOfStudentsByGroup(students, 2093);

        Printer.print("Task a");
        Printer.printStudents(studentsByFaculty);
        Printer.print("Task b");
        Printer.printStudents(studentsByFacultyAndCourse);
        Printer.print("Task c");
        Printer.printStudents(studentByYear);
        Printer.print("Task d");
        Printer.printStudents(studentByGroup);
    }
}
