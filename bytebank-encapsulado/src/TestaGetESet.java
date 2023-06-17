
public class TestaGetESet {

	public static void main(String[] args) {
		Conta conta = new Conta();
		//conta.numero = 1337; não funciona pois numero agora é privado
		conta.setNumero(1337);
		System.out.println(conta.getNumero());
		
		Cliente lucas = new Cliente();
		//conta.titular = lucas;
		lucas.setNome("Lucas Franco");
		conta.setTitular(lucas);
		System.out.println(conta.getTitular().getNome());
		
		conta.getTitular().setProfissao("Programador");
		//System.out.println(conta.getTitular().getProfissao();
		Cliente titularDaConta = conta.getTitular();
		titularDaConta.setProfissao("Srogramador"); // mesma coisa do que estava setando primeiro
		
	}
}
