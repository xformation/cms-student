package com.synectiks.student.repository.search;

import com.synectiks.student.domain.AcademicHistory;
import com.synectiks.student.utils.JPASearchRepository;

/**
 * Spring Data Elasticsearch repository for the {@link AcademicHistory} entity.
 */
public interface AcademicHistorySearchRepository extends JPASearchRepository<AcademicHistory, Long> {
}
