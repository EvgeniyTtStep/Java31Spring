package org.example.student;

public class FabricStudentImpl implements FabricStudent {

    Student student;

    @Override
    public void createStudent() {
        System.out.println(student.study());
    }


    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}
