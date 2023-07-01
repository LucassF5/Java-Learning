
//Gerente é um Funcionario, Gerente herda da classe Funcionario, assina o contrato Autenticavel
public class Gerente extends Funcionario implements Autenticavel {
	//extends serve para a classe herdar métodos de outra
	//Assim, gerente passa a ser um funcionário e possui seus campos
	
	private AutenticacaoUtil autenticador;
	
	public Gerente() {
		this.autenticador = new AutenticacaoUtil();
	}	
	public double getBonificacao() {
//		System.out.println("Chamando o método de bonificação do GERENTE");
		return super.getSalario();
		
//		super serve pra dizer que o atributo está em uma classe superior, não foi definido aqui
//		o salário vem de cima
//		reescrita, reescrevendo um trecho da classe mãe na classe filha
	}

	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);
	}

	@Override
	public boolean autentica(int senha) {
		return this.autenticador.autentica(senha);
	}
	
}
