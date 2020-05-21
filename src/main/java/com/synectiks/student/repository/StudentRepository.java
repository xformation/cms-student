package com.synectiks.student.repository;

import org.springframework.stereotype.Repository;

import com.synectiks.student.domain.Student;
import com.synectiks.student.utils.JPASearchRepository;


/**
 * Spring Data  repository for the Student entity.
 */
@SuppressWarnings("unused")
@Repository
public interface StudentRepository extends JPASearchRepository<Student, Long> {

}
