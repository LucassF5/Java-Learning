class Conta{
	private double saldo;
	//Um atributo privado não pode ser nem lido e nem alterado, a não ser que seja na própria classe
	private int agencia;
	private int numero;
	private Cliente titular; //Atribuindo uma referência ao atributo titular//associação
	private static int total; // passa a ser um atributo da classe, não mais da instância
	// passa a ser um total da classe
	
	
	//constructor
	// diferente de método pois não possui retorno
	public Conta(int agencia, int numero){
		Conta.total++;
		//System.out.println("O total de contas é: " + total);
		
		this.agencia = agencia;
		this.numero = numero;
		this.saldo = 100;
		//System.out.println("Criando uma conta " + this.numero);
	}
	
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
		if(numero <= 0) {
			System.out.println("Não pode valor menor ou igual a 0");
			return;
		}
		this.numero = numero;
	}
	
	public int getAgencia() {
		return this.agencia;
	}
	
	public void setAgencia(int agencia) {
		if(agencia <= 0) {
			System.out.println("Não pode valor menor ou igual a 0");
			return; // não vai retornar nada e ainda parar a execução do método
		}
		this.agencia = agencia;
	}
		
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public Cliente getTitular() {
		return titular;
	}
	
	public static int getTotal() {
		return Conta.total;
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

