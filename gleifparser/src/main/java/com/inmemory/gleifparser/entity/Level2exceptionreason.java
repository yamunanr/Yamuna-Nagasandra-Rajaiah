package com.inmemory.gleifparser.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the LEVEL2_EXCEPTION_REASON database table.
 * 
 */
@Entity
@Table(name="LEVEL2_EXCEPTION_REASON")
@NamedQuery(name="Level2ExceptionReason.findAll", query="SELECT l FROM Level2ExceptionReason l")
public class Level2ExceptionReason implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="exceptionReasonSequenceGen")
	@SequenceGenerator(name="exceptionReasonSequenceGen",sequenceName="LEVEL2_EXCEPTION_REASON_SEQ",allocationSize=1)
	@Column(name="EXCEPTION_REASON_ID")
	private Long exceptionReasonId;

	@Column(name="EXCEPTION_REASON")
	private String exceptionReason;

	//bi-directional many-to-one association to Level2ReportingException
	@ManyToOne
	@JoinColumn(name="EXCEPTION_ID")
	private Level2ReportingException level2ReportingException;

	public Level2ExceptionReason() {
	}

	public Long getExceptionReasonId() {
		return this.exceptionReasonId;
	}

	public void setExceptionReasonId(Long exceptionReasonId) {
		this.exceptionReasonId = exceptionReasonId;
	}

	public String getExceptionReason() {
		return this.exceptionReason;
	}

	public void setExceptionReason(String exceptionReason) {
		this.exceptionReason = exceptionReason;
	}

	public Level2ReportingException getLevel2ReportingException() {
		return this.level2ReportingException;
	}

	public void setLevel2ReportingException(Level2ReportingException level2ReportingException) {
		this.level2ReportingException = level2ReportingException;
	}

}