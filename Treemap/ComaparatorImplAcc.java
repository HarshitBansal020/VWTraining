package Treemap;

import java.util.Comparator;

public class ComaparatorImplAcc implements Comparator<Account> {

	@Override
	public int compare(Account o1, Account o2) {
		System.out.println("Compairing "+o1.getAccountHolderName()+" with "+o2.getAccountHolderName());
		return o1.getAccountHolderName().compareTo(o2.getAccountHolderName());
	}
	
	

}
