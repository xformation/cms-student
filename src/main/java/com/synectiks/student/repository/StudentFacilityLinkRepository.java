package com.synectiks.student.repository;

import org.springframework.stereotype.Repository;

import com.synectiks.student.domain.StudentFacilityLink;
import com.synectiks.student.utils.JPASearchRepository;


/**
 * Spring Data  repository for the StudentFacilityLink entity.
 */
@SuppressWarnings("unused")
@Repository
public interface StudentFacilityLinkRepository extends JPASearchRepository<StudentFacilityLink, Long> {

}
