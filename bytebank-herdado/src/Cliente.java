
public class Cliente implements Autenticavel {
//	Quem assina o contrato da interface implementa seus métodos
	private int senha;
	
	@Override
	public void setSenha(int senha) {
		this.senha = senha;
	}

	@Override
	public boolean autentica(int senha) {
		if(this.senha == senha) {
			return true;
		} else {
			return false;
		}
	}

}
