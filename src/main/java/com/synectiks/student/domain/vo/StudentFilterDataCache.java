package com.synectiks.student.domain.vo;

import java.util.List;

import com.synectiks.student.domain.Batch;
import com.synectiks.student.domain.Branch;
import com.synectiks.student.domain.Department;
import com.synectiks.student.domain.Section;

public class StudentFilterDataCache {

	private List<Branch> branches;
	private List<Department> departments;
	private List<Batch> batches;
	private List<Section> sections;
	
	public List<Department> getDepartments() {
		return departments;
	}
	public void setDepartments(List<Department> departments) {
		this.departments = departments;
	}
	public List<Batch> getBatches() {
		return batches;
	}
	public void setBatches(List<Batch> batches) {
		this.batches = batches;
	}
	
	public List<Section> getSections() {
		return sections;
	}
	public void setSections(List<Section> sections) {
		this.sections = sections;
	}
	
	public List<Branch> getBranches() {
		return branches;
	}
	public void setBranches(List<Branch> branches) {
		this.branches = branches;
	}
	
	
}
