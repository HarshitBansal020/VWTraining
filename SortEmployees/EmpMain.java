package SortEmployees;
import java.util.*;
public class EmpMain {
	public static void main(String[] args) {
		
	
		Comparator<Employee> cemp = new EmpComparator();		
		SortedSet<Employee> sst = new TreeSet<Employee>(cemp);
		
		Employee e1 = new Employee(1,"Harshit",25.5,113);
		Employee e2 = new Employee(2,"Hardik",26.5,112);
		Employee e3 = new Employee(3,"Himanshu",26.5,102);
		Employee e4 = new Employee(4,"Dipak",27.5,103);
		;
		sst.add(e1);
		sst.add(e2);
		sst.add(e3);
		sst.add(e4);
		
		System.out.println(sst);
		System.out.println(sst.size());
	}
}
