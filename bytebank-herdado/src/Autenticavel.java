//Interface é um tipo de contrato
//contrato Autenticavel
	//Quem assina esse contrato precia implementar
		//metodo setSenha
		//metodo autentica

public abstract interface Autenticavel {
//	Interface não pode ter nada concreto, tudo abstrato
	
	public abstract void setSenha(int senha);
	
	public abstract boolean autentica(int senha);
}
