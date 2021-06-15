
select * from employee


select 
EMPLOYEE.empno, employee.ename, 
employee.sal, department.dept,
department.dname
from 
employee, department
where 
department.dept=employee.dept


