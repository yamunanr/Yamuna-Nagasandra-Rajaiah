DROP INDEX IDX_Level1_Lei;
DROP INDEX IDX_Level1_Lei_legal_name;
DROP INDEX IDX_Level1_Lei_legal_name_country;


CREATE INDEX IDX_Level1_Lei ON Level1_Lei_Record (LEI);
CREATE INDEX IDX_Level1_Lei_legal_name ON Level1_Lei_Record (E_LEGAL_NAME_TYPE_VALUE);
CREATE INDEX IDX_Level1_Lei_legal_name_country ON Level1_Lei_Record (E_LEGAL_NAME_TYPE_VALUE,E_HQ_COUNTRY);