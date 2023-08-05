package teste.util;

//import java.util.ArrayList;
import java.util.List;
import java.util.LinkedList;
import modelo.Conta;
import modelo.ContaCorrente;

public class TesteArrayList {

	public static void main(String[] args) {
		
		List <Conta> lista = new LinkedList <Conta> ();
		
//		ArrayList <Conta> lista = new ArrayList <Conta> ();
		
		Conta cc = new ContaCorrente(13, 4310);
		lista.add(cc);
		
		Conta cc2 = new ContaCorrente(62, 6234);
		lista.add(cc2);
		
		Conta cc3 = new ContaCorrente(62, 6234);
		
		boolean existe = lista.contains(cc3);
		
		System.out.println("Já existe?: " + existe);
		
		System.out.println("cc é igual a cc3?: " + cc.equals(cc3));
		System.out.println("cc2 é igual a cc3?: " + cc2.equals(cc3));
		
//		for(Conta conta : lista) { 
//			if(conta.equals(cc3)) {
//				System.out.println("Já tenho essa conta");
//			} else {
//				System.out.println("Não possuo essa conta");
//			}
//		}
		
		for(Conta conta : lista) { 
			System.out.println(conta);
		}
		
	}
}
