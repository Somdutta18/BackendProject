;             
CREATE USER IF NOT EXISTS "SA" SALT '5c09b19b9b88c686' HASH '7f65fab4f8c8f188cc2eec789467a1627f347b2c29258dbf9ffa0fdc65f30b2a' ADMIN;         
CREATE CACHED TABLE "PUBLIC"."LOG_IN"(
    "ID" INTEGER NOT NULL,
    "DESIGNATION" VARCHAR(255),
    "EMAIL" VARCHAR(255),
    "NAME" VARCHAR(255),
    "PASSWORD" VARCHAR(255)
);     
ALTER TABLE "PUBLIC"."LOG_IN" ADD CONSTRAINT "PUBLIC"."CONSTRAINT_8" PRIMARY KEY("ID");       
-- 8 +/- SELECT COUNT(*) FROM PUBLIC.LOG_IN;  
INSERT INTO "PUBLIC"."LOG_IN" VALUES
(1, 'Interviwer', 'neha@accolitedigital.com', 'Neha Jain', '1234'),
(2, 'Interviwer', 'muskan.singh@accolitedigital.com', 'Muskan Singh', '2345'),
(3, 'Interviwer', 'somdutta.mitra@accolitedigital.com', 'Somdutta Mitra', '3456'),
(4, 'Interviwer', 'dhawal.dadarao@accolitedigital.com', 'Dhawal Dadarao', '4567'),
(5, 'Hr', 'pradyumn.gupta@accolitedigital.com', 'Pradyumn Gupta', '5678'),
(6, 'Hr', 'bhushan.onkar@accolitedigital.com', 'Bhusan Bisen', '6789'),
(7, 'Hr', 'raj.awate@accolitedigital.com', 'Raj Awate', '7890'),
(8, 'Hr', 'ashutosh.chauhan@accolitedigital.com', 'Ashutosh Chauhan', '8900');      
