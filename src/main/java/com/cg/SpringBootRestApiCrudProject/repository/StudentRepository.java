package com.cg.SpringBootRestApiCrudProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.SpringBootRestApiCrudProject.entity.Student;
@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

}
