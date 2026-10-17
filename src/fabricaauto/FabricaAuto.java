

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt
 * to change this license
 */
package fabricaauto;

/**
 * UNIUBE
 * CURSO: ANÁLISE E DESENVOLVIMENTO DE SISTEMAS
 * ACQA - PROGRAMAÇÃO ORIENTADA A OBJETOS
 *
 * @author VINICIUS SILVA DE ANDRADE
 * RA1221535
 */

/**
 * Classe principal do sistema fabricaAuto.
 *
 * Responsabilidades:
 * - Disponibilizar o ponto de entrada da aplicação.
 * - Instanciar a classe Menu.
 * - Iniciar a execução do sistema.
 *
 * O gerenciamento dos veículos e a interação com o usuário
 * são realizados pela classe Menu.
 *
 * A leitura e a validação dos dados são apoiadas pelas classes
 * EntradaUtil e Validador, respectivamente.
 *
 * As regras de negócio permanecem nas classes
 * Automovel, Carro e Moto.
 */
public class FabricaAuto {

    /**
     * Método principal da aplicação.
     *
     * Cria um objeto da classe Menu e inicia a execução
     * do sistema.
     *
     * @param args argumentos recebidos na inicialização
     */
    public static void main(String[] args) {

        // Cria o objeto responsável pela interação com o usuário.
        Menu menu = new Menu();

        // Inicia o menu principal e o fluxo de execução do sistema.
        menu.iniciar();
    }
}

