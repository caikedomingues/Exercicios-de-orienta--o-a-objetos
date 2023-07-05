/*Aqui vamos criar os métodos e atributos que um lutador deve possuir */

public class Lutador {

    /*
     * private String nome;
     * private String nacionalidade;
     * private int idade;
     * private float altura;
     * private float peso;
     * private String categoria;
     * private int vitorias;
     * private int derrotas;
     * private int empates;
     * 
     */

    /* Atributos */
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;

    /* getters e setters */

    public void setNome(String n) {

        this.nome = n;

    }

    public String getNome() {

        return this.nome;
    }

    public void setNacionalidade(String na) {

        this.nacionalidade = na;
    }

    public String getNacionalidade() {

        return this.nacionalidade;
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

    public void setCategoria(String c) {

        this.categoria = c;
    }

    public String getCategoria() {

        return this.categoria;
    }

    public void setVitorias(int v) {

        this.vitorias = v;

    }

    public int getVitorias() {

        return this.vitorias;
    }

    public void setDerrotas(int d) {

        this.derrotas = d;
    }

    public int getDerrotas() {

        return this.derrotas;
    }

    public void setEmpates(int e) {

        this.empates = e;
    }

    public int getEmpates() {

        return this.empates;
    }

    /* métodos */
    /* esse método ira verificar o peso informado e dar uma categoria ao lutador */
    public String imprimirCategoria(String categoria) {

        /*
         * Tabela de pesos
         * leve: até 70,3
         * meio médio: 77,1
         * médio: 83,9
         * pesado: 93
         * 
         */
        /* Estrutura condicional que ira classificar as faixas de peso */
        if (this.peso <= 70.3) {

            this.categoria = "peso leve";
        } else if (this.peso > 70.3 && this.peso <= 77.1) {

            this.categoria = " peso meio-médio";
        } else if (this.peso > 77.1 && this.peso <= 83.9) {

            this.categoria = "peso médio";
        } else if (this.peso > 83.9 && this.peso <= 93) {
            this.categoria = "peso pesado";
        } else {
            this.categoria = "peso inválido";
        }
        /* Retorno com os resultados finais */
        return this.categoria;
    }

    /*
     * Método que sera responsável por atribuir vitórias ao lutador caso ele ganhe
     * uma luta
     */
    public int imprimirVitoria(int vitorias) {
        /* A variável vitorias ira receber mais 1 em sua contagem */
        this.vitorias = this.vitorias + 1;
        /* retorno com o resultado final */
        return vitorias;
    }

    /*
     * Metodo que será responsável por atribuir derrotas ao lutador, caso ele perca
     * uma luta
     */
    public int imprimirDerrotas(int derrotas) {
        /* A variável derrotas ira receber mais 1 em sua contagem */
        this.derrotas = this.derrotas + 1;
        /* Retorno com o reusltado final */
        return derrotas;
    }

    /*
     * Metodo responsável por atribuir empate aos 2 lutadores caso nenhum deles
     * ganhe o confronto
     */
    public int imprimirEmpates(int empates) {
        /* a variável empates ira receber mais 1 em sua contagem */
        this.empates = this.empates + 1;
        /* Retorno com o resultado final */
        return empates;
    }

    /* Impressão das informações dos lutadores */
    public void imprimirStatus() {

        System.out.println("Nome do lutador: " + this.nome);
        System.out.println("Nacionalidade: " + this.nacionalidade);
        System.out.println("idade: " + this.idade);
        System.out.println("Altura: " + this.altura);
        System.out.println("peso: " + this.peso);
        System.out.println("Categoria: " + imprimirCategoria(categoria));
        System.out.println("Vitórias: " + this.vitorias);
        System.out.println("Derrotas: " + this.derrotas);
        System.out.println("Empates: " + this.empates);
    }

}
