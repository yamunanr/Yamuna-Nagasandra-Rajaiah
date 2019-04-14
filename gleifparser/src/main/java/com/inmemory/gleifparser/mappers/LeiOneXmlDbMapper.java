package com.inmemory.gleifparser.mappers;

import com.inmemory.gleifparser.entity.Level1LeiRecord;
import com.inmemory.gleifparser.model.level1.AddressType;
import com.inmemory.gleifparser.model.level1.EntityType;
import com.inmemory.gleifparser.model.level1.LEIRecordType;
import com.inmemory.gleifparser.model.level1.NameType;
import com.inmemory.gleifparser.model.level1.OtherAddressType;
import com.inmemory.gleifparser.model.level1.OtherEntityNamesType;
import com.inmemory.gleifparser.model.level1.TransliteratedOtherAddressType;
import com.inmemory.gleifparser.model.level1.TransliteratedOtherEntityNamesType;
import com.inmemory.gleifparser.utils.DateUtils;

public class LeiOneXmlDbMapper {

	public static Level1LeiRecord convertFromXmlToEntityObject(LEIRecordType leiRecordType) {
		Level1LeiRecord entity = new Level1LeiRecord();

		if (leiRecordType != null) {
			entity.setLei(leiRecordType.getLEI());
			if ((leiRecordType.getEntity() != null)) {
				if ((leiRecordType.getEntity().getLegalName() != null)) {
					setLegalName(leiRecordType.getEntity().getLegalName(), entity);
				}
				if ((leiRecordType.getEntity().getOtherEntityNames() != null)) {
					setOtherEntityName(leiRecordType.getEntity().getOtherEntityNames(), entity);
				}
				if ((leiRecordType.getEntity().getTransliteratedOtherEntityNames() != null)) {
					setTransOtherEntityName(leiRecordType.getEntity().getTransliteratedOtherEntityNames(), entity);
				}
				if ((leiRecordType.getEntity().getLegalAddress() != null)) {
					setLegalAddress(leiRecordType.getEntity().getLegalAddress(), entity);
				}
				if (((leiRecordType.getEntity().getOtherAddresses() != null))
						&& ((leiRecordType.getEntity().getOtherAddresses().getOtherAddress() != null))
						&& (!leiRecordType.getEntity().getOtherAddresses().getOtherAddress().isEmpty())) {
					setOtherAddress(entity, leiRecordType.getEntity().getOtherAddresses().getOtherAddress().get(0));
				}
				if ((leiRecordType.getEntity().getHeadquartersAddress() != null)) {
					setHeadQuartersAddress(leiRecordType.getEntity().getHeadquartersAddress(), entity);
				}
				if ((leiRecordType.getEntity().getTransliteratedOtherAddresses() != null) && (!leiRecordType.getEntity()
						.getTransliteratedOtherAddresses().getTransliteratedOtherAddress().isEmpty())) {
					setTransliteratedOtherAddress(entity, leiRecordType.getEntity().getTransliteratedOtherAddresses()
							.getTransliteratedOtherAddress().get(0));
				}
				setRegistrationAuthorityAndSuccessorEntity(entity, leiRecordType.getEntity());
			}

			if (leiRecordType.getRegistration() != null) {
				entity.setRInitialRegistrationDate(DateUtils
						.convertXmlGregorianCalToDate(leiRecordType.getRegistration().getInitialRegistrationDate()));
				entity.setRLastUpdateDate(
						DateUtils.convertXmlGregorianCalToDate(leiRecordType.getRegistration().getLastUpdateDate()));
				entity.setRRegistrationStatus(leiRecordType.getRegistration().getRegistrationStatus().name());
				entity.setRNextRenewalDate(
						DateUtils.convertXmlGregorianCalToDate(leiRecordType.getRegistration().getNextRenewalDate()));
				if (leiRecordType.getRegistration().getManagingLOU() != null)
					entity.setRManagingLou(leiRecordType.getRegistration().getManagingLOU());
				if (leiRecordType.getRegistration().getValidationSources() != null)
					entity.setRValidationSources(leiRecordType.getRegistration().getValidationSources().name());
				if (leiRecordType.getRegistration().getValidationAuthority() != null) {
					if ((leiRecordType.getRegistration().getValidationAuthority().getValidationAuthorityID() != null)) {
						entity.setRValidationAuthorityId(
								leiRecordType.getRegistration().getValidationAuthority().getValidationAuthorityID());
					}
					if ((leiRecordType.getRegistration().getValidationAuthority()
							.getOtherValidationAuthorityID() != null)) {
						entity.setROtherValidationAuthorityId(leiRecordType.getRegistration().getValidationAuthority()
								.getOtherValidationAuthorityID());
					}
					if ((leiRecordType.getRegistration().getValidationAuthority()
							.getValidationAuthorityEntityID() != null)) {
						entity.setRValidationAuthorityEntityId(leiRecordType.getRegistration().getValidationAuthority()
								.getValidationAuthorityEntityID());
					}
				}
			}
			if (leiRecordType.getRegistration() != null
					&& leiRecordType.getRegistration().getOtherValidationAuthorities() != null
					&& (!leiRecordType.getRegistration().getOtherValidationAuthorities().getOtherValidationAuthority()
							.isEmpty())) {
				entity.setROtherValidationAuthorityId(leiRecordType.getRegistration().getOtherValidationAuthorities()
						.getOtherValidationAuthority().get(0).getValidationAuthorityID());
			}

		}

		return entity;

	}

