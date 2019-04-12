package com.inmemory.gleifparser.beans;

import java.io.Serializable;

public class GleifJmsMessage implements Serializable {

	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1137386605904691878L;

	private String xmlFilePath;

	private String subscriberId;

	public String getXmlFilePath() {
		return xmlFilePath;
	}

	public void setXmlFilePath(String xmlFilePath) {
		this.xmlFilePath = xmlFilePath;
	}

	public String getSubscriberId() {
		return subscriberId;
	}

	public void setSubscriberId(String subscriberId) {
		this.subscriberId = subscriberId;
	}

}
