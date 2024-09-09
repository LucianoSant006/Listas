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

		System.out.printf("How many employees will be registered? ");
		int N = sc.nextInt();

		for (int i = 0; i < N; i++) {
			
			System.out.println();
			System.out.printf("Employee #%d", i + 1);
			System.out.println();
			System.out.print("Id: ");
			int id = sc.nextInt();
			System.out.printf("Name: ");
			String name = sc.next();
			sc.nextLine();
			System.out.printf("Salary: ");
			Double salary = sc.nextDouble();

			Employee emplo = new Employee(id, name, salary);
			list.add(emplo);
			
		}
		System.out.println();
		System.out.printf("Enter the employee id that will have salary increase: ");
		int idd = sc.nextInt();
		Integer pos = positionId(list, idd);
		if (pos == null) {
			System.out.println("This id does not exist!");
		} else {

			System.out.print("Enter the percntage: ");
			double percent = sc.nextDouble();
			list.get(pos).Percentual(percent);
		}
		System.out.println();
		System.out.println("List of employees:");
		for (Employee emp : list) {
			System.out.println(emp);
		}
		sc.close();

	}

	public static Integer positionId(List<Employee> list, int id) {

		for (int i = 0; i < list.size(); i++) {

			if (list.get(i).getId() == id) {
				return i;
			}

		}
		return null;

	}

}
