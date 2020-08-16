
/**
 * @author Henrique W Lima
 * Web Development BootCamp (Tito Kenzo)
 *
 */

public class Desafio_05 {

	public static void main(String[] args) {
		
		int qtd = 10;
        int atual = 0;     // atual
        int anterior = 0;   // anterior
		
        System.out.print("Quantidade: " + qtd + " = ");
        
        for (int i = 1; i < (qtd + 1); i++) {
        	
        	for (int j = 1; j <= i; j++) {
        		
        		if (j == 1) {
        			
        			atual = 1;
        			anterior = 0;
        			
                } else {
                	
                    atual += anterior;
                    anterior = atual - anterior;
                    
                }

            }
        	
        	System.out.print(atual + " ");
            
        }
			
	}

}
