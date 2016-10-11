package com.ourits.jobcosting.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.sql.Timestamp;


/**
 * The persistent class for the TASK_DENTIFIER database table.
 * 
 */
@Entity
@Table(name="TASK_DENTIFIER", schema ="JOBCOSTING")
@NamedQuery(name="TaskDentifier.findAll", query="SELECT t FROM TaskDentifier t")
public class TaskDentifier implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private TaskDentifierPK id;

	@Column(name="CREATION_TIME")
	private Timestamp creationTime;

	@Column(name="LAST_MODIFIED_DATE")
	private Timestamp lastModifiedDate;

	@Column(name="PERCENTAGE_COMPLETION")
	private BigDecimal percentageCompletion;

	@Temporal(TemporalType.DATE)
	@Column(name="TASK_END_DATE")
	private Date taskEndDate;

	@Temporal(TemporalType.DATE)
	@Column(name="TASK_REVISED_END_DATE")
	private Date taskRevisedEndDate;

	@Temporal(TemporalType.DATE)
	@Column(name="TASK_REVISED_STRT_DATE")
	private Date taskRevisedStrtDate;

	@Temporal(TemporalType.DATE)
	@Column(name="TASK_STRT_DATE")
	private Date taskStrtDate;

	//bi-directional many-to-one association to SubProjectIdentifier
	@ManyToOne
	@JoinColumns({
		@JoinColumn(name="PROJECT_ID", referencedColumnName="PROJECT_ID"),
		@JoinColumn(name="PROJECT_NAME", referencedColumnName="PROJECT_NAME"),
		@JoinColumn(name="SUB_PROJECT_ID", referencedColumnName="SUB_PROJECT_ID"),
		@JoinColumn(name="SUB_PROJECT_NAME", referencedColumnName="SUB_PROJECT_NAME")
		})
	private SubProjectIdentifier subProjectIdentifier;

	public TaskDentifier() {
	}

	public TaskDentifierPK getId() {
		return this.id;
	}

	public void setId(TaskDentifierPK id) {
		this.id = id;
	}

	public Timestamp getCreationTime() {
		return this.creationTime;
	}

	public void setCreationTime(Timestamp creationTime) {
		this.creationTime = creationTime;
	}

	public Timestamp getLastModifiedDate() {
		return this.lastModifiedDate;
	}

	public void setLastModifiedDate(Timestamp lastModifiedDate) {
		this.lastModifiedDate = lastModifiedDate;
	}

	public BigDecimal getPercentageCompletion() {
		return this.percentageCompletion;
	}

	public void setPercentageCompletion(BigDecimal percentageCompletion) {
		this.percentageCompletion = percentageCompletion;
	}

	public Date getTaskEndDate() {
		return this.taskEndDate;
	}

	public void setTaskEndDate(Date taskEndDate) {
		this.taskEndDate = taskEndDate;
	}

	public Date getTaskRevisedEndDate() {
		return this.taskRevisedEndDate;
	}

	public void setTaskRevisedEndDate(Date taskRevisedEndDate) {
		this.taskRevisedEndDate = taskRevisedEndDate;
	}

	public Date getTaskRevisedStrtDate() {
		return this.taskRevisedStrtDate;
	}

	public void setTaskRevisedStrtDate(Date taskRevisedStrtDate) {
		this.taskRevisedStrtDate = taskRevisedStrtDate;
	}

	public Date getTaskStrtDate() {
		return this.taskStrtDate;
	}

	public void setTaskStrtDate(Date taskStrtDate) {
		this.taskStrtDate = taskStrtDate;
	}

	public SubProjectIdentifier getSubProjectIdentifier() {
		return this.subProjectIdentifier;
	}

	public void setSubProjectIdentifier(SubProjectIdentifier subProjectIdentifier) {
		this.subProjectIdentifier = subProjectIdentifier;
	}

}