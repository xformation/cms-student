package com.synectiks.student.repository.search;

import com.synectiks.student.domain.Documents;
import com.synectiks.student.utils.JPASearchRepository;

/**
 * Spring Data Elasticsearch repository for the {@link Documents} entity.
 */
public interface DocumentsSearchRepository extends JPASearchRepository<Documents, Long> {
}
