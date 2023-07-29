package teste;

import modelo.Conta;
import modelo.ContaCorrente;

public class TesteArrayReferencias {

	public static void main(String[] args) {

		ContaCorrente contas [] = new ContaCorrente [5];
		ContaCorrente cc1 = new ContaCorrente(10, 1003);
		contas[0] = cc1;
		
		ContaCorrente cc2 = new ContaCorrente(23, 1054);
		contas[1] = cc2;
		
		System.out.println(contas[0].getNumero());
		
	}

}
