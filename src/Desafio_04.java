import java.util.Scanner;

import javax.sound.midi.Soundbank;

/**
 * @author Henrique W Lima
 * Web Development BootCamp (Tito Kenzo)
 *
 */

public class Desafio_04 {

	public static void main(String[] args) {
		
 		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite uma frase: ");
		String texto = entrada.nextLine();
		String[] palavras = texto.trim().split(" +");
		System.out.println("Quantidade de palavras: " + palavras.length);
		entrada.close();
		
	}

}
