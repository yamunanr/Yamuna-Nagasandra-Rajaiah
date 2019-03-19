package com.inmemory.gleifparser.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the LEVEL2RRRELATIONSHIPQUALIFIER database table.
 * 
 */
@Entity
@NamedQuery(name="Level2rrrelationshipqualifier.findAll", query="SELECT l FROM Level2rrrelationshipqualifier l")
public class Level2rrrelationshipqualifier implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="QUALIFIER_CATEGORY")
	private String qualifierCategory;

	@Column(name="QUALIFIER_DIMENSION")
	private String qualifierDimension;

	//bi-directional many-to-one association to Level2relationshiprecord
	@ManyToOne
	@JoinColumn(name="QUALIFIER_RR_ID")
	private Level2relationshiprecord level2relationshiprecord;

	public Level2rrrelationshipqualifier() {
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

	public Level2relationshiprecord getLevel2relationshiprecord() {
		return this.level2relationshiprecord;
	}

	public void setLevel2relationshiprecord(Level2relationshiprecord level2relationshiprecord) {
		this.level2relationshiprecord = level2relationshiprecord;
	}

}