package com.inmemory.gleifparser.mappers;

import com.inmemory.gleifparser.entity.Level1LeiRecord;
import com.inmemory.gleifparser.model.level1.AddressType;
import com.inmemory.gleifparser.model.level1.AssociatedEntityType;
import com.inmemory.gleifparser.model.level1.EntityType;
import com.inmemory.gleifparser.model.level1.LEIRecordType;
import com.inmemory.gleifparser.model.level1.OtherAddressType;
import com.inmemory.gleifparser.model.level1.RegistrationAuthorityType;
import com.inmemory.gleifparser.model.level1.RegistrationType;
import com.inmemory.gleifparser.model.level1.SuccessorEntityType;
import com.inmemory.gleifparser.model.level1.TransliteratedOtherAddressType;
import com.inmemory.gleifparser.model.level1.TransliteratedOtherEntityNamesType;
import com.inmemory.gleifparser.utils.DateUtils;

public class LeiOneXmlDbMapper {

	public static Level1LeiRecord convertFromXmlToEntityObject(LEIRecordType leiRecordType) {
		Level1LeiRecord entity = new Level1LeiRecord();
		if (leiRecordType != null) {
			entity.setLei(leiRecordType.getLEI());
			if (leiRecordType.getEntity() != null) {
				setEntityDetails(leiRecordType.getEntity(), entity);
			}

			entity.setInitialRegistrationDate(DateUtils
					.convertXmlGregorianCalToDate(leiRecordType.getRegistration().getInitialRegistrationDate()));
			entity.setLastUpdateDate(
					DateUtils.convertXmlGregorianCalToDate(leiRecordType.getRegistration().getLastUpdateDate()));
			entity.setRegistrationStatus(leiRecordType.getRegistration().getRegistrationStatus().name());
			entity.setNextRenewalDate(
					DateUtils.convertXmlGregorianCalToDate(leiRecordType.getRegistration().getNextRenewalDate()));
			entity.setManagingLou(leiRecordType.getRegistration().getManagingLOU());
			entity.setValidationSources(leiRecordType.getRegistration().getValidationSources().name());
			entity.setValidationAuthorityTypeValidationAuthorityId(
					leiRecordType.getRegistration().getValidationAuthority().getValidationAuthorityID());
			entity.setValidationAuthorityTypeOtherValidationAuthorityId(
					leiRecordType.getRegistration().getValidationAuthority().getOtherValidationAuthorityID());
			entity.setValidationAuthorityTypeValidationAuthorityEntityId(
					leiRecordType.getRegistration().getValidationAuthority().getValidationAuthorityEntityID());
			entity.setOtherValidationAuthoritiesType(leiRecordType.getRegistration().getOtherValidationAuthorities()
					.getOtherValidationAuthority().get(0).getValidationAuthorityID());
			checkAndSetRegistration(leiRecordType.getRegistration(), entity);

		}
		return entity;
	}

