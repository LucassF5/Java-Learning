
public class Fluxo {

    public static void main(String[] args) {
        System.out.println("Início do main");
        try {
        	metodo1();        	            	
        } catch(ArithmeticException ex) {
//        	String msg = ex.getMessage(); //msg guarda a mensagem de erro
//        	System.out.println("ArithmeticException" + msg);
        	ex.printStackTrace(); //Mostra o rastro por onde houve erros no código
        } catch(NullPointerException ex) {
        	String msg = ex.getMessage();
        	System.out.println("NullPointerException" + msg);
//        	ex.printStackTrace(); //Mostra o rastro por onde houve erros no código
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
        for(int i = 1; i <= 5; i++) {
            System.out.println(i);
//          int a = i/0;
            Conta c = null;
            c.deposita(); 
        }
        System.out.println("Fim do metodo2");
    }
}