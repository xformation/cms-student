package com.synectiks.student.domain;
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * A StudentFacilityLink.
 */
@Entity
@Table(name = "student_facility_link")
public class StudentFacilityLink implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @SequenceGenerator(name = "sequenceGenerator")
    private Long id;

    @Column(name = "link_desc")
    private String linkDesc;

    @Column(name = "facility_id")
    private Long facilityId;

    @ManyToOne
    @JsonIgnoreProperties("studentFacilityLinks")
    private Student student;

    // jhipster-needle-entity-add-field - JHipster will add fields here, do not remove
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLinkDesc() {
        return linkDesc;
    }

    public StudentFacilityLink linkDesc(String linkDesc) {
        this.linkDesc = linkDesc;
        return this;
    }

    public void setLinkDesc(String linkDesc) {
        this.linkDesc = linkDesc;
    }

    public Long getFacilityId() {
        return facilityId;
    }

    public StudentFacilityLink facilityId(Long facilityId) {
        this.facilityId = facilityId;
        return this;
    }

    public void setFacilityId(Long facilityId) {
        this.facilityId = facilityId;
    }

    public Student getStudent() {
        return student;
    }

    public StudentFacilityLink student(Student student) {
        this.student = student;
        return this;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here, do not remove

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof StudentFacilityLink)) {
            return false;
        }
        return id != null && id.equals(((StudentFacilityLink) o).id);
    }

    @Override
    public int hashCode() {
        return 31;
    }

    @Override
    public String toString() {
        return "StudentFacilityLink{" +
            "id=" + getId() +
            ", linkDesc='" + getLinkDesc() + "'" +
            ", facilityId=" + getFacilityId() +
            "}";
    }
}
