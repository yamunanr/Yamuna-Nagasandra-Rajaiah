package com.inmemory.gleifparser.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the GLEIF_HEADER database table.
 * 
 */
@Entity
@Table(name="GLEIF_HEADER")
@NamedQuery(name="GleifHeader.findAll", query="SELECT g FROM GleifHeader g")
public class GleifHeader implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="gleifSequenceGen")
	@SequenceGenerator(name="gleifSequenceGen",sequenceName="GLEIF_HEADER_SEQ",allocationSize = 1)
	@Column(name="GLEIF_HEADER_ID")
	private Long gleifHeaderId;

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

	public GleifHeader() {
	}

	public Long getGleifHeaderId() {
		return this.gleifHeaderId;
	}

	public void setGleifHeaderId(Long gleifHeaderId) {
		this.gleifHeaderId = gleifHeaderId;
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