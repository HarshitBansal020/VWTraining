package HashMap;
import java.util.*;
public class Main {
	
	
	public static void main(String args[]) {
		HashMap<Account,Integer>map = new HashMap<>();
		
		
		map.put(new Account(101,"Harshit","SBI"),1000);

		map.put(new Account(102,"Himanshu","ICICI"),2000);

		map.put(new Account(103,"Hardik","HDFC"),3000);
		
		
		System.out.println(map);
		
		
	}

}
