class Conta{
	private double saldo;
	//Um atributo privado não pode ser nem lido e nem alterado, a não ser que seja na própria classe
	private int agencia;
	private int numero;
	private Cliente titular;
	//Atribuindo uma referência ao atributo titular//associação
	
	public void deposita(double valor) {
		this.saldo += valor;
	}
	
	public boolean saca(double valor) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		} else {
			return false;
		}
	}
	
	public boolean transfere(double valor, Conta destino) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			destino.deposita(valor);
			return true;
		}
		return false;
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public int getNumero() {
		return this.numero;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public int getAgencia() {
		return this.agencia;
	}
	
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
		
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public Cliente getTitular() {
		return titular;
	}
	
}
/*
Quando o Java cria objetos, todos seus atributos são zerados (valor default)
A não ser que seja definido na especificação

A maneira como vai se fazer algo, comportamentos, se chama métodos
Maneira de fazer alguma coisa

this. é uma variável de referência que diz respeito a instância atual de um objeto
this serve como sujeito, quem vai praticar a ação

Quando muitas informações correlatas aparecerem é melhor criar uma nova classe
*/

