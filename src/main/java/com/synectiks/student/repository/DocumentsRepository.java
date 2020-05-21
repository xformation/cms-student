package com.synectiks.student.repository;

import org.springframework.stereotype.Repository;

import com.synectiks.student.domain.Documents;
import com.synectiks.student.utils.JPASearchRepository;


/**
 * Spring Data  repository for the Documents entity.
 */
@SuppressWarnings("unused")
@Repository
public interface DocumentsRepository extends JPASearchRepository<Documents, Long> {

}
