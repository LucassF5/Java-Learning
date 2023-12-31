package modelo;

/**
 * Classe que representa a moldura de uma conta
 * 
 * @author Lucas Franco
 *
 */

public abstract class Conta {

    protected double saldo; //protected só os filhos enxergam
    private int agencia; //private só a classe enxerga
    private int numero;
    private Cliente titular;
    private static int total = 0;

    /**
     * Construtor para inicializar o objeto Conta a partir de agência e número
     * 
     * @param agencia
     * @param numero
     */
    
    public Conta(int agencia, int numero){
        Conta.total++;
//        System.out.println("O total de contas é " + Conta.total);
        this.agencia = agencia;
        this.numero = numero;
//        this.saldo = 100;
//        System.out.println("Estou criando uma conta " + this.numero);
    }

    public abstract void deposita(double valor);
//    {
//        this.saldo = this.saldo + valor;
//    }

    /**
     * Valor precisa ser maior que o saldo
     * 
     * @param valor
     * @throws SaldoInsuficienteExcecption
     */
    
    public void saca(double valor) throws SaldoInsuficienteExcecption{
        if(this.saldo < valor) {
        	throw new SaldoInsuficienteExcecption("Saldo: " + this.saldo + " Valor: " + valor);
        } 
        
        this.saldo -= valor;
    }

    public void transfere (double valor, Conta destino) throws SaldoInsuficienteExcecption {
        this.saca(valor);
        destino.deposita(valor);
    }

    public double getSaldo(){
        return this.saldo;
    }

    public int getNumero(){
        return this.numero;
    }

    public void setNumero(int numero){
        if(numero <= 0) {
            System.out.println("Nao pode valor menor igual a 0");
            return;
        }
        this.numero = numero;
    }

    public int getAgencia(){
        return this.agencia;
    }

    public void setAgencia(int agencia){
       if(agencia <= 0) {
           System.out.println("Nao pode valor menor igual a 0");
           return;
       }
       this.agencia = agencia;
    }

    public void setTitular(Cliente titular){
        this.titular = titular;
    }

    public Cliente getTitular(){
        return this.titular;
    }

    public static int getTotal(){
        return Conta.total;
    }
    
    @Override
    public boolean equals(Object ref) {
    	
    	Conta outra = (Conta) ref;
    	
    	if(this.agencia != outra.agencia) {
    		return false;
    	}
    	
    	if(this.numero != outra.agencia) {
    		return false;
    	} 
//    	else implícito
    	return true;
    	
    }
    
    @Override
	public String toString() {
		return "Agência: " + this.agencia + ", Número: " + this.numero;
	}

}