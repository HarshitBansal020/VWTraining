package WrapperClassEx;

public class AssignmentWrapper {
	public static void main(String[] args) {
        // TODO Auto-generated method stub
        
        String s = " 10";
        //String to Integer
        
        int no = Integer.parseInt(s.trim());
        System.out.println(++no);
        
        //binary string to primitive decimal int
        String s1 = "1010";
        int no1 = Integer.parseInt(s1,2);
        System.out.println(no1);
        
        //Integer to String
        
        Integer ob = no;
        String s2 = ob.toString();
        System.out.println("int "+no+" to (decimal) String:"+s2);
        
        s2 = Integer.toBinaryString(no);
        System.out.println("primtive int "+no+" to Binary String:"+s2);
        
        
        //Integer to double primitive 
        
        int n = 100;
        double d = n;
        
        //double primitive to int
        double cost = 45.50;
       //int n1 = (int) cost; //use wrapper class instead
        
        Double dd = cost;
        int n1 = dd.intValue();
        System.out.println(n1);
        
        //double primitive to long
        long l = dd.longValue();
        System.out.println(l);
        
        //int to byte
        Integer val = 123;
        byte b = val.byteValue();
        System.out.println("int "+val+" to byte:"+b);
        
        
        //int to short
        Integer nn = 123;
        short sn = nn.shortValue();
        System.out.println("int primitive "+123+" to short primitive"+sn);

        
        //double to string
        Double dl = 12.34;
        String dval = dl.toString();
        System.out.println("Double to String value : "+dval);
        
        //String to Double
        String dval2 = "387.98";
        Double dl2 = Double.parseDouble(dval2);
        System.out.println("String to Double value : "+dl2);
        
 }

}
