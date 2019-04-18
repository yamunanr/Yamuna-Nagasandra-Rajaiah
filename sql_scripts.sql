DROP TABLE GLEIF_HEADER;
DROP TABLE LEVEL2_Rr_RELATIONSHIP_QUALIFIER;
DROP TABLE LEVEL2_RR_RELATIONSHIP_QUANTIFIER;
DROP TABLE LEVEL2_RELATIONSHIP_RECORD;
DROP TABLE LEVEL2_EXCEPTION_REFERENCE;
DROP TABLE LEVEL2_EXCEPTION_REASON;
DROP TABLE LEVEL2_REPORTING_EXCEPTION;
DROP TABLE LEVEL1_LEI_RECORD;


DROP SEQUENCE GLEIF_HEADER_SEQ;

DROP SEQUENCE LEVEL2_EXCEPTION_REASON_SEQ;

DROP SEQUENCE LEVEL2_EXCEPTION_REFERENCE_SEQ;

DROP SEQUENCE LEVEL2_RELATIONSHIP_RECORD_SEQ;

DROP SEQUENCE LEVEL2_REPORTING_EXCEPTION_SEQ;

DROP SEQUENCE LEVEL2_RR_RELATIONSHIP_QUALIFIER_SEQ;

DROP SEQUENCE LEVEL2_RR_RELATIONSHIP_QUANTIFIER_SEQ;


Create table Gleif_Header(
Gleif_Header_Id NUMBER(5) NOT NULL,
Content_Date Date,
Originator varchar(21),
File_Content  varchar(30),
Delta_Start Date NULL,
Record_Count INTEGER,
PRIMARY KEY(Gleif_Header_Id));


Create table Level1_Lei_Record (
LEI_ID INTEGER NOT NULL,
LEI varchar(21) NOT NULL,
E_Legal_Name_Type_Value varchar(500),
E_Legal_Name_Type_Lang varchar(500),
E_Other_Entity_Names_Type  varchar(500),
E_Transliterated_Other_Entity_Names_Type varchar(500),
E_Legal_Address_First_Address_Line varchar(500),
E_Legal_Address_Address_Number varchar(500),
E_Legal_Address_Address_Number_Within_Building varchar(500),
E_Legal_Address_Mail_Routing varchar(500),
E_Legal_Address_Additional_Address_Line_1 varchar(500),
E_Legal_Address_Additional_Address_Line_2 varchar(500),
E_Legal_Address_Additional_Address_Line_3 varchar(500),
E_Legal_Address_City varchar(500),
E_Legal_Address_Region varchar(500),
E_Legal_Address_Country varchar(500),
E_Legal_Address_PostalCode varchar(500),
E_Legal_Address_Lang varchar(500),
E_HQ_First_Address_Line varchar(500),
E_HQ_Address_Number varchar(500),
E_HQ_AddressNumber_Within_Building varchar(500),
E_HQ_Mail_Routing varchar(500),
E_HQ_Additional_Address_Line_1 varchar(500),
E_HQ_Additional_Address_Line_2 varchar(500),
E_HQ_Additional_Address_Line_3 varchar(500),
E_HQ_City varchar(500),
E_HQ_Region varchar(100),
E_HQ_Country varchar(100),
E_HQ_Postal_Code varchar(500),
E_HQ_Lang varchar(100),
E_O_First_Address_Line varchar(500),
E_O_Address_Number varchar(500),
E_O_Address_Number_Within_Building varchar(500),
E_O_Mail_Routing_1 varchar(500),
E_O_Additional_Address_Line_1  varchar(500),
E_O_Additional_Address_Line_2  varchar(500),
E_O_Additional_Address_Line_3 varchar(500),
E_O_Additional_Address_Number varchar(500),
E_O_City varchar(500),
E_O_Region  varchar(100),
E_O_Country varchar(100),
E_O_PostalCode varchar(500),
E_O_Lang varchar(100),
E_O_Address_Type  varchar(100),
E_TO_First_Address_Line varchar(500),
E_TO_Address_Number varchar(500),
E_TO_Address_Number_Within_Building varchar(500),
E_TO_Mail_Routing varchar(500),
E_TO_Additional_Address_Line_1  varchar(500),
E_TO_Additional_Address_Line_2 varchar(500),
E_TO_Additional_Address_Line_3 varchar(500),
E_TO_City varchar(500),
E_TO_Region  varchar(100),
E_TO_Country varchar(100),
E_TO_PostalCode varchar(500),
E_TO_Lang varchar(100),
E_TO_Address_Type  varchar(100),
E_Registration_Authority_ID varchar(500),
E_Other_Registration_Authority_ID varchar(500),
E_Registration_Authority_Entity_ID varchar(500),
E_Legal_Jurisdiction varchar(500),
E_Category_Type varchar(500),
E_Entity_Legal_Form_Code varchar(500),
E_Other_Legal_Form varchar(500),
E_Associated_LEI varchar(500),
E_Associated_Entity_Name varchar(500),
E_Associated_Entity_Type varchar(500),
E_Entity_Status varchar(500),
E_Entity_Expiration_Date Date,
E_Entity_Expiration_Reason varchar(500),
E_Successor_LEI varchar(500),
E_Successor_Entity_Name varchar(500),
R_Initial_Registration_Date  Date,
R_Last_Update_Date Date,
R_Registration_Status varchar(500),
R_Next_Renewal_Date Date,
R_Managing_LOU varchar(100),
R_Validation_Sources varchar(500),
R_Validation_Authority_ID varchar(500),
R_Other_Validation_Authority_ID varchar(500),
R_Validation_Authority_Entity_ID varchar(500),
Primary key (LEI_ID));


