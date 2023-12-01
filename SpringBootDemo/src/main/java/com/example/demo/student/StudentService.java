package com.example.demo.student;

import static com.example.demo.student.Student.print;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;

@Service
public class StudentService {

	private final StudentRepository studentRepository;

	@Autowired
	public StudentService(StudentRepository studentRepository) {
		super();
		this.studentRepository = studentRepository;
	}

	public List<Student> getStudents() {
		return studentRepository.findAll();

	}

	public void addNewStudent(Student student) {
		Optional<Student> studentOptional = studentRepository.findStudentByEmail(student.getEmailString());

		if (studentOptional.isPresent()) {
			// throw new IllegalStateException("Email used");
			System.out.println("Email Used");

		}

		studentRepository.save(student);
		System.out.println("Added");
		print();
	}

	public void deleteStudent(Long studentId) {

		boolean sb = studentRepository.existsById(studentId);

		if (!sb) {
			System.out.println("Can't find student");
		} else {
			studentRepository.deleteById(studentId);
			System.out.println("Delete");
		}

	}

	@Transactional
	public void updateStudent(Long studentId, String name, String email) {

		Student student = studentRepository.findById(studentId)
				.orElseThrow(() -> new IllegalStateException("Student not found"));

		if (email != null) {
			student.setEmailString(email);
			System.out.println("Updated");
		}

		if (name != null) {
			student.setNameString(name);
			System.out.println("Updated");
		}

	}

}
