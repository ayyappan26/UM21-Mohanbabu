package com.um21.business;
import java.sql.SQLException;
import java.util.Scanner;
public class EmployeeBO {
	public void empsystem(){
		int choice = 0;
		Scanner scan = scan.getScannerInstance();
		EmployeeDao dao = new EmployeeDao();
		do {
			System.out.println("Welcome to the employee management system");
			System.out.println("1. View All Employee");
			System.out.println("2. View Specify Employee");
			System.out.println("Enter your Choice: ");
			choice = scan.nextInt();
		} while (choice == 0);
		
		switch (choice) {
		case 1:
			printDetails(dao);
			break;
		case 2:

			break;
		case 3:
			return;
		}
	}
	
	
	public void printDetails(EmployeeDao dao){
		try {
			dao.printDetails();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
     
}
}

