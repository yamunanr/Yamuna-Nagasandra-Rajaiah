package com.inmemory.gleifparser.model;

public class KeyValue {
	private String key;
	private String value;

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	/**
	 * @param key
	 * @param value
	 */
	public KeyValue(String key, String value) {
		this.key = key;
		this.value = value;
	}

}
