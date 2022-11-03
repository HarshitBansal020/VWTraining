package SortEmployees;

public class Employee {
	
		public int empid;
		public String empname;
		public double salary;
		public int deptno;
	    
	   
		public Employee(int empid, String empname, double salary, int deptno) {
			super();
			this.empid = empid;
			this.empname = empname;
			this.salary = salary;
			this.deptno = deptno;
		}
	    
		 public int getDeptno() {
		        return deptno;
		    }
		    public void setDeptno(int deptno) {
		        this.deptno = deptno;
		  }
		
	    @Override
		public String toString() {
			return "empid= " + empid + ", empname= " + empname + ", salary= " + salary + ", deptno= " + deptno
					+ ")";
		}

}
