package org.example.student;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("student-context.xml");
        FabricStudentImpl fabricStudent = context.getBean(FabricStudentImpl.class);
        fabricStudent.createStudent();
    }
}
