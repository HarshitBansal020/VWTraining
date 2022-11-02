package OopsDesign;

public class Main extends Employee{
	public static void main(String[]args) {
		Manager mg = new Manager(1,"Harshit",100.1,1001,10,"Training",50.1);
		double answer = mg.calcAnnSal();
		System.out.println(answer);
	}
}
	
