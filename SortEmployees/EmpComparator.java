package SortEmployees;

import java.util.Comparator;
public class EmpComparator implements Comparator<Employee> {
	  @Override
	  public int compare(Employee e1 , Employee e2)
	  {
		  return (e1.getDeptno()- e2.getDeptno());
	  }

}
