package teste;

public class TesteConexao {

	public static void main(String[] args) {
		
		try(modelo.Conexao conexao = new modelo.Conexao() ){
			conexao.leDados();
		} catch (IllegalStateException ex) {
			System.out.println("Deu erro na conexão");
		}
		
		
		
		
		//--------------
//		Conexao con = null;
//		try {
//			con = new Conexao();
//			con.leDados();
//		} catch (IllegalStateException ex){
//			System.out.println("Erro na conexão");
//		} finally {
//			System.out.println("Finally");
//			if (con != null) {				
//				con.close();
//			}
//		}
	}
}
