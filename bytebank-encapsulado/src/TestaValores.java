
public class TestaValores {

	public static void main(String[] args) {
		Conta conta = new Conta(1337, 24226);
		
		// conta está incosistente
		//conta.setAgencia(-350);
	    //conta.setNumero(-330);
		
		System.out.println(conta.getAgencia());
		
		conta.setAgencia(2345);
		
		// Conta conta2 = new Conta(1337, 9234);
		System.out.println(Conta.getTotal());

	}
}
