create table department
(dept     char(4)       not null,
 dname    nvarchar2(20),
 loc      nvarchar2(20),   
 constraint pk primary key (dept)
);

comment on table department is '부서정보 관리';

comment on column department.dept is '부서코드';
comment on column department.dname is '부서명';
comment on column department.loc is '부서위치';

create index NOT NULL on department(dname);