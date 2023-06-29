
//Gerente é um FuncionarioAutenticavel, Gerente herda da classe FuncionarioAutenticavel
public class Gerente extends FuncionarioAutenticavel {
	//extends serve para a classe herdar métodos de outra
	//Assim, gerente passa a ser um funcionário e possui seus campos
	
	private int senha;
	
	
	public void setSenha(int senha) {
		this.senha = senha;
	}
	
	public boolean autentica(int senha) {
		if(this.senha == senha) {
			return true;
		} else {
			return false;
		}
		
	}
	
	public double getBonificacao() {
		System.out.println("Chamando o método de bonificação do GERENTE");
		return super.getSalario();
//		super serve pra dizer que o atributo está em uma classe superior, não foi definido aqui
//		o salário vem de cima
//		reescrita, reescrevendo um trecho da classe mãe na classe filha
	}
	
}
