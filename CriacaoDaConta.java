
/*Nessa classe iremos criar os objetos e depois chamar os metodos */

/*Import do scanner para ler a opção escolhida pelo usuário */
import java.util.Scanner;

public class CriacaoDaConta {
    public static void main(String[] args) {
        /* Declaração do scanner */
        Scanner entrada = new Scanner(System.in);
        String opcao;// Variável que ira guardar o valor escolhido pelo usuário
        int opcao2;// Ira ler as opções de menu

        /* Instanciação do objeto */
        ContaBanco c1 = new ContaBanco();
        /* Impressão das instruções e pedidos para o usuário */
        System.out.println("Olá, seja bem vindo ao banco, você quer abrir uma conta? ");
        /* Variável que irá ler o valor escolhido */
        opcao = entrada.nextLine();

        /*
         * Estrutura que ira verificar a opção escolhida e executara as opções de menu
         * do banco
         */
        if (opcao.equals("sim")) {
            System.out.println("Ola, vamos criar sua conta.");
            System.out.println("Conta correntes são criadas com um saldo de 50 reais para o usuário");
            System.out.println("Contas poupança são criadas com um saldo de 150 reais para  o usuário");
            System.out.println("Vamos começar? Forneça os dados necessários para a criação da sua conta");
            System.out.println("---------------------------------------------------------------------------");
            c1.abrirConta();
            System.out.println("---------------------------------------------------------------------------");
            System.out.println("Confira o estado atual da sua conta");
            c1.estadoAtual();
            System.out.println("---------------------------------------------------------------------------");
            /* Criação do menu do banco */
            System.out.println("Agora que ja criamos a sua conta,  escolha uma opção: ");
            System.out.println("1 para fechar a conta ");
            System.out.println("2 para sacar um valor");
            System.out.println("3 para depositar um valor");
            System.out.println("4 para pagar a mensalidade");
            opcao2 = entrada.nextInt();
            /* Estrutura que ira ler a opção e executar um método do menu */
            if (opcao2 == 1) {
                System.out.println("Olá, informe os dados da sua conta e realize o fechamento ");
                System.out.println("---------------------------------------------------------------------------");
                c1.fecharConta();
                System.out.println("---------------------------------------------------------------------------");
                System.out.println("Confira o estado atual da sua conta");
                c1.estadoAtual();
            }

            if (opcao2 == 2) {
                System.out.println("Olá, informe os dados da sua conta e realize o saque");
                System.out.println("---------------------------------------------------------------------------");
                c1.sacar();
                System.out.println("---------------------------------------------------------------------------");
                System.out.println("Confira o estado atual da sua conta");
                c1.estadoAtual();

            }

            if (opcao2 == 3) {
                System.out.println("Olá, informe os dados necessário da sua conta e realize o deposito");
                System.out.println("---------------------------------------------------------------------------");
                c1.Depositar();
                System.out.println("---------------------------------------------------------------------------");
                c1.estadoAtual();
            }

            if (opcao2 == 4) {
                System.out.println("Olá, informe os dados da sua conta e realize o pagamento da mensalidade");
                System.out.println("Conta corrente: 30 reais");
                System.out.println("Conta poupança: 50 reais");
                System.out.println("---------------------------------------------------------------------------");
                c1.pagarMensalidade();
                System.out.println("---------------------------------------------------------------------------");
                c1.estadoAtual();
            } else {
                /* Caso o usuário erre a opção */
                System.out.println("Opção inválda. programa encerrado");
            }

        } else {
            /* Caso ele não queira abrir nenhuma opção */
            System.out.println("Entendido, programa encerrado");
        }

    }
}