import java.text.NumberFormat;

/**
 * @author Henrique W Lima
 * Web Development BootCamp (Tito Kenzo)
 *
 */

public class Desafio_07 {

	public static void main(String[] args) {
		
		int n = 50;
		int x = 0;
		int somaImpar = 0;
		int somaPar = 0;
		double fatorial = 0;
		boolean chave = true;
		NumberFormat formato = NumberFormat.getInstance();
		
		for (int i = 1; i <= n; i++) {
			
			if (chave == true) {
				
				somaPar = somaPar + i;
				chave = false;
				
			} else {
				
				somaImpar = somaImpar + i;
				chave = true;
				
			}
			
		}
		
		x = somaImpar - somaPar;
		fatorial = x;

		for (int i = 1; i < x; i++) {
			
			fatorial = fatorial * (x - i);
			
		}
		
		System.out.println("[1 " + n + "] " + formato.format(fatorial));
		
	}

}
