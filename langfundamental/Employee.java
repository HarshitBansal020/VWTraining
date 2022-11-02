package langfundamental;

public class Employee {
	int empid;
	String empname;
	String projectname;
	double phonenumber;
	String designation;
	double salary;
	
	public Employee(int empid,String empname) {
		this.empid = empid;
		this.empname = empname;
	}
	
	public Employee(int empid, String empname, String projectname, double phonenumber, String designation, double salary) {
		this.empid = empid;
		this.empname = empname;
		this.projectname = projectname;
		this.phonenumber = phonenumber;
		this.designation = designation;
		this.salary = salary;
	}
	
	public static void main(String[]args) {
		Employee e1 = new Employee(10,"Harshit Bansal");
		Employee e2 = new Employee(10,"HB","JAVA",637637998,"SWT",100.00);
		System.out.println(e1.empid);
		System.out.println(e1.empname);
		System.out.println(e1.projectname);
		System.out.println(e2.empid);
		System.out.println(e2.empname);
		System.out.println(e2.projectname);		
	}
}
