package com.synectiks.student.service.mapper;

import com.synectiks.student.domain.*;
import com.synectiks.student.service.dto.StudentFacilityLinkDTO;

import org.mapstruct.*;

/**
 * Mapper for the entity {@link StudentFacilityLink} and its DTO {@link StudentFacilityLinkDTO}.
 */
@Mapper(componentModel = "spring", uses = {StudentMapper.class})
public interface StudentFacilityLinkMapper extends EntityMapper<StudentFacilityLinkDTO, StudentFacilityLink> {

    @Mapping(source = "student.id", target = "studentId")
    StudentFacilityLinkDTO toDto(StudentFacilityLink studentFacilityLink);

    @Mapping(source = "studentId", target = "student")
    StudentFacilityLink toEntity(StudentFacilityLinkDTO studentFacilityLinkDTO);

    default StudentFacilityLink fromId(Long id) {
        if (id == null) {
            return null;
        }
        StudentFacilityLink studentFacilityLink = new StudentFacilityLink();
        studentFacilityLink.setId(id);
        return studentFacilityLink;
    }
}
