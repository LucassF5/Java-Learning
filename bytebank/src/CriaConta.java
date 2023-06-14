
public class CriaConta {

	public static void main(String[] args) {
		Conta primeiraConta= new Conta(); 
		//Instânciando e criando um objeto do tipo conta
		System.out.println("Primeira conta");
		primeiraConta.saldo = 200;
		System.out.println(primeiraConta.saldo);
		
		primeiraConta.saldo += 100;
		System.out.println(primeiraConta.saldo);
		
		System.out.println();
		System.out.println("Segunda conta");
		Conta segundaConta = new Conta();
		segundaConta.saldo = 50;
		System.out.println(segundaConta.saldo);
		
		System.out.println("Por padrão os valores são zerados no Java");
		
		System.out.println("O valor da agência da primeira conta é " 
		+ primeiraConta.agencia);
		System.out.println("O valor da agência da segunda conta é " 
		+ segundaConta.agencia);
		segundaConta.agencia = 59;
		System.out.println("Agora o valor da segunda agência é " 
		+ segundaConta.agencia);
		
	}
}
