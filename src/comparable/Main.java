package comparable;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
	
	public static void main(String[] args) {
		ArrayList<Employee> data = new ArrayList<Employee>();
		data.add(new Employee("akbar", 3, 8000));
		data.add(new Employee("zee", 1, 5000));
		data.add(new Employee("yas", 2, 500));
		
		Collections.sort(data);
		System.out.println("Sorting based on ID");
		 for (Employee employee : data) {
			 System.out.println(employee.getName() +" "+ employee.getId() +" "+ employee.getSalary());
			
		}
	}

}
