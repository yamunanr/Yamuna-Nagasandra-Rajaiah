package com.inmemory.gleifparser.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the LEVEL2REPORTINGEXCEPTION database table.
 * 
 */
@Entity
@NamedQuery(name="Level2reportingexception.findAll", query="SELECT l FROM Level2reportingexception l")
public class Level2reportingexception implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	@Column(name="EXCEPTION_ID")
	private int exceptionId;

	@Column(name="EXCEPTION_CATEGORY")
	private String exceptionCategory;

	//bi-directional many-to-one association to Level2exceptionreason
	@OneToMany(mappedBy="level2reportingexception")
	private List<Level2exceptionreason> level2exceptionreasons;

	//bi-directional many-to-one association to Level2exceptionreference
	@OneToMany(mappedBy="level2reportingexception")
	private List<Level2exceptionreference> level2exceptionreferences;

	public Level2reportingexception() {
	}

	public int getExceptionId() {
		return this.exceptionId;
	}

	public void setExceptionId(int exceptionId) {
		this.exceptionId = exceptionId;
	}

	public String getExceptionCategory() {
		return this.exceptionCategory;
	}

	public void setExceptionCategory(String exceptionCategory) {
		this.exceptionCategory = exceptionCategory;
	}

	public List<Level2exceptionreason> getLevel2exceptionreasons() {
		return this.level2exceptionreasons;
	}

	public void setLevel2exceptionreasons(List<Level2exceptionreason> level2exceptionreasons) {
		this.level2exceptionreasons = level2exceptionreasons;
	}

	public Level2exceptionreason addLevel2exceptionreason(Level2exceptionreason level2exceptionreason) {
		getLevel2exceptionreasons().add(level2exceptionreason);
		level2exceptionreason.setLevel2reportingexception(this);

		return level2exceptionreason;
	}

	public Level2exceptionreason removeLevel2exceptionreason(Level2exceptionreason level2exceptionreason) {
		getLevel2exceptionreasons().remove(level2exceptionreason);
		level2exceptionreason.setLevel2reportingexception(null);

		return level2exceptionreason;
	}

	public List<Level2exceptionreference> getLevel2exceptionreferences() {
		return this.level2exceptionreferences;
	}

	public void setLevel2exceptionreferences(List<Level2exceptionreference> level2exceptionreferences) {
		this.level2exceptionreferences = level2exceptionreferences;
	}

	public Level2exceptionreference addLevel2exceptionreference(Level2exceptionreference level2exceptionreference) {
		getLevel2exceptionreferences().add(level2exceptionreference);
		level2exceptionreference.setLevel2reportingexception(this);

		return level2exceptionreference;
	}

	public Level2exceptionreference removeLevel2exceptionreference(Level2exceptionreference level2exceptionreference) {
		getLevel2exceptionreferences().remove(level2exceptionreference);
		level2exceptionreference.setLevel2reportingexception(null);

		return level2exceptionreference;
	}

}