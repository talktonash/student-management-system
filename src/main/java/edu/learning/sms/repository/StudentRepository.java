package edu.learning.sms.repository;


import edu.learning.sms.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

public interface StudentRepository extends JpaRepository<Student,Long>{

}
