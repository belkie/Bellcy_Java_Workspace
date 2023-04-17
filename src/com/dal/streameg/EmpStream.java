package com.dal.streameg;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class EmpStream {

	public static void main(String[] args) {
		Employee[] emparr = {
				new Employee("Joel","Prince", "IT", 50000),
				new Employee("Collins", "Joshua", "HR", 45000),
				new Employee("Jebina","Princy","BA", 60000),
				new Employee("Catherina","Annal","BA",55000),
				new Employee("Bellcy", "Vinitha", "IT",35000)				
		};
		List<Employee> empList = Arrays.asList(emparr);
		System.out.println(empList);
		
		boolean  result =empList.stream().anyMatch(emp->emp.getDept().matches("IT"));
		System.out.println("-----------------------------------------------------------");
		if(result)
		{
			System.out.println("Employees available");
		}
		else
		{
			System.out.println("Employees NOT available");
		}
		
		Predicate<Employee> p1=em ->(em.getSalary() >40000 && em.getSalary()<60000);
		empList.stream()
		.filter(p1)
		.sorted(Comparator.comparing(Employee::getFname))
		.forEach(System.out::println);
		
		
	    System.out.println(empList.stream().filter(p1).findFirst().get());
		
	    System.out.println("-----------------------------------------------------------");
	    Map<String,List<Employee>> groupByDept = empList.stream()
	    		.collect(Collectors.groupingBy(Employee::getDept));
		System.out.println(groupByDept);
		
		groupByDept.forEach((dep,empInDept)->
		{
			System.out.println(dep);
			/*Iterator<Employee> i = empInDept.iterator();
			while(i.hasNext()) {
				System.out.println(i.next());
			}*/
			empInDept.forEach(System.out::println);
		});
		
		
	}

}