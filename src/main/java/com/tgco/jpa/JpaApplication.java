package com.tgco.jpa;

import com.tgco.jpa.models.Student;
import com.tgco.jpa.repositories.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class JpaApplication {


	public static void main(String[] args) {
		SpringApplication.run(JpaApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(StudentRepository studentRepo) {
		return runner -> {
//			createStudent(studentRepo);
			readStudent(studentRepo);
		};
	}

	private void readStudent(StudentRepository studentRepo) {
		Student student = new Student("daisy", "Ossaija", "codebugsolved@gmail.com");
		studentRepo.save(student);
		Student studentData = studentRepo.findById(student.getId());
		System.out.println(studentData);
	}

	private void createStudent(StudentRepository studentRepo) {
		System.out.println("creating student");
		Student student = new Student("Thankgod", "Ossaija", "codebugsolved@gmail.com");
		studentRepo.save(student);

		System.out.println("Saved student. Generated Id: " + student.getId());
	}
}
