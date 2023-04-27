set serveroutput on

create or replace package emppack
 as
       PROCEDURE UPD_SAL(p_job IN varchar2,p_min_sal IN number,p_max_sal IN number ) ;
       function GET_SERVICE_YR1(id in number) return number;
 end;
 /
 
create or replace package body emppack
as
          PROCEDURE UPD_SAL(p_job IN varchar2,p_min_sal IN number,p_max_sal IN number ) 
          IS
          BEGIN
            IF p_min_sal > p_max_sal THEN
              RAISE_APPLICATION_ERROR(-20001, 'Maximum salary cannot be less than minimum salary');
            END IF;
        
            UPDATE EMP SET SAL = LEAST(GREATEST(SAL, p_min_sal), p_max_sal) WHERE JOB = p_job;
        
            IF SQL%NOTFOUND THEN
              RAISE_APPLICATION_ERROR(-20002, 'Invalid job name: ' || p_job);
            END IF;
          EXCEPTION
            WHEN OTHERS THEN
              RAISE_APPLICATION_ERROR(-20003, 'Error updating salaries: ' || SQLERRM);
          END UPD_SAL;     
    
        function GET_SERVICE_YR1(id in number)
        return number
        is
        service1 number;
        begin
           select FLOOR((to_date(SYSDATE) - to_date(hiredate)) / 365) into service1 from bellemp where empno=id;
           return service1;
        exception
            when NO_DATA_FOUND then
                 dbms_output.put_line('Error from Procedure . Employee Number Does Not Exist :( ');
        end GET_SERVICE_YR1;
        
end;
/

EXECUTE DBMS_OUTPUT.PUT_LINE ('Approximately .... ' ||get_service_yr1(&id) || ' years')

variable v_job varchar2(20);
variable v_min number;
variable v_max number;
execute UPD_SAL('MANAGER', 500, 100);