package com.synectiks.student.repository.search;

import com.synectiks.student.domain.User;
import com.synectiks.student.utils.JPASearchRepository;

/**
 * Spring Data Elasticsearch repository for the User entity.
 */
public interface UserSearchRepository extends JPASearchRepository<User, Long> {
}
