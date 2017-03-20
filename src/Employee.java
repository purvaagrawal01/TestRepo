public class Employee {
	String name;
	int salary;
	Department dep;
	Address add;

	public Employee(String name, int salary, Department dep, Address add) {
		super();
		this.name = name;
		this.salary = salary;
		this.dep = dep;
		this.add = add;
	}

	public Address getAdd() {
		return add;
	}

	public void setAdd(Address add) {
		this.add = add;
	}

	public Department getDep() {
		return dep;
	}

	public void setDep(Department dep) {
		this.dep = dep;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

}
