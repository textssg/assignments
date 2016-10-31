--------------------------------------------------------
--  File created - Saturday-October-29-2016   
--------------------------------------------------------
--------------------------------------------------------
--  DDL for Table BILL
--------------------------------------------------------

  CREATE TABLE "VIVEK"."BILL" 
   (	"BILL_ID" NUMBER, 
	"CUSTOMER_ID" NUMBER, 
	"BILLING_DATE_AND_TIME" TIMESTAMP (6), 
	"BILLING_PERIOD_START_DATE_TIME" TIMESTAMP (6), 
	"BILLING_PERIOD_END_DATE_TIME" TIMESTAMP (6), 
	"CALL_COST" BINARY_DOUBLE, 
	"SMS_COST" BINARY_DOUBLE, 
	"SERVICE_TAX_PERCENTAGE" BINARY_DOUBLE, 
	"TAX_AND_SURCHARGES" BINARY_DOUBLE, 
	"TOTAL_COST" BINARY_DOUBLE
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM" ;
--------------------------------------------------------
--  DDL for Index BILL_PK
--------------------------------------------------------

  CREATE UNIQUE INDEX "VIVEK"."BILL_PK" ON "VIVEK"."BILL" ("BILL_ID") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM" ;
--------------------------------------------------------
--  Constraints for Table BILL
--------------------------------------------------------

  ALTER TABLE "VIVEK"."BILL" ADD CONSTRAINT "BILL_PK" PRIMARY KEY ("BILL_ID")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM"  ENABLE;
--------------------------------------------------------
--  Ref Constraints for Table BILL
--------------------------------------------------------

  ALTER TABLE "VIVEK"."BILL" ADD CONSTRAINT "BILL_FK" FOREIGN KEY ("CUSTOMER_ID")
	  REFERENCES "VIVEK"."CUSTOMER" ("CUSTOMER_ID") ON DELETE CASCADE ENABLE;
--------------------------------------------------------
--  DDL for Trigger BI_BILL
--------------------------------------------------------

  CREATE OR REPLACE TRIGGER "VIVEK"."BI_BILL" 
  before insert on "BILL"               
  for each row  
begin   
    select "BILL_SEQ".nextval into :NEW.BILL_ID from dual; 
end;
/
ALTER TRIGGER "VIVEK"."BI_BILL" ENABLE;
