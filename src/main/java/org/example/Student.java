package org.example;

import java.util.List;

public class Student {

    private String firstName;
    private String lastName;
    private int studentId;

    private List<Course> courses;

    public Student(String firstName, String lastName, int studentId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.studentId = studentId;
    }

    public Student() {}

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

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", studentId=" + studentId +
                ", courses=" + courses +
                '}';
    }

    public Student findStudentById(List<Student> students, int id) {
        for (Student student : students) {
            if ( student.getStudentId() == id) {
                return student;
            }
        }
        return null;
    }

    public void addCourses(List<Course> courses) {
        setCourses(courses);
    }
}
