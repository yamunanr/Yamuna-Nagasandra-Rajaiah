package com.inmemory.gleifparser.mappers;

import java.util.ArrayList;

import com.inmemory.gleifparser.entity.Level2RelationshipRecord;
import com.inmemory.gleifparser.entity.Level2RrRelationshipQualifier;
import com.inmemory.gleifparser.entity.Level2RrRelationshipQuantifier;
import com.inmemory.gleifparser.model.level2_rr.RelationshipContainerType;
import com.inmemory.gleifparser.model.level2_rr.RelationshipPeriodsType;
import com.inmemory.gleifparser.model.level2_rr.RelationshipQualifierType;
import com.inmemory.gleifparser.model.level2_rr.RelationshipQualifiersType;
import com.inmemory.gleifparser.model.level2_rr.RelationshipQuantifierType;
import com.inmemory.gleifparser.model.level2_rr.RelationshipQuantifiersType;
import com.inmemory.gleifparser.model.level2_rr.RelationshipRecordType;
import com.inmemory.gleifparser.utils.DateUtils;

public final class Level2RrXmlDbMapper {

	public static Level2RelationshipRecord convertFromXmlToEntityObject(RelationshipRecordType relationshipRecord) {
		Level2RelationshipRecord entity = new Level2RelationshipRecord();

		entity.setRelationshipStartNodeId(relationshipRecord.getRelationship().getStartNode().getNodeID());
		entity.setRelationshipEndNodeId(relationshipRecord.getRelationship().getEndNode().getNodeID());
		entity.setRelationshipStartNodeType(relationshipRecord.getRelationship().getStartNode().getNodeIDType().name());
		entity.setRelationshipEndNodeType(relationshipRecord.getRelationship().getEndNode().getNodeIDType().name());
		entity.setRelationshipType(relationshipRecord.getRelationship().getRelationshipType().name());
		checkAndSetRelPeriodType(relationshipRecord.getRelationship().getRelationshipPeriods(), entity);
		entity.setRelationshipStatus(relationshipRecord.getRelationship().getRelationshipStatus().name());
		entity.setRegistrationInitialRegistrationDate(DateUtils
				.convertXmlGregorianCalToDate(relationshipRecord.getRegistration().getInitialRegistrationDate()));
		entity.setRegistrationLastUpdateDate(
				DateUtils.convertXmlGregorianCalToDate(relationshipRecord.getRegistration().getLastUpdateDate()));
		entity.setRegistrationStatus(relationshipRecord.getRegistration().getRegistrationStatus().name());
		entity.setRegistrationNextRenewalDate(
				DateUtils.convertXmlGregorianCalToDate(relationshipRecord.getRegistration().getNextRenewalDate()));
		entity.setRegistrationManagingLou(relationshipRecord.getRegistration().getManagingLOU());

		setRelationshipQuantifier(entity, relationshipRecord.getRelationship());
		setRelationshipQualifier(entity, relationshipRecord.getRelationship());

		entity.setValidationDocuments(relationshipRecord.getRegistration().getValidationDocuments().name());
		entity.setValidationReference(relationshipRecord.getRegistration().getValidationReference());
		entity.setValidationSources(relationshipRecord.getRegistration().getValidationSources().name());

		return entity;
	}

	private static void setRelationshipQuantifier(Level2RelationshipRecord entity,
			RelationshipContainerType relationship) {
		// TODO Auto-generated method stub
		entity.setLevel2RrRelationshipQuantifiers(new ArrayList<>());
		for (RelationshipQuantifiersType quantifiers : relationship.getRelationshipQuantifiers()) {

			for (RelationshipQuantifierType quantifier : quantifiers.getRelationshipQuantifier()) {
				Level2RrRelationshipQuantifier relationshipQuantifier = new Level2RrRelationshipQuantifier();

				if (quantifier != null) {
					if (quantifier.getQuantifierUnits() != null) {

						relationshipQuantifier.setQuantifierUnits(quantifier.getQuantifierUnits().value());
					}
					if (quantifier.getQuantifierAmount() != null) {
						relationshipQuantifier.setQuantifierAmount(quantifier.getQuantifierAmount().doubleValue());
					}
					if (quantifier.getMeasurementMethod() != null) {
						relationshipQuantifier.setMeasurementMethod(quantifier.getMeasurementMethod().name());
					}
					entity.getLevel2RrRelationshipQuantifiers().add(relationshipQuantifier);
					relationshipQuantifier.setLevel2RelationshipRecord(entity);
				}

			}

		}
	}

	private static void setRelationshipQualifier(Level2RelationshipRecord entity,
			RelationshipContainerType relationship) {
		// TODO Auto-generated method stub
		entity.setLevel2RrRelationshipQualifiers(new ArrayList<>());
		for (RelationshipQualifiersType qualifiers : relationship.getRelationshipQualifiers()) {

			for (RelationshipQualifierType qualifier : qualifiers.getRelationshipQualifier()) {
				Level2RrRelationshipQualifier relationshipQualifier = new Level2RrRelationshipQualifier();

				if (qualifier != null) {
					if (qualifier.getQualifierCategory() != null) {

						relationshipQualifier.setQualifierCategory(qualifier.getQualifierCategory().name());
					}
					if (qualifier.getQualifierDimension() != null) {
						relationshipQualifier.setQualifierDimension(qualifier.getQualifierDimension().name());
					}
					entity.getLevel2RrRelationshipQualifiers().add(relationshipQualifier);
					relationshipQualifier.setLevel2RelationshipRecord(entity);
				}

			}

		}
	}

	private static void checkAndSetRelPeriodType(RelationshipPeriodsType relationshipPeriods,
			Level2RelationshipRecord entity) {
		// TODO Auto-generated method stub

		if (relationshipPeriods != null && relationshipPeriods.getRelationshipPeriod() != null
				&& (!relationshipPeriods.getRelationshipPeriod().isEmpty())) {
			entity.setStartDate(DateUtils
					.convertXmlGregorianCalToDate(relationshipPeriods.getRelationshipPeriod().get(0).getStartDate()));
			entity.setEndDate(DateUtils
					.convertXmlGregorianCalToDate(relationshipPeriods.getRelationshipPeriod().get(0).getEndDate()));
			entity.setRelationshipPeriodType(relationshipPeriods.getRelationshipPeriod().get(0).getPeriodType().name());
		}

	}
}