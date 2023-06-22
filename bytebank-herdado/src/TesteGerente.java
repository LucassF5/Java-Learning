
public class TesteGerente {

	public static void main(String[] args) {
		Gerente g1 = new Gerente();
		g1.setNome("Lucas");
		g1.setCpf("4322541");
		g1.setSalario(5000.0);
		
		System.out.println(g1.getNome());
		System.out.println(g1.getCpf());
		System.out.println(g1.getSalario());
		
		g1.setSenha(23445);
		boolean autenticou = g1.autentica(23445);
		
		System.out.println(autenticou);
		
		System.out.println(g1.getBonificacao());
		
	}

}