	/**
	 * @param leiRecordType
	 * @param level1LeiRecord
	 */
	private static void setEntityDetails(EntityType entityType, Level1LeiRecord level1LeiRecord) {

		level1LeiRecord.setLega
		level1LeiRecord.setEntityTypeTransliteratedOtherEntityNamesType(entityType.getTransliteratedOtherEntityNames()
				.getTransliteratedOtherEntityName().get(0).getType().name());

		if (entityType.getLegalAddress() != null) {
			setLegalAddress(entityType.getLegalAddress(), level1LeiRecord);
		}

		if (entityType.getOtherAddresses() != null && entityType.getOtherAddresses().getOtherAddress() != null
				&& (!entityType.getOtherAddresses().getOtherAddress().isEmpty())) {
			setOtherAddress(level1LeiRecord, entityType.getOtherAddresses().getOtherAddress().get(0));

		}
		if (entityType.getHeadquartersAddress() != null) {
			setHeadQuartersAddress(entityType.getHeadquartersAddress(), level1LeiRecord);
		}
		if (entityType.getTransliteratedOtherAddresses() != null
				&& entityType.getTransliteratedOtherAddresses().getTransliteratedOtherAddress() != null
				&& (!entityType.getTransliteratedOtherAddresses().getTransliteratedOtherAddress().isEmpty())) {
				setTransliteratedOtherAddress(level1LeiRecord,entityType.getTransliteratedOtherAddresses().getTransliteratedOtherAddress().get(0));
		}
		

		checkAndSetAddress(entityType, level1LeiRecord);

		level1LeiRecord
				.setRegistrationAuthorityId(entityType.getRegistrationAuthority().getOtherRegistrationAuthorityID());
		level1LeiRecord.setRegistrationAuthorityEntityId(
				entityType.getRegistrationAuthority().getRegistrationAuthorityEntityID());
		level1LeiRecord.setLegalJurisdiction(entityType.getLegalJurisdiction());
		level1LeiRecord.setEntityCategoryValue(entityType.getEntityCategory().name());
		level1LeiRecord.setLegalFormTypeEntityLegalFormCode(entityType.getLegalForm().getEntityLegalFormCode());
		level1LeiRecord.setLegalFormTypeOtherLegalForm(entityType.getLegalForm().getOtherLegalForm());
		level1LeiRecord.setAssociatedLeiId(entityType.getAssociatedEntity().getAssociatedLEI());
		level1LeiRecord.setAssociatedEntityTypeAssociatedEntityTypeEnum(
				entityType.getAssociatedEntity().getAssociatedEntityName().getValue());
		level1LeiRecord.setAssociatedEntityTypeAssociatedEntityName(
				entityType.getAssociatedEntity().getAssociatedEntityName().getValue());
		level1LeiRecord.setEntityStatus(entityType.getEntityStatus().name());
		level1LeiRecord
				.setEntityExpirationDate(DateUtils.convertXmlGregorianCalToDate(entityType.getEntityExpirationDate()));
		level1LeiRecord.setEntityExpirationReason(entityType.getEntityExpirationReason().name());
		level1LeiRecord.setSuccessorLei(entityType.getSuccessorEntity().getSuccessorLEI());
		level1LeiRecord
				.setSuccessorEntityTypeSuccessorLei(entityType.getSuccessorEntity().getSuccessorEntityName().getLang());
		level1LeiRecord.setSuccessorEntityTypeSuccessorLei(
				entityType.getSuccessorEntity().getSuccessorEntityName().getValue());

		level1LeiRecord.setEntityTypeLegalAddressAdditionalAddressLine(
				entityType.getLegalAddress().getAdditionalAddressLine().get(0));
		level1LeiRecord.setEntityTypeOtherEntityNamesType(
				entityType.getOtherEntityNames().getOtherEntityName().get(0).getType().name());
		level1LeiRecord
				.setHqAdditionalAddressLine(entityType.getHeadquartersAddress().getAdditionalAddressLine().get(0));
	}

	private static void setTransliteratedOtherAddress(Level1LeiRecord entity,
			TransliteratedOtherAddressType transOtherAddress) {
		entity.setToFirstAddressLine1(transOtherAddress.getFirstAddressLine());
		entity.setToAddressNumberWithinBuilding1(transOtherAddress.getAddressNumberWithinBuilding());
		entity.setToAddressNumber2(transOtherAddress.getAddressNumber());
		entity.setToRegion1(transOtherAddress.getRegion());
		entity.setToPostalcode1(transOtherAddress.getPostalCode());
		entity.setToMailRouting1(transOtherAddress.getMailRouting());
		entity.setToCountry1(transOtherAddress.getCountry());
		entity.setT(transOtherAddress.getAdditionalAddressLine().get(0));
		
		entity.setToCity1(transOtherAddress.getCity());
		
	}

	private static void setHeadQuartersAddress(AddressType hqAddress, Level1LeiRecord entity) {
		entity.setHqFirstAddressLine(hqAddress.getFirstAddressLine());
		entity.setHqAddressnumberWithinBuilding(hqAddress.getAddressNumberWithinBuilding());
		entity.setHqAddressNumber(hqAddress.getAddressNumber());
		entity.setHqRegion(hqAddress.getRegion());
		entity.setHqPostalCode(hqAddress.getPostalCode());
		entity.setHqMailRouting(hqAddress.getMailRouting());
		entity.setHqCountry(hqAddress.getCountry());
		entity.setHqAdditionalAddressLine(hqAddress.getAdditionalAddressLine().get(0));
		entity.setHqCity(hqAddress.getCity());

	}

	private static void setOtherAddress(Level1LeiRecord entity, OtherAddressType otherAddr) {
		entity.setORegion1(otherAddr.getRegion());
		entity.setOLang1(otherAddr.getLang());
		entity.setOPostalcode1(otherAddr.getPostalCode());
		entity.setOMailRouting1(otherAddr.getMailRouting());
		entity.setOFirstAddressLine1(otherAddr.getFirstAddressLine());
		entity.setOCountry1(otherAddr.getCountry());
		entity.setOCity1(otherAddr.getCity());
		entity.setOAddressNumberWithinBuilding1(otherAddr.getAddressNumberWithinBuilding());
		entity.setOAdditionalAddressNumber2(otherAddr.getAddressNumber());
		entity.setOAdditionalAddressNumberLine1(otherAddr.getAdditionalAddressLine().get(0));

	}

