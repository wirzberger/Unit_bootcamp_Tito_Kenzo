import java.util.Scanner;

/**
 * @author Henrique W Lima
 * Web Development BootCamp (Tito Kenzo)
 *
 */

public class Desafio_06 {

	public static void main(String[] args) {
		
 		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite uma frase: ");
		String texto = entrada.nextLine();
		String[] palavras = texto.trim().split(" +");
		texto = palavras[0];
		
		for (int i = 1; i < palavras.length; i++) {

			if (palavras[i].length() > texto.length()) {
				texto = palavras[i];
			}
		
		}
		
		System.out.println("Maior palavra é " + texto);
		entrada.close();
		
	}

}
