package br.lucas.bytebank;

import modelo.Conta;
import modelo.ContaCorrente;

public class TesteBiblioteca { 

    public static void main(String[] args) { 

        Conta c = new ContaCorrente(123, 321);

        c.deposita(200);
        
        System.out.println(c.getSaldo());
    }

} 
