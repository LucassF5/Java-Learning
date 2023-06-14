
public class TestaMetodo {

	public static void main(String[] args) {
		Conta contaDoLucas = new Conta();
		contaDoLucas.saldo = 100;
		contaDoLucas.deposita(50);
		System.out.println(contaDoLucas.saldo);
		
		boolean conseguiuRetirar = contaDoLucas.saca(20);
		//contaDoLucas.saca(20);
		System.out.println(contaDoLucas.saldo);
		System.out.println("Conseguiu retirar o dinheiro?: " + conseguiuRetirar);
		
		Conta contaAlguem = new Conta();
		contaAlguem.deposita(1000);
		boolean sucessoTransferencia = contaAlguem.transfere(3000, contaDoLucas);
		
		if(sucessoTransferencia) {
			System.out.println("Transferência feita com sucesso");
		} else {
			System.out.println("Faltou dinheiro");
		}
		System.out.println(contaAlguem.saldo);
		System.out.println(contaDoLucas.saldo);
		
		contaDoLucas.titular = "Lucas Franco";
		System.out.println(contaDoLucas.titular);
	}
}
