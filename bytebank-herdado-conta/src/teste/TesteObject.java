package teste;

import modelo.Cliente;
import modelo.ContaCorrente;
import modelo.ContaPoupanca;

public class TesteObject {

	public static void main(String[] args) {

		System.out.println("x");
		System.out.println(3);
		System.out.println(false);
		
		ContaCorrente cc = new ContaCorrente(22, 33);
		Object cp = new ContaPoupanca(33, 22); 
		//ContaPoupanca é a forma mais específica, object é a forma mais abstrata
		//Pois todas as classes derivam da classe Object
		Object cliente = new Cliente();
		
//		System.out.println(cc.toString()); não precisa chamar .toString pois o método println já chama
		System.out.println(cc);
		System.out.println(cp);
		
//		println funciona com qualquer tipo de código pois qualquer tipo de referência
//		é compatível com a classe Object, classe primitiva de todas
		

	}
  static void println() {}
  static void println(int a) {}
  static void println(boolean valor) {}

  static void println(Object referencia) {
  }
  
}
