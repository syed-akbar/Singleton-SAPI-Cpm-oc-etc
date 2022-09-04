package comparable;

public class Employee implements Comparable<Employee> {
	
	private String name;
	private int id;
	private int salary;
	
	 Employee(String name, int id, int salary) {
		this.name = name;
		this.id = id;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}

	public int getSalary() {
		return salary;
	}

	@Override
	public int compareTo(Employee o) {
		return this.name.compareTo(o.name);
	}
	
	 
	

}
