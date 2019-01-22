package pl.com.andrzej.test;

public class While {
	private static boolean cond;
	
	public static void main(String[] args ) {
		//int temperature;
		System.out.println("start");
		int temp = 0;
		while((temp = check()) > 3) {
			System.out.println("in loop: " + temp);
		}
		System.out.println("stop");
		
		
	}
	
	public static int check() {
		 if (cond) {
			 cond = !cond;		// true na false and vice versa	
			 return 3;			 
		 } else {
			 cond = !cond;
			 return 5;
		 }
	}
	

}
