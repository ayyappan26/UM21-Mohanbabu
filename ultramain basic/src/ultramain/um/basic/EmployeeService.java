package ultramain.um.basic;

import java.util.ArrayList;
public class EmployeeService {
	public void Employee(ArrayList<EmployeeDto> ar){
		for(EmployeeDto res:ar){
			System.out.println("Employee Id :" + res.getEmpID());
			System.out.println("Employee First_Name :" +res.getFirst_name());
			System.out.println("Employee Last_Name : " +res.getLast_name());
			System.out.println("Employee Salary :" + res.getSalary());
			System.out.println("--------------------------");
		}
	}
	}





