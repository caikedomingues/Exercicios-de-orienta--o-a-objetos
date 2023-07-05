
/*Import do scanner para leitura de entradas do teclado */
import java.util.Scanner;

/*Classe que criaremos os obejtos pacientes */
public class TestaPaciente {

    public static void main(String[] args) {
        /* Declaração dos scanners */
        Scanner nom = new Scanner(System.in);// Ira ler o nome do paciente
        Scanner alt = new Scanner(System.in);// ira ler a altura do paciente
        Scanner pes = new Scanner(System.in);// ira ler o peso do paciente
        Scanner nascimento = new Scanner(System.in);// ira ler o ano de nascimento do paciente

        /* Instanciação/criação do objeto paciente */
        Paciente p1 = new Paciente();

        System.out.println("Informe o nome do paciente: ");
        p1.setNome(nom.nextLine());

        System.out.println("informe a altura do paciente: ");
        p1.setAltura(alt.nextFloat());

        System.out.println("Informe o peso do paciente: ");
        p1.setPeso(pes.nextFloat());

        System.out.println("Informe o ano de nascimento do paciente");
        p1.setNasc(nascimento.nextInt());

        System.out.println("----------------------------------------------");

        p1.imprimirDados();

    }

}
