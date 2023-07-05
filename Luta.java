
/*Aqui criaremos as condições para a criação da luta e trabalharemos com valores randomicos
 * (aleatórios) para definir vitorias, derrotas, empates.
 */

/*import que possibilita o trabalho com valores aleatórios  */
import java.util.Random;

public class Luta {

    /*
     * private Lutador desafiado;
     * private Lutador desafiante;
     * private int rounds;
     * private boolean aprovada;
     */

    /* Atributos */
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;

    /* getters e setters */
    public void setDesafiado(Lutador de) {
        this.desafiado = de;
    }

    public Lutador getDesafiado() {

        return this.desafiado;
    }

    public void setDesafiante(Lutador des) {

        this.desafiante = des;
    }

    public Lutador getDesafiante() {

        return this.desafiante;
    }

    public void setRounds(int r) {

        this.rounds = r;
    }

    public int getRounds() {

        return this.rounds;
    }

    public void setAprovada(boolean a) {

        this.aprovada = a;
    }

    public boolean getAprovada() {

        return this.aprovada;
    }

    /* métodos */
    /* O método marcarLuta ira verificar se é possivel ocorrer a luta */
    public void marcarLuta(Lutador l1, Lutador l2) {
        /*
         * Para verificar ele ira comparar a categoria e o nome dos lutadores. Caso
         * sejam iguais,
         * a variável aprovada passara a ser verdadeira, e o desafiado e desafiante irão
         * receber como valor a variável criada para lutadores na classe ultraemoji
         */
        if (l1.getCategoria() == l2.getCategoria() && l1.getNome() != l2.getNome()) {

            this.aprovada = true;
            this.desafiado = l1;
            this.desafiante = l2;

        } else {
            /*
             * Caso as condições não sejam favoraveis, a variável aprovada sera falsa e ele
             * informara
             * o usuário através de uma mensagem
             */
            System.out.println(
                    "A luta não pode ocorrer enquanto a categoria e o nome do lutador não forem iguais, o status pós-luta não sofrerá alterações");

            this.aprovada = false;
        }

    }

    /* esse método sera responsavel por criar a luta */
    public void criarLuta() {
        /* Antes de criar a luta ele ira verificar se ela foi aprovada */
        if (this.aprovada) {
            /* Caso a condição seja verdadeira, ele ira imprimir os dados dos lutadores */
            System.out.println("Desafiado");
            this.desafiado.imprimirStatus();
            System.out.println("--------------------------------------");

            System.out.println("Desafiante: ");
            this.desafiante.imprimirStatus();
            System.out.println("-----------------------------------------");
            /* Vamos instanciar a classe random */
            Random aleatorio = new Random();
            /* Vamos criar uma variável para receber os valores gerados pelo random */
            int ganhador = aleatorio.nextInt(3);
            /* Vamos usar o switch para validar o resultado */
            switch (ganhador) {

                case 0:// empate
                    /* Se der empate, ambos lutadores irão receber o metodo imprimirEmpate */
                    this.desafiado.imprimirEmpates(ganhador);
                    this.desafiante.imprimirEmpates(ganhador);
                    System.out.println("Os lutadores empataram");
                    System.out.println("---------------------");
                    break;

                case 1: // desafiado ganhou
                    /*
                     * O desafiafo ira receber o metodo imprimir vitória e o desafiante ira receber
                     * o método imprimir derrota
                     */
                    this.desafiado.imprimirVitoria(ganhador);
                    this.desafiante.imprimirDerrotas(ganhador);
                    System.out.println("O desafiado " + this.desafiado.getNome() + " ganhou a luta");
                    System.out.println("---------------------------------------------------------");
                    break;

                case 2: // desafiante ganhou
                    /*
                     * O desafiante ira receber o método imprimir vitória e o desafiado ira receber
                     * o método imprimir derrota
                     */
                    this.desafiado.imprimirDerrotas(ganhador);
                    this.desafiante.imprimirVitoria(ganhador);
                    System.out.println("O desafiante " + this.desafiante.getNome() + " ganhou a luta");
                    System.out.println("------------------------------------------------------------");
            }

        }

    }

}
