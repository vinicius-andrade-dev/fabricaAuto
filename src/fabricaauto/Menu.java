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

import java.util.ArrayList;
import java.util.List;

public class Menu {

    /*
     * Lista que armazena todos os veículos cadastrados.
     *
     * Como Carro e Moto herdam de Automovel, ambos podem
     * ser armazenados na mesma lista.
     */
    private final List<Automovel> listaVeiculos = new ArrayList<>();

    /**
     * Inicia o sistema e mantém o menu principal em execução
     * até que o usuário escolha a opção de sair.
     */
    public void iniciar() {
        int opcao;

        try {
            do {
                exibirMenuPrincipal();

                // Lê a opção escolhida pelo usuário.
                opcao = EntradaUtil.lerInteiro("Escolha uma opção: ");

                // Encaminha a execução conforme a opção escolhida.
                switch (opcao) {
                    case 1:
                        cadastrarCarro();
                        break;

                    case 2:
                        cadastrarMoto();
                        break;

                    case 3:
                        listarVeiculos();
                        break;

                    case 4:
                        selecionarVeiculo();
                        break;

                    case 0:
                        System.out.println("Sistema encerrado.");
                        break;

                    default:
                        System.out.println("Opção inválida.");
                }

            } while (opcao != 0);

        } catch (IllegalStateException e) {
            // Informa quando não há mais dados disponíveis para leitura.
            System.out.println(
                    "\nEntrada de dados encerrada. Encerrando sistema."
            );
        }
    }

    /**
     * Apresenta as opções disponíveis no menu principal.
     */
    private void exibirMenuPrincipal() {
        System.out.println("\n========== FABRICA AUTO ==========");
        System.out.println("1 - Cadastrar carro");
        System.out.println("2 - Cadastrar moto");
        System.out.println("3 - Listar veículos cadastrados");
        System.out.println("4 - Selecionar veículo");
        System.out.println("0 - Sair");
        System.out.println("==================================");
    }

    /**
     * Lê um texto obrigatório, utilizando a classe EntradaUtil.
     *
     * Caso o usuário informe um texto vazio, solicita novamente.
     *
     * @param mensagem mensagem apresentada ao usuário
     * @return texto informado após a validação
     */
    private String lerTextoObrigatorio(String mensagem) {
        while (true) {
            String valor = EntradaUtil.lerTexto(mensagem);

            if (Validador.textoObrigatorio(valor)) {
                return valor;
            }

            System.out.println("O campo não pode ficar vazio.");
        }
    }

    /**
     * Lê e valida um estado binário.
     *
     * Aceita somente os valores 0 e 1.
     *
     * @param mensagem mensagem apresentada ao usuário
     * @return estado validado
     */
    private int lerEstado(String mensagem) {
        while (true) {
            int estado = EntradaUtil.lerInteiro(mensagem);

            if (Validador.estadoValido(estado)) {
                return estado;
            }

            System.out.println(
                    "Valor inválido. Digite somente 0 ou 1."
            );
        }
    }

    /**
     * Solicita os dados necessários para cadastrar um carro
     * e adiciona o objeto criado à lista de veículos.
     */
    private void cadastrarCarro() {
        System.out.println("\n--- CADASTRO DE CARRO ---");

        String cor = lerTextoObrigatorio("Cor: ");
        String placa = lerTextoObrigatorio("Placa: ");
        String modelo = lerTextoObrigatorio("Modelo: ");

        // Lê a informação sobre o teto solar.
        int tetoSolar = lerEstado(
                "Possui teto solar? (0 - Não / 1 - Sim): "
        );

        // Cria o objeto e armazena o carro na lista.
        listaVeiculos.add(
                new Carro(cor, placa, modelo, tetoSolar)
        );

        System.out.println("Carro cadastrado com sucesso!");
        System.out.println(
                "Número do veículo: " + listaVeiculos.size()
        );
    }

    /**
     * Solicita os dados necessários para cadastrar uma moto
     * e adiciona o objeto criado à lista de veículos.
     */
    private void cadastrarMoto() {
        System.out.println("\n--- CADASTRO DE MOTO ---");

        String cor = lerTextoObrigatorio("Cor: ");
        String placa = lerTextoObrigatorio("Placa: ");
        String modelo = lerTextoObrigatorio("Modelo: ");

        // Lê as características específicas da moto.
        int freioAbs = lerEstado(
                "Possui freio ABS? (0 - Não / 1 - Sim): "
        );

        int bau = lerEstado(
                "Possui baú? (0 - Não / 1 - Sim): "
        );

        // Cria o objeto e armazena a moto na lista.
        listaVeiculos.add(
                new Moto(cor, placa, modelo, freioAbs, bau)
        );

        System.out.println("Moto cadastrada com sucesso!");
        System.out.println(
                "Número do veículo: " + listaVeiculos.size()
        );
    }

