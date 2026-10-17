/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fabricaauto;

/**
 * UNIUBE
 * CURSO: ANÁLISE E DESENVOLVIMENTO DE SISTEMAS
 * @author VINICIUS SILVA DE ANDRADE
 * ACQA - PROGRAMAÇÃO ORIENTADA A OBJETOS
 * RA1221535
 */

public class Validador {

    private Validador() {
        // Impede a criação de objetos desta classe utilitária.
    }

    public static boolean textoObrigatorio(String texto) {
        return texto != null && !texto.trim().isEmpty();
    }

    public static boolean estadoValido(int estado) {
        return estado == 0 || estado == 1;
    }

    public static boolean opcaoValida(
            int opcao, int minimo, int maximo) {
        return opcao >= minimo && opcao <= maximo;
    }
}

