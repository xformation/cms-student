package com.synectiks.student.graphql.resolvers;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.synectiks.student.business.service.CmsStudentService;
import com.synectiks.student.business.service.CommonService;
import com.synectiks.student.business.service.StudentFilterProcessor;
import com.synectiks.student.config.ApplicationProperties;
import com.synectiks.student.constant.CmsConstants;
import com.synectiks.student.domain.Batch;
import com.synectiks.student.domain.Branch;
import com.synectiks.student.domain.Department;
import com.synectiks.student.domain.DueDate;
import com.synectiks.student.domain.FeeCategory;
import com.synectiks.student.domain.FeeDetails;
import com.synectiks.student.domain.Invoice;
import com.synectiks.student.domain.PaymentRemainder;
import com.synectiks.student.domain.Section;
import com.synectiks.student.domain.Student;
import com.synectiks.student.domain.vo.CmsStudentVo;
import com.synectiks.student.filter.student.StudentListFilterInput;
import com.synectiks.student.graphql.types.Invoice.AddInvoiceInput;
import com.synectiks.student.graphql.types.Invoice.AddInvoicePayload;
import com.synectiks.student.graphql.types.student.StudentInput;
import com.synectiks.student.graphql.types.student.StudentPayload;
import com.synectiks.student.service.util.CommonUtil;
import com.synectiks.student.service.util.DateFormatUtil;

@Component
public class Mutation implements GraphQLMutationResolver {

    private final static Logger logger = LoggerFactory.getLogger(Mutation.class);

    @Autowired
    CommonService commonService;

    @Autowired
    CmsStudentService cmsStudentService;

    @Autowired
    private StudentFilterProcessor studentFilterProcessor;
    
    @Autowired
    private ApplicationProperties applicationProperties;
    
    public StudentPayload saveStudent(StudentInput cmsStudentVo) {
	    CmsStudentVo vo = this.cmsStudentService.addStudent(cmsStudentVo);
	    return new StudentPayload(vo);
    }

    public AddInvoicePayload addInvoice(AddInvoiceInput addInvoiceInput) {
    	Invoice invoice   = new Invoice();
        
    	if(addInvoiceInput.getFeeCategoryId() != null) {
    		String url = this.applicationProperties.getFeeSrvUrl()+"/feecategory-by-id/"+addInvoiceInput.getFeeCategoryId();
    		FeeCategory obj = this.commonService.getObject(url, FeeCategory.class);
//    		Optional<FeeCategory> feeCategory = feeCategoryRepository.findById(addInvoiceInput.getFeeCategoryId());
        	if(obj != null) {
        		invoice.setFeeCategory(obj);
        	}
    	}
    	if(addInvoiceInput.getFeeDetailsId() != null) {
    		String url = this.applicationProperties.getFeeSrvUrl()+"/feedetails-by-id/"+addInvoiceInput.getFeeDetailsId();
    		FeeDetails obj = this.commonService.getObject(url, FeeDetails.class);
    		
//    		Optional<FeeDetails> feeDetails = feeDetailsRepository.findById(addInvoiceInput.getFeeDetailsId());
    		if(obj != null) {
    			invoice.setFeeDetails(obj);
    		}
        }
    	if(addInvoiceInput.getDueDateId() != null) {
    		String url = this.applicationProperties.getFeeSrvUrl()+"/duedate-by-id/"+addInvoiceInput.getDueDateId();
    		DueDate obj = this.commonService.getObject(url, DueDate.class);
//    		Optional<DueDate> dueDate = dueDateRepository.findById(addInvoiceInput.getDueDateId());
    		if(obj != null) {
    			invoice.setDueDate(obj);
    	        
    		}
    	}
    	if(addInvoiceInput.getPaymentRemainderId() != null) {
    		String url = this.applicationProperties.getFeeSrvUrl()+"/paymentremainder-by-id/"+addInvoiceInput.getPaymentRemainderId();
    		PaymentRemainder obj = this.commonService.getObject(url, PaymentRemainder.class);
//    		Optional<PaymentRemainder> paymentRemainder = paymentRemainderRepository.findById(addInvoiceInput.getPaymentRemainderId());
    		if(obj != null) {
    			invoice.setPaymentRemainder(obj);
    		}
    	}
        
        Student student = this.cmsStudentService.getStudent(addInvoiceInput.getStudentId());
        
    	invoice.setStudentId(addInvoiceInput.getStudentId());
        invoice.setBranchId(addInvoiceInput.getBranchId());
        invoice.setAcademicYearId(addInvoiceInput.getAcademicyearId());
        invoice.setAmountPaid(addInvoiceInput.getAmountPaid());
        invoice.setModeOfPayment(addInvoiceInput.getModeOfPayment());
        invoice.setChequeNumber(addInvoiceInput.getChequeNumber());
        invoice.setDemandDraftNumber(addInvoiceInput.getDemandDraftNumber());
        invoice.setUpdatedBy(addInvoiceInput.getUpdatedBy());
        invoice.setUpdatedOn(LocalDate.now());
        invoice.setPaymentStatus("PAID");
        Long dt = System.currentTimeMillis();
        invoice.setInvoiceNumber(String.valueOf(addInvoiceInput.getStudentId())+""+String.valueOf(dt));
        invoice.setPaymentDate(LocalDate.now());
        invoice.setBank(addInvoiceInput.getBank());
        
        CmsStudentVo vo = CommonUtil.createCopyProperties(student, CmsStudentVo.class);
        vo.setFeeDetailsList(this.studentFilterProcessor.getFeeDetailsList(vo));
		vo.setFacilityList(this.studentFilterProcessor.getFacilityList(vo));
		
		Float totalFee = this.cmsStudentService.getTotalFees(vo.getFeeDetailsList(), vo.getFacilityList());
        Long totalFeePaid = this.cmsStudentService.getTotalFeePaid(vo);
        Long outstandingAmount = totalFee.longValue() -  (totalFeePaid + addInvoiceInput.getAmountPaid());
        invoice.setOutStandingAmount(outstandingAmount);
        //        invoice.setNextPaymentDate();
        
//        invoice.setOnlineTxnRefNumber(addInvoiceInput.getOnlineTxnRefNumber());
//        invoice.setComments(addInvoiceInput.getComments());
//        invoice.setCollegeId(addInvoiceInput.getCollegeId());
        
        String url = this.applicationProperties.getFeeSrvUrl()+"/cmsinvoice";
        invoice = this.commonService.postObject(url, invoice, Invoice.class);
//        invoiceRepository.save(invoice);
        return new AddInvoicePayload(invoice);
    }

