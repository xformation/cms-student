package com.synectiks.student.business.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import com.synectiks.student.domain.Student;
import com.synectiks.student.domain.StudentFacilityLink;
import com.synectiks.student.graphql.types.student.StudentInput;
import com.synectiks.student.repository.StudentFacilityLinkRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Component;

@Component
public class StudentFacilityLinkService {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    StudentFacilityLinkRepository studentFacilityLinkRepository;

    @Autowired
    CmsStudentService cmsStudentService;

    @Autowired
    CommonService commonService;

    public StudentFacilityLink saveStudentFacility(StudentInput input) {
        Student student = this.cmsStudentService.getStudent(input.getId());
        logger.debug("Making entries in teach for the given student id : "+input.getStudentId()+"and facility id : "+input.getFacilityId());
        StudentFacilityLink studentFacilityLink = new StudentFacilityLink();
        studentFacilityLink.setStudent(student);
        studentFacilityLink.setFacilityId(input.getFacilityId());
        Optional<StudentFacilityLink> oth = this.studentFacilityLinkRepository.findOne(Example.of(studentFacilityLink));
        if(!oth.isPresent()) {
            studentFacilityLink.setLinkDesc("Student - "+student.getStudentName() );
            StudentFacilityLink sf = this.studentFacilityLinkRepository.save(studentFacilityLink);
            logger.debug("StudentFacility data saved : "+studentFacilityLink);
            return sf;
        }else {
            logger.debug("StudentFacility mapping already exists. "+oth.get());
        }
        return oth.get();
    }


}
