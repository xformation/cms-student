package com.synectiks.student.domain;


import java.io.Serializable;

public class DueDate implements Serializable {

    private static final long serialVersionUID = 1L;
    
    private Long id;
    private String paymentMethod;
    private Integer installments;
    private String dayDesc;
    private Integer paymentDay;
    private String frequency;
    private Long collegeId;
    private Long branchId;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getPaymentMethod() {
		return paymentMethod;
	}
	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}
	public Integer getInstallments() {
		return installments;
	}
	public void setInstallments(Integer installments) {
		this.installments = installments;
	}
	public String getDayDesc() {
		return dayDesc;
	}
	public void setDayDesc(String dayDesc) {
		this.dayDesc = dayDesc;
	}
	public Integer getPaymentDay() {
		return paymentDay;
	}
	public void setPaymentDay(Integer paymentDay) {
		this.paymentDay = paymentDay;
	}
	public String getFrequency() {
		return frequency;
	}
	public void setFrequency(String frequency) {
		this.frequency = frequency;
	}
	public Long getCollegeId() {
		return collegeId;
	}
	public void setCollegeId(Long collegeId) {
		this.collegeId = collegeId;
	}
	public Long getBranchId() {
		return branchId;
	}
	public void setBranchId(Long branchId) {
		this.branchId = branchId;
	}

    
}
