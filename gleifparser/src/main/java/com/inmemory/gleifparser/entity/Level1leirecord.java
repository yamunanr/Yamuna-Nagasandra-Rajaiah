package com.inmemory.gleifparser.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the LEVEL1LEIRECORD database table.
 * 
 */
@Entity
@NamedQuery(name="Level1leirecord.findAll", query="SELECT l FROM Level1leirecord l")
public class Level1leirecord implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	private String lei;

	@Column(name="ASSOCIATED_LEI_ID")
	private String associatedLeiId;

	@Column(name="ENTITY_CATEGORY")
	private String entityCategory;

	@Temporal(TemporalType.DATE)
	@Column(name="ENTITY_EXPIRATION_DATE")
	private Date entityExpirationDate;

	@Column(name="ENTITY_EXPIRATION_REASON")
	private String entityExpirationReason;

	@Column(name="ENTITY_LEGAL_FORMCODE")
	private String entityLegalFormcode;

	@Column(name="ENTITY_STATUS")
	private String entityStatus;

	@Column(name="HQ_ADDITIONAL_ADDRESSLINE")
	private String hqAdditionalAddressline;

	@Column(name="HQ_ADDRESS_NUMBER")
	private String hqAddressNumber;

	@Column(name="HQ_ADDRESSNUMBER_WITHIN_BUILDING")
	private String hqAddressnumberWithinBuilding;

	@Column(name="HQ_CITY")
	private String hqCity;

	@Column(name="HQ_COUNTRY")
	private String hqCountry;

	@Column(name="HQ_FIRSTADDRESS_LINE")
	private String hqFirstaddressLine;

	@Column(name="HQ_LANG")
	private String hqLang;

	@Column(name="HQ_MAILROUTING")
	private String hqMailrouting;

	@Column(name="HQ_POSTAL_CODE")
	private String hqPostalCode;

	@Column(name="HQ_REGION")
	private String hqRegion;

	@Temporal(TemporalType.DATE)
	@Column(name="INITIAL_REGISTRATION_DATE")
	private Date initialRegistrationDate;

	@Column(name="L_ADDRESSNUMBER_2")
	private String lAddressnumber2;

	@Column(name="L_CITY_1")
	private String lCity1;

	@Column(name="L_COUNTRY_1")
	private String lCountry1;

	@Column(name="L_FIRSTADDRESSLINE_1")
	private String lFirstaddressline1;

	@Column(name="L_LANG_1")
	private String lLang1;

	@Column(name="L_POSTALCODE_1")
	private String lPostalcode1;

	@Column(name="L_REGION_1")
	private String lRegion1;

	@Temporal(TemporalType.DATE)
	@Column(name="LAST_UPDATE_DATE")
	private Date lastUpdateDate;

	@Column(name="LEGAL_JURISDICTION")
	private String legalJurisdiction;

	@Column(name="LEI_TYPE")
	private String leiType;

	@Column(name="MANAGING_LOU")
	private String managingLou;

	@Temporal(TemporalType.DATE)
	@Column(name="NEXT_RENEWAL_DATE")
	private Date nextRenewalDate;

	@Column(name="O_ADDITIONAL_ADDRESSLINE_1")
	private String oAdditionalAddressline1;

	@Column(name="O_ADDITIONAL_ADDRESSNUMBERSLINE_1")
	private String oAdditionalAddressnumbersline1;

	@Column(name="O_ADDRESSNUMBER_2")
	private String oAddressnumber2;

	@Column(name="O_ADDRESSNUMBER_WITHINBUILDING_1")
	private String oAddressnumberWithinbuilding1;

	@Column(name="O_CITY_1")
	private String oCity1;

	@Column(name="O_COUNTRY_1")
	private String oCountry1;

	@Column(name="O_FIRSTADDRESSLINE_1")
	private String oFirstaddressline1;

	@Column(name="O_LANG_1")
	private String oLang1;

	@Column(name="O_MAILROUTING_1")
	private String oMailrouting1;

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

	@Column(name="OTHER_VALIDATIONAUTHORITY_ID")
	private String otherValidationauthorityId;

	@Column(name="REGISTRATION_AUTHORITY_ID")
	private String registrationAuthorityId;

	@Column(name="REGISTRATION_AUTHORITYENTITY_ID")
	private String registrationAuthorityentityId;

	@Column(name="REGISTRATION_STATUS")
	private String registrationStatus;

	@Column(name="SUCCESSOR_LEI")
	private String successorLei;

	@Column(name="TO_ADDRESSNUMBER_2")
	private String toAddressnumber2;

	@Column(name="TO_ADDRESSNUMBER_WITHINBUILDING_1")
	private String toAddressnumberWithinbuilding1;

	@Column(name="TO_FIRSTADDRESSLINE_1")
	private String toFirstaddressline1;

	@Column(name="VALIDATION_AUTHORITY_ID")
	private String validationAuthorityId;

	@Column(name="VALIDATION_AUTHORITYENTITY_ID")
	private String validationAuthorityentityId;

	private String validationsources;

	//bi-directional many-to-one association to Level2relationshiprecord
	@OneToMany(mappedBy="level1leirecord")
	private List<Level2relationshiprecord> level2relationshiprecords;

	public Level1leirecord() {
	}

	public String getLei() {
		return this.lei;
	}

	public void setLei(String lei) {
		this.lei = lei;
	}

	public String getAssociatedLeiId() {
		return this.associatedLeiId;
	}

	public void setAssociatedLeiId(String associatedLeiId) {
		this.associatedLeiId = associatedLeiId;
	}

	public String getEntityCategory() {
		return this.entityCategory;
	}

	public void setEntityCategory(String entityCategory) {
		this.entityCategory = entityCategory;
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

	public String getEntityLegalFormcode() {
		return this.entityLegalFormcode;
	}

	public void setEntityLegalFormcode(String entityLegalFormcode) {
		this.entityLegalFormcode = entityLegalFormcode;
	}

	public String getEntityStatus() {
		return this.entityStatus;
	}

	public void setEntityStatus(String entityStatus) {
		this.entityStatus = entityStatus;
	}

	public String getHqAdditionalAddressline() {
		return this.hqAdditionalAddressline;
	}

	public void setHqAdditionalAddressline(String hqAdditionalAddressline) {
		this.hqAdditionalAddressline = hqAdditionalAddressline;
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

	public String getHqFirstaddressLine() {
		return this.hqFirstaddressLine;
	}

	public void setHqFirstaddressLine(String hqFirstaddressLine) {
		this.hqFirstaddressLine = hqFirstaddressLine;
	}

	public String getHqLang() {
		return this.hqLang;
	}

	public void setHqLang(String hqLang) {
		this.hqLang = hqLang;
	}

	public String getHqMailrouting() {
		return this.hqMailrouting;
	}

	public void setHqMailrouting(String hqMailrouting) {
		this.hqMailrouting = hqMailrouting;
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

	public String getLAddressnumber2() {
		return this.lAddressnumber2;
	}

	public void setLAddressnumber2(String lAddressnumber2) {
		this.lAddressnumber2 = lAddressnumber2;
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

	public String getLFirstaddressline1() {
		return this.lFirstaddressline1;
	}

	public void setLFirstaddressline1(String lFirstaddressline1) {
		this.lFirstaddressline1 = lFirstaddressline1;
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

	public String getLegalJurisdiction() {
		return this.legalJurisdiction;
	}

	public void setLegalJurisdiction(String legalJurisdiction) {
		this.legalJurisdiction = legalJurisdiction;
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

	public String getOAdditionalAddressline1() {
		return this.oAdditionalAddressline1;
	}

	public void setOAdditionalAddressline1(String oAdditionalAddressline1) {
		this.oAdditionalAddressline1 = oAdditionalAddressline1;
	}

	public String getOAdditionalAddressnumbersline1() {
		return this.oAdditionalAddressnumbersline1;
	}

	public void setOAdditionalAddressnumbersline1(String oAdditionalAddressnumbersline1) {
		this.oAdditionalAddressnumbersline1 = oAdditionalAddressnumbersline1;
	}

	public String getOAddressnumber2() {
		return this.oAddressnumber2;
	}

	public void setOAddressnumber2(String oAddressnumber2) {
		this.oAddressnumber2 = oAddressnumber2;
	}

	public String getOAddressnumberWithinbuilding1() {
		return this.oAddressnumberWithinbuilding1;
	}

	public void setOAddressnumberWithinbuilding1(String oAddressnumberWithinbuilding1) {
		this.oAddressnumberWithinbuilding1 = oAddressnumberWithinbuilding1;
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

	public String getOFirstaddressline1() {
		return this.oFirstaddressline1;
	}

	public void setOFirstaddressline1(String oFirstaddressline1) {
		this.oFirstaddressline1 = oFirstaddressline1;
	}

	public String getOLang1() {
		return this.oLang1;
	}

	public void setOLang1(String oLang1) {
		this.oLang1 = oLang1;
	}

	public String getOMailrouting1() {
		return this.oMailrouting1;
	}

	public void setOMailrouting1(String oMailrouting1) {
		this.oMailrouting1 = oMailrouting1;
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

	public String getOtherValidationauthorityId() {
		return this.otherValidationauthorityId;
	}

	public void setOtherValidationauthorityId(String otherValidationauthorityId) {
		this.otherValidationauthorityId = otherValidationauthorityId;
	}

	public String getRegistrationAuthorityId() {
		return this.registrationAuthorityId;
	}

	public void setRegistrationAuthorityId(String registrationAuthorityId) {
		this.registrationAuthorityId = registrationAuthorityId;
	}

	public String getRegistrationAuthorityentityId() {
		return this.registrationAuthorityentityId;
	}

	public void setRegistrationAuthorityentityId(String registrationAuthorityentityId) {
		this.registrationAuthorityentityId = registrationAuthorityentityId;
	}

	public String getRegistrationStatus() {
		return this.registrationStatus;
	}

	public void setRegistrationStatus(String registrationStatus) {
		this.registrationStatus = registrationStatus;
	}

	public String getSuccessorLei() {
		return this.successorLei;
	}

	public void setSuccessorLei(String successorLei) {
		this.successorLei = successorLei;
	}

	public String getToAddressnumber2() {
		return this.toAddressnumber2;
	}

	public void setToAddressnumber2(String toAddressnumber2) {
		this.toAddressnumber2 = toAddressnumber2;
	}

	public String getToAddressnumberWithinbuilding1() {
		return this.toAddressnumberWithinbuilding1;
	}

	public void setToAddressnumberWithinbuilding1(String toAddressnumberWithinbuilding1) {
		this.toAddressnumberWithinbuilding1 = toAddressnumberWithinbuilding1;
	}

	public String getToFirstaddressline1() {
		return this.toFirstaddressline1;
	}

	public void setToFirstaddressline1(String toFirstaddressline1) {
		this.toFirstaddressline1 = toFirstaddressline1;
	}

	public String getValidationAuthorityId() {
		return this.validationAuthorityId;
	}

	public void setValidationAuthorityId(String validationAuthorityId) {
		this.validationAuthorityId = validationAuthorityId;
	}

	public String getValidationAuthorityentityId() {
		return this.validationAuthorityentityId;
	}

	public void setValidationAuthorityentityId(String validationAuthorityentityId) {
		this.validationAuthorityentityId = validationAuthorityentityId;
	}

	public String getValidationsources() {
		return this.validationsources;
	}

	public void setValidationsources(String validationsources) {
		this.validationsources = validationsources;
	}

	public List<Level2relationshiprecord> getLevel2relationshiprecords() {
		return this.level2relationshiprecords;
	}

	public void setLevel2relationshiprecords(List<Level2relationshiprecord> level2relationshiprecords) {
		this.level2relationshiprecords = level2relationshiprecords;
	}

	public Level2relationshiprecord addLevel2relationshiprecord(Level2relationshiprecord level2relationshiprecord) {
		getLevel2relationshiprecords().add(level2relationshiprecord);
		level2relationshiprecord.setLevel1leirecord(this);

		return level2relationshiprecord;
	}

	public Level2relationshiprecord removeLevel2relationshiprecord(Level2relationshiprecord level2relationshiprecord) {
		getLevel2relationshiprecords().remove(level2relationshiprecord);
		level2relationshiprecord.setLevel1leirecord(null);

		return level2relationshiprecord;
	}

}