create table if not exists interviewer
(interviewer_id int primary key, flexibility varchar(30), 
date_from
date, date_to date, from_time varchar(10), till_time varchar(10));

create table if not exists turbohire(record_id varchar(20) primary key,
applicant_name varchar(30), applicant_email varchar(40), job_stage varchar(20), 
evaluation_date_time varchar (20), interviewers varchar(30));