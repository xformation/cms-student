package com.synectiks.student.repository.search;

import com.synectiks.student.domain.UserPreference;
import com.synectiks.student.utils.JPASearchRepository;

/**
 * Spring Data Elasticsearch repository for the {@link UserPreference} entity.
 */
public interface UserPreferenceSearchRepository extends JPASearchRepository<UserPreference, Long> {
}
