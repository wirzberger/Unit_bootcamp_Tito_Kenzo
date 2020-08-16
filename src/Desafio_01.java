import java.text.NumberFormat;

/**
 * @author Henrique W Lima
 * Web Development BootCamp (Tito Kenzo)
 *
 */

public class Desafio_01 {

	public static void main(String[] args) {

		double qtd = 1;
		double soma = 0;
		NumberFormat formato = NumberFormat.getInstance();
		
		for (int i = 1; i < 65; i++) {
			soma = soma + qtd;
			System.out.println("Casa: " + i + " - Qtd: " + formato.format(qtd) + " - Soma: " + formato.format(soma));
			qtd = qtd + qtd;
	
		}		
		
	}

}
