/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fabricaauto;

/**
* UNIUBE
* CURSO: ANÁLISE E DESENVOLVIMENTO DE SISTEMAS
* DISCENTE: VINICIUS SILVA DE ANDRADE
* ACQA - PROGRAMAÇÃO ORIENTADA A OBJETOS
* RA1221535
 */

import java.util.Scanner;

public class EntradaUtil {

    private static final Scanner scanner = new Scanner(System.in);

    public static int lerInteiro(String mensagem) {
        while (true) {
            System.out.print(mensagem);

            String entrada = scanner.nextLine().trim();

            try {
                return Integer.parseInt(entrada);
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Digite um número inteiro.");
            }
        }
    }

    public static String lerTexto(String mensagem) {
        System.out.print(mensagem);
        return scanner.nextLine().trim();
    }
}

