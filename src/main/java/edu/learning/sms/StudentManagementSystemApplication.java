package edu.learning.sms;

import edu.learning.sms.entity.Student;
import edu.learning.sms.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}

	@Autowired
	private StudentRepository studentRepository;
	@Override
	public void run(String... args) throws Exception {
//		Student student1 = new Student("Naresh","Kumar","test@gmail.com");
//		Student student2 = new Student("Naveen","Kumar","test1@gmail.com");
//		Student student3 = new Student("Sanjay","Bansal","test2@gmail.com");
//		studentRepository.save(student1);
//		studentRepository.save(student2);
//		studentRepository.save(student3);
	}
}
