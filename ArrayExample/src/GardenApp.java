import java.util.Scanner;



// Application (main)
// Garden <<< arrray[]
// Land,Corn,Potato <<<< Thing

// main() -> 
// Garden g = new Garden(20); // this.array = new Thing[20];
// g.show()

// Corn -> object  -> quantity,price  
// 

// g.plant(where - int, what - Potato)
// g.gather() 


public class GardenApp {

	public static void main(String[] args) {
		
		// '.' - land
		// 'Y' - corn
		// 'o' - potato
		
		final float PRICE_CORN    = 50.00F; // mdl
		final float PRICE_POTATO  = 10.00F; // mdl
		      float total         = 00.00F; // mdl
		Scanner                in = new Scanner(System.in);
		      System.out.println( "Where to?" );
		      int   where         = in.nextInt();
		      System.out.println( "What?" );
		      int   what          = in.nextInt(); // 1 - corn, 2 - potato
		      
		
		      
		char[] garden = { '.', '.', '.', 'Y', 'Y', 'Y', 'o', 'o', 'o', 'o' }; 
	      
		  if(what==1){
	    	  garden[where] = 'Y';
	      }
		  if(what==2){
	    	  garden[where] = 'o';
	      }
		
		
		//  ... sbor
		
		for (char c : garden) {
			System.out.print( c );
		}
		
		
	}

}
