package com.synectiks.student.business.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.synectiks.student.domain.FeeDetails;
import com.synectiks.student.domain.Student;
import com.synectiks.student.domain.StudentFacilityLink;
import com.synectiks.student.domain.vo.CmsInvoice;
import com.synectiks.student.domain.vo.CmsStudentVo;
import com.synectiks.student.filter.student.StudentListFilterInput;

@Component
public class StudentFilterProcessor {


    @Autowired
    private CmsStudentService cmsStudentService;

//    public List<Student> searchStudent(Long departmentId, Long batchId, Long sectionId, Long branchId, Gender gender, StudentTypeEnum studentType, String studentName){
//        return cmsStudentService.searchStudent(departmentId, batchId, sectionId, branchId, gender, studentType, studentName);
//    }
    
    public List<Student> searchStudent(StudentListFilterInput filter){
        return cmsStudentService.searchStudent(filter);
    }
    
    public List<FeeDetails> getFeeDetailsList(CmsStudentVo vo){
        return cmsStudentService.getFeeDetailsList(vo);
    }
    
    public Float getTotalFees(List<FeeDetails> feeDetailsList, List<StudentFacilityLink> facilityList) {
    	return cmsStudentService.getTotalFees(feeDetailsList, facilityList);
    }
    
    public Long getTotalFeesPaid(CmsStudentVo vo) {
    	return cmsStudentService.getTotalFeePaid(vo);
    }
    public Long getTotalFeesOverDue(CmsStudentVo vo) {
    	return cmsStudentService.getTotalFeeOverDue(vo);
    }
    
    public List<StudentFacilityLink> getFacilityList(CmsStudentVo vo){
        return cmsStudentService.getFacilityList(vo);
    }
    
    public List<CmsInvoice> getPaymentHistory(CmsStudentVo vo){
    	return cmsStudentService.getPaymentHistory(vo);
    }
    
    public String getNextPaymentDate(CmsStudentVo vo) {
    	List<CmsInvoice> list = cmsStudentService.getPaymentHistory(vo);
    	if(list.size() > 0) {
    		return list.get(0).getStrNextPaymentDate();
    	}
    	return null;
    }
}

