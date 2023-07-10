
public class Fluxo {

    public static void main(String[] args) {
        System.out.println("Início do main");
        try {
        	metodo1();        	            	
        } catch(ArithmeticException | NullPointerException | MinhaException ex) {
        	String msg = ex.getMessage(); //msg guarda a mensagem de erro
        	System.out.println("Exception " + msg);
        	ex.printStackTrace(); //Mostra o rastro por onde houve erros no código
        }
        	System.out.println("Fim do main");
    }

    private static void metodo1() {
        System.out.println("Início do metodo1");
        metodo2();
        System.out.println("Fim do metodo1");
    }

    private static void metodo2() {
        System.out.println("Início do metodo2");
        throw new MinhaException("Deu errado");
//        System.out.println("Fim do metodo2");
    }
}