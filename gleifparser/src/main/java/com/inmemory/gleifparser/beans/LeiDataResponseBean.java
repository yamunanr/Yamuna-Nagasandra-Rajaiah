package com.inmemory.gleifparser.beans;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import com.inmemory.gleifparser.utils.DateUtils;

public class LeiDataResponseBean extends BaseBean {
 private String lei;
 private String legalName;
 private String registeredAs;
 private String jurdiscation;
 private String legalForm;
 private String entityStatus;
 private String legalfirstAddLine;
 private String legalAddressNumber;
 private String legalAddNumBuilding;
 private String legalAddMailRouting;
 private String legalAdditionalAddLine1;
 private String legalAdditonalAddLine2;
 private String legalAdditonalAddLine3;
 private String legalAddressPostalCode;
 private String legalAddCity;
 private String legalAddRegion;
 private String legalAddCountry;
 private String regInitialDate;
 private String regLastUpdateDate;
 private String regStatus;;
 private String regNextRenewalDate;
 private String regLeiIssuer;
 private String corroborationLevel;
 private Set<KeyValue> childLeis;
 private Set<KeyValue> parentLeis;
 
 
public LeiDataResponseBean() {
	// TODO Auto-generated constructor stub
}
public String getLei() {
	return lei;
}
public void setLei(String lei) {
	this.lei = lei;
}
public String getLegalName() {
	return legalName;
}
public void setLegalName(String legalName) {
	this.legalName = legalName;
}
public String getRegisteredAs() {
	return registeredAs;
}
public void setRegisteredAs(String registeredAs) {
	this.registeredAs = registeredAs;
}
public String getJurdiscation() {
	return jurdiscation;
}
public void setJurdiscation(String jurdiscation) {
	this.jurdiscation = jurdiscation;
}
public String getLegalForm() {
	return legalForm;
}
public void setLegalForm(String legalForm) {
	this.legalForm = legalForm;
}
public String getEntityStatus() {
	return entityStatus;
}
public void setEntityStatus(String entityStatus) {
	this.entityStatus = entityStatus;
}
public String getLegalfirstAddLine() {
	return legalfirstAddLine;
}
public void setLegalfirstAddLine(String legalfirstAddLine) {
	this.legalfirstAddLine = legalfirstAddLine;
}
public String getLegalAddressNumber() {
	return legalAddressNumber;
}
public void setLegalAddressNumber(String legalAddressNumber) {
	this.legalAddressNumber = legalAddressNumber;
}
public String getLegalAddNumBuilding() {
	return legalAddNumBuilding;
}
public void setLegalAddNumBuilding(String legalAddNumBuilding) {
	this.legalAddNumBuilding = legalAddNumBuilding;
}
public String getLegalAddMailRouting() {
	return legalAddMailRouting;
}
public void setLegalAddMailRouting(String legalAddMailRouting) {
	this.legalAddMailRouting = legalAddMailRouting;
}
public String getLegalAdditionalAddLine1() {
	return legalAdditionalAddLine1;
}
public void setLegalAdditionalAddLine1(String legalAdditionalAddLine1) {
	this.legalAdditionalAddLine1 = legalAdditionalAddLine1;
}
public String getLegalAdditonalAddLine2() {
	return legalAdditonalAddLine2;
}
public void setLegalAdditonalAddLine2(String legalAdditonalAddLine2) {
	this.legalAdditonalAddLine2 = legalAdditonalAddLine2;
}
public String getLegalAdditonalAddLine3() {
	return legalAdditonalAddLine3;
}
public void setLegalAdditonalAddLine3(String legalAdditonalAddLine3) {
	this.legalAdditonalAddLine3 = legalAdditonalAddLine3;
}
public String getLegalAddressPostalCode() {
	return legalAddressPostalCode;
}
public void setLegalAddressPostalCode(String legalAddressPostalCode) {
	this.legalAddressPostalCode = legalAddressPostalCode;
}
public String getLegalAddCity() {
	return legalAddCity;
}
public void setLegalAddCity(String legalAddCity) {
	this.legalAddCity = legalAddCity;
}
public String getLegalAddRegion() {
	return legalAddRegion;
}
public void setLegalAddRegion(String legalAddRegion) {
	this.legalAddRegion = legalAddRegion;
}
public String getLegalAddCountry() {
	return legalAddCountry;
}
public void setLegalAddCountry(String legalAddCountry) {
	this.legalAddCountry = legalAddCountry;
}
public String getRegInitialDate() {
	return regInitialDate;
}
public void setRegInitialDate(String regInitialDate) {
	this.regInitialDate = regInitialDate;
}
public String getRegLastUpdateDate() {
	return regLastUpdateDate;
}
public void setRegLastUpdateDate(String regLastUpdateDate) {
	this.regLastUpdateDate = regLastUpdateDate;
}
public String getRegStatus() {
	return regStatus;
}
public void setRegStatus(String regStatus) {
	this.regStatus = regStatus;
}
public String getRegNextRenewalDate() {
	return regNextRenewalDate;
}
public void setRegNextRenewalDate(String regNextRenewalDate) {
	this.regNextRenewalDate = regNextRenewalDate;
}
public String getRegLeiIssuer() {
	return regLeiIssuer;
}
public void setRegLeiIssuer(String regLeiIssuer) {
	this.regLeiIssuer = regLeiIssuer;
}




public Set<KeyValue> getChildLeis() {
	return childLeis;
}
public void setChildLeis(Set<KeyValue> childLeis) {
	this.childLeis = childLeis;
}
public Set<KeyValue> getParentLeis() {
	return parentLeis;
}
public void setParentLeis(Set<KeyValue> parentLeis) {
	this.parentLeis = parentLeis;
}
public String getCorroborationLevel() {
	return corroborationLevel;
}
public void setCorroborationLevel(String corroborationLevel) {
	this.corroborationLevel = corroborationLevel;
}
public LeiDataResponseBean(String lei, String legalName, String registeredAs, String jurdiscation, String legalForm,
		String entityStatus, String legalfirstAddLine, String legalAddressNumber, String legalAddNumBuilding,
		String legalAddMailRouting, String legalAdditionalAddLine1, String legalAdditonalAddLine2,
		String legalAdditonalAddLine3, String legalAddressPostalCode, String legalAddCity, String legalAddRegion,
		String legalAddCountry, Date regInitialDate, Date regLastUpdateDate, String regStatus,
		Date regNextRenewalDate, String regLeiIssuer,String corroborationLevel) {
	this.lei = lei;
	this.legalName = legalName;
	this.registeredAs = registeredAs;
	this.jurdiscation = jurdiscation;
	this.legalForm = legalForm;
	this.entityStatus = entityStatus;
	this.legalfirstAddLine = legalfirstAddLine;
	this.legalAddressNumber = legalAddressNumber;
	this.legalAddNumBuilding = legalAddNumBuilding;
	this.legalAddMailRouting = legalAddMailRouting;
	this.legalAdditionalAddLine1 = legalAdditionalAddLine1;
	this.legalAdditonalAddLine2 = legalAdditonalAddLine2;
	this.legalAdditonalAddLine3 = legalAdditonalAddLine3;
	this.legalAddressPostalCode = legalAddressPostalCode;
	this.legalAddCity = legalAddCity;
	this.legalAddRegion = legalAddRegion;
	this.legalAddCountry = legalAddCountry;
	this.regInitialDate = DateUtils.convertDateToString(regInitialDate);
	this.regLastUpdateDate = DateUtils.convertDateToString(regLastUpdateDate);
	this.regStatus = regStatus;
	this.regNextRenewalDate = DateUtils.convertDateToString(regNextRenewalDate);
	this.regLeiIssuer = regLeiIssuer;
	this.corroborationLevel=corroborationLevel;
	this.childLeis=new HashSet<>();
	this.parentLeis=new HashSet<>();
}

 
 
 
 
} 
