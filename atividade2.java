import java.util.Scanner;
public class atividade2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite sua primeira nota: ");
        double nota1 = scanner.nextDouble();

        System.out.println("Digite sua segunda nota: ");
        double nota2 = scanner.nextDouble();

        System.out.println("Digite sua terceira nota: ");
        double nota3 = scanner.nextDouble();

        System.out.println("Digite o numero de aulas: ");
        int totalAulas = scanner.nextInt();

        System.out.println("Digite o numero de faltas: ");
        int faltas = scanner.nextInt();

        double media = (nota1 + nota2 + nota3) / 3;
        double porcentagemFaltas = (faltas * 100.0) / totalAulas;

        if (porcentagemFaltas > 25) {
            System.out.println("Reprovado.");
            System.out.println("Reprovado por faltas.");
            
        } else if (media >= 9 && porcentagemFaltas <= 10) {
            System.out.println("Aprovado com Louvor.");
            
        } else if (media >= 7) {
            System.out.println("Aprovado.");

        } else if (media <= 5) {
            System.out.println("Recuperação...");

        } else {
            System.out.println("Reprovado.");
        }

        System.out.println("Situação do Aluno");
        System.out.println("Media; " + media);
        System.out.println("Faltas: " + porcentagemFaltas);
            
        scanner.close();
        }
}