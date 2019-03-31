package com.inmemory.gleifparser.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the LEVEL1_LEI_RECORD database table.
 * 
 */
@Entity
@Table(name="LEVEL1_LEI_RECORD")
@NamedQuery(name="Level1LeiRecord.findAll", query="SELECT l FROM Level1LeiRecord l")
public class Level1LeiRecord implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String lei;

	@Column(name="ASSOCIATED_ENTITY_TYPE_ASSOCIATED_ENTITY_NAME")
	private String associatedEntityTypeAssociatedEntityName;

	@Column(name="ASSOCIATED_ENTITY_TYPE_ASSOCIATED_ENTITY_TYPE_ENUM")
	private String associatedEntityTypeAssociatedEntityTypeEnum;

	@Column(name="ASSOCIATED_ENTITY_TYPE_ASSOCIATED_LEI")
	private String associatedEntityTypeAssociatedLei;

	@Column(name="ASSOCIATED_LEI_ID")
	private String associatedLeiId;

	@Column(name="ENTITY_CATEGORY_VALUE")
	private String entityCategoryValue;

	@Temporal(TemporalType.DATE)
	@Column(name="ENTITY_EXPIRATION_DATE")
	private Date entityExpirationDate;

	@Column(name="ENTITY_EXPIRATION_REASON")
	private String entityExpirationReason;

	@Column(name="ENTITY_LEGAL_FORM_CODE")
	private String entityLegalFormCode;

	@Column(name="ENTITY_NEXT_VERSION_TYPE_ANY")
	private String entityNextVersionTypeAny;

	@Column(name="ENTITY_STATUS")
	private String entityStatus;

	@Column(name="ENTITY_TYPE_LEGAL_ADDRESS_ADDITIONAL_ADDRESS_LINE")
	private String entityTypeLegalAddressAdditionalAddressLine;

	@Column(name="ENTITY_TYPE_LEGAL_ADDRESS_ADDRESS_NUMBER")
	private String entityTypeLegalAddressAddressNumber;

	@Column(name="ENTITY_TYPE_LEGAL_ADDRESS_ADDRESS_NUMBER_WITHIN_BUILDING")
	private String entityTypeLegalAddressAddressNumberWithinBuilding;

	@Column(name="ENTITY_TYPE_LEGAL_ADDRESS_CITY")
	private String entityTypeLegalAddressCity;

	@Column(name="ENTITY_TYPE_LEGAL_ADDRESS_COUNTRY")
	private String entityTypeLegalAddressCountry;

	@Column(name="ENTITY_TYPE_LEGAL_ADDRESS_FIRST_ADDRESS_LINE")
	private String entityTypeLegalAddressFirstAddressLine;

	@Column(name="ENTITY_TYPE_LEGAL_ADDRESS_LANG")
	private String entityTypeLegalAddressLang;

	@Column(name="ENTITY_TYPE_LEGAL_ADDRESS_MAIL_ROUTING")
	private String entityTypeLegalAddressMailRouting;

	@Column(name="ENTITY_TYPE_LEGAL_ADDRESS_POSTALCODE")
	private String entityTypeLegalAddressPostalcode;

	@Column(name="ENTITY_TYPE_LEGAL_ADDRESS_REGION")
	private String entityTypeLegalAddressRegion;

	@Column(name="ENTITY_TYPE_LEGAL_NAME_NAME_TYPE")
	private String entityTypeLegalNameNameType;

	@Column(name="ENTITY_TYPE_LEGAL_NAME_NAME_TYPE_LANG")
	private String entityTypeLegalNameNameTypeLang;

	@Column(name="ENTITY_TYPE_OTHER_ENTITY_NAMES_TYPE")
	private String entityTypeOtherEntityNamesType;

	@Column(name="ENTITY_TYPE_TRANSLITERATED_OTHER_ENTITY_NAMES_TYPE")
	private String entityTypeTransliteratedOtherEntityNamesType;

	@Column(name="EXTENSION_TYPE")
	private String extensionType;

	@Column(name="HQ_ADDITIONAL_ADDRESS_LINE")
	private String hqAdditionalAddressLine;

	@Column(name="HQ_ADDRESS_NUMBER")
	private String hqAddressNumber;

	@Column(name="HQ_ADDRESSNUMBER_WITHIN_BUILDING")
	private String hqAddressnumberWithinBuilding;

	@Column(name="HQ_CITY")
	private String hqCity;

	@Column(name="HQ_COUNTRY")
	private String hqCountry;

	@Column(name="HQ_FIRST_ADDRESS_LINE")
	private String hqFirstAddressLine;

	@Column(name="HQ_LANG")
	private String hqLang;

	@Column(name="HQ_MAIL_ROUTING")
	private String hqMailRouting;

	@Column(name="HQ_POSTAL_CODE")
	private String hqPostalCode;

	@Column(name="HQ_REGION")
	private String hqRegion;

	@Temporal(TemporalType.DATE)
	@Column(name="INITIAL_REGISTRATION_DATE")
	private Date initialRegistrationDate;

	@Column(name="L_ADDRESS_NUMBER_2")
	private String lAddressNumber2;

	@Column(name="L_CITY_1")
	private String lCity1;

	@Column(name="L_COUNTRY_1")
	private String lCountry1;

	@Column(name="L_FIRST_ADDRESS_LINE_1")
	private String lFirstAddressLine1;

	@Column(name="L_LANG_1")
	private String lLang1;

	@Column(name="L_POSTALCODE_1")
	private String lPostalcode1;

	@Column(name="L_REGION_1")
	private String lRegion1;

	@Temporal(TemporalType.DATE)
	@Column(name="LAST_UPDATE_DATE")
	private Date lastUpdateDate;

	@Column(name="LEGAL_FORM_TYPE_ENTITY_LEGAL_FORM_CODE")
	private String legalFormTypeEntityLegalFormCode;

	@Column(name="LEGAL_FORM_TYPE_OTHER_LEGAL_FORM")
	private String legalFormTypeOtherLegalForm;

	@Column(name="LEGAL_JURISDICTION")
	private String legalJurisdiction;

	@Column(name="LEI_RECORD_NEXT_VERSION_TYPE")
	private String leiRecordNextVersionType;

	@Column(name="LEI_TYPE")
	private String leiType;

	@Column(name="MANAGING_LOU")
	private String managingLou;

	@Temporal(TemporalType.DATE)
	@Column(name="NEXT_RENEWAL_DATE")
	private Date nextRenewalDate;

	@Column(name="O_ADDITIONAL_ADDRESS_NUMBER_2")
	private String oAdditionalAddressNumber2;

	@Column(name="O_ADDITIONAL_ADDRESS_NUMBER_LINE_1")
	private String oAdditionalAddressNumberLine1;

	@Column(name="O_ADDITIONAL_ADDRESS_NUMBER_WITHIN_BUILDING_1")
	private String oAdditionalAddressNumberWithinBuilding1;

	@Column(name="O_ADDRESS_NUMBER_2")
	private String oAddressNumber2;

	@Column(name="O_ADDRESS_NUMBER_WITHIN_BUILDING_1")
	private String oAddressNumberWithinBuilding1;

	@Column(name="O_CITY_1")
	private String oCity1;

	@Column(name="O_COUNTRY_1")
	private String oCountry1;

	@Column(name="O_FIRST_ADDRESS_LINE_1")
	private String oFirstAddressLine1;

	@Column(name="O_LANG_1")
	private String oLang1;

	@Column(name="O_MAIL_ROUTING_1")
	private String oMailRouting1;

	@Column(name="O_POSTALCODE_1")
	private String oPostalcode1;

	@Column(name="O_REGION_1")
	private String oRegion1;

	@Column(name="O_TYPE")
	private String oType;

	@Column(name="OTHER_LEGAL_FORM")
	private String otherLegalForm;

	@Column(name="OTHER_REGISTRATION_AUTHORITY_ID")
	private String otherRegistrationAuthorityId;

	@Column(name="OTHER_VALIDATION_AUTHORITIES_TYPE")
	private String otherValidationAuthoritiesType;

	@Column(name="REGISTRATION_AUTHORITY_ENTITY_ID")
	private String registrationAuthorityEntityId;

	@Column(name="REGISTRATION_AUTHORITY_ID")
	private String registrationAuthorityId;

	@Column(name="REGISTRATION_NEXT_VERSION_TYPE")
	private String registrationNextVersionType;

	@Column(name="REGISTRATION_STATUS")
	private String registrationStatus;

	@Column(name="SUCCESSOR_ENTITY_TYPE_SUCCESSOR_ENTITY_NAME_LANG")
	private String successorEntityTypeSuccessorEntityNameLang;

	@Column(name="SUCCESSOR_ENTITY_TYPE_SUCCESSOR_ENTITY_NAME_VALUE")
	private String successorEntityTypeSuccessorEntityNameValue;

	@Column(name="SUCCESSOR_ENTITY_TYPE_SUCCESSOR_LEI")
	private String successorEntityTypeSuccessorLei;

	@Column(name="SUCCESSOR_LEI")
	private String successorLei;

	@Column(name="TO_ADDRESS_NUMBER_2")
	private String toAddressNumber2;

	@Column(name="TO_ADDRESS_NUMBER_WITHIN_BUILDING_1")
	private String toAddressNumberWithinBuilding1;

	@Column(name="TO_FIRST_ADDRESS_LINE_1")
	private String toFirstAddressLine1;

	@Column(name="VALIDATION_AUTHORITY_TYPE_OTHER_VALIDATION_AUTHORITY_ID")
	private String validationAuthorityTypeOtherValidationAuthorityId;

	@Column(name="VALIDATION_AUTHORITY_TYPE_VALIDATION_AUTHORITY_ENTITY_ID")
	private String validationAuthorityTypeValidationAuthorityEntityId;

	@Column(name="VALIDATION_AUTHORITY_TYPE_VALIDATION_AUTHORITY_ID")
	private String validationAuthorityTypeValidationAuthorityId;

	@Column(name="VALIDATION_SOURCES")
	private String validationSources;

	//bi-directional many-to-one association to Level2RelationshipRecord
	@OneToMany(mappedBy="level1LeiRecord")
	private List<Level2RelationshipRecord> level2RelationshipRecords;

	/*
	 * //bi-directional many-to-one association to Level2ReportingException
	 * 
	 * @OneToMany(mappedBy="level1LeiRecord") private List<Level2ReportingException>
	 * level2ReportingExceptions;
	 */
	public Level1LeiRecord() {
	}

	public String getLei() {
		return this.lei;
	}

	public void setLei(String lei) {
		this.lei = lei;
	}

	public String getAssociatedEntityTypeAssociatedEntityName() {
		return this.associatedEntityTypeAssociatedEntityName;
	}

	public void setAssociatedEntityTypeAssociatedEntityName(String associatedEntityTypeAssociatedEntityName) {
		this.associatedEntityTypeAssociatedEntityName = associatedEntityTypeAssociatedEntityName;
	}

	public String getAssociatedEntityTypeAssociatedEntityTypeEnum() {
		return this.associatedEntityTypeAssociatedEntityTypeEnum;
	}

	public void setAssociatedEntityTypeAssociatedEntityTypeEnum(String associatedEntityTypeAssociatedEntityTypeEnum) {
		this.associatedEntityTypeAssociatedEntityTypeEnum = associatedEntityTypeAssociatedEntityTypeEnum;
	}

	public String getAssociatedEntityTypeAssociatedLei() {
		return this.associatedEntityTypeAssociatedLei;
	}

	public void setAssociatedEntityTypeAssociatedLei(String associatedEntityTypeAssociatedLei) {
		this.associatedEntityTypeAssociatedLei = associatedEntityTypeAssociatedLei;
	}

	public String getAssociatedLeiId() {
		return this.associatedLeiId;
	}

	public void setAssociatedLeiId(String associatedLeiId) {
		this.associatedLeiId = associatedLeiId;
	}

	public String getEntityCategoryValue() {
		return this.entityCategoryValue;
	}

	public void setEntityCategoryValue(String entityCategoryValue) {
		this.entityCategoryValue = entityCategoryValue;
	}

	public Date getEntityExpirationDate() {
		return this.entityExpirationDate;
	}

	public void setEntityExpirationDate(Date entityExpirationDate) {
		this.entityExpirationDate = entityExpirationDate;
	}

	public String getEntityExpirationReason() {
		return this.entityExpirationReason;
	}

	public void setEntityExpirationReason(String entityExpirationReason) {
		this.entityExpirationReason = entityExpirationReason;
	}

	public String getEntityLegalFormCode() {
		return this.entityLegalFormCode;
	}

	public void setEntityLegalFormCode(String entityLegalFormCode) {
		this.entityLegalFormCode = entityLegalFormCode;
	}

	public String getEntityNextVersionTypeAny() {
		return this.entityNextVersionTypeAny;
	}

	public void setEntityNextVersionTypeAny(String entityNextVersionTypeAny) {
		this.entityNextVersionTypeAny = entityNextVersionTypeAny;
	}

	public String getEntityStatus() {
		return this.entityStatus;
	}

	public void setEntityStatus(String entityStatus) {
		this.entityStatus = entityStatus;
	}

	public String getEntityTypeLegalAddressAdditionalAddressLine() {
		return this.entityTypeLegalAddressAdditionalAddressLine;
	}

	public void setEntityTypeLegalAddressAdditionalAddressLine(String entityTypeLegalAddressAdditionalAddressLine) {
		this.entityTypeLegalAddressAdditionalAddressLine = entityTypeLegalAddressAdditionalAddressLine;
	}

	public String getEntityTypeLegalAddressAddressNumber() {
		return this.entityTypeLegalAddressAddressNumber;
	}

	public void setEntityTypeLegalAddressAddressNumber(String entityTypeLegalAddressAddressNumber) {
		this.entityTypeLegalAddressAddressNumber = entityTypeLegalAddressAddressNumber;
	}

	public String getEntityTypeLegalAddressAddressNumberWithinBuilding() {
		return this.entityTypeLegalAddressAddressNumberWithinBuilding;
	}

	public void setEntityTypeLegalAddressAddressNumberWithinBuilding(String entityTypeLegalAddressAddressNumberWithinBuilding) {
		this.entityTypeLegalAddressAddressNumberWithinBuilding = entityTypeLegalAddressAddressNumberWithinBuilding;
	}

	public String getEntityTypeLegalAddressCity() {
		return this.entityTypeLegalAddressCity;
	}

	public void setEntityTypeLegalAddressCity(String entityTypeLegalAddressCity) {
		this.entityTypeLegalAddressCity = entityTypeLegalAddressCity;
	}

	public String getEntityTypeLegalAddressCountry() {
		return this.entityTypeLegalAddressCountry;
	}

	public void setEntityTypeLegalAddressCountry(String entityTypeLegalAddressCountry) {
		this.entityTypeLegalAddressCountry = entityTypeLegalAddressCountry;
	}

	public String getEntityTypeLegalAddressFirstAddressLine() {
		return this.entityTypeLegalAddressFirstAddressLine;
	}

	public void setEntityTypeLegalAddressFirstAddressLine(String entityTypeLegalAddressFirstAddressLine) {
		this.entityTypeLegalAddressFirstAddressLine = entityTypeLegalAddressFirstAddressLine;
	}

	public String getEntityTypeLegalAddressLang() {
		return this.entityTypeLegalAddressLang;
	}

	public void setEntityTypeLegalAddressLang(String entityTypeLegalAddressLang) {
		this.entityTypeLegalAddressLang = entityTypeLegalAddressLang;
	}

	public String getEntityTypeLegalAddressMailRouting() {
		return this.entityTypeLegalAddressMailRouting;
	}

	public void setEntityTypeLegalAddressMailRouting(String entityTypeLegalAddressMailRouting) {
		this.entityTypeLegalAddressMailRouting = entityTypeLegalAddressMailRouting;
	}

	public String getEntityTypeLegalAddressPostalcode() {
		return this.entityTypeLegalAddressPostalcode;
	}

	public void setEntityTypeLegalAddressPostalcode(String entityTypeLegalAddressPostalcode) {
		this.entityTypeLegalAddressPostalcode = entityTypeLegalAddressPostalcode;
	}

	public String getEntityTypeLegalAddressRegion() {
		return this.entityTypeLegalAddressRegion;
	}

	public void setEntityTypeLegalAddressRegion(String entityTypeLegalAddressRegion) {
		this.entityTypeLegalAddressRegion = entityTypeLegalAddressRegion;
	}

	public String getEntityTypeLegalNameNameType() {
		return this.entityTypeLegalNameNameType;
	}

	public void setEntityTypeLegalNameNameType(String entityTypeLegalNameNameType) {
		this.entityTypeLegalNameNameType = entityTypeLegalNameNameType;
	}

	public String getEntityTypeLegalNameNameTypeLang() {
		return this.entityTypeLegalNameNameTypeLang;
	}

	public void setEntityTypeLegalNameNameTypeLang(String entityTypeLegalNameNameTypeLang) {
		this.entityTypeLegalNameNameTypeLang = entityTypeLegalNameNameTypeLang;
	}

	public String getEntityTypeOtherEntityNamesType() {
		return this.entityTypeOtherEntityNamesType;
	}

	public void setEntityTypeOtherEntityNamesType(String entityTypeOtherEntityNamesType) {
		this.entityTypeOtherEntityNamesType = entityTypeOtherEntityNamesType;
	}

	public String getEntityTypeTransliteratedOtherEntityNamesType() {
		return this.entityTypeTransliteratedOtherEntityNamesType;
	}

	public void setEntityTypeTransliteratedOtherEntityNamesType(String entityTypeTransliteratedOtherEntityNamesType) {
		this.entityTypeTransliteratedOtherEntityNamesType = entityTypeTransliteratedOtherEntityNamesType;
	}

	public String getExtensionType() {
		return this.extensionType;
	}

	public void setExtensionType(String extensionType) {
		this.extensionType = extensionType;
	}

	public String getHqAdditionalAddressLine() {
		return this.hqAdditionalAddressLine;
	}

	public void setHqAdditionalAddressLine(String hqAdditionalAddressLine) {
		this.hqAdditionalAddressLine = hqAdditionalAddressLine;
	}

	public String getHqAddressNumber() {
		return this.hqAddressNumber;
	}

	public void setHqAddressNumber(String hqAddressNumber) {
		this.hqAddressNumber = hqAddressNumber;
	}

	public String getHqAddressnumberWithinBuilding() {
		return this.hqAddressnumberWithinBuilding;
	}

	public void setHqAddressnumberWithinBuilding(String hqAddressnumberWithinBuilding) {
		this.hqAddressnumberWithinBuilding = hqAddressnumberWithinBuilding;
	}

	public String getHqCity() {
		return this.hqCity;
	}

	public void setHqCity(String hqCity) {
		this.hqCity = hqCity;
	}

	public String getHqCountry() {
		return this.hqCountry;
	}

	public void setHqCountry(String hqCountry) {
		this.hqCountry = hqCountry;
	}

	public String getHqFirstAddressLine() {
		return this.hqFirstAddressLine;
	}

	public void setHqFirstAddressLine(String hqFirstAddressLine) {
		this.hqFirstAddressLine = hqFirstAddressLine;
	}

	public String getHqLang() {
		return this.hqLang;
	}

	public void setHqLang(String hqLang) {
		this.hqLang = hqLang;
	}

	public String getHqMailRouting() {
		return this.hqMailRouting;
	}

	public void setHqMailRouting(String hqMailRouting) {
		this.hqMailRouting = hqMailRouting;
	}

	public String getHqPostalCode() {
		return this.hqPostalCode;
	}

	public void setHqPostalCode(String hqPostalCode) {
		this.hqPostalCode = hqPostalCode;
	}

	public String getHqRegion() {
		return this.hqRegion;
	}

	public void setHqRegion(String hqRegion) {
		this.hqRegion = hqRegion;
	}

	public Date getInitialRegistrationDate() {
		return this.initialRegistrationDate;
	}

	public void setInitialRegistrationDate(Date initialRegistrationDate) {
		this.initialRegistrationDate = initialRegistrationDate;
	}

	public String getLAddressNumber2() {
		return this.lAddressNumber2;
	}

	public void setLAddressNumber2(String lAddressNumber2) {
		this.lAddressNumber2 = lAddressNumber2;
	}

	public String getLCity1() {
		return this.lCity1;
	}

	public void setLCity1(String lCity1) {
		this.lCity1 = lCity1;
	}

	public String getLCountry1() {
		return this.lCountry1;
	}

	public void setLCountry1(String lCountry1) {
		this.lCountry1 = lCountry1;
	}

	public String getLFirstAddressLine1() {
		return this.lFirstAddressLine1;
	}

	public void setLFirstAddressLine1(String lFirstAddressLine1) {
		this.lFirstAddressLine1 = lFirstAddressLine1;
	}

	public String getLLang1() {
		return this.lLang1;
	}

	public void setLLang1(String lLang1) {
		this.lLang1 = lLang1;
	}

	public String getLPostalcode1() {
		return this.lPostalcode1;
	}

	public void setLPostalcode1(String lPostalcode1) {
		this.lPostalcode1 = lPostalcode1;
	}

	public String getLRegion1() {
		return this.lRegion1;
	}

	public void setLRegion1(String lRegion1) {
		this.lRegion1 = lRegion1;
	}

	public Date getLastUpdateDate() {
		return this.lastUpdateDate;
	}

	public void setLastUpdateDate(Date lastUpdateDate) {
		this.lastUpdateDate = lastUpdateDate;
	}

	public String getLegalFormTypeEntityLegalFormCode() {
		return this.legalFormTypeEntityLegalFormCode;
	}

	public void setLegalFormTypeEntityLegalFormCode(String legalFormTypeEntityLegalFormCode) {
		this.legalFormTypeEntityLegalFormCode = legalFormTypeEntityLegalFormCode;
	}

	public String getLegalFormTypeOtherLegalForm() {
		return this.legalFormTypeOtherLegalForm;
	}

	public void setLegalFormTypeOtherLegalForm(String legalFormTypeOtherLegalForm) {
		this.legalFormTypeOtherLegalForm = legalFormTypeOtherLegalForm;
	}

	public String getLegalJurisdiction() {
		return this.legalJurisdiction;
	}

	public void setLegalJurisdiction(String legalJurisdiction) {
		this.legalJurisdiction = legalJurisdiction;
	}

	public String getLeiRecordNextVersionType() {
		return this.leiRecordNextVersionType;
	}

	public void setLeiRecordNextVersionType(String leiRecordNextVersionType) {
		this.leiRecordNextVersionType = leiRecordNextVersionType;
	}

	public String getLeiType() {
		return this.leiType;
	}

	public void setLeiType(String leiType) {
		this.leiType = leiType;
	}

	public String getManagingLou() {
		return this.managingLou;
	}

	public void setManagingLou(String managingLou) {
		this.managingLou = managingLou;
	}

	public Date getNextRenewalDate() {
		return this.nextRenewalDate;
	}

	public void setNextRenewalDate(Date nextRenewalDate) {
		this.nextRenewalDate = nextRenewalDate;
	}

	public String getOAdditionalAddressNumber2() {
		return this.oAdditionalAddressNumber2;
	}

	public void setOAdditionalAddressNumber2(String oAdditionalAddressNumber2) {
		this.oAdditionalAddressNumber2 = oAdditionalAddressNumber2;
	}

	public String getOAdditionalAddressNumberLine1() {
		return this.oAdditionalAddressNumberLine1;
	}

	public void setOAdditionalAddressNumberLine1(String oAdditionalAddressNumberLine1) {
		this.oAdditionalAddressNumberLine1 = oAdditionalAddressNumberLine1;
	}

	public String getOAdditionalAddressNumberWithinBuilding1() {
		return this.oAdditionalAddressNumberWithinBuilding1;
	}

	public void setOAdditionalAddressNumberWithinBuilding1(String oAdditionalAddressNumberWithinBuilding1) {
		this.oAdditionalAddressNumberWithinBuilding1 = oAdditionalAddressNumberWithinBuilding1;
	}

	public String getOAddressNumber2() {
		return this.oAddressNumber2;
	}

	public void setOAddressNumber2(String oAddressNumber2) {
		this.oAddressNumber2 = oAddressNumber2;
	}

	public String getOAddressNumberWithinBuilding1() {
		return this.oAddressNumberWithinBuilding1;
	}

	public void setOAddressNumberWithinBuilding1(String oAddressNumberWithinBuilding1) {
		this.oAddressNumberWithinBuilding1 = oAddressNumberWithinBuilding1;
	}

	public String getOCity1() {
		return this.oCity1;
	}

	public void setOCity1(String oCity1) {
		this.oCity1 = oCity1;
	}

	public String getOCountry1() {
		return this.oCountry1;
	}

	public void setOCountry1(String oCountry1) {
		this.oCountry1 = oCountry1;
	}

	public String getOFirstAddressLine1() {
		return this.oFirstAddressLine1;
	}

	public void setOFirstAddressLine1(String oFirstAddressLine1) {
		this.oFirstAddressLine1 = oFirstAddressLine1;
	}

	public String getOLang1() {
		return this.oLang1;
	}

	public void setOLang1(String oLang1) {
		this.oLang1 = oLang1;
	}

	public String getOMailRouting1() {
		return this.oMailRouting1;
	}

	public void setOMailRouting1(String oMailRouting1) {
		this.oMailRouting1 = oMailRouting1;
	}

	public String getOPostalcode1() {
		return this.oPostalcode1;
	}

	public void setOPostalcode1(String oPostalcode1) {
		this.oPostalcode1 = oPostalcode1;
	}

	public String getORegion1() {
		return this.oRegion1;
	}

	public void setORegion1(String oRegion1) {
		this.oRegion1 = oRegion1;
	}

	public String getOType() {
		return this.oType;
	}

	public void setOType(String oType) {
		this.oType = oType;
	}

	public String getOtherLegalForm() {
		return this.otherLegalForm;
	}

	public void setOtherLegalForm(String otherLegalForm) {
		this.otherLegalForm = otherLegalForm;
	}

	public String getOtherRegistrationAuthorityId() {
		return this.otherRegistrationAuthorityId;
	}

	public void setOtherRegistrationAuthorityId(String otherRegistrationAuthorityId) {
		this.otherRegistrationAuthorityId = otherRegistrationAuthorityId;
	}

	public String getOtherValidationAuthoritiesType() {
		return this.otherValidationAuthoritiesType;
	}

	public void setOtherValidationAuthoritiesType(String otherValidationAuthoritiesType) {
		this.otherValidationAuthoritiesType = otherValidationAuthoritiesType;
	}

	public String getRegistrationAuthorityEntityId() {
		return this.registrationAuthorityEntityId;
	}

	public void setRegistrationAuthorityEntityId(String registrationAuthorityEntityId) {
		this.registrationAuthorityEntityId = registrationAuthorityEntityId;
	}

	public String getRegistrationAuthorityId() {
		return this.registrationAuthorityId;
	}

	public void setRegistrationAuthorityId(String registrationAuthorityId) {
		this.registrationAuthorityId = registrationAuthorityId;
	}

	public String getRegistrationNextVersionType() {
		return this.registrationNextVersionType;
	}

	public void setRegistrationNextVersionType(String registrationNextVersionType) {
		this.registrationNextVersionType = registrationNextVersionType;
	}

	public String getRegistrationStatus() {
		return this.registrationStatus;
	}

	public void setRegistrationStatus(String registrationStatus) {
		this.registrationStatus = registrationStatus;
	}

	public String getSuccessorEntityTypeSuccessorEntityNameLang() {
		return this.successorEntityTypeSuccessorEntityNameLang;
	}

	public void setSuccessorEntityTypeSuccessorEntityNameLang(String successorEntityTypeSuccessorEntityNameLang) {
		this.successorEntityTypeSuccessorEntityNameLang = successorEntityTypeSuccessorEntityNameLang;
	}

	public String getSuccessorEntityTypeSuccessorEntityNameValue() {
		return this.successorEntityTypeSuccessorEntityNameValue;
	}

	public void setSuccessorEntityTypeSuccessorEntityNameValue(String successorEntityTypeSuccessorEntityNameValue) {
		this.successorEntityTypeSuccessorEntityNameValue = successorEntityTypeSuccessorEntityNameValue;
	}

	public String getSuccessorEntityTypeSuccessorLei() {
		return this.successorEntityTypeSuccessorLei;
	}

	public void setSuccessorEntityTypeSuccessorLei(String successorEntityTypeSuccessorLei) {
		this.successorEntityTypeSuccessorLei = successorEntityTypeSuccessorLei;
	}

	public String getSuccessorLei() {
		return this.successorLei;
	}

	public void setSuccessorLei(String successorLei) {
		this.successorLei = successorLei;
	}

	public String getToAddressNumber2() {
		return this.toAddressNumber2;
	}

	public void setToAddressNumber2(String toAddressNumber2) {
		this.toAddressNumber2 = toAddressNumber2;
	}

	public String getToAddressNumberWithinBuilding1() {
		return this.toAddressNumberWithinBuilding1;
	}

	public void setToAddressNumberWithinBuilding1(String toAddressNumberWithinBuilding1) {
		this.toAddressNumberWithinBuilding1 = toAddressNumberWithinBuilding1;
	}

	public String getToFirstAddressLine1() {
		return this.toFirstAddressLine1;
	}

	public void setToFirstAddressLine1(String toFirstAddressLine1) {
		this.toFirstAddressLine1 = toFirstAddressLine1;
	}

	public String getValidationAuthorityTypeOtherValidationAuthorityId() {
		return this.validationAuthorityTypeOtherValidationAuthorityId;
	}

	public void setValidationAuthorityTypeOtherValidationAuthorityId(String validationAuthorityTypeOtherValidationAuthorityId) {
		this.validationAuthorityTypeOtherValidationAuthorityId = validationAuthorityTypeOtherValidationAuthorityId;
	}

	public String getValidationAuthorityTypeValidationAuthorityEntityId() {
		return this.validationAuthorityTypeValidationAuthorityEntityId;
	}

	public void setValidationAuthorityTypeValidationAuthorityEntityId(String validationAuthorityTypeValidationAuthorityEntityId) {
		this.validationAuthorityTypeValidationAuthorityEntityId = validationAuthorityTypeValidationAuthorityEntityId;
	}

	public String getValidationAuthorityTypeValidationAuthorityId() {
		return this.validationAuthorityTypeValidationAuthorityId;
	}

	public void setValidationAuthorityTypeValidationAuthorityId(String validationAuthorityTypeValidationAuthorityId) {
		this.validationAuthorityTypeValidationAuthorityId = validationAuthorityTypeValidationAuthorityId;
	}

	public String getValidationSources() {
		return this.validationSources;
	}

	public void setValidationSources(String validationSources) {
		this.validationSources = validationSources;
	}

	public List<Level2RelationshipRecord> getLevel2RelationshipRecords() {
		return this.level2RelationshipRecords;
	}

	public void setLevel2RelationshipRecords(List<Level2RelationshipRecord> level2RelationshipRecords) {
		this.level2RelationshipRecords = level2RelationshipRecords;
	}

	public Level2RelationshipRecord addLevel2RelationshipRecord(Level2RelationshipRecord level2RelationshipRecord) {
		getLevel2RelationshipRecords().add(level2RelationshipRecord);
		level2RelationshipRecord.setLevel1LeiRecord(this);

		return level2RelationshipRecord;
	}

	public Level2RelationshipRecord removeLevel2RelationshipRecord(Level2RelationshipRecord level2RelationshipRecord) {
		getLevel2RelationshipRecords().remove(level2RelationshipRecord);
		level2RelationshipRecord.setLevel1LeiRecord(null);

		return level2RelationshipRecord;
	}

	/*
	 * public List<Level2ReportingException> getLevel2ReportingExceptions() { return
	 * this.level2ReportingExceptions; }
	 * 
	 * public void setLevel2ReportingExceptions(List<Level2ReportingException>
	 * level2ReportingExceptions) { this.level2ReportingExceptions =
	 * level2ReportingExceptions; }
	 */

	/*
	 * public Level2ReportingException
	 * addLevel2ReportingException(Level2ReportingException
	 * level2ReportingException) {
	 * getLevel2ReportingExceptions().add(level2ReportingException);
	 * level2ReportingException.setLevel1LeiRecord(this);
	 * 
	 * return level2ReportingException; }
	 * 
	 * public Level2ReportingException
	 * removeLevel2ReportingException(Level2ReportingException
	 * level2ReportingException) {
	 * getLevel2ReportingExceptions().remove(level2ReportingException);
	 * level2ReportingException.setLevel1LeiRecord(null);
	 * 
	 * return level2ReportingException; }
	 */

}