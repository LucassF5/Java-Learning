package teste.util;

import java.util.ArrayList;
import java.util.List;
public class TesteWrapperInteger {

        public static void main(String[] args) {

                int idade = 29;//Integer
                Integer idadeRef = Integer.valueOf(idade); // Autoboxing
                // tipo int vira Integer(Classe) - Wrapper 
				// Transforma o primitivo em objeto, e guarda a referência no array
				// Wrapper - Classe que representa um tipo primitivo e embrulha, transformando em um objeto
                
                System.out.println(idadeRef.doubleValue());
                
                int valor = idadeRef.intValue(); //Unboxing
                
                String s = args[0];
                
//              Integer numero = Integer.valueOf(s);
                int numero = Integer.parseInt(s); // parseInt já transforma a Str em Int	
                System.out.println(numero);
                
                List<Integer> numeros = new ArrayList<Integer>();
                numeros.add(29); //Autoboxing
				// Java automaticamente pega o primitivo e cria em um objeto, logo após guarda a referência no array

        }
}