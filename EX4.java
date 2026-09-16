import java.util.Scanner;
public class EX4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite sua primeira nota: ");
        Double nota1 = scanner.nextDouble();

        System.out.print("Digite sua segunda nota: ");
        Double nota2 = scanner.nextDouble();

        System.out.print("Digite sua terceira nota: ");
        Double nota3 = scanner.nextDouble();

        double media = ((nota1 + nota2 + nota3) / 3);

        if (media >=7) {
            System.out.println("APROVADO.");
            
        }else {
            System.out.println("REPROVADO.");
        }

        scanner.close();
    }
}
