--------------------------------------------------------
--  File created - Saturday-October-29-2016   
--------------------------------------------------------
--------------------------------------------------------
--  DDL for Table CUSTOMER
--------------------------------------------------------

  CREATE TABLE "VIVEK"."CUSTOMER" 
   (	"CUSTOMER_ID" NUMBER, 
	"MOBILE_NUMBER" NUMBER, 
	"PLAN_NAME" VARCHAR2(30 BYTE), 
	"NAME" VARCHAR2(30 BYTE), 
	"ADDRESS" VARCHAR2(30 BYTE), 
	"PINCODE" NUMBER, 
	"SUBSCRIPTION_STATUS" VARCHAR2(30 BYTE), 
	"ACTIVATION_DATE_TIME" TIMESTAMP (6), 
	"DEACTIVATION_DATE_TIME" TIMESTAMP (6)
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM" ;
--------------------------------------------------------
--  DDL for Index CUSTOMER_PK
--------------------------------------------------------

  CREATE UNIQUE INDEX "VIVEK"."CUSTOMER_PK" ON "VIVEK"."CUSTOMER" ("CUSTOMER_ID") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM" ;
--------------------------------------------------------
--  Constraints for Table CUSTOMER
--------------------------------------------------------

  ALTER TABLE "VIVEK"."CUSTOMER" ADD CONSTRAINT "CUSTOMER_PK" PRIMARY KEY ("CUSTOMER_ID")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM"  ENABLE;
--------------------------------------------------------
--  Ref Constraints for Table CUSTOMER
--------------------------------------------------------

  ALTER TABLE "VIVEK"."CUSTOMER" ADD CONSTRAINT "CUSTOMER_PLAN_NAME_FK" FOREIGN KEY ("PLAN_NAME")
	  REFERENCES "VIVEK"."TARIFF_PLAN_NAME" ("PLAN_NAME") ENABLE;
--------------------------------------------------------
--  DDL for Trigger CUSTOMER_TRIGGER
--------------------------------------------------------

  CREATE OR REPLACE TRIGGER "VIVEK"."CUSTOMER_TRIGGER" 
   before insert on "CUSTOMER" 
   for each row 
begin  
   if inserting then 
      if :NEW."CUSTOMER_ID" is null then 
         select CUSTOMER_SEQ.nextval into :NEW."CUSTOMER_ID" from dual; 
      end if; 
   end if; 
end;
/
ALTER TRIGGER "VIVEK"."CUSTOMER_TRIGGER" ENABLE;
