/*
 * Crie uma classe chamada paciente em que serão necessários especificar
 * atributos para armazenar nome, ano de nascimento, altura, peso. Crie
 * métodos para
 * 
 * imprimir a idade
 * 
 * calcular o indice de massa corporal (imc): podemos ver como calcular
 * o peso ideal na equação abaixo: 60 /(1,65 x 1,65) = 60
 * 
 * imprimir a situação do paciente
 * 
 * menor que 18,5 = abaixo do peso;
 * entre 18,5 e 24,9 = peso normal
 * entre 25 e 29,9 = sobre peso
 * entre 30 e 34,99 = obesidade grau I.
 * entre 35 e 39,99 = obesidade grau II(severa)
 * Acima de 40 = obesidade grau III (mórbida)
 * 
 * imprimir dados do pacinte
 * 
 */

public class Paciente {
    /* Atributos */
    private String nome;// Ira guardar o nome do paciente
    private int nasc;// ira guardar o ano de nascimento do paciente
    private int idade;// Ira guardar a idade do paciente
    private float altura;// Ira guardar a altura do paciente
    private float peso;// Ira guardar o peso do paciente
    private float pesoIdeal;// Ira guardar o peso ideal do paciente

    /* Getters e setters */

    public void setNome(String n) {
        this.nome = n;
    }

    public String getNome() {

        return this.nome;
    }

    public void setNasc(int na) {

        this.nasc = na;
    }

    public int getNasc() {

        return this.nasc;
    }

    public void setIdade(int i) {
        this.idade = i;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setAltura(float a) {

        this.altura = a;
    }

    public float getAltura() {

        return this.altura;
    }

    public void setPeso(float p) {

        this.peso = p;
    }

    public float getPeso() {

        return this.peso;
    }

    public void setPesoIdeal(int pi) {

        this.pesoIdeal = pi;
    }

    public float getPesoIdeal() {

        return this.peso;
    }

    /* métodos */

    /*
     * Método que ira calcular a idade do paciente e recebera como parametro
     * a variável do tipo inteiro idade
     */
    public int imprimirIdade(int idade) {
        /*
         * Na realização do cálculo a variável idade irá receber o ano atual -
         * a variável nascimento.
         */
        idade = 2023 - this.nasc;
        /* Vamos retornar a variável idade com o resultado final */
        return idade;

    }

    /* método que irá calcular o imc baseado na fórmula explicada acima */
    public float imc(float pesoIdeal) {

        pesoIdeal = this.peso / (this.altura * this.altura);
        /*
         * menor que 18,5 = abaixo do peso;
         * entre 18,5 e 24,9 = peso normal
         * entre 25 e 29,9 = sobre peso
         * entre 30 e 34,99 = obesidade grau I.
         * entre 35 e 39,99 = obesidade grau II(severa)
         * Acima de 40 = obesidade grau III (mórbida)
         */
        /* Estrutura que ira verificar o resultado e imprimir um determinado texto */
        if (pesoIdeal < 18.5) {
            System.out.println("abaixo do peso");
        } else if (pesoIdeal > 18.5 && pesoIdeal <= 24.9) {
            System.out.println("Peso normal");

        } else if (pesoIdeal > 24.9 && pesoIdeal <= 29.9) {
            System.out.println("Sobre peso");
        } else if (pesoIdeal > 29.9 && pesoIdeal <= 34.99) {

            System.out.println("obesidade grau I");
        } else if (pesoIdeal > 34.99 && pesoIdeal <= 39.99) {

            System.out.println("Obesidade grau II (severa)");
        } else {

            System.out.println("Obesidade grau III(mórbida)");
        }
        /* Retorno com o resultado final */
        return pesoIdeal;

    }

    /* Método que ira imprimir os resultados após a passagem de valores */
    public void imprimirDados() {
        /* Ele usa o método get para coletar e imprimir os resultados finais */
        System.out.println("Nome do pacinte: " + getNome());
        System.out.println("Altura do paciente: " + getAltura());
        System.out.println("Peso do pacinte: " + this.peso);
        System.out.println("Cálculo do imc do pacinte: " + imc(pesoIdeal));
        System.out.println("Ano de nascimento do paciente: " + getNasc());
        System.out.println("Idade do paciente: " + imprimirIdade(idade));
    }

}