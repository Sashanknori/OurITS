package com.ourits.jobcosting.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the SUB_PROJECT_IDENTIFIER database table.
 * 
 */
@Entity
@Table(name="SUB_PROJECT_IDENTIFIER")
@NamedQuery(name="SubProjectIdentifier.findAll", query="SELECT s FROM SubProjectIdentifier s")
public class SubProjectIdentifier implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private SubProjectIdentifierPK id;

	private String contractor;

	@Column(name="CREATION_TIME")
	private Timestamp creationTime;

	@Column(name="LAST_MODIFIED_DATE")
	private Timestamp lastModifiedDate;

	@Column(name="PERCENTAGE_COMPLETION")
	private BigDecimal percentageCompletion;

	@Column(name="SUB_PROJECT_AMOUNT_CURRENCY")
	private String subProjectAmountCurrency;

	@Column(name="SUB_PROJECT_BUDGET_AMT")
	private BigDecimal subProjectBudgetAmt;

	@Column(name="SUB_PROJECT_DESC")
	private String subProjectDesc;

	@Temporal(TemporalType.DATE)
	@Column(name="SUB_PROJECT_END_DATE")
	private Date subProjectEndDate;

	@Column(name="SUB_PROJECT_REVISED_AMOUNT_CURRENCY")
	private String subProjectRevisedAmountCurrency;

	@Column(name="SUB_PROJECT_REVISED_BUDGET_AMT")
	private BigDecimal subProjectRevisedBudgetAmt;

	@Temporal(TemporalType.DATE)
	@Column(name="SUB_PROJECT_REVISED_END_DATE")
	private Date subProjectRevisedEndDate;

	@Temporal(TemporalType.DATE)
	@Column(name="SUB_PROJECT_REVISED_STRT_DATE")
	private Date subProjectRevisedStrtDate;

	@Temporal(TemporalType.DATE)
	@Column(name="SUB_PROJECT_STRT_DATE")
	private Date subProjectStrtDate;

	//bi-directional many-to-one association to ProjectIdentifier
	@ManyToOne
	@JoinColumns({
		@JoinColumn(name="PROJECT_ID", referencedColumnName="PROJECT_ID"),
		@JoinColumn(name="PROJECT_NAME", referencedColumnName="PROJECT_NAME")
		})
	private ProjectIdentifier projectIdentifier;

	//bi-directional many-to-one association to TaskDentifier
	@OneToMany(mappedBy="subProjectIdentifier")
	private List<TaskDentifier> taskDentifiers;

	public SubProjectIdentifier() {
	}

	public SubProjectIdentifierPK getId() {
		return this.id;
	}

	public void setId(SubProjectIdentifierPK id) {
		this.id = id;
	}

	public String getContractor() {
		return this.contractor;
	}

	public void setContractor(String contractor) {
		this.contractor = contractor;
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

	public String getSubProjectAmountCurrency() {
		return this.subProjectAmountCurrency;
	}

	public void setSubProjectAmountCurrency(String subProjectAmountCurrency) {
		this.subProjectAmountCurrency = subProjectAmountCurrency;
	}

	public BigDecimal getSubProjectBudgetAmt() {
		return this.subProjectBudgetAmt;
	}

	public void setSubProjectBudgetAmt(BigDecimal subProjectBudgetAmt) {
		this.subProjectBudgetAmt = subProjectBudgetAmt;
	}

	public String getSubProjectDesc() {
		return this.subProjectDesc;
	}

	public void setSubProjectDesc(String subProjectDesc) {
		this.subProjectDesc = subProjectDesc;
	}

	public Date getSubProjectEndDate() {
		return this.subProjectEndDate;
	}

	public void setSubProjectEndDate(Date subProjectEndDate) {
		this.subProjectEndDate = subProjectEndDate;
	}

	public String getSubProjectRevisedAmountCurrency() {
		return this.subProjectRevisedAmountCurrency;
	}

	public void setSubProjectRevisedAmountCurrency(String subProjectRevisedAmountCurrency) {
		this.subProjectRevisedAmountCurrency = subProjectRevisedAmountCurrency;
	}

	public BigDecimal getSubProjectRevisedBudgetAmt() {
		return this.subProjectRevisedBudgetAmt;
	}

	public void setSubProjectRevisedBudgetAmt(BigDecimal subProjectRevisedBudgetAmt) {
		this.subProjectRevisedBudgetAmt = subProjectRevisedBudgetAmt;
	}

	public Date getSubProjectRevisedEndDate() {
		return this.subProjectRevisedEndDate;
	}

	public void setSubProjectRevisedEndDate(Date subProjectRevisedEndDate) {
		this.subProjectRevisedEndDate = subProjectRevisedEndDate;
	}

	public Date getSubProjectRevisedStrtDate() {
		return this.subProjectRevisedStrtDate;
	}

	public void setSubProjectRevisedStrtDate(Date subProjectRevisedStrtDate) {
		this.subProjectRevisedStrtDate = subProjectRevisedStrtDate;
	}

	public Date getSubProjectStrtDate() {
		return this.subProjectStrtDate;
	}

	public void setSubProjectStrtDate(Date subProjectStrtDate) {
		this.subProjectStrtDate = subProjectStrtDate;
	}

	public ProjectIdentifier getProjectIdentifier() {
		return this.projectIdentifier;
	}

	public void setProjectIdentifier(ProjectIdentifier projectIdentifier) {
		this.projectIdentifier = projectIdentifier;
	}

	public List<TaskDentifier> getTaskDentifiers() {
		return this.taskDentifiers;
	}

	public void setTaskDentifiers(List<TaskDentifier> taskDentifiers) {
		this.taskDentifiers = taskDentifiers;
	}

	public TaskDentifier addTaskDentifier(TaskDentifier taskDentifier) {
		getTaskDentifiers().add(taskDentifier);
		taskDentifier.setSubProjectIdentifier(this);

		return taskDentifier;
	}

	public TaskDentifier removeTaskDentifier(TaskDentifier taskDentifier) {
		getTaskDentifiers().remove(taskDentifier);
		taskDentifier.setSubProjectIdentifier(null);

		return taskDentifier;
	}

}