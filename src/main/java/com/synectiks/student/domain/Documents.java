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
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * A Documents.
 */
@Entity
@Table(name = "documents")
public class Documents implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @SequenceGenerator(name = "sequenceGenerator")
    private Long id;

    @Column(name = "file_name")
    private String fileName;

    @Column(name = "file_type")
    private String fileType;

    @Column(name = "file_path")
    private String filePath;

    @Size(max = 5000)
    @Column(name = "ms_one_drive_file_path", length = 5000)
    private String msOneDriveFilePath;

    @Size(max = 5000)
    @Column(name = "jsr_oak_repo_file_path", length = 5000)
    private String jsrOakRepoFilePath;

    @Size(max = 5000)
    @Column(name = "aws_file_path", length = 5000)
    private String awsFilePath;

    @ManyToOne
    @JsonIgnoreProperties("documents")
    private Student student;

    // jhipster-needle-entity-add-field - JHipster will add fields here, do not remove
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFileName() {
        return fileName;
    }

    public Documents fileName(String fileName) {
        this.fileName = fileName;
        return this;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getFileType() {
        return fileType;
    }

    public Documents fileType(String fileType) {
        this.fileType = fileType;
        return this;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    public String getFilePath() {
        return filePath;
    }

    public Documents filePath(String filePath) {
        this.filePath = filePath;
        return this;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public String getMsOneDriveFilePath() {
        return msOneDriveFilePath;
    }

    public Documents msOneDriveFilePath(String msOneDriveFilePath) {
        this.msOneDriveFilePath = msOneDriveFilePath;
        return this;
    }

    public void setMsOneDriveFilePath(String msOneDriveFilePath) {
        this.msOneDriveFilePath = msOneDriveFilePath;
    }

    public String getJsrOakRepoFilePath() {
        return jsrOakRepoFilePath;
    }

    public Documents jsrOakRepoFilePath(String jsrOakRepoFilePath) {
        this.jsrOakRepoFilePath = jsrOakRepoFilePath;
        return this;
    }

    public void setJsrOakRepoFilePath(String jsrOakRepoFilePath) {
        this.jsrOakRepoFilePath = jsrOakRepoFilePath;
    }

    public String getAwsFilePath() {
        return awsFilePath;
    }

    public Documents awsFilePath(String awsFilePath) {
        this.awsFilePath = awsFilePath;
        return this;
    }

    public void setAwsFilePath(String awsFilePath) {
        this.awsFilePath = awsFilePath;
    }

    public Student getStudent() {
        return student;
    }

    public Documents student(Student student) {
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
        if (!(o instanceof Documents)) {
            return false;
        }
        return id != null && id.equals(((Documents) o).id);
    }

    @Override
    public int hashCode() {
        return 31;
    }

    @Override
    public String toString() {
        return "Documents{" +
            "id=" + getId() +
            ", fileName='" + getFileName() + "'" +
            ", fileType='" + getFileType() + "'" +
            ", filePath='" + getFilePath() + "'" +
            ", msOneDriveFilePath='" + getMsOneDriveFilePath() + "'" +
            ", jsrOakRepoFilePath='" + getJsrOakRepoFilePath() + "'" +
            ", awsFilePath='" + getAwsFilePath() + "'" +
            "}";
    }
}
