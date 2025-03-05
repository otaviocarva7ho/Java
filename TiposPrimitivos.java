import java.util.Scanner;

public class TiposPrimitivos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do aluno: ");
        String nome = scanner.nextLine();

        System.out.print("Digite a nota do aluno: ");
        float nota = scanner.nextFloat();

        System.out.println("A nota de " + nome + " é " + nota);

        scanner.close();
    }
}
