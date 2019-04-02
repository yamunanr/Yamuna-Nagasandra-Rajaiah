package com.inmemory.gleifparser.entity;

import java.io.Serializable;
import javax.persistence.*;

import com.inmemory.gleifparser.constants.Constants;

import java.util.List;


/**
 * The persistent class for the LEVEL2_REPORTING_EXCEPTION database table.
 * 
 */
@Entity
@Table(name="LEVEL2_REPORTING_EXCEPTION")
@NamedQuery(name="Level2ReportingException.findAll", query="SELECT l FROM Level2ReportingException l")
public class Level2ReportingException implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="reportingExceptionSequenceGen")
	@SequenceGenerator(name="reportingExceptionSequenceGen",sequenceName="LEVEL2_REPORTING_EXCEPTION_SEQ",allocationSize=Constants.SEQUENCE_ALLOCATION_SIZE)
	@Column(name="EXCEPTION_ID")
	private Long exceptionId;

	@Column(name="EXCEPTION_CATEGORY")
	private String exceptionCategory;

	@Column(name="EXCEPTION_TYPE_ANY")
	private String exceptionTypeAny;

	@Column(name="NEXT_VERSION_TYPE")
	private String nextVersionType;

	//bi-directional many-to-one association to Level2ExceptionReason
	@OneToMany(mappedBy="level2ReportingException",cascade=CascadeType.PERSIST)
	private List<Level2ExceptionReason> level2ExceptionReasons;

	//bi-directional many-to-one association to Level2ExceptionReferenceDAO
	@OneToMany(mappedBy="level2ReportingException",cascade=CascadeType.PERSIST)
	private List<Level2ExceptionReference> level2ExceptionReferences;

	//bi-directional many-to-one association to Level1LeiRecord
	/*
	 * @ManyToOne
	 * 
	 * @JoinColumn(name="LEI",insertable=false) private Level1LeiRecord
	 * level1LeiRecord;
	 */
	@Column(name="LEI")
	private String lei;

	

	public Level2ReportingException() {
	}

	public Long getExceptionId() {
		return this.exceptionId;
	}

	public void setExceptionId(Long exceptionId) {
		this.exceptionId = exceptionId;
	}

	public String getExceptionCategory() {
		return this.exceptionCategory;
	}

	public void setExceptionCategory(String exceptionCategory) {
		this.exceptionCategory = exceptionCategory;
	}

	public String getExceptionTypeAny() {
		return this.exceptionTypeAny;
	}

	public void setExceptionTypeAny(String exceptionTypeAny) {
		this.exceptionTypeAny = exceptionTypeAny;
	}

	public String getNextVersionType() {
		return this.nextVersionType;
	}

	public void setNextVersionType(String nextVersionType) {
		this.nextVersionType = nextVersionType;
	}

	public List<Level2ExceptionReason> getLevel2ExceptionReasons() {
		return this.level2ExceptionReasons;
	}

	public void setLevel2ExceptionReasons(List<Level2ExceptionReason> level2ExceptionReasons) {
		this.level2ExceptionReasons = level2ExceptionReasons;
	}

	public Level2ExceptionReason addLevel2ExceptionReason(Level2ExceptionReason level2ExceptionReason) {
		getLevel2ExceptionReasons().add(level2ExceptionReason);
		level2ExceptionReason.setLevel2ReportingException(this);

		return level2ExceptionReason;
	}

	public Level2ExceptionReason removeLevel2ExceptionReason(Level2ExceptionReason level2ExceptionReason) {
		getLevel2ExceptionReasons().remove(level2ExceptionReason);
		level2ExceptionReason.setLevel2ReportingException(null);

		return level2ExceptionReason;
	}

	public List<Level2ExceptionReference> getLevel2ExceptionReferences() {
		return this.level2ExceptionReferences;
	}

	public void setLevel2ExceptionReferences(List<Level2ExceptionReference> level2ExceptionReferences) {
		this.level2ExceptionReferences = level2ExceptionReferences;
	}

	public Level2ExceptionReference addLevel2ExceptionReference(Level2ExceptionReference level2ExceptionReference) {
		getLevel2ExceptionReferences().add(level2ExceptionReference);
		level2ExceptionReference.setLevel2ReportingException(this);

		return level2ExceptionReference;
	}

	public Level2ExceptionReference removeLevel2ExceptionReference(Level2ExceptionReference level2ExceptionReference) {
		getLevel2ExceptionReferences().remove(level2ExceptionReference);
		level2ExceptionReference.setLevel2ReportingException(null);

		return level2ExceptionReference;
	}

	public String getLei() {
		return lei;
	}

	public void setLei(String lei) {
		this.lei = lei;
	}

	

}