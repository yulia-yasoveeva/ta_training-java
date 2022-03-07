package com.epam.training.student_iulia_iasoveeva.java_classes.main_task;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

public class StudentsUtils {

    private StudentsUtils() {
    }

    public static Student[] listOfStudentsByFaculty(Student[] original, String faculty) {
        List<Student> studentList = new ArrayList<>();
        for (Student s : original) {
            if (s.getFaculty().equals(faculty)) {
                studentList.add(s);
            }
        }
        return studentList.toArray(new Student[0]);
    }

    public static Student[] listOfStudentsByFacultyAndCourse(Student[] original, String faculty, int course) {
        Student[] originalFiltered = listOfStudentsByFaculty(original, faculty);
        List<Student> studentListFiltered = new ArrayList<>();
        for (Student s : originalFiltered) {
            if (s.getCourse() == course) {
                studentListFiltered.add(s);
            }
        }
        return studentListFiltered.toArray(new Student[0]);
    }

    public static Student[] listOfStudentsBornAfter(Student[] original, int year) {
        List<Student> studentFilteredYear = new ArrayList<>();
        for (Student s : original) {
            if (s.getDateOfBirth().after(new GregorianCalendar(year, Calendar.DECEMBER, 31).getTime())) {
                studentFilteredYear.add(s);
            }
        }
        return studentFilteredYear.toArray(new Student[0]);
    }

    public static Student[] listOfStudentsByGroup(Student[] original, int group) {
        List<Student> studentFilteredGroup = new ArrayList<>();
        for (Student s : original) {
            if (s.getGroup() == group) {
                studentFilteredGroup.add(s);
            }
        }
        return studentFilteredGroup.toArray(new Student[0]);
    }
}

