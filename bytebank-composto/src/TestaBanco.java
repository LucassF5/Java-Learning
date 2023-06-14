
public class TestaBanco {

	public static void main(String[] args) {
		Cliente lucas = new Cliente();
		lucas.nome = "Lucas Franco";
		lucas.cpf = "222.222.222-22";
		lucas.profissao = "programador";
		
		Conta contaDoLucas = new Conta();
		contaDoLucas.deposita(100);
		
		contaDoLucas.titular = lucas; //fazendo a composição, interligando
		System.out.println(contaDoLucas.titular.nome);
		System.out.println(contaDoLucas.titular); //(1)
		System.out.println(lucas); //(2)
		//1 e 2 fazem referência ao mesmo objeto, sendo ambos a mesma coisa
	}
}