	/**
	 * @param entityType
	 * @param entity
	 */
	private static void setLegalAddress(AddressType legalAddress, Level1LeiRecord entity) {
		entity.setLFirstAddressLine1(legalAddress.getFirstAddressLine());
		entity.setLAddressNumber2(legalAddress.getAddressNumber());
		entity.setLCity1(legalAddress.getCity());
		entity.setLRegion1(legalAddress.getRegion());
		entity.setLPostalcode1(legalAddress.getPostalCode());
		entity.setLCountry1(legalAddress.getCountry());

		entity.setEntityTypeLegalAddressMailRouting(legalAddress.getMailRouting());
		entity.setEntityTypeLegalAddressAdditionalAddressLine(legalAddress.getAdditionalAddressLine().get(0));
		entity.setEntityTypeLegalAddressAddressNumberWithinBuilding(legalAddress.getAddressNumberWithinBuilding());
	}

	/**
	 * @param leiRecord
	 * @param entity
	 */
	private static void checkAndSetAddress(EntityType leiRecord, Level1LeiRecord entity) {
		// TODO Auto-generated method stub

	

		if (leiRecord != null && leiRecord.getRegistrationAuthority() != null) {
			RegistrationAuthorityType register = leiRecord.getRegistrationAuthority();
			entity.setRegistrationAuthorityId(register.getRegistrationAuthorityID());
			entity.setRegistrationAuthorityEntityId(register.getRegistrationAuthorityEntityID());
			entity.setOtherRegistrationAuthorityId(register.getOtherRegistrationAuthorityID());

		}

		if (leiRecord != null && leiRecord.getAssociatedEntity() != null) {
			AssociatedEntityType associated = leiRecord.getAssociatedEntity();
			entity.setAssociatedLeiId(associated.getAssociatedLEI());
			entity.setAssociatedEntityTypeAssociatedEntityName(associated.getAssociatedEntityName().getLang());
			entity.setAssociatedEntityTypeAssociatedEntityName(associated.getAssociatedEntityName().getValue());

		}

		if (leiRecord != null && leiRecord.getSuccessorEntity() != null) {
			SuccessorEntityType successor = leiRecord.getSuccessorEntity();
			entity.setSuccessorLei(successor.getSuccessorLEI());
			entity.setSuccessorEntityTypeSuccessorEntityNameLang(successor.getSuccessorEntityName().getLang());
			entity.setSuccessorEntityTypeSuccessorEntityNameValue(successor.getSuccessorEntityName().getValue());
		}

		if (leiRecord != null && leiRecord.getTransliteratedOtherEntityNames() != null) {
			TransliteratedOtherEntityNamesType transliterated = leiRecord.getTransliteratedOtherEntityNames();
			if (transliterated.getTransliteratedOtherEntityName() != null) {
				entity.setEntityTypeTransliteratedOtherEntityNamesType(
						transliterated.getTransliteratedOtherEntityName().get(0).getType().name());
			}
		}

	}

	private static void checkAndSetRegistration(RegistrationType registrationType, Level1LeiRecord entity) {
		if (registrationType != null) {
			entity.setInitialRegistrationDate(
					DateUtils.convertXmlGregorianCalToDate(registrationType.getInitialRegistrationDate()));
			entity.setLastUpdateDate(DateUtils.convertXmlGregorianCalToDate(registrationType.getLastUpdateDate()));
			entity.setRegistrationStatus(registrationType.getRegistrationStatus().name());
			entity.setNextRenewalDate(DateUtils.convertXmlGregorianCalToDate(registrationType.getNextRenewalDate()));
			entity.setManagingLou(registrationType.getManagingLOU());
			entity.setValidationSources(registrationType.getValidationSources().name());
			entity.setValidationAuthorityTypeOtherValidationAuthorityId(
					registrationType.getValidationAuthority().getOtherValidationAuthorityID());
			entity.setValidationAuthorityTypeValidationAuthorityEntityId(
					registrationType.getValidationAuthority().getValidationAuthorityEntityID());
			entity.setValidationAuthorityTypeValidationAuthorityId(
					registrationType.getValidationAuthority().getValidationAuthorityID());
			entity.setOtherValidationAuthoritiesType(registrationType.getOtherValidationAuthorities()
					.getOtherValidationAuthority().get(0).getOtherValidationAuthorityID());

		}

	}
}
