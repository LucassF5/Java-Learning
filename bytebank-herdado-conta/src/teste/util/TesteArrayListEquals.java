package teste.util;

import java.util.ArrayList;

import modelo.Conta;
import modelo.ContaCorrente;

public class TesteArrayListEquals {

	public static void main(String[] args) {
		
		//Generics <>
		ArrayList <Conta> lista = new ArrayList <Conta> ();
		//<definindo o tipo de referência que vai ser guardada em ArrayList>		
		
		Conta cc = new ContaCorrente(13, 4310);
		lista.add(cc);
		
		Conta cc2 = new ContaCorrente(62, 6234);
		lista.add(cc2);
		
		System.out.println("Tamanho da lista: "+lista.size());
		Conta ref = (Conta) lista.get(0);
		System.out.println(ref.getAgencia());
		lista.remove(1);
		System.out.println("Tamanho da lista: "+lista.size());
		
		Conta cc3 = new ContaCorrente(54, 7245);
		lista.add(cc3);
		
		Conta cc4 = new ContaCorrente(26, 5431);
		lista.add(cc4);
		
		Conta cc5 = new ContaCorrente(74, 2546);
		lista.add(cc5);
		
		for(int i = 0; i < lista.size(); i++) {
			Object oRef =  lista.get(i);
			System.out.println(oRef);
		}
		
		System.out.println("------------------");
		
		for(Conta conta : lista) { 
			//outra forma(mais atual) de iterar em um for
			System.out.println(conta);
		}
		
	}
}
