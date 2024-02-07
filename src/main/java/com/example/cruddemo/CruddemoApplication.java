package com.example.cruddemo;

import com.example.cruddemo.dao.StudentDAO;
import com.example.cruddemo.entity.Student;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class CruddemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(CruddemoApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(StudentDAO studentDAO) {
        return runner -> {
//            createStudent(studentDAO);
//            findStudent(studentDAO);
//            findAll(studentDAO);
//            findByLastName(studentDAO);
//            updateStudent(studentDAO);
//            deleteStudent(studentDAO);
//            deleteAll(studentDAO);

        };
    }

    private void createStudent(StudentDAO studentDAO) {
        Student tempStudent = new Student("John", "Doe", "johnd@mockmail.com");

        studentDAO.save(tempStudent);

        System.out.println("Student created: " + tempStudent + " with id: " + tempStudent.getId());
    }

    private void findStudent(StudentDAO studentDAO) {
        Student myStudent = studentDAO.findById(3);

        System.out.println("Student found: " + myStudent);
    }

    private void findAll(StudentDAO studentDAO) {
        List<Student> students = studentDAO.findAll();

        students.forEach(System.out::println);
    }

    private void findByLastName(StudentDAO studentDAO) {
        List<Student> students = studentDAO.findByLastName("Davis");

        students.forEach(System.out::println);
    }

    private void updateStudent(StudentDAO studentDAO) {
        // retrieve student by id
        Student student = studentDAO.findById(2);

        // update details
        student.setFirstName("Scooby");
        student.setLastName("Doo");

        // save the updated student
        studentDAO.update(student);
    }

    private void deleteStudent(StudentDAO studentDAO) {
        int studentId = 11;

        System.out.println("Deleting student with the id: " + studentId);

        studentDAO.delete(studentId);
    }

    private void deleteAll(StudentDAO studentDAO) {
        System.out.println("Deleting all students!!");

        int numRowsDeleted = studentDAO.deleteAll();

        System.out.println("Deleted rows count: " + numRowsDeleted);
    }

}
