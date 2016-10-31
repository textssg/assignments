--------------------------------------------------------
--  File created - Saturday-October-29-2016   
--------------------------------------------------------
--------------------------------------------------------
--  DDL for Table CALL_RECORDS
--------------------------------------------------------

  CREATE TABLE "VIVEK"."CALL_RECORDS" 
   (	"CALL_ID" NUMBER, 
	"CUSTOMER_ID" NUMBER, 
	"PLAN_NAME" VARCHAR2(30 BYTE), 
	"PLAN_ID" NUMBER, 
	"FROM_MOBILE_NUMBER" NUMBER, 
	"TO_MOBILE_NUMBER" NUMBER, 
	"FROM_DATE_AND_TIME" TIMESTAMP (6), 
	"TO_DATE_AND_TIME" TIMESTAMP (6), 
	"DURATION" NUMBER, 
	"CALL_TYPE" VARCHAR2(30 BYTE), 
	"CALL_DETAIL" VARCHAR2(30 BYTE)
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM" ;
--------------------------------------------------------
--  DDL for Index CALL_RECORDS_PK
--------------------------------------------------------

  CREATE UNIQUE INDEX "VIVEK"."CALL_RECORDS_PK" ON "VIVEK"."CALL_RECORDS" ("CALL_ID") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM" ;
--------------------------------------------------------
--  Constraints for Table CALL_RECORDS
--------------------------------------------------------

  ALTER TABLE "VIVEK"."CALL_RECORDS" ADD CONSTRAINT "CALL_RECORDS_PK" PRIMARY KEY ("CALL_ID")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM"  ENABLE;
--------------------------------------------------------
--  Ref Constraints for Table CALL_RECORDS
--------------------------------------------------------

  ALTER TABLE "VIVEK"."CALL_RECORDS" ADD CONSTRAINT "CALL_RECORDS_FK" FOREIGN KEY ("CUSTOMER_ID")
	  REFERENCES "VIVEK"."CUSTOMER" ("CUSTOMER_ID") ON DELETE CASCADE ENABLE;
  ALTER TABLE "VIVEK"."CALL_RECORDS" ADD CONSTRAINT "CALL_RECORDS_FK2" FOREIGN KEY ("PLAN_ID")
	  REFERENCES "VIVEK"."TARIFF" ("PLAN_ID") ENABLE;
--------------------------------------------------------
--  DDL for Trigger BI_CALL_RECORDS
--------------------------------------------------------

  CREATE OR REPLACE TRIGGER "VIVEK"."BI_CALL_RECORDS" 
  before insert on "CALL_RECORDS"               
  for each row  
begin   
    select "CALL_ID_SEQ".nextval into :NEW.CALL_ID from dual; 
end;
/
ALTER TRIGGER "VIVEK"."BI_CALL_RECORDS" ENABLE;