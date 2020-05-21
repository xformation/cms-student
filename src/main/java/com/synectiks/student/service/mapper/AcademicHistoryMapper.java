package com.synectiks.student.service.mapper;

import com.synectiks.student.domain.*;
import com.synectiks.student.service.dto.AcademicHistoryDTO;

import org.mapstruct.*;

/**
 * Mapper for the entity {@link AcademicHistory} and its DTO {@link AcademicHistoryDTO}.
 */
@Mapper(componentModel = "spring", uses = {StudentMapper.class})
public interface AcademicHistoryMapper extends EntityMapper<AcademicHistoryDTO, AcademicHistory> {

    @Mapping(source = "student.id", target = "studentId")
    AcademicHistoryDTO toDto(AcademicHistory academicHistory);

    @Mapping(source = "studentId", target = "student")
    AcademicHistory toEntity(AcademicHistoryDTO academicHistoryDTO);

    default AcademicHistory fromId(Long id) {
        if (id == null) {
            return null;
        }
        AcademicHistory academicHistory = new AcademicHistory();
        academicHistory.setId(id);
        return academicHistory;
    }
}
