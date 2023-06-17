package com.demo.test;

import java.util.Scanner;
import java.util.Set;

import com.demo.beans.Employee;
import com.demo.service.EmployeeService;
import com.demo.service.EmployeeServiceImpl;

public class EmployeeTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		EmployeeService es=new EmployeeServiceImpl();
		int choice=0;
		do {
		System.out.println("1. Add new Employee\n2. Display all\n 3. Disaly by id\n 4. Display by name");
		System.out.println("5. sort by sal\n 6. sort by name\n 7. modify sal\n 8. delete by id\n 9.exit");
		System.out.println("choice : ");
		choice=sc.nextInt();
		switch(choice) {
		case 1:
			es.addEmployee();
			break;
		
		case 2:
			Set<Employee>eset=es.displayAll();
			eset.forEach((o)->{System.out.println(o);});
			break;
			
		case 3:
			System.out.println("Enter the id to be searched");
			int id=sc.nextInt();
			Employee e=es.displayById(id);
			if(e!=null) {
				System.out.println(e);
			}
			else
				System.out.println("Employee not found");
			break;
			
		case 4:
			System.out.println("Enter the name to be searched");
			String nm=sc.next();
			eset=es.displayByName(nm);
			eset.forEach((o)->{System.out.println(o);});
			break;
			
		case 5:
			eset=es.sortBySal();
			eset.forEach(o->{System.out.println(o);});
			break;
			
		case 6:
			eset=es.sortByName();
			eset.forEach(o->{System.out.println(o);});
			break;
			
		case 7:
			System.out.println("Enter the Employee id");
			id=sc.nextInt();
			System.out.println("Enter the updated salary");
			double sal=sc.nextDouble();
			boolean flag=es.modifyBySal(id,sal);
			if(flag)
				System.out.println("Salary modidfied successfully");
			else
				System.out.println("Employee not found");
			break;
			
		case 8:
			System.out.println("Enter the id to be deleted");
			id=sc.nextInt();
			flag=es.deleteById(id);
			if(flag)
				System.out.println("Employee deleted Succesffully");
			else
		        System.out.println("Employee not found");
			break;
			
		case 9:
			sc.close();
			System.out.println("Thank you for Visting!!!!");
			break;
			
		default:
			System.out.println("Invalid choice");
		}
		}while(choice!=9);

}
	}
