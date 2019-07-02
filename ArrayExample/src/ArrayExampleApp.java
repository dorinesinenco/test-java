import java.util.Scanner;

public class ArrayExampleApp {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		float[] prices = { 
				15.50F,  // 0
				00.75F,  // 1 
				02.00F,  // 2
				01.00F,  // 3
				05.00F   // 4
		};		
		float min_price,max_price;
		
	
		// min - 1,max - 3
		System.out.println( "Enter price range:" );
		min_price = in.nextFloat();
		max_price = in.nextFloat();
		
		for(float p : prices){
			if(p>=min_price && p <=max_price){
				System.out.printf( "%05.2f\n", p );
			}
		}
		
	}

}