	/**
	 * @param leiRecordType
	 * @param level1LeiRecord
	 */

	private static void setTransliteratedOtherAddress(Level1LeiRecord entity,
			TransliteratedOtherAddressType transOtherAddress) {
		entity.setEToFirstAddressLine(transOtherAddress.getFirstAddressLine());
		entity.setEToAddressNumberWithinBuilding(transOtherAddress.getAddressNumberWithinBuilding());
		entity.setEToAddressNumber(transOtherAddress.getAddressNumber());
		entity.setEToRegion(transOtherAddress.getRegion());
		entity.setEToPostalcode(transOtherAddress.getPostalCode());
		entity.setEToMailRouting(transOtherAddress.getMailRouting());
		entity.setEToCountry(transOtherAddress.getCountry());
		entity.setEToAddressType(transOtherAddress.getType().name());
		if (transOtherAddress.getAdditionalAddressLine() != null
				&& (!transOtherAddress.getAdditionalAddressLine().isEmpty())) {
			for (int index = 0; index < transOtherAddress.getAdditionalAddressLine().size(); index++) {
				if (index == 0) {
					entity.setEToAdditionalAddressLine1(transOtherAddress.getAdditionalAddressLine().get(0));
				} else if (index == 1) {
					entity.setEToAdditionalAddressLine2(transOtherAddress.getAdditionalAddressLine().get(1));
				} else if (index == 2) {
					entity.setEToAdditionalAddressLine3(transOtherAddress.getAdditionalAddressLine().get(2));
				}
			}
		}
		entity.setEToLang(transOtherAddress.getLang());
		entity.setEToCity(transOtherAddress.getCity());

	}

	private static void setHeadQuartersAddress(AddressType hqAddress, Level1LeiRecord entity) {
		entity.setEHqFirstAddressLine(hqAddress.getFirstAddressLine());
		entity.setEHqAddressnumberWithinBuilding(hqAddress.getAddressNumberWithinBuilding());
		entity.setEHqAddressNumber(hqAddress.getAddressNumber());
		entity.setEHqRegion(hqAddress.getRegion());
		entity.setEHqPostalCode(hqAddress.getPostalCode());
		entity.setEHqMailRouting(hqAddress.getMailRouting());
		entity.setEHqCountry(hqAddress.getCountry());
		if (hqAddress.getAdditionalAddressLine() != null && (!hqAddress.getAdditionalAddressLine().isEmpty())) {
			for (int index = 0; index < hqAddress.getAdditionalAddressLine().size(); index++) {
				if (index == 0) {
					entity.setEHqAdditionalAddressLine1(hqAddress.getAdditionalAddressLine().get(0));
				} else if (index == 1) {
					entity.setEHqAdditionalAddressLine2(hqAddress.getAdditionalAddressLine().get(1));
				} else if (index == 2) {
					entity.setEHqAdditionalAddressLine3(hqAddress.getAdditionalAddressLine().get(2));
				}
			}
		}

		entity.setEHqCity(hqAddress.getCity());
		entity.setEHqLang(hqAddress.getLang());
	}

	private static void setOtherAddress(Level1LeiRecord entity, OtherAddressType otherAddr) {
		entity.setEORegion(otherAddr.getRegion());
		entity.setEOAddressNumber(otherAddr.getAddressNumber());
		entity.setEOLang(otherAddr.getLang());
		entity.setEOPostalcode(otherAddr.getPostalCode());
		entity.setEOMailRouting1(otherAddr.getMailRouting());
		entity.setEOFirstAddressLine(otherAddr.getFirstAddressLine());
		entity.setEOCountry(otherAddr.getCountry());
		entity.setEOCity(otherAddr.getCity());
		entity.setEOAddressNumberWithinBuilding(otherAddr.getAddressNumberWithinBuilding());
		entity.setEOAdditionalAddressNumber(otherAddr.getAddressNumber());
		entity.setEOAddressType(otherAddr.getType().name());
		if (otherAddr.getAdditionalAddressLine() != null && (!otherAddr.getAdditionalAddressLine().isEmpty())) {
			for (int index = 0; index < otherAddr.getAdditionalAddressLine().size(); index++) {
				if (index == 0) {
					entity.setEOAdditionalAddressLine1(otherAddr.getAdditionalAddressLine().get(0));
				} else if (index == 1) {
					entity.setEOAdditionalAddressLine2(otherAddr.getAdditionalAddressLine().get(1));
				} else if (index == 2) {
					entity.setEOAdditionalAddressLine3(otherAddr.getAdditionalAddressLine().get(2));
				}
			}
		}

	}

