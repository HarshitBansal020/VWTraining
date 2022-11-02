package langfundamental;


public class Employee2 {    
    
    private int empid;
    private String empname;
    private double salary;
    private int deptno;
    
    
    
    
//    public Employee() {} 
    
    
    public Employee2(int empid, String empname, double salary, int deptno) {
        //super();
        System.out.println("Parameterized Employee constructor called..");
        this.empid = empid;
        this.empname = empname;
        this.salary = salary;
        this.deptno = deptno;
        
        
    }
    
    
    
    
    
    public String getEmpname() {
        return empname;
    }
    
    public void setEmpname(String empname) {
        this.empname = empname;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        
        if(salary > 0)
        {
          this.salary = salary;
        }
        else
        {
            System.out.println("Slary can't be 0 or less than 0");
        }
    }
    public int getDeptno() {
        return deptno;
    }
    public void setDeptno(int deptno) {
        this.deptno = deptno;
    }
    public int getEmpid() {
        return empid;
    }
    
    
    public void displayEmp()
    {
        //this
        System.out.println("employee details:"+this.empid+","+this.empname+","+this.salary+","+this.deptno);
        //System.out.println(empid+","+this.empname+","+this.salary+","+this.deptno);
    }
    
    
    public double calcAnnSal()
    {
        return this.salary * 12;
    }
    
    //function overloading  - static/compile time polymorphism
    public double calcAnnSal(double bonus)
    {
        return (this.salary * 12)+bonus;
    }


}
 