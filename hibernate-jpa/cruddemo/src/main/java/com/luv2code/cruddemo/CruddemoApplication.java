package com.luv2code.cruddemo;

import com.luv2code.cruddemo.dao.StudentDAO;
import com.luv2code.cruddemo.entity.Student;
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
	public CommandLineRunner commandLineRunner(StudentDAO studentDAO){
		return runner ->{
//			queryStudent(studentDAO);
//			createStudent(studentDAO);
//			updateStudent(studentDAO);
//			deleteStudent(studentDAO);
			deleteAll(studentDAO);
		};
	}

	private void createStudent(StudentDAO studentDAO){
		System.out.println("Create new student Obj");
		Student tempStudent = new Student("Lin", "Ye", "ll@gmail.com");
		System.out.println("Saving the student");
		studentDAO.save(tempStudent);
//		System.out.println("Saved student" + tempStudent.getFirstName());

//		System.out.println("read student" + studentDAO.findById(1));

	}
	private void queryStudent(StudentDAO studentDAO){
//		List<Student> theStudents = studentDAO.findAll();
		List<Student> theStudents = studentDAO.findByLastName("Ye");
		for (Student tempStudent : theStudents){
			System.out.println(tempStudent);
		}
	}

	private void updateStudent(StudentDAO studentDAO){
		Student theStudent = studentDAO.findById(1);
		theStudent.setLastName("zhou");
		studentDAO.update(theStudent);
	}

	private void deleteStudent(StudentDAO studentDAO){
		studentDAO.delete(1);
	}

	private void deleteAll(StudentDAO studentDAO){
		System.out.println(studentDAO.deleteAll());
	}
}
