-- 18th April Activity

-- 1.To write a  Cursor to display the list of employees who are Working as a Managers or Analyst.

set serveroutput on;
DECLARE
      cursor c(jb varchar2) is select ename from emp where job=jb; 
em emp.job%type;
BEGIN
  open c('MANAGER');
    dbms_output.put_line(' Employees working as Manager are:');
  loop
  fetch c into em;
  exit when c%notfound;
  dbms_output.put_line(em);
  end loop;
  close c;

  open c('ANALYST');dbms_output.put_line(' Employees working as Analyst are:');
  loop
  fetch c into em;
  exit when c%notfound;
    dbms_output.put_line(em);
  end loop;
  close c;
END;
/


-- 2.Write PL/SQL code in Cursor to display employee names and salary

set serveroutput on;
declare
erec emp%rowtype;
    cursor mycur is select * from emp;
begin
    open mycur;
    loop
    fetch mycur into erec ;
    exit when mycur%NOTFOUND;    
    dbms_output.put_line(erec.ename || '     ' || erec.sal ); 
    end loop;
    close mycur;
end;
/


-- 3. Write PL/SQL code in Procedure to find the Reverse of the  number
declare
num NUMBER;
rev NUMBER;
  
BEGIN
    num:=&no;
    rev:=0;
    DBMS_OUTPUT.PUT_LINE('The substituted number is: ' || num);
    WHILE num>0
    LOOP
        rev:=(rev*10) + mod(num,10);
        num:=floor(num/10);
        END LOOP;
        DBMS_OUTPUT.PUT_LINE('Reverse of the number is: ' || rev);
END;
/

