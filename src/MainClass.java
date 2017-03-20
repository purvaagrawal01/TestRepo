import java.util.ArrayList;
import java.util.Iterator;


public class MainClass {

	public static void main(String[] args) {
		displayEmployees(createEmployees());

	}

	public static ArrayList<Employee> createEmployees()
	{
		ArrayList<Employee> allEmployees = new ArrayList<Employee>();
		Department d1 = new Department("IT", 1);
		Department d2 = new Department("Accounts", 2);
		
		Address a1 = new Address("Arches Apartment", "Sunnyvale", "CA");
		Address a2 = new Address("Some other Apartment", "Fremont", "CA");
		
		Employee e1 = new Employee("Purva", 1000, d1, a1);
		allEmployees.add(e1);
		Employee e2 = new Employee("Aman", 500, d2, a1);
		allEmployees.add(e2);
		Employee e3 = new Employee("Rajul", 800, d1, a2);
		allEmployees.add(e3);
		Employee e4 = new Employee("Yuti", 200, d2, a2);
		allEmployees.add(e4);
		
		return allEmployees;
		
	}
	
	public static void displayEmployees(ArrayList<Employee> allEmployees)
	{
		
		Iterator<Employee> i = allEmployees.iterator();
		while(i.hasNext())
		{
			Employee employee = i.next();
			System.out.println("Employee Name : " + employee.getName());
			System.out.println("Employee Salary : " + employee.getSalary());
			System.out.println("Employee Department ID : " + employee.getDep().getId());
			System.out.println("Employee Department Name : " + employee.getDep().getName());
			System.out.println("Employee Address : " + employee.getAdd().getAddress());
			System.out.println("Employee City : " + employee.getAdd().getCity());
			System.out.println("Employee State : " + employee.getAdd().getState());
			System.out.println("-----*****-----*****-----");
		}
	}
}
