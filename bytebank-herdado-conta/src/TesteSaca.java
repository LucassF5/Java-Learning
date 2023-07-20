
public class TesteSaca {

	public static void main(String[] args) {
		Conta conta = new ContaCorrente(213, 321);
		
		conta.deposita(200);
		conta.saca(190);
		
		System.out.println("Primeiro saque: " + conta.getSaldo());
		
		conta.saca(10);
		
		System.out.println("Segundo saque: " + conta.getSaldo());
		
	}

}
