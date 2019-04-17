package com.inmemory.gleifparser.entity;

import java.io.Serializable;
import javax.persistence.*;

import com.inmemory.gleifparser.constants.Constants;

import java.util.Date;
import java.util.List;


/**
 * The persistent class for the LEVEL2_RELATIONSHIP_RECORD database table.
 * 
 */
@Entity
@Table(name="LEVEL2_RELATIONSHIP_RECORD")
@NamedQuery(name="Level2RelationshipRecord.findAll", query="SELECT l FROM Level2RelationshipRecord l")
public class Level2RelationshipRecord implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="relationshipRecordSequenceGen")
	@SequenceGenerator(name="relationshipRecordSequenceGen",sequenceName="LEVEL2_RELATIONSHIP_RECORD_SEQ",allocationSize = Constants.SEQUENCE_ALLOCATION_SIZE)
	@Column(name="RR_ID")
	private Long rrId;

	@Temporal(TemporalType.DATE)
	@Column(name="END_DATE")
	private Date endDate;

	@Temporal(TemporalType.DATE)
	@Column(name="REGISTRATION_INITIAL_REGISTRATION_DATE")
	private Date registrationInitialRegistrationDate;

	@Temporal(TemporalType.DATE)
	@Column(name="REGISTRATION_LAST_UPDATE_DATE")
	private Date registrationLastUpdateDate;

	@Column(name="REGISTRATION_MANAGING_LOU")
	private String registrationManagingLou;

	@Column(name="REGISTRATION_NEXT_RENEWAL_DATE")
	private Date registrationNextRenewalDate;

	@Column(name="REGISTRATION_STATUS")
	private String registrationStatus;

	@Column(name="RELATIONSHIP_END_NODE_ID")
	private String relationshipEndNodeId;

	@Column(name="RELATIONSHIP_END_NODE_TYPE")
	private String relationshipEndNodeType;

	@Column(name="RELATIONSHIP_PERIOD_TYPE")
	private String relationshipPeriodType;

	@Column(name="RELATIONSHIP_TYPE")
	private String relationshipType;

	@Column(name="RELATIONSHIP_START_NODE_TYPE")
	private String relationshipStartNodeType;

	@Column(name="RELATIONSHIP_STATUS")
	private String relationshipStatus;

	@Temporal(TemporalType.DATE)
	@Column(name="START_DATE")
	private Date startDate;

	@Column(name="VALIDATION_DOCUMENTS")
	private String validationDocuments;

	@Column(name="VALIDATION_REFERENCE")
	private String validationReference;

	@Column(name="VALIDATION_SOURCES")
	private String validationSources;
	

	@Column(name="RELATIONSHIP_START_NODE_ID")
	private String relationshipStartNodeId;

	//bi-directional many-to-one association to Level1LeiRecord
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="RELATIONSHIP_START_NODE_ID",insertable=false,updatable=false)
	private Level1LeiRecord level1LeiRecord;

	//bi-directional many-to-one association to Level2RrRelationshipQualifier
	@OneToMany(mappedBy="level2RelationshipRecord",cascade = CascadeType.PERSIST)
	private List<Level2RrRelationshipQualifier> level2RrRelationshipQualifiers;

	//bi-directional many-to-one association to Level2RrRelationshipQuantifier
	@OneToMany(mappedBy="level2RelationshipRecord",cascade = CascadeType.PERSIST)
	private List<Level2RrRelationshipQuantifier> level2RrRelationshipQuantifiers;

	public Level2RelationshipRecord() {
	}

	public Long getRrId() {
		return this.rrId;
	}

	public void setRrId(Long rrId) {
		this.rrId = rrId;
	}

	public Date getEndDate() {
		return this.endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public Date getRegistrationInitialRegistrationDate() {
		return this.registrationInitialRegistrationDate;
	}

	public void setRegistrationInitialRegistrationDate(Date registrationInitialRegistrationDate) {
		this.registrationInitialRegistrationDate = registrationInitialRegistrationDate;
	}

	public Date getRegistrationLastUpdateDate() {
		return this.registrationLastUpdateDate;
	}

	public void setRegistrationLastUpdateDate(Date registrationLastUpdateDate) {
		this.registrationLastUpdateDate = registrationLastUpdateDate;
	}

	public String getRegistrationManagingLou() {
		return this.registrationManagingLou;
	}

	public void setRegistrationManagingLou(String registrationManagingLou) {
		this.registrationManagingLou = registrationManagingLou;
	}

	public Date getRegistrationNextRenewalDate() {
		return this.registrationNextRenewalDate;
	}

	public void setRegistrationNextRenewalDate(Date registrationNextRenewalDate) {
		this.registrationNextRenewalDate = registrationNextRenewalDate;
	}

	public String getRegistrationStatus() {
		return this.registrationStatus;
	}

	public void setRegistrationStatus(String registrationStatus) {
		this.registrationStatus = registrationStatus;
	}

	public String getRelationshipEndNodeId() {
		return this.relationshipEndNodeId;
	}

	public void setRelationshipEndNodeId(String relationshipEndNodeId) {
		this.relationshipEndNodeId = relationshipEndNodeId;
	}

	public String getRelationshipEndNodeType() {
		return this.relationshipEndNodeType;
	}

	public void setRelationshipEndNodeType(String relationshipEndNodeType) {
		this.relationshipEndNodeType = relationshipEndNodeType;
	}

	public String getRelationshipPeriodType() {
		return this.relationshipPeriodType;
	}

	public void setRelationshipPeriodType(String relationshipPeriodType) {
		this.relationshipPeriodType = relationshipPeriodType;
	}

	public String getRelationshipType() {
		return this.relationshipType;
	}

	public void setRelationshipType(String relationshipType) {
		this.relationshipType = relationshipType;
	}

	public String getRelationshipStartNodeType() {
		return this.relationshipStartNodeType;
	}

	public void setRelationshipStartNodeType(String relationshipStartNodeType) {
		this.relationshipStartNodeType = relationshipStartNodeType;
	}

	public String getRelationshipStatus() {
		return this.relationshipStatus;
	}

	public void setRelationshipStatus(String relationshipStatus) {
		this.relationshipStatus = relationshipStatus;
	}

	public Date getStartDate() {
		return this.startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public String getValidationDocuments() {
		return this.validationDocuments;
	}

	public void setValidationDocuments(String validationDocuments) {
		this.validationDocuments = validationDocuments;
	}

	public String getValidationReference() {
		return this.validationReference;
	}

	public void setValidationReference(String validationReference) {
		this.validationReference = validationReference;
	}

	public String getValidationSources() {
		return this.validationSources;
	}

	public void setValidationSources(String validationSources) {
		this.validationSources = validationSources;
	}

	public Level1LeiRecord getLevel1LeiRecord() {
		return this.level1LeiRecord;
	}

	public void setLevel1LeiRecord(Level1LeiRecord level1LeiRecord) {
		this.level1LeiRecord = level1LeiRecord;
	}

	public List<Level2RrRelationshipQualifier> getLevel2RrRelationshipQualifiers() {
		return this.level2RrRelationshipQualifiers;
	}

	public void setLevel2RrRelationshipQualifiers(List<Level2RrRelationshipQualifier> level2RrRelationshipQualifiers) {
		this.level2RrRelationshipQualifiers = level2RrRelationshipQualifiers;
	}

	public Level2RrRelationshipQualifier addLevel2RrRelationshipQualifier(Level2RrRelationshipQualifier level2RrRelationshipQualifier) {
		getLevel2RrRelationshipQualifiers().add(level2RrRelationshipQualifier);
		level2RrRelationshipQualifier.setLevel2RelationshipRecord(this);

		return level2RrRelationshipQualifier;
	}

	public Level2RrRelationshipQualifier removeLevel2RrRelationshipQualifier(Level2RrRelationshipQualifier level2RrRelationshipQualifier) {
		getLevel2RrRelationshipQualifiers().remove(level2RrRelationshipQualifier);
		level2RrRelationshipQualifier.setLevel2RelationshipRecord(null);

		return level2RrRelationshipQualifier;
	}

	public List<Level2RrRelationshipQuantifier> getLevel2RrRelationshipQuantifiers() {
		return this.level2RrRelationshipQuantifiers;
	}

	public void setLevel2RrRelationshipQuantifiers(List<Level2RrRelationshipQuantifier> level2RrRelationshipQuantifiers) {
		this.level2RrRelationshipQuantifiers = level2RrRelationshipQuantifiers;
	}

	public Level2RrRelationshipQuantifier addLevel2RrRelationshipQuantifier(Level2RrRelationshipQuantifier level2RrRelationshipQuantifier) {
		getLevel2RrRelationshipQuantifiers().add(level2RrRelationshipQuantifier);
		level2RrRelationshipQuantifier.setLevel2RelationshipRecord(this);

		return level2RrRelationshipQuantifier;
	}

	public Level2RrRelationshipQuantifier removeLevel2RrRelationshipQuantifier(Level2RrRelationshipQuantifier level2RrRelationshipQuantifier) {
		getLevel2RrRelationshipQuantifiers().remove(level2RrRelationshipQuantifier);
		level2RrRelationshipQuantifier.setLevel2RelationshipRecord(null);

		return level2RrRelationshipQuantifier;
	}

	public String getRelationshipStartNodeId() {
		return relationshipStartNodeId;
	}

	public void setRelationshipStartNodeId(String relationshipStartNodeId) {
		this.relationshipStartNodeId = relationshipStartNodeId;
	}

}