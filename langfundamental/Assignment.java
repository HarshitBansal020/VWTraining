package langfundamental;
import java.util.*;
public class Assignment {

	public static void main(String[] args) {
		greaternum();
		evenodd(10);
		System.out.println(prime());
		sumfive();

	}
	//1. Greatest Of Three Number 
	public static void greaternum() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Number");
		int a = sc.nextInt();
		System.out.println("Enter Second Number");
		int b = sc.nextInt();
		System.out.println("Enter Third Number");
		int c = sc.nextInt();
		sc.close();
		if(a>=b && a>=c) {
			System.out.println("First Number is Greatest");
		}
		else if(b>=c && b>=c) {
			System.out.println("Second Number is Greatest");
		}
		else {
			System.out.println("Third Number is Greatest");
		}
		
	}
	
	//2.Addition of N Even and Odd Number 
	public static void evenodd(int n) {
		int evensum = 0;
		int oddsum = 0;
		for(int i= 0;i<= n;i++) {
			if(i%2 == 0) {
				evensum+= i;
			}
			else{
				oddsum+= i;
			}
		}
		System.out.println("Sum Of first " + n + " Even is " + evensum);
		System.out.println("Sum Of first " + n + " Odd is " + oddsum);
	}
	
	//3. Check Prime Number
	public static boolean prime() {
		System.out.println("Enter A Number To Check");
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();
		for(int i = 2; i<N; i++) {
			if(N % i == 0) {
				return false;
			}
		}
		return true;
		
	}
	//4. Sum of 5 Even and Odd 
	public static void sumfive() {
		System.out.println("Enter Input");
		Scanner sc = new Scanner(System.in);
        
        int seed = sc.nextInt();
        int sum =0;
        int ct=0;
        
        while(ct<5)
        {
            
          System.out.println("seed="+seed);    
          sum +=seed; //10
          System.out.println("sum="+sum);    
          seed++;  
          
          ct++;
        }
        
        System.out.println("final sum:="+sum);
        sc.close();
	}
}
