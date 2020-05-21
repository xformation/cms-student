package com.synectiks.student.domain;
import java.io.Serializable;
import java.time.LocalDate;

public class Invoice implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;
    private String invoiceNumber;
    private Long amountPaid;
    private LocalDate paymentDate;
    private LocalDate nextPaymentDate;
    private Long outStandingAmount;
    private String modeOfPayment;
    private Long chequeNumber;
    private Long demandDraftNumber;
    private String onlineTxnRefNumber;
    private String paymentStatus;
    private String comments;
    private String updatedBy;
    private String bank;
    private LocalDate updatedOn;
    private Long academicYearId;
    private Long branchId;
    private Long departmentId;
    private Long studentId;
    private FeeCategory feeCategory;
    private FeeDetails feeDetails;
    private DueDate dueDate;
    private PaymentRemainder paymentRemainder;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    public Invoice invoiceNumber(String invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
        return this;
    }

    public void setInvoiceNumber(String invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    public Long getAmountPaid() {
        return amountPaid;
    }

    public Invoice amountPaid(Long amountPaid) {
        this.amountPaid = amountPaid;
        return this;
    }

    public void setAmountPaid(Long amountPaid) {
        this.amountPaid = amountPaid;
    }

    public LocalDate getPaymentDate() {
        return paymentDate;
    }

    public Invoice paymentDate(LocalDate paymentDate) {
        this.paymentDate = paymentDate;
        return this;
    }

    public void setPaymentDate(LocalDate paymentDate) {
        this.paymentDate = paymentDate;
    }

    public LocalDate getNextPaymentDate() {
        return nextPaymentDate;
    }

    public Invoice nextPaymentDate(LocalDate nextPaymentDate) {
        this.nextPaymentDate = nextPaymentDate;
        return this;
    }

    public void setNextPaymentDate(LocalDate nextPaymentDate) {
        this.nextPaymentDate = nextPaymentDate;
    }

    public Long getOutStandingAmount() {
        return outStandingAmount;
    }

    public Invoice outStandingAmount(Long outStandingAmount) {
        this.outStandingAmount = outStandingAmount;
        return this;
    }

    public void setOutStandingAmount(Long outStandingAmount) {
        this.outStandingAmount = outStandingAmount;
    }

    public String getModeOfPayment() {
        return modeOfPayment;
    }

    public Invoice modeOfPayment(String modeOfPayment) {
        this.modeOfPayment = modeOfPayment;
        return this;
    }

    public void setModeOfPayment(String modeOfPayment) {
        this.modeOfPayment = modeOfPayment;
    }

    public Long getChequeNumber() {
        return chequeNumber;
    }

    public Invoice chequeNumber(Long chequeNumber) {
        this.chequeNumber = chequeNumber;
        return this;
    }

    public void setChequeNumber(Long chequeNumber) {
        this.chequeNumber = chequeNumber;
    }

    public Long getDemandDraftNumber() {
        return demandDraftNumber;
    }

    public Invoice demandDraftNumber(Long demandDraftNumber) {
        this.demandDraftNumber = demandDraftNumber;
        return this;
    }

    public void setDemandDraftNumber(Long demandDraftNumber) {
        this.demandDraftNumber = demandDraftNumber;
    }

    public String getOnlineTxnRefNumber() {
        return onlineTxnRefNumber;
    }

    public Invoice onlineTxnRefNumber(String onlineTxnRefNumber) {
        this.onlineTxnRefNumber = onlineTxnRefNumber;
        return this;
    }

    public void setOnlineTxnRefNumber(String onlineTxnRefNumber) {
        this.onlineTxnRefNumber = onlineTxnRefNumber;
    }

    public String getPaymentStatus() {
        return paymentStatus;
    }

    public Invoice paymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
        return this;
    }

    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public String getComments() {
        return comments;
    }

    public Invoice comments(String comments) {
        this.comments = comments;
        return this;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public Invoice updatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
        return this;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    public String getBank() {
        return bank;
    }

    public Invoice bank(String bank) {
        this.bank = bank;
        return this;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    public LocalDate getUpdatedOn() {
        return updatedOn;
    }

    public Invoice updatedOn(LocalDate updatedOn) {
        this.updatedOn = updatedOn;
        return this;
    }

    public void setUpdatedOn(LocalDate updatedOn) {
        this.updatedOn = updatedOn;
    }

    public Long getAcademicYearId() {
        return academicYearId;
    }

    public Invoice academicYearId(Long academicYearId) {
        this.academicYearId = academicYearId;
        return this;
    }

    public void setAcademicYearId(Long academicYearId) {
        this.academicYearId = academicYearId;
    }

    public Long getBranchId() {
        return branchId;
    }

    public Invoice branchId(Long branchId) {
        this.branchId = branchId;
        return this;
    }

    public void setBranchId(Long branchId) {
        this.branchId = branchId;
    }

    public Long getDepartmentId() {
        return departmentId;
    }

    public Invoice departmentId(Long departmentId) {
        this.departmentId = departmentId;
        return this;
    }

    public void setDepartmentId(Long departmentId) {
        this.departmentId = departmentId;
    }

    public Long getStudentId() {
        return studentId;
    }

    public Invoice studentId(Long studentId) {
        this.studentId = studentId;
        return this;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    public FeeCategory getFeeCategory() {
        return feeCategory;
    }

    public Invoice feeCategory(FeeCategory feeCategory) {
        this.feeCategory = feeCategory;
        return this;
    }

    public void setFeeCategory(FeeCategory feeCategory) {
        this.feeCategory = feeCategory;
    }

    public FeeDetails getFeeDetails() {
        return feeDetails;
    }

    public Invoice feeDetails(FeeDetails feeDetails) {
        this.feeDetails = feeDetails;
        return this;
    }

    public void setFeeDetails(FeeDetails feeDetails) {
        this.feeDetails = feeDetails;
    }

    public DueDate getDueDate() {
        return dueDate;
    }

    public Invoice dueDate(DueDate dueDate) {
        this.dueDate = dueDate;
        return this;
    }

    public void setDueDate(DueDate dueDate) {
        this.dueDate = dueDate;
    }

    public PaymentRemainder getPaymentRemainder() {
        return paymentRemainder;
    }

    public Invoice paymentRemainder(PaymentRemainder paymentRemainder) {
        this.paymentRemainder = paymentRemainder;
        return this;
    }

    public void setPaymentRemainder(PaymentRemainder paymentRemainder) {
        this.paymentRemainder = paymentRemainder;
    }
    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here, do not remove

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Invoice)) {
            return false;
        }
        return id != null && id.equals(((Invoice) o).id);
    }

    @Override
    public int hashCode() {
        return 31;
    }

    @Override
    public String toString() {
        return "Invoice{" +
            "id=" + getId() +
            ", invoiceNumber='" + getInvoiceNumber() + "'" +
            ", amountPaid=" + getAmountPaid() +
            ", paymentDate='" + getPaymentDate() + "'" +
            ", nextPaymentDate='" + getNextPaymentDate() + "'" +
            ", outStandingAmount=" + getOutStandingAmount() +
            ", modeOfPayment='" + getModeOfPayment() + "'" +
            ", chequeNumber=" + getChequeNumber() +
            ", demandDraftNumber=" + getDemandDraftNumber() +
            ", onlineTxnRefNumber='" + getOnlineTxnRefNumber() + "'" +
            ", paymentStatus='" + getPaymentStatus() + "'" +
            ", comments='" + getComments() + "'" +
            ", updatedBy='" + getUpdatedBy() + "'" +
            ", bank='" + getBank() + "'" +
            ", updatedOn='" + getUpdatedOn() + "'" +
            ", academicYearId=" + getAcademicYearId() +
            ", branchId=" + getBranchId() +
            ", departmentId=" + getDepartmentId() +
            ", studentId=" + getStudentId() +
            "}";
    }
}
