package org.example;

import java.util.List;

public class School {

    private List<Student> students;

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public Student removeStudent(int id) {
        Student studentToDelete = new Student();
        return studentToDelete.findStudentById(this.students, id);
    }

    @Override
    public String toString() {
        return "School{" +
                "students=" + students +
                '}';
    }

    public List<Course> getCoursesByStudentId(int studentId) {
        Student students = new Student();

        Student student = students.findStudentById(this.students, studentId);

        if (student != null) {
            List<Course> studentCourses = student.getCourses();
            return studentCourses;
        }
        return null;
    }
}
