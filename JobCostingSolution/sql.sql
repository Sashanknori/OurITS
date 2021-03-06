create schema JOBCOSTING;


CREATE TABLE JOBCOSTING.PROJECT_IDENTIFIER (
PROJECT_ID VARCHAR(10) NOT NULL,
PROJECT_NAME VARCHAR(50) NOT NULL,
PROJECT_DESC VARCHAR(200),
PROJECT_STRT_DATE DATE NOT NULL,
PROJECT_END_DATE DATE NOT NULL,
PROJECT_BUDGET_AMT DECIMAL(12,2) NOT NULL,
PROJECT_AMOUNT_CURRENCY VARCHAR(5) NOT NULL,
PROJECT_REVISED_STRT_DATE DATE ,
PROJECT_REVISED_END_DATE DATE ,
PROJECT_REVISED_BUDGET_AMT DECIMAL(12,2) ,
PROJECT_REVISED_AMOUNT_CURRENCY VARCHAR(5),
LAST_MODIFIED_DATE TIMESTAMP NOT NULL,
CREATION_TIME TIMESTAMP NOT NULL,
PRIMARY KEY (PROJECT_ID,PROJECT_NAME)
);


CREATE TABLE JOBCOSTING.SUB_PROJECT_IDENTIFIER (
PROJECT_ID VARCHAR(10) NOT NULL,
PROJECT_NAME VARCHAR(50) NOT NULL,
SUB_PROJECT_ID VARCHAR(10) NOT NULL,
SUB_PROJECT_NAME VARCHAR(50) NOT NULL,
SUB_PROJECT_DESC VARCHAR(200),
PERCENTAGE_COMPLETION DECIMAL(5,2) NOT NULL,
CONTRACTOR VARCHAR(50) NOT NULL,
SUB_PROJECT_STRT_DATE DATE NOT NULL,
SUB_PROJECT_END_DATE DATE NOT NULL,
SUB_PROJECT_BUDGET_AMT DECIMAL(12,2) NOT NULL,
SUB_PROJECT_AMOUNT_CURRENCY VARCHAR(5) NOT NULL,
SUB_PROJECT_REVISED_STRT_DATE DATE ,
SUB_PROJECT_REVISED_END_DATE DATE ,
SUB_PROJECT_REVISED_BUDGET_AMT DECIMAL(12,2) ,
SUB_PROJECT_REVISED_AMOUNT_CURRENCY VARCHAR(5),
LAST_MODIFIED_DATE TIMESTAMP NOT NULL,
CREATION_TIME TIMESTAMP NOT NULL,
PRIMARY KEY (PROJECT_ID,PROJECT_NAME,SUB_PROJECT_ID,SUB_PROJECT_NAME)
);



CREATE TABLE JOBCOSTING.TASK_DENTIFIER (
PROJECT_ID VARCHAR(10) NOT NULL,
PROJECT_NAME VARCHAR(50) NOT NULL,
SUB_PROJECT_ID VARCHAR(10) NOT NULL,
SUB_PROJECT_NAME VARCHAR(50) NOT NULL,
TASK_ID VARCHAR(10) NOT NULL,
TASK_NAME VARCHAR(50) NOT NULL,
PERCENTAGE_COMPLETION DECIMAL(5,2) NOT NULL,
TASK_STRT_DATE DATE NOT NULL,
TASK_END_DATE DATE NOT NULL,
TASK_REVISED_STRT_DATE DATE ,
TASK_REVISED_END_DATE DATE ,
LAST_MODIFIED_DATE TIMESTAMP NOT NULL,
CREATION_TIME TIMESTAMP NOT NULL,
PRIMARY KEY (PROJECT_ID,PROJECT_NAME,SUB_PROJECT_ID,SUB_PROJECT_NAME,TASK_ID,TASK_NAME)
);

ALTER TABLE JOBCOSTING.SUB_PROJECT_IDENTIFIER ADD CONSTRAINT PROJECT_SUBPROJECT_FK FOREIGN KEY (PROJECT_ID,PROJECT_NAME)
REFERENCES JOBCOSTING.PROJECT_IDENTIFIER (PROJECT_ID,PROJECT_NAME);

ALTER TABLE JOBCOSTING.TASK_DENTIFIER ADD CONSTRAINT PROJECT_TASK_FK FOREIGN KEY (PROJECT_ID,PROJECT_NAME,SUB_PROJECT_ID,SUB_PROJECT_NAME)
REFERENCES JOBCOSTING.SUB_PROJECT_IDENTIFIER  (PROJECT_ID,PROJECT_NAME,SUB_PROJECT_ID,SUB_PROJECT_NAME);