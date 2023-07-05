
import java.util.Scanner;

public class ContaBanco {
    /* Declaraçaõ dos scanners necessários */
    Scanner entrada = new Scanner(System.in);// Scanner principal
    Scanner entra = new Scanner(System.in);// Scanner secundário, caso o segundo não funcione
    /* Atributos da conta */
    public int numConta;// Ira guardar o numero da conta
    protected String tipo;// Ira guardar o tipo da conta (corrente ou poupança)
    private String dono;// Ira guardar o nome do titular da conta
    private float saldo;// Ira mostrar o saldo atual do usuário
    private boolean status;// Ira mostrar se a conta esta aberta ou fechada

    /* Metodo construtor */

    public ContaBanco() {
        /* Ira ter como padrão o status verdadeiro, ou seja, contas abertas */
        this.status = true;
    }

    /* getters e setters */
    public int setnumConta(int n) {
        return this.numConta = n;

    }

    public int getnumConta() {
        return this.numConta;
    }

    public String setTipo(String t) {
        return this.tipo = t;
    }

    public String getTipo() {

        return this.tipo;
    }

    public String setDono(String d) {

        return this.dono = d;
    }

    public String getDono() {

        return this.dono;
    }

    public float setSaldo(float sa) {

        return this.saldo = sa;
    }

    public float getSaldo() {

        return this.saldo;
    }

    public boolean setStatus(boolean s) {

        return this.status = s;
    }

    public boolean getStatus() {
        return status;
    }

    /* Metodos da conta */
    /* Função responsável por criar contas */
    public void abrirConta() {
        /* Impressão do pedido de dados */
        System.out.println("Informe o tipo da conta: ");
        tipo = entrada.nextLine();

        System.out.println("Informe o numero da conta");
        numConta = entrada.nextInt();

        System.out.println("Informe o seu nome: ");
        dono = entra.nextLine();
        /*
         * Estrutura que ira verificar o tipo da conta e depositar um valor inicial para
         * o usuário
         */
        if (this.tipo.equals("cc")) {
            this.saldo = this.saldo + 50;
        } else {
            this.saldo = this.saldo + 150;
        }

    }

    /* Função responsável por fechar a conta do usuário */
    public void fecharConta() {
        /* Impressão do pedido de dados */
        System.out.println("Informe o seu nome: ");
        this.dono = entrada.nextLine();
        this.saldo = entrada.nextFloat();
        System.out.println("Informe o tipo da conta: ");
        this.tipo = entra.nextLine();
        System.out.println("Informe o numero da sua conta");
        this.numConta = entrada.nextInt();
        /*
         * Se o valor do saldo for maior ou menor que zero, não poderemos fechar a conta
         */
        if (this.saldo > 0) {
            System.out.println("Há valor na conta, não podemos fecha-la");
        } else if (this.saldo < 0) {
            System.out.println("Conta em débito, não é possivel fecha-la");
        } else {// Caso contrário fecharemos a conta
            System.out.println("Conta fechada com sucesso");
            /* Ao ter a conta fechada, o status passa a ser falso */
            this.status = false;
        }
    }

    /* Função responsável por realizar o saque */
    public void sacar() {
        float saqueValor;// Parametro que ira guardar o valor do saque
        float valorSaldo;// Parametro que ira guardar o valor do saldo
        /* Impressão do pedido de dados */
        System.out.println("Informe o valor do saque: ");
        saqueValor = entrada.nextFloat();

        System.out.println("Informe o seu nome: ");
        this.dono = entra.nextLine();

        System.out.println("Informe o tipo da sua conta: ");
        this.tipo = entra.nextLine();

        System.out.println("Informe o numero da conta: ");
        this.numConta = entrada.nextInt();

        if (saqueValor > this.saldo) {
            /* Se o valor do saque for maior ele ira bloquear o saque */
            System.out.println("Saldo insuficiente");
            /* Impressão do saldo atual sem o saque */
            this.saldo = this.saldo;
        } else {
            /*
             * Se o valor do saque for menor que o saldo, ele ira subtrair o valor do saque
             * do saldo
             */
            this.saldo = this.saldo - saqueValor;
            /* Impressão da operação realizada */
            System.out.println("Você realizou um saque no valor de " + saqueValor);
            this.saldo = this.saldo;
            System.out.println("Saldo atual: " + this.saldo);
        }
    }

    /* Função responsável por realizar o saque */
    public void Depositar() {
        float valorDeposito;// Parametro que ira guardar o valor que deve ser depositado
        /* Impressão do pedido de dados */
        System.out.println("Informe o valor do deposito: ");
        valorDeposito = entrada.nextFloat();

        System.out.println("Informe o seu nome: ");
        this.dono = entra.nextLine();

        System.out.println("Informe o tipo da sua conta: ");
        this.tipo = entra.nextLine();

        System.out.println("Informe o numero da conta: ");
        this.numConta = entrada.nextInt();
        /*
         * Após o preenchimento de dados, ele ira adicionar o valor depositado no saldo
         * do usuário
         */
        this.saldo = this.saldo + valorDeposito;
        /* Impressão da operação realizada */
        System.out.println("Você depositou " + valorDeposito + " reais");

    }

    /* Função responsável por realizar o pagamento da mensalidade da conta */
    public void pagarMensalidade() {
        /* Impressão do pedido de dados */
        System.out.println("Informe o seu nome: ");
        this.dono = entra.nextLine();

        System.out.println("Informe o tipo da sua conta: ");
        this.tipo = entra.nextLine();

        System.out.println("Informe o numero da conta: ");
        this.numConta = entrada.nextInt();
        /*
         * Se o tipo de conta for a corrente ele ira verificar se o saldo é maior ou
         * igual a 30 reais
         */
        if (this.tipo.equals("cc")) {
            /* Comparaçaõ do valor do saldo com o valor da mensalidade */
            if (this.saldo >= 30) {
                /*
                 * Se o valor do saldo for maior ou igual a 30, ele ira subtrair 30 reais da
                 * conta do usuário
                 */
                this.saldo = this.saldo - 30;
                System.out.println("Mensalidade de conta corrente paga");
            } else {
                /* Caso contrario, ele não ira extrair o valor da conta */
                System.out.println("Saldo insuficiente");
            }
        } else if (this.tipo.equals("cp")) {// Caso seja uma conta corrente, ele irá verificar se o valor é maior que 50
                                            // reais
            if (this.saldo >= 50) {
                /* Se o valor for maior que 50 reais, ele ira subtrair 50 reais do saldo */
                this.saldo = this.saldo - 50;
                System.out.println("Mensalidade de conta poupança paga");
            } else {// Caso contrario, ele não ira extrair o valor da conta
                System.out.println("Saldo insuficiente");
            }
        } else {
            /* Caso o usuário informe um tipo diferente dos 2 casos */
            System.out.println("Tipo de conta inválido");
        }

    }

    /* Função que irá mostrar a situação atual do usuário */
    public void estadoAtual() {
        System.out.println("Numero da conta: " + this.numConta);
        System.out.println("Tipo: " + this.tipo);
        System.out.println("Dono: " + this.dono);
        System.out.println("saldo: " + this.saldo);
        System.out.println("A conta esta aberta? " + this.status);
    }
}
