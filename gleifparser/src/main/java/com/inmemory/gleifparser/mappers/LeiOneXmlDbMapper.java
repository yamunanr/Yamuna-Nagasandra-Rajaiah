package com.inmemory.gleifparser.mappers;

import com.inmemory.gleifparser.entity.Level1LeiRecord;
import com.inmemory.gleifparser.model.level1.EntityType;
import com.inmemory.gleifparser.model.level1.LEIRecordType;
import com.inmemory.gleifparser.utils.DateUtils;

public class LeiOneXmlDbMapper {

	public Level1LeiRecord convertFromXmlToEntityObject(LEIRecordType leiRecordType) {
		Level1LeiRecord entity = new Level1LeiRecord();
		
	    
		entity.setLei(leiRecordType.getLEI());
		
		entity.setEntityTypeTransliteratedOtherEntityNamesType(leiRecordType.getEntity().getTransliteratedOtherEntityNames().getTransliteratedOtherEntityName().get(0).getType().name());
		entity.setEntityTypeLegalAddressRegion(leiRecordType.getEntity().getLegalAddress().getRegion());
		entity.setEntityTypeLegalAddressPostalcode(leiRecordType.getEntity().getLegalAddress().getPostalCode());
		entity.setEntityTypeLegalAddressMailRouting(leiRecordType.getEntity().getLegalAddress().getMailRouting());
		entity.setEntityTypeLegalAddressLang(leiRecordType.getEntity().getLegalAddress().getLang());
		entity.setEntityTypeLegalAddressFirstAddressLine(leiRecordType.getEntity().getLegalAddress().getFirstAddressLine());
		entity.setEntityTypeLegalAddressCountry(leiRecordType.getEntity().getLegalAddress().getCountry());
		entity.setEntityTypeLegalAddressCity(leiRecordType.getEntity().getLegalAddress().getCity());
		entity.setEntityTypeLegalAddressAddressNumberWithinBuilding(leiRecordType.getEntity().getLegalAddress().getAddressNumberWithinBuilding());
		entity.setEntityTypeLegalAddressAddressNumber(leiRecordType.getEntity().getLegalAddress().getAddressNumber());
		checkAndSetAddress(leiRecordType.getEntity(), entity);
		
		
		entity.setHqRegion(leiRecordType.getEntity().getHeadquartersAddress().getRegion());
		entity.setHqPostalCode(leiRecordType.getEntity().getHeadquartersAddress().getPostalCode());
		entity.setHqMailRouting(leiRecordType.getEntity().getHeadquartersAddress().getMailRouting());
		entity.setHqLang(leiRecordType.getEntity().getHeadquartersAddress().getLang());
		entity.setHqFirstAddressLine(leiRecordType.getEntity().getHeadquartersAddress().getFirstAddressLine());
		entity.setHqCountry(leiRecordType.getEntity().getHeadquartersAddress().getCountry());
		entity.setHqCity(leiRecordType.getEntity().getHeadquartersAddress().getCity());
		entity.setHqAddressnumberWithinBuilding(leiRecordType.getEntity().getHeadquartersAddress().getAddressNumberWithinBuilding());
		entity.setHqAddressNumber(leiRecordType.getEntity().getHeadquartersAddress().getAddressNumber());
		
		
		
		
		entity.setRegistrationAuthorityId(leiRecordType.getEntity().getRegistrationAuthority().getOtherRegistrationAuthorityID());
		entity.setRegistrationAuthorityEntityId(leiRecordType.getEntity().getRegistrationAuthority().getRegistrationAuthorityEntityID());
		entity.setLegalJurisdiction(leiRecordType.getEntity().getLegalJurisdiction());
		entity.setEntityCategoryValue(leiRecordType.getEntity().getEntityCategory().name());
		entity.setLegalFormTypeEntityLegalFormCode(leiRecordType.getEntity().getLegalForm().getEntityLegalFormCode());
		entity.setLegalFormTypeOtherLegalForm(leiRecordType.getEntity().getLegalForm().getOtherLegalForm());
		entity.setAssociatedLeiId(leiRecordType.getEntity().getAssociatedEntity().getAssociatedLEI());
		entity.setAssociatedEntityTypeAssociatedEntityTypeEnum(leiRecordType.getEntity().getAssociatedEntity().getAssociatedEntityName().getValue());
		entity.setAssociatedEntityTypeAssociatedEntityName(leiRecordType.getEntity().getAssociatedEntity().getAssociatedEntityName().getValue());
	    entity.setEntityStatus(leiRecordType.getEntity().getEntityStatus().name());
		entity.setEntityExpirationDate(DateUtils.convertXmlGregorianCalToDate(leiRecordType.getEntity().getEntityExpirationDate()));
		entity.setEntityExpirationReason(leiRecordType.getEntity().getEntityExpirationReason().name());
		entity.setSuccessorLei(leiRecordType.getEntity().getSuccessorEntity().getSuccessorLEI());
		entity.setSuccessorEntityTypeSuccessorLei(leiRecordType.getEntity().getSuccessorEntity().getSuccessorEntityName().getLang());
		entity.setSuccessorEntityTypeSuccessorLei(leiRecordType.getEntity().getSuccessorEntity().getSuccessorEntityName().getValue());
		
		entity.setInitialRegistrationDate(DateUtils.convertXmlGregorianCalToDate(leiRecordType.getRegistration().getInitialRegistrationDate()));
		entity.setLastUpdateDate(DateUtils.convertXmlGregorianCalToDate(leiRecordType.getRegistration().getLastUpdateDate()));
		entity.setRegistrationStatus(leiRecordType.getRegistration().getRegistrationStatus().name());
		entity.setNextRenewalDate(DateUtils.convertXmlGregorianCalToDate(leiRecordType.getRegistration().getNextRenewalDate()));
		entity.setManagingLou(leiRecordType.getRegistration().getManagingLOU());
		entity.setValidationSources(leiRecordType.getRegistration().getValidationSources().name());
		entity.setValidationAuthorityTypeValidationAuthorityId(leiRecordType.getRegistration().getValidationAuthority().getValidationAuthorityID());
		entity.setValidationAuthorityTypeOtherValidationAuthorityId(leiRecordType.getRegistration().getValidationAuthority().getOtherValidationAuthorityID());
		entity.setValidationAuthorityTypeValidationAuthorityEntityId(leiRecordType.getRegistration().getValidationAuthority().getValidationAuthorityEntityID());
		entity.setOtherValidationAuthoritiesType(leiRecordType.getRegistration().getOtherValidationAuthorities().getOtherValidationAuthority().get(0).getValidationAuthorityID());
		
		if (leiRecordType != null && leiRecordType.getEntity() != null) {
			entity.setEntityTypeLegalAddressAdditionalAddressLine(leiRecordType.getEntity().getLegalAddress().getAdditionalAddressLine().get(0));
			entity.setEntityTypeOtherEntityNamesType(leiRecordType.getEntity().getOtherEntityNames().getOtherEntityName().get(0).getType().name());
			entity.setHqAdditionalAddressLine(leiRecordType.getEntity().getHeadquartersAddress().getAdditionalAddressLine().get(0));
			
		}
	
		return entity;
	
	}

