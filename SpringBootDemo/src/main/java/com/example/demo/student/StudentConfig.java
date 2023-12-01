package com.example.demo.student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {

	@Bean
	CommandLineRunner commandLineRunner(StudentRepository studentRepository) {

		return args -> {
			Student heatherStudent = new Student("Heather Carson", "john@hotmail.com",
					LocalDate.of(1990, Month.JANUARY, 5));

			Student johnStudent = new Student("John Carson", "john@hotmail.com", LocalDate.of(1995, Month.JANUARY, 5));

			studentRepository.saveAll(List.of(heatherStudent, johnStudent));

		};

	}

}
