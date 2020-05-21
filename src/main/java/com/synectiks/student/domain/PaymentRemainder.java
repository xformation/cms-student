package com.synectiks.student.domain;


import java.io.Serializable;

public class PaymentRemainder implements Serializable {

    private static final long serialVersionUID = 1L;
    private Long id;
    private String isAutoRemainder;
    private String isFirstPaymentRemainder;
    private Integer firstPaymentRemainderDays;
    private String isSecondPaymentRemainder;
    private Integer secondPaymentRemainderDays;
    private String isOverDuePaymentRemainder;
    private String overDuePaymentRemainderAfterDueDateOrUntilPaid;
    private Integer overDuePaymentRemainderDays;
    private String isRemainderRecipients;
    private String remainderRecipients;
    private Long collegeId;
    private Long branchId;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getIsAutoRemainder() {
		return isAutoRemainder;
	}
	public void setIsAutoRemainder(String isAutoRemainder) {
		this.isAutoRemainder = isAutoRemainder;
	}
	public String getIsFirstPaymentRemainder() {
		return isFirstPaymentRemainder;
	}
	public void setIsFirstPaymentRemainder(String isFirstPaymentRemainder) {
		this.isFirstPaymentRemainder = isFirstPaymentRemainder;
	}
	public Integer getFirstPaymentRemainderDays() {
		return firstPaymentRemainderDays;
	}
	public void setFirstPaymentRemainderDays(Integer firstPaymentRemainderDays) {
		this.firstPaymentRemainderDays = firstPaymentRemainderDays;
	}
	public String getIsSecondPaymentRemainder() {
		return isSecondPaymentRemainder;
	}
	public void setIsSecondPaymentRemainder(String isSecondPaymentRemainder) {
		this.isSecondPaymentRemainder = isSecondPaymentRemainder;
	}
	public Integer getSecondPaymentRemainderDays() {
		return secondPaymentRemainderDays;
	}
	public void setSecondPaymentRemainderDays(Integer secondPaymentRemainderDays) {
		this.secondPaymentRemainderDays = secondPaymentRemainderDays;
	}
	public String getIsOverDuePaymentRemainder() {
		return isOverDuePaymentRemainder;
	}
	public void setIsOverDuePaymentRemainder(String isOverDuePaymentRemainder) {
		this.isOverDuePaymentRemainder = isOverDuePaymentRemainder;
	}
	public String getOverDuePaymentRemainderAfterDueDateOrUntilPaid() {
		return overDuePaymentRemainderAfterDueDateOrUntilPaid;
	}
	public void setOverDuePaymentRemainderAfterDueDateOrUntilPaid(String overDuePaymentRemainderAfterDueDateOrUntilPaid) {
		this.overDuePaymentRemainderAfterDueDateOrUntilPaid = overDuePaymentRemainderAfterDueDateOrUntilPaid;
	}
	public Integer getOverDuePaymentRemainderDays() {
		return overDuePaymentRemainderDays;
	}
	public void setOverDuePaymentRemainderDays(Integer overDuePaymentRemainderDays) {
		this.overDuePaymentRemainderDays = overDuePaymentRemainderDays;
	}
	public String getIsRemainderRecipients() {
		return isRemainderRecipients;
	}
	public void setIsRemainderRecipients(String isRemainderRecipients) {
		this.isRemainderRecipients = isRemainderRecipients;
	}
	public String getRemainderRecipients() {
		return remainderRecipients;
	}
	public void setRemainderRecipients(String remainderRecipients) {
		this.remainderRecipients = remainderRecipients;
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
