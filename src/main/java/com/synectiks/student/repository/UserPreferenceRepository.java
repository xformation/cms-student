package com.synectiks.student.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.synectiks.student.domain.UserPreference;


/**
 * Spring Data  repository for the UserPreference entity.
 */
@SuppressWarnings("unused")
@Repository
public interface UserPreferenceRepository extends JpaRepository<UserPreference, Long> {

}
