package com.inmemory.gleifparser.entity;

import java.io.Serializable;
import javax.persistence.*;

import com.inmemory.gleifparser.constants.Constants;


/**
 * The persistent class for the LEVEL2_RR_RELATIONSHIP_QUANTIFIER database table.
 * 
 */
@Entity
@Table(name="LEVEL2_RR_RELATIONSHIP_QUANTIFIER")
@NamedQuery(name="Level2RrRelationshipQuantifier.findAll", query="SELECT l FROM Level2RrRelationshipQuantifier l")
public class Level2RrRelationshipQuantifier implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="relationshipQuantifierSequenceGen")
	@SequenceGenerator(name="relationshipQuantifierSequenceGen",sequenceName="LEVEL2_RR_RELATIONSHIP_QUANTIFIER_SEQ", allocationSize = Constants.SEQUENCE_ALLOCATION_SIZE)
	@Column(name="QUANTIFIER_RR_ID")
	private Long quantifierRrId;

	@Column(name="MEASUREMENT_METHOD")
	private String measurementMethod;

	@Column(name="QUANTIFIER_AMOUNT")
	private int quantifierAmount;

	@Column(name="QUANTIFIER_UNITS")
	private int quantifierUnits;

	//bi-directional many-to-one association to Level2RelationshipRecord
	@ManyToOne
	@JoinColumn(name="RR_ID")
	private Level2RelationshipRecord level2RelationshipRecord;

	public Level2RrRelationshipQuantifier() {
	}

	public Long getQuantifierRrId() {
		return this.quantifierRrId;
	}

	public void setQuantifierRrId(Long quantifierRrId) {
		this.quantifierRrId = quantifierRrId;
	}

	public String getMeasurementMethod() {
		return this.measurementMethod;
	}

	public void setMeasurementMethod(String measurementMethod) {
		this.measurementMethod = measurementMethod;
	}

	public int getQuantifierAmount() {
		return this.quantifierAmount;
	}

	public void setQuantifierAmount(int quantifierAmount) {
		this.quantifierAmount = quantifierAmount;
	}

	public int getQuantifierUnits() {
		return this.quantifierUnits;
	}

	public void setQuantifierUnits(int quantifierUnits) {
		this.quantifierUnits = quantifierUnits;
	}

	public Level2RelationshipRecord getLevel2RelationshipRecord() {
		return this.level2RelationshipRecord;
	}

	public void setLevel2RelationshipRecord(Level2RelationshipRecord level2RelationshipRecord) {
		this.level2RelationshipRecord = level2RelationshipRecord;
	}

}