package com.inmemory.gleifparser.entity;

import java.io.Serializable;
import javax.persistence.*;

import com.inmemory.gleifparser.constants.Constants;


/**
 * The persistent class for the LEVEL2_EXCEPTION_REFERENCE database table.
 * 
 */
@Entity
@Table(name="LEVEL2_EXCEPTION_REFERENCE")
@NamedQuery(name="Level2ExceptionReference.findAll", query="SELECT l FROM Level2ExceptionReference l")
public class Level2ExceptionReference implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="exceptionReferenceSequenceGen")
	@SequenceGenerator(name="exceptionReferenceSequenceGen",sequenceName="LEVEL2_EXCEPTION_REFERENCE_SEQ",allocationSize=Constants.SEQUENCE_ALLOCATION_SIZE)
	@Column(name="EXCEPTION_REFERENCE_ID")
	private Long exceptionReferenceId;

	@Column(name="EXCEPTION_REFERENCE")
	private String exceptionReference;

	//bi-directional many-to-one association to Level2ReportingException
	@ManyToOne
	@JoinColumn(name="EXCEPTION_ID")
	private Level2ReportingException level2ReportingException;

	public Level2ExceptionReference() {
	}

	public Long getExceptionReferenceId() {
		return this.exceptionReferenceId;
	}

	public void setExceptionReferenceId(Long exceptionReferenceId) {
		this.exceptionReferenceId = exceptionReferenceId;
	}

	public String getExceptionReference() {
		return this.exceptionReference;
	}

	public void setExceptionReference(String exceptionReference) {
		this.exceptionReference = exceptionReference;
	}

	public Level2ReportingException getLevel2ReportingException() {
		return this.level2ReportingException;
	}

	public void setLevel2ReportingException(Level2ReportingException level2ReportingException) {
		this.level2ReportingException = level2ReportingException;
	}

}