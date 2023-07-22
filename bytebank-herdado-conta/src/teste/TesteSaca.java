package teste;

public class TesteSaca {

	public static void main(String[] args) {
		modelo.Conta conta = new modelo.ContaCorrente(213, 321);
		
		conta.deposita(200);
//		conta.saca(190);
		
		System.out.println("Primeiro saque: " + conta.getSaldo());
		
		try {			
			conta.saca(210);
		} catch (modelo.SaldoInsuficienteExcecption ex) {
			System.out.println("Erro, valor de saldo menor do que o de saque");
			System.out.println("Ex: " + ex.getMessage());
		}
		
		System.out.println("Saldo: " + conta.getSaldo());
		
	}

}
