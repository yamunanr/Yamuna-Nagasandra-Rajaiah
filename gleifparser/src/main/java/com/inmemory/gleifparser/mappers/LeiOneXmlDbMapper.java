package com.inmemory.gleifparser.mappers;

import com.inmemory.gleifparser.entity.Level1leirecord;
import com.inmemory.gleifparser.model.level1.EntityType;
import com.inmemory.gleifparser.model.level1.LEIRecordType;

public class LeiOneXmlDbMapper {

	public Level1leirecord convertXmlToDbMapper(LEIRecordType leiRecordType) {
		Level1leirecord level1leirecord=new Level1leirecord();
		
		convertEntity(leiRecordType.getEntity(), level1leirecord);
		
		return level1leirecord;
		
	}

	private void convertEntity(EntityType entity, Level1leirecord level1leirecord) {
		level1leirecord.setHqFirstaddressLine(entity.getHeadquartersAddress().getFirstAddressLine());
		level1leirecord.setHqAddressNumber(entity.getHeadquartersAddress().getAddressNumber());
		level1leirecord.setHqAddressnumberWithinBuilding(entity.getHeadquartersAddress().getAddressNumberWithinBuilding());
		level1leirecord.setHqMailrouting(entity.getHeadquartersAddress().getMailRouting());
		level1leirecord.setHqCity(entity.getHeadquartersAddress().getCity());
		level1leirecord.setHqRegion(entity.getHeadquartersAddress().getRegion());
		level1leirecord.setHqCountry(entity.getHeadquartersAddress().getCountry());
		level1leirecord.setHqPostalCode(entity.getHeadquartersAddress().getPostalCode());
		level1leirecord.setHqLang(entity.getHeadquartersAddress().getLang());
		level1leirecord.setLFirstaddressline1(entity.getLegalAddress().getFirstAddressLine());
		level1leirecord.setLAddressnumber2(entity.getLegalAddress().getAddressNumber());
		level1leirecord.setLCity1(entity.getLegalAddress().getCity());
		level1leirecord.setLRegion1(entity.getLegalAddress().getRegion());
		level1leirecord.setLCountry1(entity.getLegalAddress().getCountry());
		level1leirecord.setLPostalcode1(entity.getLegalAddress().getPostalCode());
		level1leirecord.setLLang1(entity.getLegalAddress().getLang());
		level1leirecord.setAssociatedLeiId(entity.getAssociatedEntity().getAssociatedLEI());
		level1leirecord.setLegalJurisdiction(entity.getLegalJurisdiction());
		level1leirecord.setOtherLegalForm(entity.getLegalForm().getOtherLegalForm());
		level1leirecord.setRegistrationAuthorityId(entity.getRegistrationAuthority().getRegistrationAuthorityID());
		level1leirecord.setRegistrationAuthorityentityId(entity.getRegistrationAuthority().getRegistrationAuthorityEntityID());
		level1leirecord.setSuccessorLei(entity.getSuccessorEntity().getSuccessorLEI());
	}
	
}