    // Needed
    public List<CmsStudentVo> getStudentList(StudentListFilterInput filter) throws Exception {
    	List<Student> list = this.studentFilterProcessor.searchStudent(filter);
    	List<CmsStudentVo> ls = new ArrayList<>();
    	
    	String prefUrl = applicationProperties.getPrefSrvUrl();
    	for(Student student: list) {
    		CmsStudentVo vo = CommonUtil.createCopyProperties(student, CmsStudentVo.class);
    		
    		String url = prefUrl+"/api/section-by-id/"+vo.getSectionId();
    		Section se = this.commonService.getObject(url, Section.class);
//    		Section se = this.commonService.getSectionById(vo.getSectionId());

    		url = prefUrl+"/api/branch-by-id/"+vo.getBranchId();
    		Branch br = this.commonService.getObject(url, Branch.class);
//    		Branch br = this.commonService.getBranchById(vo.getBranchId());

    		url = prefUrl+"/api/department-by-id/"+vo.getDepartmentId();
    		Department de = this.commonService.getObject(url, Department.class);
//    		Department de = this.commonService.getDepartmentById(vo.getDepartmentId());
    		
    		url = prefUrl+"/api/batch-by-id/"+vo.getBatchId();
    		Batch ba = this.commonService.getObject(url, Batch.class);
//    		Batch ba = this.commonService.getBatchById(vo.getBatchId());
    		vo.setStrDateOfBirth(DateFormatUtil.changeLocalDateFormat(student.getDateOfBirth(), CmsConstants.DATE_FORMAT_dd_MM_yyyy));
    		vo.setDateOfBirth(null);
    		vo.setSection(se);
    		vo.setBranch(br);
    		vo.setBatch(ba);
    		vo.setDepartment(de);
    		vo.setFeeDetailsList(this.studentFilterProcessor.getFeeDetailsList(vo));
    		vo.setFacilityList(this.studentFilterProcessor.getFacilityList(vo));
    		vo.setTotalFee(this.studentFilterProcessor.getTotalFees(vo.getFeeDetailsList(), vo.getFacilityList()));
    		vo.setTotalFeePaid(this.studentFilterProcessor.getTotalFeesPaid(vo));
    		vo.setTotalFeeOverDue(this.studentFilterProcessor.getTotalFeesOverDue(vo));
    		vo.setPaymentHistory(this.studentFilterProcessor.getPaymentHistory(vo));
    		vo.setStrNextPaymentDate(this.studentFilterProcessor.getNextPaymentDate(vo));
//    		vo.setDepartmentId(student.getDepartmentId() != null ? student.getDepartmentId() : null);
//    		vo.setBatchId(student.getBatchId() != null ? student.getBatchId() : null);
//    		vo.setSectionId(student.getSectionId() != null ? student.getSectionId() : null);
//    		vo.setBranchId(student.getBranchId() != null ? student.getBranchId() : null);
    		ls.add(vo);
    	}
    	logger.debug("Total students retrieved. "+list.size());
    	return ls;
    }

}
