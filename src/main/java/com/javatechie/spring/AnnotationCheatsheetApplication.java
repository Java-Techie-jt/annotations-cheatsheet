package com.javatechie.spring;

import com.javatechie.spring.entity.Student;
import com.javatechie.spring.repository.StudentRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@SpringBootApplication
public class AnnotationCheatsheetApplication {

    private StudentRepository studentRepository;

    public AnnotationCheatsheetApplication(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @PostConstruct
    public void initStudents() {
        studentRepository.saveAll(Stream.of(
                        new Student(101, "Basant", 14, "Science"),
                        new Student(102, "Santosh", 48, "Arts"),
                        new Student(103, "Rajesh", 16, "Commerce"),
                        new Student(104, "Sam", 12, "Arts"))
                .collect(Collectors.toList()));
    }

    public static void main(String[] args) {
        SpringApplication.run(AnnotationCheatsheetApplication.class, args);
    }

}
