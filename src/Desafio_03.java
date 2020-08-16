import java.util.Scanner;

/**
 * @author Henrique W Lima
 * Web Development BootCamp (Tito Kenzo)
 *
 */

public class Desafio_03 {

	public static void main(String[] args) {
		
		String texto;
		int qtd = 0;
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite uma frase: ");
		texto = entrada.nextLine();
		for (int i = 0; i < texto.length(); i++) {
			
			if (texto.charAt(i) == 'A' || texto.charAt(i) == 'a') {
				
				qtd = qtd + 1;
				
			}
			
		}
		
		System.out.println("Quantidade de A: " + qtd);
		entrada.close();
		
	}

}
