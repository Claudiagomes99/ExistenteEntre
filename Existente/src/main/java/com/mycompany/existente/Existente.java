/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.existente;

/**
 *
 * @author Gomes
 */

public class Existente {
   public static void main(String[] args) {
        int inicio = 100, fim = 125; // numeros limite
        int cont = 0;

        do {
            cont++;
            inicio++;
        } while (inicio <= fim); // basicamente como verificar os numeros

        System.out.println("Quantidade de números entre 100 e 125: " + cont); // mensagem final, resultado 
    }
}