
public class Fluxo {

    public static void main(String[] args) {
        System.out.println("Início do main");
//        Não é necessário colocar "throws MinhaException" pois há um bloco try catch
        try {
        	metodo1();        	            	
        } catch(ArithmeticException | NullPointerException | MinhaException ex) {
        	String msg = ex.getMessage(); //msg guarda a mensagem de erro
        	System.out.println("Exception " + msg);
        	ex.printStackTrace(); //Mostra o rastro por onde houve erros no código
        }
        	System.out.println("Fim do main");
    }

    private static void metodo1() throws MinhaException {
//    	Usando throws pois MinhaException é checked, herda diretamente de Exception
        System.out.println("Início do metodo1");
        
        metodo2();
        
        System.out.println("Fim do metodo1");
    }

    private static void metodo2() throws MinhaException {
        System.out.println("Início do metodo2");
        new MinhaException("Deu errado");
//        System.out.println("Fim do metodo2");
    }
}

// MinhaException faz parte da categoria checked e ela é necessária explicitar na assinatura do método
// Nas de tipo unchecked não é necessário
// Checked são chamadas de "checked" (checadas) porque o compilador verifica 
// se essas exceções foram tratadas ou se foram lançadas novamente usando o comando "throws"

//a primeira obriga o desenvolvedor a tratá-la(checked), isto é, usar umas das duas formas básicas de tratamento
// de exceção no Java: captura ou tratamento(try catch); enquanto a segunda exceção não o faz