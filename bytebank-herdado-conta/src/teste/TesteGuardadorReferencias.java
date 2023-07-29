package teste;

import modelo.Conta;
import modelo.ContaCorrente;
import modelo.GuardadorDeReferencias;

public class TesteGuardadorReferencias {

	public static void main(String[] args) {

		GuardadorDeReferencias guardador = new GuardadorDeReferencias();
		
		Conta cc = new ContaCorrente(13, 4310);
		guardador.adiciona(cc);
		
		
		Conta cc2 = new ContaCorrente(62, 6234);
		guardador.adiciona(cc2);
		
		int tamanho = guardador.getQuantidadeElementos();
		
		System.out.println("O número de elementos no array é " + tamanho);
		
		Conta ref = (Conta) guardador.getReferencia(0); 
		//Fazendo type cast e referenciando o primeiro elemento do array
		System.out.println(ref.getAgencia());
		
	}

}
