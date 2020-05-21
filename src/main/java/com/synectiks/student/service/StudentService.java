package com.synectiks.student.service;

import com.synectiks.student.service.dto.StudentDTO;

import java.util.List;
import java.util.Optional;

/**
 * Service Interface for managing {@link com.synectiks.student.domain.Student}.
 */
public interface StudentService {

    /**
     * Save a student.
     *
     * @param studentDTO the entity to save.
     * @return the persisted entity.
     */
    StudentDTO save(StudentDTO studentDTO);

    /**
     * Get all the students.
     *
     * @return the list of entities.
     */
    List<StudentDTO> findAll();


    /**
     * Get the "id" student.
     *
     * @param id the id of the entity.
     * @return the entity.
     */
    Optional<StudentDTO> findOne(Long id);

    /**
     * Delete the "id" student.
     *
     * @param id the id of the entity.
     */
    void delete(Long id);

    /**
     * Search for the student corresponding to the query.
     *
     * @param query the query of the search.
     * 
     * @return the list of entities.
     */
    List<StudentDTO> search(String query);
}
