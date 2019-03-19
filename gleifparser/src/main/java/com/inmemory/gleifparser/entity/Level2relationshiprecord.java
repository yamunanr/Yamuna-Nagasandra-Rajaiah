package com.inmemory.gleifparser.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the LEVEL2RELATIONSHIPRECORD database table.
 * 
 */
@Entity
@NamedQuery(name="Level2relationshiprecord.findAll", query="SELECT l FROM Level2relationshiprecord l")
public class Level2relationshiprecord implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	@Column(name="RR_ID")
	private int rrId;

	@Temporal(TemporalType.DATE)
	@Column(name="END_DATE")
	private Date endDate;

	@Column(name="END_NODE_ID")
	private String endNodeId;

	@Column(name="END_NODE_TYPE")
	private String endNodeType;

	@Temporal(TemporalType.DATE)
	@Column(name="INITIAL_REGISTRATION_DATE")
	private Date initialRegistrationDate;

	@Temporal(TemporalType.DATE)
	@Column(name="LAST_UPDATE_DATE")
	private Date lastUpdateDate;

	@Column(name="MANAGING_LOU")
	private String managingLou;

	@Column(name="PERIOD_TYPE")
	private String periodType;

	@Column(name="REGISTRATION_STATUS")
	private String registrationStatus;

	@Column(name="RELATIONSHIP_STATUS")
	private String relationshipStatus;

	@Column(name="RELATIONSHIP_TYPE")
	private String relationshipType;

	@Temporal(TemporalType.DATE)
	@Column(name="START_DATE")
	private Date startDate;

	@Column(name="START_NODE_TYPE")
	private String startNodeType;

	@Column(name="VALIDATION_DOCUMENTS")
	private String validationDocuments;

	@Column(name="VALIDATION_REFERENCE")
	private String validationReference;

	@Column(name="VALIDATION_SOURCES")
	private String validationSources;

	//bi-directional many-to-one association to Level1leirecord
	@ManyToOne
	@JoinColumn(name="START_NODE_ID")
	private Level1leirecord level1leirecord;

	//bi-directional many-to-one association to Level2rrrelationshipqualifier
	@OneToMany(mappedBy="level2relationshiprecord")
	private List<Level2rrrelationshipqualifier> level2rrrelationshipqualifiers;

	//bi-directional many-to-one association to Level2rrrelationshipquantifier
	@OneToMany(mappedBy="level2relationshiprecord")
	private List<Level2rrrelationshipquantifier> level2rrrelationshipquantifiers;

	public Level2relationshiprecord() {
	}

	public int getRrId() {
		return this.rrId;
	}

	public void setRrId(int rrId) {
		this.rrId = rrId;
	}

	public Date getEndDate() {
		return this.endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public String getEndNodeId() {
		return this.endNodeId;
	}

	public void setEndNodeId(String endNodeId) {
		this.endNodeId = endNodeId;
	}

	public String getEndNodeType() {
		return this.endNodeType;
	}

	public void setEndNodeType(String endNodeType) {
		this.endNodeType = endNodeType;
	}

	public Date getInitialRegistrationDate() {
		return this.initialRegistrationDate;
	}

	public void setInitialRegistrationDate(Date initialRegistrationDate) {
		this.initialRegistrationDate = initialRegistrationDate;
	}

	public Date getLastUpdateDate() {
		return this.lastUpdateDate;
	}

	public void setLastUpdateDate(Date lastUpdateDate) {
		this.lastUpdateDate = lastUpdateDate;
	}

	public String getManagingLou() {
		return this.managingLou;
	}

	public void setManagingLou(String managingLou) {
		this.managingLou = managingLou;
	}

	public String getPeriodType() {
		return this.periodType;
	}

	public void setPeriodType(String periodType) {
		this.periodType = periodType;
	}

	public String getRegistrationStatus() {
		return this.registrationStatus;
	}

	public void setRegistrationStatus(String registrationStatus) {
		this.registrationStatus = registrationStatus;
	}

	public String getRelationshipStatus() {
		return this.relationshipStatus;
	}

	public void setRelationshipStatus(String relationshipStatus) {
		this.relationshipStatus = relationshipStatus;
	}

	public String getRelationshipType() {
		return this.relationshipType;
	}

	public void setRelationshipType(String relationshipType) {
		this.relationshipType = relationshipType;
	}

	public Date getStartDate() {
		return this.startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public String getStartNodeType() {
		return this.startNodeType;
	}

	public void setStartNodeType(String startNodeType) {
		this.startNodeType = startNodeType;
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

	public Level1leirecord getLevel1leirecord() {
		return this.level1leirecord;
	}

	public void setLevel1leirecord(Level1leirecord level1leirecord) {
		this.level1leirecord = level1leirecord;
	}

	public List<Level2rrrelationshipqualifier> getLevel2rrrelationshipqualifiers() {
		return this.level2rrrelationshipqualifiers;
	}

	public void setLevel2rrrelationshipqualifiers(List<Level2rrrelationshipqualifier> level2rrrelationshipqualifiers) {
		this.level2rrrelationshipqualifiers = level2rrrelationshipqualifiers;
	}

	public Level2rrrelationshipqualifier addLevel2rrrelationshipqualifier(Level2rrrelationshipqualifier level2rrrelationshipqualifier) {
		getLevel2rrrelationshipqualifiers().add(level2rrrelationshipqualifier);
		level2rrrelationshipqualifier.setLevel2relationshiprecord(this);

		return level2rrrelationshipqualifier;
	}

	public Level2rrrelationshipqualifier removeLevel2rrrelationshipqualifier(Level2rrrelationshipqualifier level2rrrelationshipqualifier) {
		getLevel2rrrelationshipqualifiers().remove(level2rrrelationshipqualifier);
		level2rrrelationshipqualifier.setLevel2relationshiprecord(null);

		return level2rrrelationshipqualifier;
	}

	public List<Level2rrrelationshipquantifier> getLevel2rrrelationshipquantifiers() {
		return this.level2rrrelationshipquantifiers;
	}

	public void setLevel2rrrelationshipquantifiers(List<Level2rrrelationshipquantifier> level2rrrelationshipquantifiers) {
		this.level2rrrelationshipquantifiers = level2rrrelationshipquantifiers;
	}

	public Level2rrrelationshipquantifier addLevel2rrrelationshipquantifier(Level2rrrelationshipquantifier level2rrrelationshipquantifier) {
		getLevel2rrrelationshipquantifiers().add(level2rrrelationshipquantifier);
		level2rrrelationshipquantifier.setLevel2relationshiprecord(this);

		return level2rrrelationshipquantifier;
	}

	public Level2rrrelationshipquantifier removeLevel2rrrelationshipquantifier(Level2rrrelationshipquantifier level2rrrelationshipquantifier) {
		getLevel2rrrelationshipquantifiers().remove(level2rrrelationshipquantifier);
		level2rrrelationshipquantifier.setLevel2relationshiprecord(null);

		return level2rrrelationshipquantifier;
	}

}