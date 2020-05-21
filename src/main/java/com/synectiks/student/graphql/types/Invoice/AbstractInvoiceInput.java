package com.synectiks.student.graphql.types.Invoice;

import java.util.Date;

public class AbstractInvoiceInput {
    private Long id;
    private String invoiceNumber;
    private Long amountPaid;
    private Date paymentDate;
    private Date nextPaymentDate;
    private Long outStandingAmount;
    private String modeOfPayment;
    private Long chequeNumber;
    private Long demandDraftNumber;
    private String onlineTxnRefNumber;
    private String paymentStatus;
    private String comments;
    private String updatedBy;
    private Date updatedOn;
    private String bank;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getInvoiceNumber() {
		return invoiceNumber;
	}
	public void setInvoiceNumber(String invoiceNumber) {
		this.invoiceNumber = invoiceNumber;
	}
	public Long getAmountPaid() {
		return amountPaid;
	}
	public void setAmountPaid(Long amountPaid) {
		this.amountPaid = amountPaid;
	}
	public Date getPaymentDate() {
		return paymentDate;
	}
	public void setPaymentDate(Date paymentDate) {
		this.paymentDate = paymentDate;
	}
	public Date getNextPaymentDate() {
		return nextPaymentDate;
	}
	public void setNextPaymentDate(Date nextPaymentDate) {
		this.nextPaymentDate = nextPaymentDate;
	}
	public Long getOutStandingAmount() {
		return outStandingAmount;
	}
	public void setOutStandingAmount(Long outStandingAmount) {
		this.outStandingAmount = outStandingAmount;
	}
	public String getModeOfPayment() {
		return modeOfPayment;
	}
	public void setModeOfPayment(String modeOfPayment) {
		this.modeOfPayment = modeOfPayment;
	}
	public Long getChequeNumber() {
		return chequeNumber;
	}
	public void setChequeNumber(Long chequeNumber) {
		this.chequeNumber = chequeNumber;
	}
	public Long getDemandDraftNumber() {
		return demandDraftNumber;
	}
	public void setDemandDraftNumber(Long demandDraftNumber) {
		this.demandDraftNumber = demandDraftNumber;
	}
	public String getOnlineTxnRefNumber() {
		return onlineTxnRefNumber;
	}
	public void setOnlineTxnRefNumber(String onlineTxnRefNumber) {
		this.onlineTxnRefNumber = onlineTxnRefNumber;
	}
	public String getPaymentStatus() {
		return paymentStatus;
	}
	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	public String getUpdatedBy() {
		return updatedBy;
	}
	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}
	public Date getUpdatedOn() {
		return updatedOn;
	}
	public void setUpdatedOn(Date updatedOn) {
		this.updatedOn = updatedOn;
	}
	public String getBank() {
		return bank;
	}
	public void setBank(String bank) {
		this.bank = bank;
	}
    
    
}
