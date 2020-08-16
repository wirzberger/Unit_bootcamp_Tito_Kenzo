
/**
 * @author Henrique W Lima
 * Web Development BootCamp (Tito Kenzo)
 *
 */

public class Desafio_08 {

	public static void main(String[] args) {
		
		int a = 1;
		int b = 5;
		int c = 4;
		double x1 = 0;
		double x2 = 0;
		double delta = 0;
		
		delta = (b * b) - (4 * a * c);		
		
		if (delta >= 0) {			
			
	        x1 = - ((-b + Math.sqrt(delta) ) / 2 * a); 
	        x2 = - ((-b - Math.sqrt(delta) ) / 2 * a); 
	        
	        System.out.println("\nX1 = " + x1);
	        System.out.println("X2 = " + x2);

		} else {
			
			System.out.println("Indeterminadas");
			
		}
						
	}
		
}
