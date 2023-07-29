package teste;

import modelo.Cliente;
import modelo.Conta;
import modelo.ContaCorrente;
import modelo.ContaPoupanca;

public class TesteArrayReferencias {

	public static void main(String[] args) {

		Object referencias [] = new Object [5];
		
		ContaCorrente cc1 = new ContaCorrente(10, 1003);
		referencias[0] = cc1;
		
		ContaCorrente cc2 = new ContaCorrente(23, 1054);
		referencias[1] = cc2;
		
		Cliente cliente = new Cliente();
		referencias[2] = cliente;
		
		ContaPoupanca ref = (ContaPoupanca) referencias[1]; //type cast, mudando o tipo
//		Casting é transformar uma referência genérica em uma específica
		// System.out.println(referencias[0].getNumero());
		System.out.println(ref.getAgencia());
		
	}

}
