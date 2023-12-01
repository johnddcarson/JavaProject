package com.example.demo.student;

import java.time.LocalDate;
import java.time.Period;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;

@Entity
@Table
public class Student {

	@Id
	@SequenceGenerator(name = "student_sequence", sequenceName = "student_sequence", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "student_sequence")
	private long id;
	private String nameString;
	private String emailString;
	private LocalDate dobDate;
	@Transient
	private int age;

	public Student() {
		super();
	}

	public Student(long id, String nameString, String emailString, LocalDate dobDate) {
		this.id = id;
		this.nameString = nameString;
		this.emailString = emailString;
		this.dobDate = dobDate;

	}

	public Student(String nameString, String emailString, LocalDate dobDate) {
		this.nameString = nameString;
		this.emailString = emailString;
		this.dobDate = dobDate;

	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNameString() {
		return nameString;
	}

	public void setNameString(String nameString) {
		this.nameString = nameString;
	}

	public String getEmailString() {
		return emailString;
	}

	public void setEmailString(String emailString) {
		this.emailString = emailString;
	}

	public LocalDate getDobDate() {
		return dobDate;
	}

	public void setDobDate(LocalDate dobDate) {
		this.dobDate = dobDate;
	}

	public int getAge() {
		return Period.between(this.dobDate, LocalDate.now()).getYears();
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return String.format(
				"Student [\n" + "  id=%d,\n" + "  name=%s,\n" + "  email=%s,\n" + "  dob=%s,\n" + "  age=%d\n" + "]",
				id, nameString, emailString, dobDate, age);
	}

	public static void print() {
		System.out.println("Print");
	}

}
