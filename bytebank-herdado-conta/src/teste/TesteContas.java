package teste;

public class TesteContas {

	public static void main(String[] args) throws modelo.SaldoInsuficienteExcecption{
		//Full Qualified Name FQN
		modelo.ContaCorrente cc = new modelo.ContaCorrente(111, 111);
		cc.deposita(100);
		
		modelo.ContaPoupanca cp = new modelo.ContaPoupanca(222, 222);
		cp.deposita(200);
		
		cc.transfere(10, cp);
		
		System.out.println("CC:" + cc.getSaldo());
		System.out.println("CP:" + cp.getSaldo());
	}

}
