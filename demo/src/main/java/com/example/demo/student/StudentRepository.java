package com.example.demo.student;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository //Esta interface é responsavel para acessar os dados
public interface StudentRepository 
	extends JpaRepository<Student, Long>{
	
	@Query("SELECT s from Student s WHERE s.email = ?1")
	Optional<Student> findStudentByEmail(String email);
}
