class Employee {
 
	String name;
	int empId;
	
	public Employee(String name, int empId) {
		this.name = name;
		this.empId = empId;
	}

	void displayData() {
		System.out.println("Name: "+name);
		System.out.println("Employee ID: "+empId);
	}
}
class Manager extends Employee {

	String dept;
	public Manager(String name, int empId, String dept) {
		super(name, empId);
		this.dept = dept;
	}
	void displayData() {
		super.displayData();
		System.out.println("Department: "+dept);
	}
}
class Developer extends Employee {

	String spcl;
	public Developer(String name, int empId, String spcl) {
		super(name, empId);
		this.spcl = spcl;
	}
	void displayData() {
		super.displayData();
		System.out.println("Specialized in: "+spcl);
	}
}
class Intern extends Employee {

	String period;
	public Intern(String name, int empId, String period) {
		super(name, empId);
		this.period = period;
	}
	void displayData() {
		super.displayData();
		System.out.println("Time period of Internship: "+period);
	}
}
class SeniorManager extends Manager {

	int since;
	public SeniorManager(String name, int empId, String dept, int since) {
		super(name, empId, dept);
		this.since = since;
	}
	void displayData() {
		super.displayData();
		System.out.println("Senior Manager since the year: "+since);
	}
}
class JuniorDeveloper extends Developer {

	int year;
	public JuniorDeveloper(String name, int empId, String spcl, int year) {
		super(name, empId, spcl);
		this.year = year;
	}
	void displayData() {
		super.displayData();
		System.out.println("Joined team on the year: "+year);
	}
}
class employeeDemo {

	public static void main(String[] args) {

	Employee e1 = new Manager("Happy Hogan", 1001, "IT");
        Employee e2 = new Developer("Peter Parker", 1002, "Java");
        Employee e3 = new Intern("Michelle Jones", 1003, "2 Years");
        Employee e4 = new SeniorManager("Tony Stark", 1004, "IT", 2008);
        Employee e5 = new JuniorDeveloper("Ned Leeds", 1005, "Java", 2017);
	
	System.out.println();
	e1.displayData();
        System.out.println();

	e2.displayData();
        System.out.println();

	e3.displayData();
        System.out.println();

	e4.displayData();
        System.out.println();

	e5.displayData();
        System.out.println();        
	}
}
