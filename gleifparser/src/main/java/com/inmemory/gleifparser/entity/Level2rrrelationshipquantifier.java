package com.inmemory.gleifparser.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the LEVEL2RRRELATIONSHIPQUANTIFIER database table.
 * 
 */
@Entity
@NamedQuery(name="Level2rrrelationshipquantifier.findAll", query="SELECT l FROM Level2rrrelationshipquantifier l")
public class Level2rrrelationshipquantifier implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="MEASUREMENT_METHOD")
	private String measurementMethod;

	@Column(name="QUANTIFIER_AMOUNT")
	private int quantifierAmount;

	@Column(name="QUANTIFIER_UNITS")
	private int quantifierUnits;

	//bi-directional many-to-one association to Level2relationshiprecord
	@ManyToOne
	@JoinColumn(name="QUANTIFIER_RR_ID")
	private Level2relationshiprecord level2relationshiprecord;

	public Level2rrrelationshipquantifier() {
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

	public Level2relationshiprecord getLevel2relationshiprecord() {
		return this.level2relationshiprecord;
	}

	public void setLevel2relationshiprecord(Level2relationshiprecord level2relationshiprecord) {
		this.level2relationshiprecord = level2relationshiprecord;
	}

}