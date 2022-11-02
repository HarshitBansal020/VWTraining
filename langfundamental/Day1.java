package langfundamental;

public class Day1 {
	public static void main(String[] args) {
		System.out.println("Java Training");
//		Iterate Over the array		
		int[] arr = {1,2,3,4,5};
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Iteration " + arr[i]);
		}
		printnum();
	}
//		Functions In Java 
		public static void printnum() {
			for(int i = 0; i<10;i++) {
				System.out.println(i);
		}
	}

}
