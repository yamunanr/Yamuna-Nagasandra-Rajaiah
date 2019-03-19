package com.inmemory.gleifparser.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the LEVEL2EXCEPTIONREASON database table.
 * 
 */
@Entity
@NamedQuery(name="Level2exceptionreason.findAll", query="SELECT l FROM Level2exceptionreason l")
public class Level2exceptionreason implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="EXCEPTION_CATEGORY")
	private String exceptionCategory;

	//bi-directional many-to-one association to Level2reportingexception
	@ManyToOne
	@JoinColumn(name="EXCEPTIONREASON_ID")
	private Level2reportingexception level2reportingexception;

	public Level2exceptionreason() {
	}

	public String getExceptionCategory() {
		return this.exceptionCategory;
	}

	public void setExceptionCategory(String exceptionCategory) {
		this.exceptionCategory = exceptionCategory;
	}

	public Level2reportingexception getLevel2reportingexception() {
		return this.level2reportingexception;
	}

	public void setLevel2reportingexception(Level2reportingexception level2reportingexception) {
		this.level2reportingexception = level2reportingexception;
	}

}