package com.inmemory.gleifparser.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the LEVEL2EXCEPTIONREFERENCE database table.
 * 
 */
@Entity
@NamedQuery(name="Level2exceptionreference.findAll", query="SELECT l FROM Level2exceptionreference l")
public class Level2exceptionreference implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="EXCEPTION_REFERENCE")
	private String exceptionReference;

	//bi-directional many-to-one association to Level2reportingexception
	@ManyToOne
	@JoinColumn(name="EXCEPTIONREFERENCE_ID")
	private Level2reportingexception level2reportingexception;

	public Level2exceptionreference() {
	}

	public String getExceptionReference() {
		return this.exceptionReference;
	}

	public void setExceptionReference(String exceptionReference) {
		this.exceptionReference = exceptionReference;
	}

	public Level2reportingexception getLevel2reportingexception() {
		return this.level2reportingexception;
	}

	public void setLevel2reportingexception(Level2reportingexception level2reportingexception) {
		this.level2reportingexception = level2reportingexception;
	}

}