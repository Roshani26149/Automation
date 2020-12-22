package UsingMap;

import java.util.ArrayList;

import java.util.List;
import java.util.stream.Collectors;


	class Employee{
	int empid;
	String empname;
	int salary;
	
	Employee (int empid,String empname,int salary){
		this.empid=empid;
		this.empname=empname;
		this.salary=salary;
	}{
	try {
		int a=10;
		int b=0;
		int c=a/b;
	}catch(Exception e) {
		e.printStackTrace();
		System.out.println("hii");
	}
	}
	}
	public class FilterAndMap {
	 
	public static void main(String[] args) {
		
		List<Employee> employeeList =new ArrayList<Employee>();
		employeeList.add(new Employee(101,"anushka",6000));
		employeeList.add(new Employee(102,"pankaj",4000));
		employeeList.add(new Employee(103,"jasmin",5000));
		
		
		
		List<Integer> employeesallsit =employeeList.stream().filter(e ->e.salary>4000)
				                                   .map(e ->e.salary)
				                                   .collect(Collectors.toList());
		
		System.out.println(employeesallsit);
		
		
}

}
