package com.ourits.jobcosting.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the PROJECT_IDENTIFIER database table.
 * 
 */

@Entity
@Table(name="PROJECT_IDENTIFIER", schema ="JOBCOSTING")
@NamedQuery(name="ProjectIdentifier.findAll", query="SELECT p FROM ProjectIdentifier p")
public class ProjectIdentifier implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private ProjectIdentifierPK id;

	@Column(name="CREATION_TIME")
	private Timestamp creationTime;

	@Column(name="LAST_MODIFIED_DATE")
	private Timestamp lastModifiedDate;

	@Column(name="PROJECT_AMOUNT_CURRENCY")
	private String projectAmountCurrency;

	@Column(name="PROJECT_BUDGET_AMT")
	private BigDecimal projectBudgetAmt;

	@Column(name="PROJECT_DESC")
	private String projectDesc;

	@Temporal(TemporalType.DATE)
	@Column(name="PROJECT_END_DATE")
	private Date projectEndDate;

	@Column(name="PROJECT_REVISED_AMOUNT_CURRENCY")
	private String projectRevisedAmountCurrency;

	@Column(name="PROJECT_REVISED_BUDGET_AMT")
	private BigDecimal projectRevisedBudgetAmt;

	@Temporal(TemporalType.DATE)
	@Column(name="PROJECT_REVISED_END_DATE")
	private Date projectRevisedEndDate;

	@Temporal(TemporalType.DATE)
	@Column(name="PROJECT_REVISED_STRT_DATE")
	private Date projectRevisedStrtDate;

	@Temporal(TemporalType.DATE)
	@Column(name="PROJECT_STRT_DATE")
	private Date projectStrtDate;

	//bi-directional many-to-one association to SubProjectIdentifier
	@OneToMany(mappedBy="projectIdentifier")
	private List<SubProjectIdentifier> subProjectIdentifiers;

	public ProjectIdentifier() {
	}

	public ProjectIdentifierPK getId() {
		return this.id;
	}

	public void setId(ProjectIdentifierPK id) {
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

	public String getProjectAmountCurrency() {
		return this.projectAmountCurrency;
	}

	public void setProjectAmountCurrency(String projectAmountCurrency) {
		this.projectAmountCurrency = projectAmountCurrency;
	}

	public BigDecimal getProjectBudgetAmt() {
		return this.projectBudgetAmt;
	}

	public void setProjectBudgetAmt(BigDecimal projectBudgetAmt) {
		this.projectBudgetAmt = projectBudgetAmt;
	}

	public String getProjectDesc() {
		return this.projectDesc;
	}

	public void setProjectDesc(String projectDesc) {
		this.projectDesc = projectDesc;
	}

	public Date getProjectEndDate() {
		return this.projectEndDate;
	}

	public void setProjectEndDate(Date projectEndDate) {
		this.projectEndDate = projectEndDate;
	}

	public String getProjectRevisedAmountCurrency() {
		return this.projectRevisedAmountCurrency;
	}

	public void setProjectRevisedAmountCurrency(String projectRevisedAmountCurrency) {
		this.projectRevisedAmountCurrency = projectRevisedAmountCurrency;
	}

	public BigDecimal getProjectRevisedBudgetAmt() {
		return this.projectRevisedBudgetAmt;
	}

	public void setProjectRevisedBudgetAmt(BigDecimal projectRevisedBudgetAmt) {
		this.projectRevisedBudgetAmt = projectRevisedBudgetAmt;
	}

	public Date getProjectRevisedEndDate() {
		return this.projectRevisedEndDate;
	}

	public void setProjectRevisedEndDate(Date projectRevisedEndDate) {
		this.projectRevisedEndDate = projectRevisedEndDate;
	}

	public Date getProjectRevisedStrtDate() {
		return this.projectRevisedStrtDate;
	}

	public void setProjectRevisedStrtDate(Date projectRevisedStrtDate) {
		this.projectRevisedStrtDate = projectRevisedStrtDate;
	}

	public Date getProjectStrtDate() {
		return this.projectStrtDate;
	}

	public void setProjectStrtDate(Date projectStrtDate) {
		this.projectStrtDate = projectStrtDate;
	}

	public List<SubProjectIdentifier> getSubProjectIdentifiers() {
		return this.subProjectIdentifiers;
	}

	public void setSubProjectIdentifiers(List<SubProjectIdentifier> subProjectIdentifiers) {
		this.subProjectIdentifiers = subProjectIdentifiers;
	}

	public SubProjectIdentifier addSubProjectIdentifier(SubProjectIdentifier subProjectIdentifier) {
		getSubProjectIdentifiers().add(subProjectIdentifier);
		subProjectIdentifier.setProjectIdentifier(this);

		return subProjectIdentifier;
	}

	public SubProjectIdentifier removeSubProjectIdentifier(SubProjectIdentifier subProjectIdentifier) {
		getSubProjectIdentifiers().remove(subProjectIdentifier);
		subProjectIdentifier.setProjectIdentifier(null);

		return subProjectIdentifier;
	}

}