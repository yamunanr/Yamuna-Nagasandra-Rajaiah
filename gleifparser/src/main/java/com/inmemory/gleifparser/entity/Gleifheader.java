package com.inmemory.gleifparser.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


/**
 * The persistent class for the GLEIFHEADER database table.
 * 
 */
@Entity
@NamedQuery(name="Gleifheader.findAll", query="SELECT g FROM Gleifheader g")
public class Gleifheader implements Serializable {
	private static final long serialVersionUID = 1L;

	@Temporal(TemporalType.DATE)
	@Column(name="CONTENT_DATE")
	private Date contentDate;

	@Temporal(TemporalType.DATE)
	@Column(name="DELTA_START")
	private Date deltaStart;

	@Column(name="FILE_CONTENT")
	private String fileContent;

	private String originator;

	@Column(name="RECORD_COUNT")
	private int recordCount;

	public Gleifheader() {
	}

	public Date getContentDate() {
		return this.contentDate;
	}

	public void setContentDate(Date contentDate) {
		this.contentDate = contentDate;
	}

	public Date getDeltaStart() {
		return this.deltaStart;
	}

	public void setDeltaStart(Date deltaStart) {
		this.deltaStart = deltaStart;
	}

	public String getFileContent() {
		return this.fileContent;
	}

	public void setFileContent(String fileContent) {
		this.fileContent = fileContent;
	}

	public String getOriginator() {
		return this.originator;
	}

	public void setOriginator(String originator) {
		this.originator = originator;
	}

	public int getRecordCount() {
		return this.recordCount;
	}

	public void setRecordCount(int recordCount) {
		this.recordCount = recordCount;
	}

}