	/**
	 * @param entityType
	 * @param entity
	 */
	private static void setLegalAddress(AddressType legalAddress, Level1LeiRecord entity) {
		entity.setELegalAddressFirstAddressLine(legalAddress.getFirstAddressLine());
		entity.setELegalAddressAddressNumber(legalAddress.getAddressNumber());
		entity.setELegalAddressCity(legalAddress.getCity());
		entity.setELegalAddressRegion(legalAddress.getRegion());
		entity.setELegalAddressPostalcode(legalAddress.getPostalCode());
		entity.setELegalAddressCountry(legalAddress.getCountry());
		entity.setELegalAddressMailRouting(legalAddress.getMailRouting());
		if (legalAddress.getAdditionalAddressLine() != null && (!legalAddress.getAdditionalAddressLine().isEmpty())) {
			for (int index = 0; index < legalAddress.getAdditionalAddressLine().size(); index++) {
				if (index == 0) {
					entity.setELegalAddressAdditionalAddressLine1(legalAddress.getAdditionalAddressLine().get(0));
				} else if (index == 1) {
					entity.setELegalAddressAdditionalAddressLine2(legalAddress.getAdditionalAddressLine().get(1));
				} else if (index == 2) {
					entity.setELegalAddressAdditionalAddressLine3(legalAddress.getAdditionalAddressLine().get(2));
				}
			}
		}
		entity.setELegalAddressLang(legalAddress.getLang());
		entity.setELegalAddressAddressNumberWithinBuilding(legalAddress.getAddressNumberWithinBuilding());
	}

	private static void setLegalName(NameType legalName, Level1LeiRecord entity) {
		entity.setELegalNameTypeLang(legalName.getLang());
		entity.setELegalNameTypeValue(legalName.getValue());
	}

	private static void setOtherEntityName(OtherEntityNamesType otherEntityName, Level1LeiRecord entity) {
		entity.setEOtherEntityNamesType(otherEntityName.getOtherEntityName().get(0).getLang());
		entity.setEOtherEntityNamesType(otherEntityName.getOtherEntityName().get(0).getValue());

	}

	private static void setTransOtherEntityName(TransliteratedOtherEntityNamesType transOtherEntityName,
			Level1LeiRecord entity) {
		entity.setETransliteratedOtherEntityNamesType(
				transOtherEntityName.getTransliteratedOtherEntityName().get(0).getLang());
		entity.setETransliteratedOtherEntityNamesType(
				transOtherEntityName.getTransliteratedOtherEntityName().get(0).getValue());

	}

	private static void setRegistrationAuthorityAndSuccessorEntity(Level1LeiRecord entity, EntityType entityType) {
		if (entityType.getSuccessorEntity() != null) {
			entity.setESuccessorLei(entityType.getSuccessorEntity().getSuccessorLEI());
			if (entityType.getSuccessorEntity().getSuccessorEntityName() != null) {
				entity.setESuccessorEntityName(entityType.getSuccessorEntity().getSuccessorEntityName().getLang());
			}
		}

		if (entityType.getRegistrationAuthority() != null) {
			entity.setERegistrationAuthorityId(entityType.getRegistrationAuthority().getOtherRegistrationAuthorityID());
			entity.setERegistrationAuthorityEntityId(
					entityType.getRegistrationAuthority().getRegistrationAuthorityEntityID());
			entity.setEOtherRegistrationAuthorityId(
					entityType.getRegistrationAuthority().getOtherRegistrationAuthorityID());
		}
		if (entityType.getLegalJurisdiction() != null) {
			entity.setELegalJurisdiction(entityType.getLegalJurisdiction());
		}
		if (entityType.getEntityCategory() != null) {
			entity.setECategoryType(entityType.getEntityCategory().name());
		}
		if (entityType.getLegalForm() != null) {
			entity.setEEntityLegalFormCode(entityType.getLegalForm().getEntityLegalFormCode());
			entity.setEOtherLegalForm(entityType.getLegalForm().getOtherLegalForm());
		}
		if (entityType.getAssociatedEntity() != null) {
			if (entityType.getAssociatedEntity().getAssociatedLEI() != null)
				entity.setEAssociatedLei(entityType.getAssociatedEntity().getAssociatedLEI());
			if (entityType.getAssociatedEntity().getType() != null)
				entity.setEAssociatedEntityType(entityType.getAssociatedEntity().getType().name());
			if (entityType.getAssociatedEntity().getAssociatedEntityName() != null)
				entity.setEAssociatedEntityName(entityType.getAssociatedEntity().getAssociatedEntityName().getValue());
		}
		if (entityType.getEntityStatus() != null) {
			entity.setEEntityStatus(entityType.getEntityStatus().name());
		}
		entity.setEEntityExpirationDate(DateUtils.convertXmlGregorianCalToDate(entityType.getEntityExpirationDate()));
		if (entityType.getEntityExpirationReason() != null) {
			entity.setEEntityExpirationReason(entityType.getEntityExpirationReason().name());
		}

	}

}
