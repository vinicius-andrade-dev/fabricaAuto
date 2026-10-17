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

/**
 * Representa uma moto e suas características específicas.
 */
public class Moto extends Automovel {

    // Atributos exclusivos da moto.
    private int freioAbs;
    private int bau;

    /**
     * O construtor reutiliza a inicialização dos dados comuns
     * realizada pela classe Automovel.
     */
    public Moto(
            String cor,
            String placa,
            String modelo,
            int freioAbs,
            int bau) {

        super(cor, placa, modelo);

        validarEstado(freioAbs, "freioAbs");
        validarEstado(bau, "bau");

        this.freioAbs = freioAbs;
        this.bau = bau;
    }

    public int getFreioAbs() {
        return freioAbs;
    }

    public void setFreioAbs(int freioAbs) {
        validarEstado(freioAbs, "freioAbs");
        this.freioAbs = freioAbs;
    }

    public int getBau() {
        return bau;
    }

    public void setBau(int bau) {
        validarEstado(bau, "bau");
        this.bau = bau;
    }

    /**
     * Exibe a mensagem solicitada pelo exercício.
     *
     * Como o enunciado não exige controlar o estado do alarme,
     * este método não adiciona um atributo novo.
     */
    public void alarme() {
        System.out.println("alarme ligado");
    }
}

