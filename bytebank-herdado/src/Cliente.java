
public class Cliente implements Autenticavel {
//	Quem assina o contrato da interface implementa seus métodos

	private AutenticacaoUtil autenticador;
	
	public Cliente() {
		this.autenticador = new AutenticacaoUtil();
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