	private void checkAndSetAddress(EntityType leiRecord, Level1LeiRecord entity) {
		// TODO Auto-generated method stub
		
		if (leiRecord != null && leiRecord.getOtherAddresses() != null) {
			
		entity.setORegion1(leiRecord.getOtherAddresses().getOtherAddress().get(0).getRegion());
		entity.setOLang1(leiRecord.getOtherAddresses().getOtherAddress().get(0).getLang());
		entity.setOPostalcode1(leiRecord.getOtherAddresses().getOtherAddress().get(0).getPostalCode());
		entity.setOMailRouting1(leiRecord.getOtherAddresses().getOtherAddress().get(0).getMailRouting());
		entity.setOFirstAddressLine1(leiRecord.getOtherAddresses().getOtherAddress().get(0).getFirstAddressLine());
		entity.setOCountry1(leiRecord.getOtherAddresses().getOtherAddress().get(0).getCountry());
		entity.setOCity1(leiRecord.getOtherAddresses().getOtherAddress().get(0).getCity());
		entity.setOAddressNumberWithinBuilding1(leiRecord.getOtherAddresses().getOtherAddress().get(0).getAddressNumberWithinBuilding());
		entity.setOAdditionalAddressNumber2(leiRecord.getOtherAddresses().getOtherAddress().get(0).getAddressNumber());
		entity.setOAdditionalAddressNumberLine1(leiRecord.getOtherAddresses().getOtherAddress().get(0).getAdditionalAddressLine().get(0));
		
		}
		
		if(leiRecord != null && leiRecord.getTransliteratedOtherAddresses() != null) {
			
		entity.setToFirstAddressLine1(leiRecord.getTransliteratedOtherAddresses().getTransliteratedOtherAddress().get(0).getFirstAddressLine());
		entity.setToAddressNumberWithinBuilding1(leiRecord.getTransliteratedOtherAddresses().getTransliteratedOtherAddress().get(0).getAddressNumberWithinBuilding());
		entity.setToAddressNumber2(leiRecord.getTransliteratedOtherAddresses().getTransliteratedOtherAddress().get(0).getAddressNumber());
		entity.setToRegion1(leiRecord.getTransliteratedOtherAddresses().getTransliteratedOtherAddress().get(0).getRegion());
		entity.setToPostalcode1(leiRecord.getTransliteratedOtherAddresses().getTransliteratedOtherAddress().get(0).getPostalCode());
		entity.setToMailRouting1(leiRecord.getTransliteratedOtherAddresses().getTransliteratedOtherAddress().get(0).getMailRouting());
		entity.setToCountry1(leiRecord.getTransliteratedOtherAddresses().getTransliteratedOtherAddress().get(0).getCountry());
		entity.setToAdditionalAddressNumberLine1(leiRecord.getTransliteratedOtherAddresses().getTransliteratedOtherAddress().get(0).getAdditionalAddressLine().get(0));
		entity.setToCity1(leiRecord.getTransliteratedOtherAddresses().getTransliteratedOtherAddress().get(0).getCity());
			
		}
		
	}
	
	

}
