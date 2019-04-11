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
LEI varchar(21) NOT NULL,
Entity_Type_Legal_Name_Name_Type varchar(500),
Entity_Type_Legal_Name_Name_Type_Lang varchar(500),
Entity_Type_Other_Entity_Names_Type  varchar(500),
Entity_Type_Transliterated_Other_Entity_Names_Type varchar(500),
Entity_Type_Legal_Address_First_Address_Line varchar(500),
Entity_Type_Legal_Address_Address_Number varchar(500),
Entity_Type_Legal_Address_Address_Number_Within_Building varchar(500),
Entity_Type_Legal_Address_Mail_Routing varchar(500),
Entity_Type_Legal_Address_Additional_Address_Line varchar(500),
Entity_Type_Legal_Address_City varchar(500),
Entity_Type_Legal_Address_Region varchar(500),
Entity_Type_Legal_Address_country varchar(500),
Entity_Type_Legal_Address_postalCode varchar(500),
Entity_Type_Legal_Address_lang varchar(500),
HQ_First_Address_Line varchar(500),
HQ_Address_Number varchar(500),
HQ_AddressNumber_Within_Building varchar(500),
HQ_Mail_Routing varchar(500),
HQ_Additional_Address_Line varchar(500),
HQ_City varchar(500),
HQ_Region varchar(10),
HQ_Country varchar(10),
HQ_Postal_Code varchar(500),
HQ_lang varchar(10),
L_First_Address_Line_1 varchar(500),
L_Address_Number_2 varchar(500),
L_City_1 varchar(500),
L_Region_1  varchar(10),
L_Country_1 varchar(10),
L_PostalCode_1 varchar(500),
L_Lang_1 varchar(10),
Legal_Form_Type_Entity_Legal_Form_Code varchar(500),
Legal_Form_Type_Other_Legal_Form varchar(500),
O_First_Address_Line_1 varchar(500),
O_Address_Number_2 varchar(500),
O_Address_Number_Within_Building_1 varchar(500),
O_Mail_Routing_1 varchar(500),
O_Additional_Address_Number_Line_1  varchar(500),
O_Additional_Address_Number_2 varchar(500),
O_Additional_Address_Number_Within_Building_1 varchar(500),
O_City_1 varchar(500),
O_Region_1  varchar(10),
O_Country_1 varchar(10),
O_PostalCode_1 varchar(500),
O_Lang_1 varchar(10),
O_Type  varchar(10),
Associated_LEI_ID varchar(20),
LEI_Type varchar(20),
Legal_Jurisdiction varchar(500),
Entity_Category_Value varchar(500),
Entity_Status varchar(500),
Entity_Expiration_Date Date,
Entity_Expiration_Reason varchar(500),
Entity_Legal_Form_Code varchar(500),
Other_Legal_Form varchar(500),
Initial_Registration_Date  Date,
Last_Update_Date Date,
Registration_Status varchar(500),
Next_Renewal_Date Date,
Managing_LOU varchar(20),
Validation_Sources varchar(500),
Registration_Authority_ID varchar(500),
Other_Registration_Authority_ID varchar(500),
Registration_Authority_Entity_ID varchar(500),
Successor_LEI varchar(20),
TO_First_Address_Line_1 varchar(500),
TO_Address_Number_2 varchar(500),
TO_Address_Number_Within_Building_1 varchar(500),
TO_Mail_Routing_1 varchar(500),
TO_Additional_Address_Number_Line_1  varchar(500),
TO_Additional_Address_Number_2 varchar(500),
TO_Additional_Address_Number_Within_Building_1 varchar(500),
TO_City_1 varchar(500),
TO_Region_1  varchar(10),
TO_Country_1 varchar(10),
TO_PostalCode_1 varchar(500),
TO_Lang_1 varchar(10),
TO_Type  varchar(10),
Associated_Entity_Type_Associated_LEI varchar(500),
Associated_Entity_Type_Associated_Entity_Name varchar(500),
Associated_Entity_Type_Associated_Entity_Type_Enum varchar(500),
Successor_Entity_Type_Successor_LEI varchar(500),
Successor_Entity_Type_Successor_Entity_Name_Value varchar(500),
Successor_Entity_Type_Successor_Entity_Name_Lang varchar(500),
Entity_Next_Version_Type_Any varchar(500),
Validation_Authority_Type_Validation_Authority_ID varchar(500),
Validation_Authority_Type_Other_Validation_Authority_ID varchar(500),
Validation_Authority_Type_Validation_Authority_Entity_ID varchar(500),
Other_Validation_Authorities_Type varchar(500),
Registration_Next_Version_Type varchar(500),
LEI_Record_Next_Version_Type varchar(500),
Extension_Type varchar(500),
Primary key (LEI));


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
Relationship_Status varchar(10),
Relationship_Relationship_Type varchar(20),
Relationship_Start_Node_ID varchar(500),
Relationship_Start_Node_Type varchar(500),
Relationship_End_Node_ID  varchar(500),
Relationship_End_Node_Type varchar(500),
Registration_Initial_Registration_Date Date,
Registration_Last_Update_Date  Date,
Registration_Status varchar(20),
Validation_Sources varchar(30),
Validation_Documents varchar(30),
Start_Date Date,
End_Date Date,
Managing_LOU varchar(20),
Relationship_Period_Type varchar(10),
Validation_Reference varchar(10),
Relationship_Next_Version_Type varchar(500),
Extension_Type varchar(500),
Registration_Next_Renewal_Date Date,
Registration_Managing_LOU varchar(500),
Registration_Next_Version_Type varchar(500),
Relationship_Record_Next_Version_Type varchar(500),
Primary key(RR_ID),
Foreign key (Relationship_Start_Node_ID) references Level1_Lei_Record(LEI)
);

