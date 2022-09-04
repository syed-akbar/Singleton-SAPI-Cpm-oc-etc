package comparator;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
	
	public static void main(String[] args) {
		ArrayList<Employee> data = new ArrayList<Employee>();
		data.add(new Employee("akbar", 3, 8000));
		data.add(new Employee("zee", 1, 5000));
		data.add(new Employee("yas", 2, 500));
		
		IdComp id = new IdComp();
		Collections.sort(data,id);
		System.out.println("Sorting based on ID");
		 for (Employee employee : data) {
			 System.out.println(employee.getName() +" "+ employee.getId() +" "+ employee.getSalary());
			
		}
		 
		 SalaryComp sal = new SalaryComp();
			Collections.sort(data,sal);
			
			System.out.println("Sorting based on Salary");
			
			 for (Employee employee : data) {
				 System.out.println(employee.getName() +" "+ employee.getId() +" "+ employee.getSalary());
				
			}
			 
			NameComp name = new NameComp();
				Collections.sort(data,name);
				
				System.out.println("Sorting based on Name");
				
				 for (Employee employee : data) {
					 System.out.println(employee.getName() +" "+ employee.getId() +" "+ employee.getSalary());
					
				}
	}

}
