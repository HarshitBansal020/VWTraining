package LinkedL;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;


public class LLObj {
	public static void main(String[] args) {
		
		Queue<Account> l = new LinkedList<>();
		l.offer(new Account(101,10000,"Harshit"));
		l.offer(new Account(102,20000,"Hardik"));
		l.offer(new Account(103,30000,"Himanshu"));
		l.offer(new Account(104,40000,"Dipak"));
		l.offer(new Account(105,50000,"Devesh"));
		
		System.out.println(l.size());
        System.out.println("peek:"+l.peek());
        System.out.println(l.size());
        
        System.out.println("poll:"+l.poll());
        System.out.println(l.size());
        
        System.out.println("poll:"+l.poll());
        System.out.println(l.size());
		
        
        
        Queue<Account> q = new PriorityQueue<Account>();
        q.offer(new Account(105,10000,"Harsh"));
		q.offer(new Account(107,20000,"Har"));
		q.offer(new Account(108,30000,"Himanshu"));
		q.offer(new Account(109,40000,"Dipak"));
		q.offer(new Account(110,50000,"Devesh"));
		
		System.out.println(q.size());
        System.out.println("peek:"+q.peek());
        System.out.println(q.size());
        
        System.out.println("poll:"+q.poll());
        System.out.println(q.size());
        
        System.out.println("poll:"+q.poll());
        System.out.println(q.size());
	}
	

}