Create table Level2_Reporting_Exception (
LEI varchar(21),
Exception_ID INTEGER NOT NULL,
Exception_Category varchar(500),
Next_Version_Type varchar(500),
Exception_Type_any varchar(500),
Primary key(Exception_ID));




Create table Level2_Exception_Reference (
Exception_Reference_ID INTEGER NOT NULL,
Exception_ID INTEGER NOT NULL,
Exception_Reference varchar(2000),
Primary key(Exception_Reference_ID),
FOREIGN KEY (Exception_ID) REFERENCES Level2_Reporting_Exception(Exception_ID));

Create table Level2_Exception_Reason (
Exception_Reason_ID INTEGER NOT NULL,
Exception_ID INTEGER NOT NULL,
Exception_Reason varchar(1000),
Primary key(Exception_Reason_ID),
FOREIGN KEY (Exception_ID) REFERENCES Level2_Reporting_Exception(Exception_ID));


Create table Level2_Relationship_Record(
RR_ID INTEGER,
Relationship_Status varchar(100),
Relationship_Type varchar(100),
Relationship_Start_Node_ID varchar(500),
Relationship_Start_Node_Type varchar(500),
Relationship_End_Node_ID  varchar(500),
Relationship_End_Node_Type varchar(500),
Registration_Initial_Registration_Date Date,
Registration_Last_Update_Date  Date,

Registration_Status varchar(100),
Validation_Sources varchar(100),
Validation_Documents varchar(300),
Start_Date Date,
End_Date Date,
Relationship_Period_Type varchar(100),
Validation_Reference varchar(600),
Registration_Next_Renewal_Date Date,
Registration_Managing_LOU varchar(500),
Primary key(RR_ID)
--Foreign key (Relationship_Start_Node_ID) references Level1_Lei_Record(LEI)
);

Create table Level2_Rr_Relationship_Qualifier(
Qualifier_RR_ID INTEGER NOT NULL,
RR_ID INTEGER, 
Qualifier_Dimension varchar(500),
Qualifier_Category varchar(500),
Primary key(Qualifier_RR_ID),
FOREIGN KEY (RR_ID) REFERENCES Level2_Relationship_Record(RR_ID)
);

Create table Level2_Rr_Relationship_Quantifier (
Quantifier_RR_ID INTEGER NOT NULL,
RR_ID INTEGER,
Measurement_Method varchar(100),
Quantifier_Amount DECIMAL,
Quantifier_Units VARCHAR(100),
Primary key(Quantifier_RR_ID),
FOREIGN KEY (RR_ID) REFERENCES Level2_Relationship_Record(RR_ID));




CREATE SEQUENCE GLEIF_HEADER_SEQ INCREMENT BY 1 MAXVALUE 99999 RESET BY SELECT IFNULL(MAX(GLEIF_HEADER_ID), 0) + 1 FROM GLEIF_HEADER;


CREATE SEQUENCE LEVEL1_LEI_RECORD_SEQ INCREMENT BY 1000 MAXVALUE 9999999999 RESET BY SELECT IFNULL(MAX(LEI_ID), 0) + 1 FROM LEVEL1_LEI_RECORD;

CREATE SEQUENCE LEVEL2_EXCEPTION_REASON_SEQ INCREMENT BY 1000 MAXVALUE 9999999999 RESET BY SELECT IFNULL(MAX(EXCEPTION_REASON_ID), 0) + 1 FROM LEVEL2_EXCEPTION_REASON;

CREATE SEQUENCE LEVEL2_EXCEPTION_REFERENCE_SEQ INCREMENT BY 1000 MAXVALUE 9999999999 RESET BY SELECT IFNULL(MAX(EXCEPTION_REFERENCE_ID), 0) + 1 FROM LEVEL2_EXCEPTION_REFERENCE;

CREATE SEQUENCE LEVEL2_RELATIONSHIP_RECORD_SEQ INCREMENT BY 1000 MAXVALUE 9999999999 RESET BY SELECT IFNULL(MAX(RR_ID), 0) + 1 FROM LEVEL2_RELATIONSHIP_RECORD;

CREATE SEQUENCE LEVEL2_REPORTING_EXCEPTION_SEQ INCREMENT BY 1000 MAXVALUE 9999999999 RESET BY SELECT IFNULL(MAX(EXCEPTION_ID), 0) + 1 FROM LEVEL2_REPORTING_EXCEPTION;

CREATE SEQUENCE LEVEL2_RR_RELATIONSHIP_QUALIFIER_SEQ INCREMENT BY 1000 MAXVALUE 9999999999 RESET BY SELECT IFNULL(MAX(QUALIFIER_RR_ID), 0) + 1 FROM LEVEL2_RR_RELATIONSHIP_QUALIFIER;

CREATE SEQUENCE LEVEL2_RR_RELATIONSHIP_QUANTIFIER_SEQ INCREMENT BY 1000 MAXVALUE 9999999999 RESET BY SELECT IFNULL(MAX(QUANTIFIER_RR_ID), 0) + 1 FROM LEVEL2_RR_RELATIONSHIP_QUANTIFIER;





