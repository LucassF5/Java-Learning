
public class ContaCorrente extends Conta implements Tributavel {

	
	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero);
//		super implícito que chama o construtor da classe mãe
//		passando os parâmetros do construtor expecífico o java aceita
//		Construtores não são herdados, é necessário escrever os próprios com super fazendo a chamada
	}
	
	@Override
//	Override serve pra sobrescrever um método já existente
//	reescrevendo o método saca
	public void saca(double valor) {
		double valorASacar = valor + 0.2;
		super.saca(valorASacar);
	}

	@Override
	public void deposita(double valor) {
		super.saldo += valor;
	}

	@Override
	public double getValorImposto() {
		return super.saldo * 0.01;
	}
}
