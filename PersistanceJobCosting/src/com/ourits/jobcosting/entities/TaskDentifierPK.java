package com.ourits.jobcosting.entities;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the TASK_DENTIFIER database table.
 * 
 */
@Embeddable
public class TaskDentifierPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="PROJECT_ID", insertable=false, updatable=false)
	private String projectId;

	@Column(name="PROJECT_NAME", insertable=false, updatable=false)
	private String projectName;

	@Column(name="SUB_PROJECT_ID", insertable=false, updatable=false)
	private String subProjectId;

	@Column(name="SUB_PROJECT_NAME", insertable=false, updatable=false)
	private String subProjectName;

	@Column(name="TASK_ID")
	private String taskId;

	@Column(name="TASK_NAME")
	private String taskName;

	public TaskDentifierPK() {
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
	public String getTaskId() {
		return this.taskId;
	}
	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}
	public String getTaskName() {
		return this.taskName;
	}
	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof TaskDentifierPK)) {
			return false;
		}
		TaskDentifierPK castOther = (TaskDentifierPK)other;
		return 
			this.projectId.equals(castOther.projectId)
			&& this.projectName.equals(castOther.projectName)
			&& this.subProjectId.equals(castOther.subProjectId)
			&& this.subProjectName.equals(castOther.subProjectName)
			&& this.taskId.equals(castOther.taskId)
			&& this.taskName.equals(castOther.taskName);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.projectId.hashCode();
		hash = hash * prime + this.projectName.hashCode();
		hash = hash * prime + this.subProjectId.hashCode();
		hash = hash * prime + this.subProjectName.hashCode();
		hash = hash * prime + this.taskId.hashCode();
		hash = hash * prime + this.taskName.hashCode();
		
		return hash;
	}
}