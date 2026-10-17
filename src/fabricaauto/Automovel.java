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
 * Classe pai que representa as características e os comportamentos
 * comuns a todos os automóveis do sistema.
 *
 * Carro e Moto herdam desta classe para evitar duplicação de código.
 */
public class Automovel {

    /*
     * Atributos comuns a carros e motos.
     *
     * private: impede o acesso direto aos atributos de outras classes.
     * String: utilizado para informações textuais.
     * int: utilizado nos estados que o exercício define como 0 ou 1.
     */
    private String cor;
    private String placa;
    private String modelo;
    private int ligado;
    private int movimento;

    /**
     * Construtor responsável por inicializar os dados comuns.
     *
     * Todo veículo começa desligado e parado, independentemente
     * do tipo de veículo cadastrado.
     */
    public Automovel(String cor, String placa, String modelo) {
        this.cor = cor;
        this.placa = placa;
        this.modelo = modelo;
        this.ligado = 0;
        this.movimento = 0;
    }

    // Métodos de acesso aos atributos comuns.

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getLigado() {
        return ligado;
    }

    /**
     * Permite alterar o estado de ligado somente para 0 ou 1.
     */
    public void setLigado(int ligado) {
        validarEstado(ligado, "ligado");
        this.ligado = ligado;
    }

    public int getMovimento() {
        return movimento;
    }

    /**
     * Permite alterar o estado de movimento somente para 0 ou 1.
     */
    public void setMovimento(int movimento) {
        validarEstado(movimento, "movimento");
        this.movimento = movimento;
    }

    /**
     * Valida os estados binários definidos pelo exercício.
     * Centralizar essa regra evita repetir a mesma validação.
     */
    protected void validarEstado(int estado, String atributo) {
        if (estado != 0 && estado != 1) {
            throw new IllegalArgumentException(
                "O atributo " + atributo + " aceita somente 0 ou 1."
            );
        }
    }

    /**
     * Liga o veículo e atualiza seu estado.
     *
     * Um veículo que já está ligado não precisa ser ligado novamente.
     */
    public void ligar() {
        if (ligado == 1) {
            System.out.println("O veículo já está ligado.");
            return;
        }

        ligado = 1;
        System.out.println("O veículo está ligado.");
    }

    /**
     * Coloca o veículo em movimento somente se estiver ligado.
     *
     * A validação é necessária para impedir uma operação incompatível
     * com o estado atual do veículo.
     */
    public void mover() {
        if (ligado == 0) {
            System.out.println(
                "Não é possível mover o veículo: ligue-o primeiro."
            );
            return;
        }

        if (movimento == 1) {
            System.out.println("O veículo já está em movimento.");
            return;
        }

        movimento = 1;
        System.out.println("O veículo está em movimento.");
    }

    /**
     * Interrompe o movimento somente se o veículo estiver se movendo.
     */
    public void parar() {
        if (movimento == 0) {
            System.out.println("O veículo já está parado.");
            return;
        }

        movimento = 0;
        System.out.println("O veículo está parado.");
    }
    
    /**
     * Desliga o veículo somente quando ele está ligado e parado.
     */
    public void desligar() {
        if (getLigado() == 0) {
            System.out.println("O veículo já está desligado.");
            return;
        }

        if (getMovimento() == 1) {
            System.out.println(
                    "Não é possível desligar o veículo em movimento. "
                    + "Pare o veículo primeiro."
            );
            return;
        }

        setLigado(0);
        System.out.println("Veículo desligado com sucesso.");
    }

}

