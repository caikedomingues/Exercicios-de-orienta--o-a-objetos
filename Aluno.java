import java.util.Scanner;

public class Aluno extends Pessoa {

    private String matricula;
    private String curso;

    /* Declaraçaõ de scanners */
    Scanner nomCurso = new Scanner(System.in);

    /* getters e setters */

    public void setMatricula(String m) {

        this.matricula = m;
    }

    public String getMatricula() {

        return this.matricula;
    }

    public void setCurso(String c) {

        this.curso = c;
    }

    public String getCurso() {

        return this.curso;
    }

    /* Métodos */

    public void abrirMatricula() {

        this.matricula = "aberta";
    }

    public void cancelaMatricula() {

        this.matricula = "fechada";
    }

    public void cadastrarCurso() {

        this.curso = nomCurso.nextLine();

    }

    public void detalhesAluno() {

        System.out.println("Nome do aluno: " + this.getNome());
        System.out.println("idade do aluno: " + this.getIdade());
        System.out.println("Sexo do aluno: " + this.getSexo());
        System.out.println("Curso do aluno: " + this.getCurso());
        System.out.println("Status da matricula: " + this.getMatricula());

    }

}
