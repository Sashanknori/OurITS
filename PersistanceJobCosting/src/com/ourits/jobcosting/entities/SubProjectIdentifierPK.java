package com.ourits.jobcosting.entities;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the SUB_PROJECT_IDENTIFIER database table.
 * 
 */
@Embeddable
public class SubProjectIdentifierPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="PROJECT_ID", insertable=false, updatable=false)
	private String projectId;

	@Column(name="PROJECT_NAME", insertable=false, updatable=false)
	private String projectName;

	@Column(name="SUB_PROJECT_ID")
	private String subProjectId;

	@Column(name="SUB_PROJECT_NAME")
	private String subProjectName;

	public SubProjectIdentifierPK() {
	}
	public String getProjectId() {
		return this.projectId;
	}
	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}
	public String getProjectName() {
		return this.projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public String getSubProjectId() {
		return this.subProjectId;
	}
	public void setSubProjectId(String subProjectId) {
		this.subProjectId = subProjectId;
	}
	public String getSubProjectName() {
		return this.subProjectName;
	}
	public void setSubProjectName(String subProjectName) {
		this.subProjectName = subProjectName;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof SubProjectIdentifierPK)) {
			return false;
		}
		SubProjectIdentifierPK castOther = (SubProjectIdentifierPK)other;
		return 
			this.projectId.equals(castOther.projectId)
			&& this.projectName.equals(castOther.projectName)
			&& this.subProjectId.equals(castOther.subProjectId)
			&& this.subProjectName.equals(castOther.subProjectName);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.projectId.hashCode();
		hash = hash * prime + this.projectName.hashCode();
		hash = hash * prime + this.subProjectId.hashCode();
		hash = hash * prime + this.subProjectName.hashCode();
		
		return hash;
	}
}