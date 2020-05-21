package com.synectiks.student.repository.search;

import com.synectiks.student.domain.Student;
import com.synectiks.student.utils.JPASearchRepository;

/**
 * Spring Data Elasticsearch repository for the {@link Student} entity.
 */
public interface StudentSearchRepository extends JPASearchRepository<Student, Long> {
}
