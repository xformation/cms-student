package com.synectiks.student.repository.search;

import com.synectiks.student.domain.StudentFacilityLink;
import com.synectiks.student.utils.JPASearchRepository;

/**
 * Spring Data Elasticsearch repository for the {@link StudentFacilityLink} entity.
 */
public interface StudentFacilityLinkSearchRepository extends JPASearchRepository<StudentFacilityLink, Long> {
}
