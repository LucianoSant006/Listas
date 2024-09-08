import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] Args) { 
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	
	
	
	List<Employee> list = new ArrayList();
	 
	System.out.printf("How manu empployees will be registered");
	int N = sc.nextInt();
	
	for(int i = 0;i < N;i++) {
		
		
	System.out.printf("Employee #%d",i);
	System.out.println();
	System.out.print("Id: ");
	int id = sc.nextInt();
    sc.nextLine();
	System.out.printf("Name: ");
	String name= sc.next();
	System.out.printf("Salary: ");
	Double salary= sc.nextDouble();
	
	Employee emplo = new Employee(id, name, salary);
	list.add(emplo);
		
	}
	
	System.out.println("Enter the employee id that will have salary increase: ");
	int idd = sc.nextInt();
	Integer pos = positionId(list,idd);
	

}
public Integer positionId(List<Employee> list,int id) {
		
		for(int i =0; i < list.size();i++) {
			
			if(list.get(i).getId() == id) {
				return i;
			}
			return null;
			
		}
	
		
	}
	
