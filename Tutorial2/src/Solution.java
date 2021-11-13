import java.util.Random;

public class Solution {
	
	
	/* Ex4 */
	public static void Ex4(double cash) {
		String sCash;
		double int_sCash;
		
		
		// Divisible by 3
		if(cash%3==0) {
			
			// show 2 decimal 
			sCash = String.format("%.02f", cash/3);
			System.out.println("Each Cash ->" + sCash);
		}
		
		// Not divisible by 3
		else {
			int_sCash = cash/3;
			
			// Round up to 2 decimal
			System.out.println(" One more Cash ->" + String.format("%.02f", Math.ceil(int_sCash * 100.0) / 100.0));
			System.out.println(" Two less Cash ->" + String.format("%.02f", Math.floor(int_sCash * 100.0) / 100.0));
				
		}
		
	}
}
