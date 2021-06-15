create table department
(dept     char(4)       not null,
 dname    nvarchar2(20),
 loc      nvarchar2(20),   
 constraint pk primary key (dept)
);

comment on table department is '�μ����� ����';

comment on column department.dept is '�μ��ڵ�';
comment on column department.dname is '�μ���';
comment on column department.loc is '�μ���ġ';

create index NOT NULL on department(dname);