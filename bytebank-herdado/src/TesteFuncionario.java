
public class TesteFuncionario {

	public static void main(String[] args) {

		Funcionario lucas = new Gerente();
		lucas.setNome("Lucas Franco");
		lucas.setCpf("002244668-90");
		lucas.setSalario(2023.60);
		
		System.out.println(lucas.getNome());
		System.out.println(lucas.getBonificacao());
	}

}
