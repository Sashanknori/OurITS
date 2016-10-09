package com.ourits.jobcosting.entities;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the PROJECT_IDENTIFIER database table.
 * 
 */
@Embeddable
public class ProjectIdentifierPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="PROJECT_ID")
	private String projectId;

	@Column(name="PROJECT_NAME")
	private String projectName;

	public ProjectIdentifierPK() {
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

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof ProjectIdentifierPK)) {
			return false;
		}
		ProjectIdentifierPK castOther = (ProjectIdentifierPK)other;
		return 
			this.projectId.equals(castOther.projectId)
			&& this.projectName.equals(castOther.projectName);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.projectId.hashCode();
		hash = hash * prime + this.projectName.hashCode();
		
		return hash;
	}
}