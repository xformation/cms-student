package com.synectiks.student.graphql.types.student;

import com.synectiks.student.domain.vo.CmsStudentVo;

public class StudentPayload {
    private final CmsStudentVo cmsStudentVo;

    public StudentPayload(CmsStudentVo cmsStudentVo){
        this.cmsStudentVo = cmsStudentVo;
    }

	public CmsStudentVo getCmsStudentVo() {
		return cmsStudentVo;
	}

    
}
