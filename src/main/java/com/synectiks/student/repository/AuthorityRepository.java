package com.synectiks.student.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.synectiks.student.domain.Authority;

/**
 * Spring Data JPA repository for the {@link Authority} entity.
 */
public interface AuthorityRepository extends JpaRepository<Authority, String> {
}
