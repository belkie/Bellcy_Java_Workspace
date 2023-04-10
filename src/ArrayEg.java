import java.io.*;
import static java.lang.Math.*;

class Employee1
{
	
     private int eno;
	 private String ename;
		 
	 public Employee1()
	 {		 
		 System.out.println("From Employee Constructor");
	 }
	 
	 public Employee1(int eno,String ename)
	 {		 
		this.eno =eno;
		this.ename = ename;
	 }
	 public void setEno(int eno)
	 {
		 this.eno=eno;
	 }
	 public int getEno()
	 {
		 return eno;
	 }
	 public void setEname(String ename)
	 {
		 this.ename=ename;
	 }
	 public String getEname()
	 {
		 return ename;
	 }		 
	
	public String toString()
	 {
		 return "Employee  [ " + this.eno +"  " + this.ename+  "  ]";
	 }
}

public class ArrayEg {

	public static void main(String[] args) {
		
		int[] arr=new int[3];
		arr[0]=1;
		arr[1]=2;
		arr[2]=3;
		
		//for loop
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		//for each
		for(int i:arr)
		{
			//i is the index
			System.out.println(i);
		}
		
		Employee1 e1=new Employee1();
		e1.setEname("Bell");
		Employee1 e2=new Employee1();
		e2.setEname("Bala");
		
		Employee1 emp[]=new Employee1[2];
		emp[0]=e1;
		emp[1]=e2;
		
		
		for(Employee1 i: emp)
		{
			//i is the index
			System.out.println(i);
		}
		System.out.println(PI);
	}

}
