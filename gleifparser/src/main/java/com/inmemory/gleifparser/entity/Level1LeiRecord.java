package com.inmemory.gleifparser.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;

/**
 * The persistent class for the LEVEL1_LEI_RECORD database table.
 * 
 */
@Entity
@Table(name = "LEVEL1_LEI_RECORD")
@NamedQuery(name = "Level1LeiRecord.findAll", query = "SELECT l FROM Level1LeiRecord l")
public class Level1LeiRecord implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String lei;

	@Column(name = "E_ASSOCIATED_ENTITY_NAME")
	private String eAssociatedEntityName;

	@Column(name = "E_ASSOCIATED_ENTITY_TYPE")
	private String eAssociatedEntityType;

	@Column(name = "E_ASSOCIATED_LEI")
	private String eAssociatedLei;

	@Column(name = "E_CATEGORY_TYPE")
	private String eCategoryType;

	@Temporal(TemporalType.DATE)
	@Column(name = "E_ENTITY_EXPIRATION_DATE")
	private Date eEntityExpirationDate;

	@Column(name = "E_ENTITY_EXPIRATION_REASON")
	private String eEntityExpirationReason;

	@Column(name = "E_ENTITY_LEGAL_FORM_CODE")
	private String eEntityLegalFormCode;

	@Column(name = "E_ENTITY_STATUS")
	private String eEntityStatus;

	@Column(name = "E_HQ_ADDITIONAL_ADDRESS_LINE_1")
	private String eHqAdditionalAddressLine1;

	@Column(name = "E_HQ_ADDITIONAL_ADDRESS_LINE_2")
	private String eHqAdditionalAddressLine2;

	@Column(name = "E_HQ_ADDITIONAL_ADDRESS_LINE_3")
	private String eHqAdditionalAddressLine3;

	@Column(name = "E_HQ_ADDRESS_NUMBER")
	private String eHqAddressNumber;

	@Column(name = "E_HQ_ADDRESSNUMBER_WITHIN_BUILDING")
	private String eHqAddressnumberWithinBuilding;

	@Column(name = "E_HQ_CITY")
	private String eHqCity;

	@Column(name = "E_HQ_COUNTRY")
	private String eHqCountry;

	@Column(name = "E_HQ_FIRST_ADDRESS_LINE")
	private String eHqFirstAddressLine;

	@Column(name = "E_HQ_LANG")
	private String eHqLang;

	@Column(name = "E_HQ_MAIL_ROUTING")
	private String eHqMailRouting;

	@Column(name = "E_HQ_POSTAL_CODE")
	private String eHqPostalCode;

	@Column(name = "E_HQ_REGION")
	private String eHqRegion;

	@Column(name = "E_LEGAL_ADDRESS_ADDITIONAL_ADDRESS_LINE_1")
	private String eLegalAddressAdditionalAddressLine1;

	@Column(name = "E_LEGAL_ADDRESS_ADDITIONAL_ADDRESS_LINE_2")
	private String eLegalAddressAdditionalAddressLine2;

	@Column(name = "E_LEGAL_ADDRESS_ADDITIONAL_ADDRESS_LINE_3")
	private String eLegalAddressAdditionalAddressLine3;

	@Column(name = "E_LEGAL_ADDRESS_ADDRESS_NUMBER")
	private String eLegalAddressAddressNumber;

	@Column(name = "E_LEGAL_ADDRESS_ADDRESS_NUMBER_WITHIN_BUILDING")
	private String eLegalAddressAddressNumberWithinBuilding;

	@Column(name = "E_LEGAL_ADDRESS_CITY")
	private String eLegalAddressCity;

	@Column(name = "E_LEGAL_ADDRESS_COUNTRY")
	private String eLegalAddressCountry;

	@Column(name = "E_LEGAL_ADDRESS_FIRST_ADDRESS_LINE")
	private String eLegalAddressFirstAddressLine;

	@Column(name = "E_LEGAL_ADDRESS_LANG")
	private String eLegalAddressLang;

	@Column(name = "E_LEGAL_ADDRESS_MAIL_ROUTING")
	private String eLegalAddressMailRouting;

	@Column(name = "E_LEGAL_ADDRESS_POSTALCODE")
	private String eLegalAddressPostalcode;

	@Column(name = "E_LEGAL_ADDRESS_REGION")
	private String eLegalAddressRegion;

	@Column(name = "E_LEGAL_JURISDICTION")
	private String eLegalJurisdiction;

	@Column(name = "E_LEGAL_NAME_TYPE_LANG")
	private String eLegalNameTypeLang;

	@Column(name = "E_LEGAL_NAME_TYPE_VALUE")
	private String eLegalNameTypeValue;

	@Column(name = "E_O_ADDITIONAL_ADDRESS_LINE_1")
	private String eOAdditionalAddressLine1;

	@Column(name = "E_O_ADDITIONAL_ADDRESS_LINE_2")
	private String eOAdditionalAddressLine2;

	@Column(name = "E_O_ADDITIONAL_ADDRESS_LINE_3")
	private String eOAdditionalAddressLine3;

	@Column(name = "E_O_ADDITIONAL_ADDRESS_NUMBER")
	private String eOAdditionalAddressNumber;

	@Column(name = "E_O_ADDRESS_NUMBER")
	private String eOAddressNumber;

	@Column(name = "E_O_ADDRESS_NUMBER_WITHIN_BUILDING")
	private String eOAddressNumberWithinBuilding;

	@Column(name = "E_O_ADDRESS_TYPE")
	private String eOAddressType;

	@Column(name = "E_O_CITY")
	private String eOCity;

	@Column(name = "E_O_COUNTRY")
	private String eOCountry;

	@Column(name = "E_O_FIRST_ADDRESS_LINE")
	private String eOFirstAddressLine;

	@Column(name = "E_O_LANG")
	private String eOLang;

	@Column(name = "E_O_MAIL_ROUTING_1")
	private String eOMailRouting1;

	@Column(name = "E_O_POSTALCODE")
	private String eOPostalcode;

	@Column(name = "E_O_REGION")
	private String eORegion;

	@Column(name = "E_OTHER_ENTITY_NAMES_TYPE")
	private String eOtherEntityNamesType;

	@Column(name = "E_OTHER_LEGAL_FORM")
	private String eOtherLegalForm;

	@Column(name = "E_OTHER_REGISTRATION_AUTHORITY_ID")
	private String eOtherRegistrationAuthorityId;

	@Column(name = "E_REGISTRATION_AUTHORITY_ENTITY_ID")
	private String eRegistrationAuthorityEntityId;

	@Column(name = "E_REGISTRATION_AUTHORITY_ID")
	private String eRegistrationAuthorityId;

	@Column(name = "E_SUCCESSOR_ENTITY_NAME")
	private String eSuccessorEntityName;

	@Column(name = "E_SUCCESSOR_LEI")
	private String eSuccessorLei;

	@Column(name = "E_TO_ADDITIONAL_ADDRESS_LINE_1")
	private String eToAdditionalAddressLine1;

	@Column(name = "E_TO_ADDITIONAL_ADDRESS_LINE_2")
	private String eToAdditionalAddressLine2;

	@Column(name = "E_TO_ADDITIONAL_ADDRESS_LINE_3")
	private String eToAdditionalAddressLine3;

	@Column(name = "E_TO_ADDRESS_NUMBER")
	private String eToAddressNumber;

	@Column(name = "E_TO_ADDRESS_NUMBER_WITHIN_BUILDING")
	private String eToAddressNumberWithinBuilding;

	@Column(name = "E_TO_ADDRESS_TYPE")
	private String eToAddressType;

	@Column(name = "E_TO_CITY")
	private String eToCity;

	@Column(name = "E_TO_COUNTRY")
	private String eToCountry;

	@Column(name = "E_TO_FIRST_ADDRESS_LINE")
	private String eToFirstAddressLine;

	@Column(name = "E_TO_LANG")
	private String eToLang;

	@Column(name = "E_TO_MAIL_ROUTING")
	private String eToMailRouting;

	@Column(name = "E_TO_POSTALCODE")
	private String eToPostalcode;

	@Column(name = "E_TO_REGION")
	private String eToRegion;

	@Column(name = "E_TRANSLITERATED_OTHER_ENTITY_NAMES_TYPE")
	private String eTransliteratedOtherEntityNamesType;

	@Temporal(TemporalType.DATE)
	@Column(name = "R_INITIAL_REGISTRATION_DATE")
	private Date rInitialRegistrationDate;

	@Temporal(TemporalType.DATE)
	@Column(name = "R_LAST_UPDATE_DATE")
	private Date rLastUpdateDate;

	@Column(name = "R_MANAGING_LOU")
	private String rManagingLou;

	@Temporal(TemporalType.DATE)
	@Column(name = "R_NEXT_RENEWAL_DATE")
	private Date rNextRenewalDate;

	@Column(name = "R_OTHER_VALIDATION_AUTHORITY_ID")
	private String rOtherValidationAuthorityId;

	@Column(name = "R_REGISTRATION_STATUS")
	private String rRegistrationStatus;

	@Column(name = "R_VALIDATION_AUTHORITY_ENTITY_ID")
	private String rValidationAuthorityEntityId;

	@Column(name = "R_VALIDATION_AUTHORITY_ID")
	private String rValidationAuthorityId;

	@Column(name = "R_VALIDATION_SOURCES")
	private String rValidationSources;


	public String getLei() {
		return this.lei;
	}

	public void setLei(String lei) {
		this.lei = lei;
	}

	public String getEAssociatedEntityName() {
		return this.eAssociatedEntityName;
	}

	public void setEAssociatedEntityName(String eAssociatedEntityName) {
		this.eAssociatedEntityName = eAssociatedEntityName;
	}

	public String getEAssociatedEntityType() {
		return this.eAssociatedEntityType;
	}

	public void setEAssociatedEntityType(String eAssociatedEntityType) {
		this.eAssociatedEntityType = eAssociatedEntityType;
	}

	public String getEAssociatedLei() {
		return this.eAssociatedLei;
	}

	public void setEAssociatedLei(String eAssociatedLei) {
		this.eAssociatedLei = eAssociatedLei;
	}

	public String getECategoryType() {
		return this.eCategoryType;
	}

	public void setECategoryType(String eCategoryType) {
		this.eCategoryType = eCategoryType;
	}

	public Date getEEntityExpirationDate() {
		return this.eEntityExpirationDate;
	}

	public void setEEntityExpirationDate(Date eEntityExpirationDate) {
		this.eEntityExpirationDate = eEntityExpirationDate;
	}

	public String getEEntityExpirationReason() {
		return this.eEntityExpirationReason;
	}

	public void setEEntityExpirationReason(String eEntityExpirationReason) {
		this.eEntityExpirationReason = eEntityExpirationReason;
	}

	public String getEEntityLegalFormCode() {
		return this.eEntityLegalFormCode;
	}

	public void setEEntityLegalFormCode(String eEntityLegalFormCode) {
		this.eEntityLegalFormCode = eEntityLegalFormCode;
	}

	public String getEEntityStatus() {
		return this.eEntityStatus;
	}

	public void setEEntityStatus(String eEntityStatus) {
		this.eEntityStatus = eEntityStatus;
	}

	public String getEHqAdditionalAddressLine1() {
		return this.eHqAdditionalAddressLine1;
	}

	public void setEHqAdditionalAddressLine1(String eHqAdditionalAddressLine1) {
		this.eHqAdditionalAddressLine1 = eHqAdditionalAddressLine1;
	}

	public String getEHqAdditionalAddressLine2() {
		return this.eHqAdditionalAddressLine2;
	}

	public void setEHqAdditionalAddressLine2(String eHqAdditionalAddressLine2) {
		this.eHqAdditionalAddressLine2 = eHqAdditionalAddressLine2;
	}

	public String getEHqAdditionalAddressLine3() {
		return this.eHqAdditionalAddressLine3;
	}

	public void setEHqAdditionalAddressLine3(String eHqAdditionalAddressLine3) {
		this.eHqAdditionalAddressLine3 = eHqAdditionalAddressLine3;
	}

	public String getEHqAddressNumber() {
		return this.eHqAddressNumber;
	}

	public void setEHqAddressNumber(String eHqAddressNumber) {
		this.eHqAddressNumber = eHqAddressNumber;
	}

	public String getEHqAddressnumberWithinBuilding() {
		return this.eHqAddressnumberWithinBuilding;
	}

	public void setEHqAddressnumberWithinBuilding(String eHqAddressnumberWithinBuilding) {
		this.eHqAddressnumberWithinBuilding = eHqAddressnumberWithinBuilding;
	}

	public String getEHqCity() {
		return this.eHqCity;
	}

	public void setEHqCity(String eHqCity) {
		this.eHqCity = eHqCity;
	}

	public String getEHqCountry() {
		return this.eHqCountry;
	}

	public void setEHqCountry(String eHqCountry) {
		this.eHqCountry = eHqCountry;
	}

	public String getEHqFirstAddressLine() {
		return this.eHqFirstAddressLine;
	}

	public void setEHqFirstAddressLine(String eHqFirstAddressLine) {
		this.eHqFirstAddressLine = eHqFirstAddressLine;
	}

	public String getEHqLang() {
		return this.eHqLang;
	}

	public void setEHqLang(String eHqLang) {
		this.eHqLang = eHqLang;
	}

	public String getEHqMailRouting() {
		return this.eHqMailRouting;
	}

	public void setEHqMailRouting(String eHqMailRouting) {
		this.eHqMailRouting = eHqMailRouting;
	}

	public String getEHqPostalCode() {
		return this.eHqPostalCode;
	}

	public void setEHqPostalCode(String eHqPostalCode) {
		this.eHqPostalCode = eHqPostalCode;
	}

	public String getEHqRegion() {
		return this.eHqRegion;
	}

	public void setEHqRegion(String eHqRegion) {
		this.eHqRegion = eHqRegion;
	}

	public String getELegalAddressAdditionalAddressLine1() {
		return this.eLegalAddressAdditionalAddressLine1;
	}

	public void setELegalAddressAdditionalAddressLine1(String eLegalAddressAdditionalAddressLine1) {
		this.eLegalAddressAdditionalAddressLine1 = eLegalAddressAdditionalAddressLine1;
	}

	public String getELegalAddressAdditionalAddressLine2() {
		return this.eLegalAddressAdditionalAddressLine2;
	}

	public void setELegalAddressAdditionalAddressLine2(String eLegalAddressAdditionalAddressLine2) {
		this.eLegalAddressAdditionalAddressLine2 = eLegalAddressAdditionalAddressLine2;
	}

	public String getELegalAddressAdditionalAddressLine3() {
		return this.eLegalAddressAdditionalAddressLine3;
	}

	public void setELegalAddressAdditionalAddressLine3(String eLegalAddressAdditionalAddressLine3) {
		this.eLegalAddressAdditionalAddressLine3 = eLegalAddressAdditionalAddressLine3;
	}

	public String getELegalAddressAddressNumber() {
		return this.eLegalAddressAddressNumber;
	}

	public void setELegalAddressAddressNumber(String eLegalAddressAddressNumber) {
		this.eLegalAddressAddressNumber = eLegalAddressAddressNumber;
	}

	public String getELegalAddressAddressNumberWithinBuilding() {
		return this.eLegalAddressAddressNumberWithinBuilding;
	}

	public void setELegalAddressAddressNumberWithinBuilding(String eLegalAddressAddressNumberWithinBuilding) {
		this.eLegalAddressAddressNumberWithinBuilding = eLegalAddressAddressNumberWithinBuilding;
	}

	public String getELegalAddressCity() {
		return this.eLegalAddressCity;
	}

	public void setELegalAddressCity(String eLegalAddressCity) {
		this.eLegalAddressCity = eLegalAddressCity;
	}

	public String getELegalAddressCountry() {
		return this.eLegalAddressCountry;
	}

	public void setELegalAddressCountry(String eLegalAddressCountry) {
		this.eLegalAddressCountry = eLegalAddressCountry;
	}

	public String getELegalAddressFirstAddressLine() {
		return this.eLegalAddressFirstAddressLine;
	}

	public void setELegalAddressFirstAddressLine(String eLegalAddressFirstAddressLine) {
		this.eLegalAddressFirstAddressLine = eLegalAddressFirstAddressLine;
	}

	public String getELegalAddressLang() {
		return this.eLegalAddressLang;
	}

	public void setELegalAddressLang(String eLegalAddressLang) {
		this.eLegalAddressLang = eLegalAddressLang;
	}

	public String getELegalAddressMailRouting() {
		return this.eLegalAddressMailRouting;
	}

	public void setELegalAddressMailRouting(String eLegalAddressMailRouting) {
		this.eLegalAddressMailRouting = eLegalAddressMailRouting;
	}

	public String getELegalAddressPostalcode() {
		return this.eLegalAddressPostalcode;
	}

	public void setELegalAddressPostalcode(String eLegalAddressPostalcode) {
		this.eLegalAddressPostalcode = eLegalAddressPostalcode;
	}

	public String getELegalAddressRegion() {
		return this.eLegalAddressRegion;
	}

	public void setELegalAddressRegion(String eLegalAddressRegion) {
		this.eLegalAddressRegion = eLegalAddressRegion;
	}

	public String getELegalJurisdiction() {
		return this.eLegalJurisdiction;
	}

	public void setELegalJurisdiction(String eLegalJurisdiction) {
		this.eLegalJurisdiction = eLegalJurisdiction;
	}

	public String getELegalNameTypeLang() {
		return this.eLegalNameTypeLang;
	}

	public void setELegalNameTypeLang(String eLegalNameTypeLang) {
		this.eLegalNameTypeLang = eLegalNameTypeLang;
	}

	public String getELegalNameTypeValue() {
		return this.eLegalNameTypeValue;
	}

	public void setELegalNameTypeValue(String eLegalNameTypeValue) {
		this.eLegalNameTypeValue = eLegalNameTypeValue;
	}

	public String getEOAdditionalAddressLine1() {
		return this.eOAdditionalAddressLine1;
	}

	public void setEOAdditionalAddressLine1(String eOAdditionalAddressLine1) {
		this.eOAdditionalAddressLine1 = eOAdditionalAddressLine1;
	}

	public String getEOAdditionalAddressLine2() {
		return this.eOAdditionalAddressLine2;
	}

	public void setEOAdditionalAddressLine2(String eOAdditionalAddressLine2) {
		this.eOAdditionalAddressLine2 = eOAdditionalAddressLine2;
	}

	public String getEOAdditionalAddressLine3() {
		return this.eOAdditionalAddressLine3;
	}

	public void setEOAdditionalAddressLine3(String eOAdditionalAddressLine3) {
		this.eOAdditionalAddressLine3 = eOAdditionalAddressLine3;
	}

	public String getEOAdditionalAddressNumber() {
		return this.eOAdditionalAddressNumber;
	}

	public void setEOAdditionalAddressNumber(String eOAdditionalAddressNumber) {
		this.eOAdditionalAddressNumber = eOAdditionalAddressNumber;
	}

	public String getEOAddressNumber() {
		return this.eOAddressNumber;
	}

	public void setEOAddressNumber(String eOAddressNumber) {
		this.eOAddressNumber = eOAddressNumber;
	}

	public String getEOAddressNumberWithinBuilding() {
		return this.eOAddressNumberWithinBuilding;
	}

	public void setEOAddressNumberWithinBuilding(String eOAddressNumberWithinBuilding) {
		this.eOAddressNumberWithinBuilding = eOAddressNumberWithinBuilding;
	}

	public String getEOAddressType() {
		return this.eOAddressType;
	}

	public void setEOAddressType(String eOAddressType) {
		this.eOAddressType = eOAddressType;
	}

	public String getEOCity() {
		return this.eOCity;
	}

	public void setEOCity(String eOCity) {
		this.eOCity = eOCity;
	}

	public String getEOCountry() {
		return this.eOCountry;
	}

	public void setEOCountry(String eOCountry) {
		this.eOCountry = eOCountry;
	}

	public String getEOFirstAddressLine() {
		return this.eOFirstAddressLine;
	}

	public void setEOFirstAddressLine(String eOFirstAddressLine) {
		this.eOFirstAddressLine = eOFirstAddressLine;
	}

	public String getEOLang() {
		return this.eOLang;
	}

	public void setEOLang(String eOLang) {
		this.eOLang = eOLang;
	}

	public String getEOMailRouting1() {
		return this.eOMailRouting1;
	}

	public void setEOMailRouting1(String eOMailRouting1) {
		this.eOMailRouting1 = eOMailRouting1;
	}

	public String getEOPostalcode() {
		return this.eOPostalcode;
	}

	public void setEOPostalcode(String eOPostalcode) {
		this.eOPostalcode = eOPostalcode;
	}

	public String getEORegion() {
		return this.eORegion;
	}

	public void setEORegion(String eORegion) {
		this.eORegion = eORegion;
	}

	public String getEOtherEntityNamesType() {
		return this.eOtherEntityNamesType;
	}

	public void setEOtherEntityNamesType(String eOtherEntityNamesType) {
		this.eOtherEntityNamesType = eOtherEntityNamesType;
	}

	public String getEOtherLegalForm() {
		return this.eOtherLegalForm;
	}

	public void setEOtherLegalForm(String eOtherLegalForm) {
		this.eOtherLegalForm = eOtherLegalForm;
	}

	public String getEOtherRegistrationAuthorityId() {
		return this.eOtherRegistrationAuthorityId;
	}

	public void setEOtherRegistrationAuthorityId(String eOtherRegistrationAuthorityId) {
		this.eOtherRegistrationAuthorityId = eOtherRegistrationAuthorityId;
	}

	public String getERegistrationAuthorityEntityId() {
		return this.eRegistrationAuthorityEntityId;
	}

	public void setERegistrationAuthorityEntityId(String eRegistrationAuthorityEntityId) {
		this.eRegistrationAuthorityEntityId = eRegistrationAuthorityEntityId;
	}

	public String getERegistrationAuthorityId() {
		return this.eRegistrationAuthorityId;
	}

	public void setERegistrationAuthorityId(String eRegistrationAuthorityId) {
		this.eRegistrationAuthorityId = eRegistrationAuthorityId;
	}

	public String getESuccessorEntityName() {
		return this.eSuccessorEntityName;
	}

	public void setESuccessorEntityName(String eSuccessorEntityName) {
		this.eSuccessorEntityName = eSuccessorEntityName;
	}

	public String getESuccessorLei() {
		return this.eSuccessorLei;
	}

	public void setESuccessorLei(String eSuccessorLei) {
		this.eSuccessorLei = eSuccessorLei;
	}

	public String getEToAdditionalAddressLine1() {
		return this.eToAdditionalAddressLine1;
	}

	public void setEToAdditionalAddressLine1(String eToAdditionalAddressLine1) {
		this.eToAdditionalAddressLine1 = eToAdditionalAddressLine1;
	}

	public String getEToAdditionalAddressLine2() {
		return this.eToAdditionalAddressLine2;
	}

	public void setEToAdditionalAddressLine2(String eToAdditionalAddressLine2) {
		this.eToAdditionalAddressLine2 = eToAdditionalAddressLine2;
	}

	public String getEToAdditionalAddressLine3() {
		return this.eToAdditionalAddressLine3;
	}

	public void setEToAdditionalAddressLine3(String eToAdditionalAddressLine3) {
		this.eToAdditionalAddressLine3 = eToAdditionalAddressLine3;
	}

	public String getEToAddressNumber() {
		return this.eToAddressNumber;
	}

	public void setEToAddressNumber(String eToAddressNumber) {
		this.eToAddressNumber = eToAddressNumber;
	}

	public String getEToAddressNumberWithinBuilding() {
		return this.eToAddressNumberWithinBuilding;
	}

	public void setEToAddressNumberWithinBuilding(String eToAddressNumberWithinBuilding) {
		this.eToAddressNumberWithinBuilding = eToAddressNumberWithinBuilding;
	}

	public String getEToAddressType() {
		return this.eToAddressType;
	}

	public void setEToAddressType(String eToAddressType) {
		this.eToAddressType = eToAddressType;
	}

	public String getEToCity() {
		return this.eToCity;
	}

	public void setEToCity(String eToCity) {
		this.eToCity = eToCity;
	}

	public String getEToCountry() {
		return this.eToCountry;
	}

	public void setEToCountry(String eToCountry) {
		this.eToCountry = eToCountry;
	}

	public String getEToFirstAddressLine() {
		return this.eToFirstAddressLine;
	}

	public void setEToFirstAddressLine(String eToFirstAddressLine) {
		this.eToFirstAddressLine = eToFirstAddressLine;
	}

	public String getEToLang() {
		return this.eToLang;
	}

	public void setEToLang(String eToLang) {
		this.eToLang = eToLang;
	}

	public String getEToMailRouting() {
		return this.eToMailRouting;
	}

	public void setEToMailRouting(String eToMailRouting) {
		this.eToMailRouting = eToMailRouting;
	}

	public String getEToPostalcode() {
		return this.eToPostalcode;
	}

	public void setEToPostalcode(String eToPostalcode) {
		this.eToPostalcode = eToPostalcode;
	}

	public String getEToRegion() {
		return this.eToRegion;
	}

	public void setEToRegion(String eToRegion) {
		this.eToRegion = eToRegion;
	}

	public String getETransliteratedOtherEntityNamesType() {
		return this.eTransliteratedOtherEntityNamesType;
	}

	public void setETransliteratedOtherEntityNamesType(String eTransliteratedOtherEntityNamesType) {
		this.eTransliteratedOtherEntityNamesType = eTransliteratedOtherEntityNamesType;
	}

	public Date getRInitialRegistrationDate() {
		return this.rInitialRegistrationDate;
	}

	public void setRInitialRegistrationDate(Date rInitialRegistrationDate) {
		this.rInitialRegistrationDate = rInitialRegistrationDate;
	}

	public Date getRLastUpdateDate() {
		return this.rLastUpdateDate;
	}

	public void setRLastUpdateDate(Date rLastUpdateDate) {
		this.rLastUpdateDate = rLastUpdateDate;
	}

	public String getRManagingLou() {
		return this.rManagingLou;
	}

	public void setRManagingLou(String rManagingLou) {
		this.rManagingLou = rManagingLou;
	}

	public Date getRNextRenewalDate() {
		return this.rNextRenewalDate;
	}

	public void setRNextRenewalDate(Date rNextRenewalDate) {
		this.rNextRenewalDate = rNextRenewalDate;
	}

	public String getROtherValidationAuthorityId() {
		return this.rOtherValidationAuthorityId;
	}

	public void setROtherValidationAuthorityId(String rOtherValidationAuthorityId) {
		this.rOtherValidationAuthorityId = rOtherValidationAuthorityId;
	}

	public String getRRegistrationStatus() {
		return this.rRegistrationStatus;
	}

	public void setRRegistrationStatus(String rRegistrationStatus) {
		this.rRegistrationStatus = rRegistrationStatus;
	}

	public String getRValidationAuthorityEntityId() {
		return this.rValidationAuthorityEntityId;
	}

	public void setRValidationAuthorityEntityId(String rValidationAuthorityEntityId) {
		this.rValidationAuthorityEntityId = rValidationAuthorityEntityId;
	}

	public String getRValidationAuthorityId() {
		return this.rValidationAuthorityId;
	}

	public void setRValidationAuthorityId(String rValidationAuthorityId) {
		this.rValidationAuthorityId = rValidationAuthorityId;
	}

	public String getRValidationSources() {
		return this.rValidationSources;
	}

	public void setRValidationSources(String rValidationSources) {
		this.rValidationSources = rValidationSources;
	}

}