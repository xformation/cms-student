package com.synectiks.student.domain;


import java.io.Serializable;
import java.time.LocalDate;

public class FeeDetails implements Serializable {

    private static final long serialVersionUID = 1L;
    
    private Long id;
    private String feeParticularsName;
    private String feeParticularDesc;
    private String studentType;
    private String gender;
    private Float amount;
    private String status;
    private String createdBy;
    private LocalDate createdOn;
    private String updatedBy;
    private LocalDate updatedOn;
    private LocalDate startDate;
    private LocalDate endDate;
    private Long branchId;
    private Long batchId;
    private Long departmentId;
    private FeeCategory feeCategory;
    private Facility facility;
    private TransportRoute transportRoute;
    private Long facilityId;
    private Long transportRouteId;
    
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFeeParticularsName() {
		return feeParticularsName;
	}
	public void setFeeParticularsName(String feeParticularsName) {
		this.feeParticularsName = feeParticularsName;
	}
	public String getFeeParticularDesc() {
		return feeParticularDesc;
	}
	public void setFeeParticularDesc(String feeParticularDesc) {
		this.feeParticularDesc = feeParticularDesc;
	}
	public String getStudentType() {
		return studentType;
	}
	public void setStudentType(String studentType) {
		this.studentType = studentType;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Float getAmount() {
		return amount;
	}
	public void setAmount(Float amount) {
		this.amount = amount;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public LocalDate getCreatedOn() {
		return createdOn;
	}
	public void setCreatedOn(LocalDate createdOn) {
		this.createdOn = createdOn;
	}
	public String getUpdatedBy() {
		return updatedBy;
	}
	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}
	public LocalDate getUpdatedOn() {
		return updatedOn;
	}
	public void setUpdatedOn(LocalDate updatedOn) {
		this.updatedOn = updatedOn;
	}
	public LocalDate getStartDate() {
		return startDate;
	}
	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}
	public LocalDate getEndDate() {
		return endDate;
	}
	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}
	public Long getBatchId() {
		return batchId;
	}
	public void setBatchId(Long batchId) {
		this.batchId = batchId;
	}
	public Long getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(Long departmentId) {
		this.departmentId = departmentId;
	}
	public FeeCategory getFeeCategory() {
		return feeCategory;
	}
	public void setFeeCategory(FeeCategory feeCategory) {
		this.feeCategory = feeCategory;
	}
	public Facility getFacility() {
		return facility;
	}
	public void setFacility(Facility facility) {
		this.facility = facility;
	}
	public TransportRoute getTransportRoute() {
		return transportRoute;
	}
	public void setTransportRoute(TransportRoute transportRoute) {
		this.transportRoute = transportRoute;
	}
	public Long getBranchId() {
		return branchId;
	}
	public void setBranchId(Long branchId) {
		this.branchId = branchId;
	}
	public Long getFacilityId() {
		return facilityId;
	}
	public void setFacilityId(Long facilityId) {
		this.facilityId = facilityId;
	}
	public Long getTransportRouteId() {
		return transportRouteId;
	}
	public void setTransportRouteId(Long transportRouteId) {
		this.transportRouteId = transportRouteId;
	}

    
}
