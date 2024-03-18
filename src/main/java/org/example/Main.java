package org.example;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Student Alice = new Student("Alice", "Bauch", 1);
        Student Mike = new Student("Mike", "Müller", 2);
        Student Laura = new Student("Laura", "Lulu", 3);

        List<Student> students = new ArrayList<>();
        students.add(Alice);
        students.add(Mike);
        students.add(Laura);

        School school1 = new School();
        school1.setStudents(students);

        System.out.println(school1.getStudents().toString());

        Student foundedStudent = new Student();
        System.out.println(foundedStudent.findStudentById(students, 3));
        System.out.println(school1.removeStudent(2));

        Course JavaCourse = new Course("Java Kurs", "Lukas", "Java Room");
        Course CSharpCourse = new Course("C# Kurs", "Phili", "C# Room");

        List<Course> courses = new ArrayList<>();
        courses.add(JavaCourse);
        courses.add(CSharpCourse);

        Alice.addCourses(courses);

        List<Course> AliceCourses =  school1.getCoursesByStudentId(1);
        for (Course AliceCourse : AliceCourses) {
            System.out.printf(AliceCourse.toString());
        }
    }
}