
package fabricaauto;

/**
 * UNIUBE
 * CURSO: ANÁLISE E DESENVOLVIMENTO DE SISTEMAS
 * ACQA - PROGRAMAÇÃO ORIENTADA A OBJETOS
 *
 * Representa um carro, especialização da classe Automovel.
 *
 * Regras específicas:
 * - O carro não pode ser aberto enquanto estiver em movimento.
 * - O carro não pode ser movimentado enquanto estiver aberto.
 */
public class Carro extends Automovel {

    /** Indica se o carro possui teto solar: 0 - Não, 1 - Sim. */
    private int tetoSolar;

    /** Indica se o carro está aberto: 0 - Não, 1 - Sim. */
    private int aberto;

    /**
     * Construtor da classe Carro.
     *
     * @param cor cor do veículo
     * @param placa placa do veículo
     * @param modelo modelo do veículo
     * @param tetoSolar indica se possui teto solar (0 ou 1)
     */
    public Carro(String cor, String placa, String modelo, int tetoSolar) {
        super(cor, placa, modelo);
        this.tetoSolar = tetoSolar;
        this.aberto = 0;
    }

    /** Retorna se o carro possui teto solar. */
    public int getTetoSolar() {
        return tetoSolar;
    }

    /** Define se o carro possui teto solar. */
    public void setTetoSolar(int tetoSolar) {
        validarEstado(tetoSolar, "teto solar");
        this.tetoSolar = tetoSolar;
    }

    /** Retorna o estado de abertura do carro. */
    public int getAberto() {
        return aberto;
    }

    /** Define o estado de abertura do carro. */
    public void setAberto(int aberto) {
        validarEstado(aberto, "aberto");
        this.aberto = aberto;
    }

    /**
     * Abre ou fecha o carro.
     *
     * O carro só pode ser aberto quando estiver parado.
     * Se estiver aberto, pode ser fechado quando estiver parado.
     */
    public void abrirFechar() {

        // Impede qualquer alteração de abertura durante o movimento.
        if (getMovimento() == 1) {
            System.out.println(
                    "Operação não permitida: pare o carro antes de abrir ou fechar."
            );
            return;
        }

        // Alterna entre aberto (1) e fechado (0).
        if (aberto == 0) {
            aberto = 1;
            System.out.println("Carro aberto com sucesso.");
        } else {
            aberto = 0;
            System.out.println("Carro fechado com sucesso.");
        }
    }

    /**
     * Movimenta o carro somente quando estiver fechado.
     *
     * Sobrescreve o método mover() herdado de Automovel.
     */
    @Override
    public void mover() {

        // Impede o movimento enquanto o carro estiver aberto.
        if (aberto == 1) {
            System.out.println(
                    "Operação não permitida: feche o carro antes de movimentá-lo."
            );
            return;
        }

        // Executa a implementação original da classe Automovel.
        super.mover();
    }
}