Create table Level2_Rr_Relationship_Qualifier(
Qualifier_RR_ID INTEGER NOT NULL,
RR_ID INTEGER, 
Qualifier_Dimension varchar(500),
Qualifier_Category varchar(500),
Primary key(Qualifier_RR_ID),
FOREIGN KEY (RR_ID) REFERENCES Level2_Relationship_Record(RR_ID));

Create table Level2_Rr_Relationship_Quantifier (
Quantifier_RR_ID INTEGER NOT NULL,
RR_ID INTEGER,
Measurement_Method varchar(100),
Quantifier_Amount INTEGER,
Quantifier_Units INTEGER,
Primary key(Quantifier_RR_ID),
FOREIGN KEY (RR_ID) REFERENCES Level2_Relationship_Record(RR_ID));


CREATE SEQUENCE GLEIF_HEADER_SEQ INCREMENT BY 1 MAXVALUE 99999 RESET BY SELECT IFNULL(MAX(GLEIF_HEADER_ID), 0) + 1 FROM GLEIF_HEADER;

CREATE SEQUENCE LEVEL2_EXCEPTION_REASON_SEQ INCREMENT BY 1000 MAXVALUE 9999999999 RESET BY SELECT IFNULL(MAX(EXCEPTION_REASON_ID), 0) + 1 FROM LEVEL2_EXCEPTION_REASON;

CREATE SEQUENCE LEVEL2_EXCEPTION_REFERENCE_SEQ INCREMENT BY 1000 MAXVALUE 9999999999 RESET BY SELECT IFNULL(MAX(EXCEPTION_REFERENCE_ID), 0) + 1 FROM LEVEL2_EXCEPTION_REFERENCE;

CREATE SEQUENCE LEVEL2_RELATIONSHIP_RECORD_SEQ INCREMENT BY 1000 MAXVALUE 9999999999 RESET BY SELECT IFNULL(MAX(RR_ID), 0) + 1 FROM LEVEL2_RELATIONSHIP_RECORD;

CREATE SEQUENCE LEVEL2_REPORTING_EXCEPTION_SEQ INCREMENT BY 1000 MAXVALUE 9999999999 RESET BY SELECT IFNULL(MAX(EXCEPTION_ID), 0) + 1 FROM LEVEL2_REPORTING_EXCEPTION;

CREATE SEQUENCE LEVEL2_RR_RELATIONSHIP_QUALIFIER_SEQ INCREMENT BY 1000 MAXVALUE 9999999999 RESET BY SELECT IFNULL(MAX(QUALIFIER_RR_ID), 0) + 1 FROM LEVEL2_RR_RELATIONSHIP_QUALIFIER;

CREATE SEQUENCE LEVEL2_RR_RELATIONSHIP_QUANTIFIER_SEQ INCREMENT BY 1000 MAXVALUE 9999999999 RESET BY SELECT IFNULL(MAX(QUANTIFIER_RR_ID), 0) + 1 FROM LEVEL2_RR_RELATIONSHIP_QUANTIFIER;





