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
    }
}