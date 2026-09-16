import java.util.Scanner;
public class EX11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite sua primeira nota: ");
        Double primeira = scanner.nextDouble();

        System.out.print("Digite sua segunda nota: ");
        Double segunda = scanner.nextDouble();

        System.out.print("Digite sua terceira nota: ");
        Double terceira = scanner.nextDouble();

        System.out.print("Digite sua frenquencia escolar: ");
        int frequencia = scanner.nextInt();

        System.out.print("Como esta sua situação financeira? ");
        System.out.println("1 - Regular. ");
        System.out.println("0 - Pendente. ");
        Double financeira = scanner.nextDouble();

        double media = ((primeira + segunda + terceira) / 3);

        if (financeira == 0) {
            System.out.println("Reprovado: Pendência financeira. ");
        } else if (media >= 7 && frequencia >= 75) {
            System.out.println("Aprovado. ");
        } else if (media < 7 && frequencia >= 75) {
            System.out.println("Reprovado por nota. ");
        } else if (media >= 7 && frequencia < 75) {
            System.out.println("Reprovado por frequencia. ");
        } else {
            System.out.println("Reprovado por nota e frequencia. ");
        }

        scanner.close();
    }
}
