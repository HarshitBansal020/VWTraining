package Treemap;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.TreeMap;




public class AccTreeMap {

	public static void main(String[] args) {
		
		SortedMap<Account, Double> tmap = new TreeMap<Account, Double>();
		
		tmap.put(new Account("Liam", 101, 50000),50000.0);
		tmap.put(new Account("Alaistair", 110, 10000),10000.0);
		tmap.put(new Account("Ian", 103, 50000),50000.0);
		tmap.put(new Account("Ben", 200, 50000),50000.0);
		tmap.put(new Account("Ben", 200, 50000),50000.0);
		tmap.put(new Account("Eric", 101, 100000),100000.0);
		
		System.out.println(tmap);
		System.out.println(tmap.size());
		
		System.out.println(tmap.get(new Account("Ben", 200, 50000)));
		
		// Using Comparator
		
		Comparator<Account> c = new ComaparatorImplAcc();
		
		tmap = new TreeMap<Account, Double>(c);
		
		tmap.put(new Account("Liam", 101, 50000),50000.0);
		tmap.put(new Account("Alaistair", 110, 10000),10000.0);
		tmap.put(new Account("Ian", 103, 50000),50000.0);
		tmap.put(new Account("Ben", 200, 50000),50000.0);
		tmap.put(new Account("Ben", 200, 50000),50000.0);
		tmap.put(new Account("Eric", 101, 100000),100000.0);
		
		System.out.println(tmap);
		System.out.println(tmap.size());
		
		System.out.println(tmap.get(new Account("Ben", 200, 50000)));
		
		

	}
	

}