package com.inmemory.gleifparser.entity;

import java.io.Serializable;
import javax.persistence.*;

import com.inmemory.gleifparser.constants.Constants;


/**
 * The persistent class for the LEVEL2_RR_RELATIONSHIP_QUALIFIER database table.
 * 
 */
@Entity
@Table(name="LEVEL2_RR_RELATIONSHIP_QUALIFIER")
@NamedQuery(name="Level2RrRelationshipQualifier.findAll", query="SELECT l FROM Level2RrRelationshipQualifier l")
public class Level2RrRelationshipQualifier implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="relationshipQualifierSequenceGen")
	@SequenceGenerator(name="relationshipQualifierSequenceGen",sequenceName="LEVEL2_RR_RELATIONSHIP_QUALIFIER_SEQ",allocationSize = Constants.SEQUENCE_ALLOCATION_SIZE)
	@Column(name="QUALIFIER_RR_ID")
	private Long qualifierRrId;

	@Column(name="QUALIFIER_CATEGORY")
	private String qualifierCategory;

	@Column(name="QUALIFIER_DIMENSION")
	private String qualifierDimension;

	//bi-directional many-to-one association to Level2RelationshipRecord
	@ManyToOne
	@JoinColumn(name="RR_ID")
	private Level2RelationshipRecord level2RelationshipRecord;

	public Level2RrRelationshipQualifier() {
	}

	public Long getQualifierRrId() {
		return this.qualifierRrId;
	}

	public void setQualifierRrId(Long qualifierRrId) {
		this.qualifierRrId = qualifierRrId;
	}

	public String getQualifierCategory() {
		return this.qualifierCategory;
	}

	public void setQualifierCategory(String qualifierCategory) {
		this.qualifierCategory = qualifierCategory;
	}

	public String getQualifierDimension() {
		return this.qualifierDimension;
	}

	public void setQualifierDimension(String qualifierDimension) {
		this.qualifierDimension = qualifierDimension;
	}

	public Level2RelationshipRecord getLevel2RelationshipRecord() {
		return this.level2RelationshipRecord;
	}

	public void setLevel2RelationshipRecord(Level2RelationshipRecord level2RelationshipRecord) {
		this.level2RelationshipRecord = level2RelationshipRecord;
	}

}