package com.cg.project.client;

import com.cg.project.beans.*;

public class MainClass {
	public static void main(String args[]) {
		/*
		Employee emp=new Employee(111,65874,"lakshmi","Somineni");
		
		emp.calculateSalary();
		System.out.println(emp.getFirstName()+" " +emp.getLastName()+" "+emp.getTotalSalary());
	
	    PEmployee pemp=new PEmployee(75454,66546,"lakshmi","Somineni");
	     pemp.calculateSalary();
		System.out.println(pemp.getFirstName()+" "+pemp.getLastName()+" "+pemp.getTotalSalary());
			
			
			CEmployee cemp=new CEmployee(858, "aBHI", "CHOWDARY",78);
			cemp.calculateSalary();
			System.out.println(cemp.getFirstName()+" "+cemp.getLastName()+" "+cemp.getTotalSalary());
			
			Developer dev=new Developer(6447,73,"Akhi","Chowdary",90);
			dev.calculateSalary();
			dev.developProject();
			System.out.println(dev.getFirstName()+" "+dev.getLastName()+" "+dev.getTotalSalary());
			
			SalesManager man=new SalesManager(7574, 66, "Nani", "bujji", 9);
			man.calculateSalary();
			man.doASales();
			System.out.println(man.getFirstName()+" "+man.getLastName()+" "+man.getNoOfSales()+"  "+man.getCommission()+" "+man.getTotalSalary());
			
			*/
			
			Employee emp;
			
			
			emp=new PEmployee(75454,66546,"lakshmi","Somineni");
			PEmployee pemp=(PEmployee) emp;
		    emp.calculateSalary();
			System.out.println(emp. toString());
			
				
			emp=new CEmployee(858, "aBHI", "CHOWDARY",78);
				
			CEmployee cemp=(CEmployee) emp;
			cemp.signContract();
			emp.calculateSalary();	
			System.out.println(emp.toString());
			
			
			emp=new Developer(6447,73,"Akhi","Chowdary",90);
			Developer dev=(Developer) emp;
			dev.developProject();
			emp.calculateSalary();
			System.out.println(emp.toString());
				
				
				emp=new SalesManager(7574, 66, "Nani", "bujji", 9);
				SalesManager man=(SalesManager) emp;
				man.doASales();
				emp.calculateSalary();
				System.out.println(emp.getFirstName()+" "+emp.getLastName()+" "+emp.getTotalSalary());
				
				
				
				
		}
}



		
		
