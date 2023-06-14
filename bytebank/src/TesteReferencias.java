
public class TesteReferencias {

	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 300;

		System.out.println("Saldo da primeira conta: " + primeiraConta.saldo);

		Conta segundaConta = primeiraConta;
		/*
		 * Vai ser uma referência para o mesmo lugar da primeira conta 
		 * Referências são caminhos que levam ao mesmo lugar
		 */

		System.out.println("Saldo da segunda conta: " + segundaConta.saldo);

		if (primeiraConta == segundaConta) {
			System.out.println("São a mesma conta, apenas duas referências " + "para a mesma coisa");
		}
	}
}
