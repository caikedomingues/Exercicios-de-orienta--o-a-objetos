
/*A ideia aqui é criar um exercicio orientado a objeto que crie lutadores e os faça
 * entrar em confrontos
  */

/*Nessa classes faremos as instanciações de objetos e faremos os luatdores interagirem 
 * entre si
  */
/*Import da classe Scanner que posssibilitara a leitura de entradas do teclado */
import java.util.Scanner;

public class UltraEmojiCombat {

    public static void main(String[] args) {
        /* Instanciação/criação dos objetos */
        Lutador l1 = new Lutador();
        Lutador l2 = new Lutador();
        Luta lut1 = new Luta();

        /* Declaração dos scanners */
        Scanner nom = new Scanner(System.in);// Scanner do nome
        Scanner nac = new Scanner(System.in);// Scanner da nacionalidade
        Scanner id = new Scanner(System.in);// Scanner da idade
        Scanner alt = new Scanner(System.in);// scanner da altura
        Scanner pes = new Scanner(System.in);// Scanner do peso
        Scanner vit = new Scanner(System.in);// scanner de vitorias
        Scanner der = new Scanner(System.in);// scanner de derrotas
        Scanner em = new Scanner(System.in);// Scanner de empates
        Scanner opcao = new Scanner(System.in);// Scanner que ira verifcar se o usuário quer ou não iniciar uma luta
        String luta;// Variável que ira receber a escolha do usuário

        /*
         * Tabela de pesos
         * leve: até 70,3
         * meio médio: 77,1
         * médio: 83,9
         * pesado: 93
         * 
         */

        /*
         * Impressão da tabela de pesos que guiara o usuário na criação da categoria do
         * lutador
         */
        System.out.println("Tabela de pesos para criação de lutadores");
        System.out.println("peso leve: até 70,3");
        System.out.println("peso Meio-médio: até 77,1");
        System.out.println("peso médio: até 83,9");
        System.out.println("peso pesado: 93");
        System.out.println("Acima de 93: peso inválido");
        System.out.println("-----------------------------");
        /* Formulário de criação do lutador 1 */
        // pedido do nome do lutador
        System.out.println("informe o nome do lutador 1: ");
        // Leitura do nome do lutador
        l1.setNome(nom.nextLine());

        // pedido da nacionalidade do lutador
        System.out.println("Informe a nacionalidade: ");
        // Leitura da nacionalidade do lutador
        l1.setNacionalidade(nac.nextLine());

        // pedido da idade do lutador
        System.out.println("Informe a idade: ");
        // Leitura da idade do lutador
        l1.setIdade(id.nextInt());

        // pedido da altura do lutador
        System.out.println("Informe a altura: ");
        // Leitura da altura do lutador
        l1.setAltura(alt.nextFloat());

        // pedido do peso do lutador
        System.out.println("Informe o peso: ");
        // Leitura do peso do lutador
        l1.setPeso(pes.nextFloat());

        // Pedido do numero de vitorias que o lutador possui momento
        System.out.println("Numero de vitórias até o momento: ");

        // Leitura de vitorias do lutador
        l1.setVitorias(vit.nextInt());

        // Pedido do numero de derrotas que o lutador possui no momento
        System.out.println("Numero de derrotas até o momento: ");

        // Leitura de derrotas do lutador
        l1.setDerrotas(der.nextInt());

        /* Pedido do numero de empates que o lutador possui no momento */
        System.out.println("numero de empates até o momento: ");

        /* Leitura de empates do lutador */
        l1.setEmpates(em.nextInt());
        System.out.println("-----------------------------------");

        /* Mensagem que informa que o lutador foi criado */
        System.out.println("Lutador 1 criado");

        System.out.println("Dados informados");

        /*
         * Impressão do status do lutador baseado no formulário respondido pelo usuário
         */
        l1.imprimirStatus();
        System.out.println("----------------------------------------");

        /* Criação do segundo lutador */

        /* Aqui a lógica é exatamente a mesma que a do lutador anterior */
        System.out.println("Tabela de pesos para criação de lutadores");
        System.out.println("peso leve: até 70,3");
        System.out.println("peso Meio-médio: até 77,1");
        System.out.println("peso médio: até 83,9");
        System.out.println("peso pesado: 93");
        System.out.println("Acima de 93: peso inválido");
        System.out.println("-----------------------------");

        System.out.println("informe o nome do lutador 2: ");
        l2.setNome(nom.nextLine());

        System.out.println("Informe a nacionalidade: ");
        l2.setNacionalidade(nac.nextLine());

        System.out.println("Informe a idade: ");
        l2.setIdade(id.nextInt());

        System.out.println("Informe a altura: ");
        l2.setAltura(alt.nextFloat());

        System.out.println("Informe o peso: ");
        l2.setPeso(pes.nextFloat());

        System.out.println("Numero de vitórias até o momento: ");
        l2.setVitorias(vit.nextInt());

        System.out.println("Numero de derrotas até o momento: ");
        l2.setDerrotas(der.nextInt());

        System.out.println("numero de empates até o momento: ");
        l2.setEmpates(em.nextInt());
        System.out.println("-----------------------------------");

        System.out.println("Lutador 2 criado");
        System.out.println("Dados informados");

        l2.imprimirStatus();

        System.out.println("-------------------------------------");
        /* Aqui sera criado a luta entre os 2 lutadores */
        /* Antes de iniciarmos iremos perguntar se o usuário quer que a luta ocorra */
        System.out.println("Você quer iniciar um confronto entre os lutadores criados");
        /* Leitura da opção escolhida pelo usuário */
        luta = opcao.nextLine();
        /* Condição que ira verificar se a luta irá ou não ocorrer */
        if (luta.equals("sim")) {
            /*
             * Caso o usuário escolha sim, o método marcarLuta ira verificar os nomes e as
             * categorias
             * para verificar se as condições de luta estão favoraveis
             */
            lut1.marcarLuta(l1, l2);
            /* O método criarLuta ira criar a luta */
            lut1.criarLuta();
            System.out.println("--------------------------");
            /*
             * Apos o resultado, o status pós-luta ira mostrar o status dos lutadores com
             * vitorias, derrotas e empates atualizados após a luta
             */
            System.out.println("Status pós-luta");
            System.out.println("--------------------------");
            /* Ira imprimir o status do primeiro lutador atualizado */
            l1.imprimirStatus();
            System.out.println("--------------------------");
            /* Ira imprimir o status dp segundo lutador atualizado */
            l2.imprimirStatus();

        } else {
            /* Caso o usuário não queira iniciar a luta, o programa será encerrado */
            System.out.println("Entendido, a luta não acontecerá");
        }

    }
}