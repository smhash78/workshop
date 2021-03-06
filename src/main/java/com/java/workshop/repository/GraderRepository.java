package com.java.workshop.repository;

import com.java.workshop.model.role.Student.Student;
import com.java.workshop.model.role.grader.Grader;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GraderRepository extends CrudRepository<Grader, Long> {
}
