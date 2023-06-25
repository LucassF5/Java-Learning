
public abstract class Funcionario {
//	Com abstract não pode mais instanciiar objetos dessa classe
	
	private String nome;
	private String cpf;
	private double salario;
//	protected significa público para os filhos
	
	
//	método sem corpo, não há implementação
//	Só há implementação nas classes filhas
//	Com um método abstrato, todos os filhos são obrigados a colocar esse método
	public abstract double getBonificacao();
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
}