    /**
     * Exibe os veículos cadastrados, incluindo os atributos
     * comuns e as características específicas de cada tipo.
     */
    private void listarVeiculos() {
        System.out.println("\n--- VEÍCULOS CADASTRADOS ---");

        // Verifica se existem veículos registrados.
        if (listaVeiculos.isEmpty()) {
            System.out.println("Nenhum veículo cadastrado.");
            return;
        }

        // Percorre a lista e apresenta os dados de cada veículo.
        for (int i = 0; i < listaVeiculos.size(); i++) {
            Automovel veiculo = listaVeiculos.get(i);

            // Identifica o tipo concreto do objeto.
            String tipo = veiculo instanceof Carro
                    ? "Carro" : "Moto";

            System.out.println("\nNúmero: " + (i + 1));
            System.out.println("Tipo: " + tipo);
            System.out.println("Modelo: " + veiculo.getModelo());
            System.out.println("Placa: " + veiculo.getPlaca());
            System.out.println("Cor: " + veiculo.getCor());

            System.out.println(
                    "Ligado: "
                    + (veiculo.getLigado() == 1 ? "Sim" : "Não")
            );

            System.out.println(
                    "Em movimento: "
                    + (veiculo.getMovimento() == 1 ? "Sim" : "Não")
            );

            // Apresenta os atributos exclusivos de Carro.
            if (veiculo instanceof Carro) {
                Carro carro = (Carro) veiculo;

                System.out.println(
                        "Teto solar: "
                        + (carro.getTetoSolar() == 1 ? "Sim" : "Não")
                );

                System.out.println(
                        "Aberto: "
                        + (carro.getAberto() == 1 ? "Sim" : "Não")
                );

            // Apresenta os atributos exclusivos de Moto.
            } else if (veiculo instanceof Moto) {
                Moto moto = (Moto) veiculo;

                System.out.println(
                        "Freio ABS: "
                        + (moto.getFreioAbs() == 1 ? "Sim" : "Não")
                );

                System.out.println(
                        "Baú: "
                        + (moto.getBau() == 1 ? "Sim" : "Não")
                );
            }
        }
    }

    /**
     * Permite selecionar um veículo cadastrado para executar
     * operações específicas.
     */
    private void selecionarVeiculo() {
        // Impede a seleção quando a lista está vazia.
        if (listaVeiculos.isEmpty()) {
            System.out.println(
                    "Cadastre pelo menos um veículo antes de selecioná-lo."
            );
            return;
        }

        listarVeiculos();

        int numero = EntradaUtil.lerInteiro(
                "\nDigite o número do veículo que deseja selecionar: "
        );

        // Confere se o número corresponde a um veículo existente.
        if (!Validador.opcaoValida(
                numero, 1, listaVeiculos.size())) {

            System.out.println("Número de veículo inválido.");
            return;
        }

        // Converte o número apresentado ao usuário em índice da lista.
        Automovel veiculoSelecionado = listaVeiculos.get(numero - 1);

        menuOperacoes(veiculoSelecionado);
    }

    /**
     * Apresenta as operações disponíveis para o veículo escolhido
     * e encaminha cada comando ao objeto correspondente.
     *
     * @param veiculo veículo selecionado pelo usuário
     */
    private void menuOperacoes(Automovel veiculo) {
        int opcao;

        do {
            System.out.println("\n======= VEÍCULO SELECIONADO =======");
            System.out.println("Modelo: " + veiculo.getModelo());
            System.out.println("Placa: " + veiculo.getPlaca());
            System.out.println("1 - Ligar");
            System.out.println("2 - Mover");
            System.out.println("3 - Parar");
            System.out.println("4 - Desligar");

            // A opção 5 varia conforme o tipo de veículo.
            if (veiculo instanceof Carro) {
                System.out.println("5 - Abrir/fechar carro");
            } else if (veiculo instanceof Moto) {
                System.out.println("5 - Acionar alarme");
            }

            System.out.println("6 - Consultar estado do veículo");
            System.out.println("0 - Voltar ao menu principal");
            System.out.println("==================================");

            opcao = EntradaUtil.lerInteiro(
                    "Escolha uma operação: "
            );

            switch (opcao) {
                case 1:
                    veiculo.ligar();
                    break;

                case 2:
                    veiculo.mover();
                    break;

                case 3:
                    veiculo.parar();
                    break;

                case 4:
                    // A própria classe Automovel verifica se pode desligar.
                    veiculo.desligar();
                    break;

                case 5:
                    // Executa a operação específica do tipo selecionado.
                    if (veiculo instanceof Carro) {
                        ((Carro) veiculo).abrirFechar();

                    } else if (veiculo instanceof Moto) {
                        ((Moto) veiculo).alarme();
                    }
                    break;

                case 6:
                    consultarEstado(veiculo);
                    break;

                case 0:
                    System.out.println("Voltando ao menu principal.");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }

        } while (opcao != 0);
    }

    /**
     * Exibe o estado atual do veículo sem modificar seus atributos.
     *
     * @param veiculo veículo cujos dados serão consultados
     */
    private void consultarEstado(Automovel veiculo) {
        System.out.println("\n--- ESTADO ATUAL ---");
        System.out.println("Modelo: " + veiculo.getModelo());
        System.out.println("Placa: " + veiculo.getPlaca());
        System.out.println("Cor: " + veiculo.getCor());

        System.out.println(
                "Ligado: "
                + (veiculo.getLigado() == 1 ? "Sim" : "Não")
        );

        System.out.println(
                "Em movimento: "
                + (veiculo.getMovimento() == 1 ? "Sim" : "Não")
        );

        // Consulta os atributos específicos de Carro.
        if (veiculo instanceof Carro) {
            Carro carro = (Carro) veiculo;

            System.out.println(
                    "Teto solar: "
                    + (carro.getTetoSolar() == 1 ? "Sim" : "Não")
            );

            System.out.println(
                    "Aberto: "
                    + (carro.getAberto() == 1 ? "Sim" : "Não")
            );

        // Consulta os atributos específicos de Moto.
        } else if (veiculo instanceof Moto) {
            Moto moto = (Moto) veiculo;

            System.out.println(
                    "Freio ABS: "
                    + (moto.getFreioAbs() == 1 ? "Sim" : "Não")
            );

            System.out.println(
                    "Baú: "
                    + (moto.getBau() == 1 ? "Sim" : "Não")
            );
        }
    }
}