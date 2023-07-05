
import java.util.Scanner;

public class Pessoa {

    /* Atributos */
    private String nome;
    private int idade;
    private String sexo;
    int escol;// ira analisar a escolha feita pelo usuário
    String aniv;// ira verificar se o usuário esta fazendo aniversario hoje

    /* Instanciação e chamada de métodos */
    Aluno a1 = new Aluno();

    /* Declaração de scanners */
    Scanner opcao = new Scanner(System.in);// opção para o usuário cadastrar o tipo de pessoa que ele deseja.
    Scanner nom = new Scanner(System.in);
    Scanner id = new Scanner(System.in);
    Scanner sex = new Scanner(System.in);
    Scanner niver = new Scanner(System.in);

    /* getters e setters */

    public void setNome(String n) {

        this.nome = n;
    }

    public String getNome() {

        return this.nome;
    }

    public void setIdade(int i) {

        this.idade = i;
    }

    public int getIdade() {

        return this.idade;
    }

    public void setSexo(String s) {

        this.sexo = s;
    }

    public String getSexo() {

        return this.sexo;
    }

    /* Métodos */

    public void cadastrarPessoa() {

        System.out.println("Que tipo de pessoa você quer cadastrar? ");
        escol = opcao.nextInt();

        if (escol == 1) {
            /* Scanner de fechamento de matricula */
            Scanner fechaMat = new Scanner(System.in);
            String cancMat;

            System.out.println("Nome do aluno: ");
            this.nome = nom.nextLine();

            System.out.println("Idade do aluno: ");
            this.idade = id.nextInt();

            System.out.println("Sexo do aluno: ");
            this.sexo = sex.nextLine();

            System.out.println("Qual o curso do aluno? ");
            a1.cadastrarCurso();

            System.out.println("Status da matricula: ");
            a1.abrirMatricula();

            System.out.println("Você quer trancar a matricula desse aluno: ");
            cancMat = fechaMat.nextLine();

            if (cancMat.equals("sim")) {
                a1.cancelaMatricula();
                System.out.println("Matricula cancelada com sucesso, verifique os detalhes de matricula");

                a1.detalhesAluno();
            } else {
                a1.detalhesAluno();
            }

            System.out.println("ele esta fazendo aniversario hoje? ");
            aniv = niver.nextLine();

            if (aniv.equals("sim")) {

                a1.fazerAniversario(idade);
                System.out.println("Parabens, verifique nos detalhes a idade atualizada");

                a1.detalhesAluno();
            }
        }

    }

    public int fazerAniversario(int idade) {

        this.idade = this.idade + 1;

        return this.idade;
    }

}
