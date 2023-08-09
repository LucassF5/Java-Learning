package teste.util;

import java.util.ArrayList;
import java.util.List;
public class Teste {

        public static void main(String[] args) {

                int[] idades = new int[5];

                String[] nomes = new String[5];

                int idade = 29;//Integer
                Integer idadeRef = new Integer(29); // tipo int vira Integer(Classe) - Wrapper
				// Transforma o primitivo em objeto, e guarda a referência no array
				// Wrapper - Classe que representa um tipo primitivo e embrulha, transformando em um objeto
                List<Integer> numeros = new ArrayList<Integer>();
                numeros.add(29); //Autoboxing
				// Java automaticamente pega o primitivo e cria em um objeto, logo após guarda a referência no array

        }
}