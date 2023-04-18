13 April 2023



7. Display all the details of the emps whose Comm. Is more than their Sal.

select * from emp where comm>sal

8. List the emps along with their Exp and whose Daily Sal is more than Rs. 100.

select ename,job,deptno,sal from emp where (sal/30) >100

9. List the emps who are working for the Deptno 10 or 20.

select empno,ename,job,mgr,deptno,sal from emp where deptno in(10,20) --deptno=10 or deptno=20