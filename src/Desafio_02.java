
/**
 * @author Henrique W Lima
 * Web Development BootCamp (Tito Kenzo)
 *
 */

public class Desafio_02 {

	public static void main(String[] args) {
		double a = 0;
		double n = 10;
		
		for (int i = 0; i < n; i++) {
			
			a = a + ((n - i)/(i + 1));
					
		}
		
		System.out.println(a);		

	}

}
