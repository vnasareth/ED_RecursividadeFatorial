package Controller;

public class FatorialController {

	public FatorialController() {
	 super();
	 
	}

	// public int fatorial (int numero) essa linha vai receber um numero inteiro
	
	public int fat (int fatorial, int multiplicador) {
	
		
		//condição de parada
	
		// se o numero for igual a um retorna um
	
	   // if (numero <= 1)
	   // return 1;
		
		
		if (multiplicador == 1) {
		
		return 1;
	
	   } else {
		   // int proximo = numero - 1; // o proximo numero do fatorial é o numero - 1  // ou numero - 1 * fatorial
		   // return numero * fatorial (proximo);
		   
		   multiplicador = fatorial-multiplicador;
		   return 1- fat (multiplicador,fatorial);
	   }
	
	}
		
}
