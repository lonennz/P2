import java.util.Scanner;
public class EX6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro numero inteiro: ");
        Double primeiro = scanner.nextDouble();

        System.out.print("Digite o segundo numero inteiro: ");
        Double segundo = scanner.nextDouble();

        if (primeiro > segundo) {
            System.out.println("Primeiro numero é maior que o segundo.");
        } else if (primeiro < segundo) {
            System.out.println("Segundo numero é maior que o primeiro.");
        } else {
            System.out.println("Os dois numero são iguais.");
        }

        scanner.close();
    }
}
