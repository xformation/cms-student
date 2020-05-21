package com.synectiks.student.repository;

import org.springframework.stereotype.Repository;

import com.synectiks.student.domain.AcademicHistory;
import com.synectiks.student.utils.JPASearchRepository;


/**
 * Spring Data  repository for the AcademicHistory entity.
 */
@SuppressWarnings("unused")
@Repository
public interface AcademicHistoryRepository extends JPASearchRepository<AcademicHistory, Long> {

}
