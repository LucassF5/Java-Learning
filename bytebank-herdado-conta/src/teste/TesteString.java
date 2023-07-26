package teste;

import java.util.Iterator;

public class TesteString {

	public static void main(String[] args) {

//		String é imutável
		String nome = "Lucas"; //object literal
		
		String vazio = "   vazio   ";
		String outroVazio = vazio.trim(); 
		//.trim retira os espaços do começo e final de uma string
		
		System.out.println("A string está vazia? " + outroVazio.isEmpty());
		System.out.println(vazio.contains("z")); 
		//.contains retorna se possui uma string ou substring
		
//		nome.toLowerCase();
//		nome.replace("a", "A"); //Não haverá mudança pois a variável não muda de tipo
//		É necessário utilizar outra vartiável
		
//		char c = nome.charAt(1); //para saber qual o caracter do índice 1
//		System.out.println(c);
		
//		int pos = nome.indexOf("uc");
//		System.out.println(pos);
		
//		String sub = nome.substring(1);
//		System.out.println(sub);
		
		System.out.println("Tamanho da string é: " +nome.length());
		
		for(int i = 0; i < nome.length(); i++) {
			System.out.println(nome.charAt(i));
		}
		
//		char c = 's';
//		char d = 'S';
//		String outro = nome.replace(c,d);
		
//		System.out.println(nome);
//		System.out.println(outro);
	}

}
