import java.util.Scanner;
public class EX10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro numero inteiro: ");
        Double primeiro = scanner.nextDouble();

        System.out.print("Digite o segundo numero inteiro: ");
        Double segundo = scanner.nextDouble();

        System.out.print("Digite o terceiro numero inteiro: ");
        Double terceiro = scanner.nextDouble();

        if (primeiro > segundo && primeiro > terceiro) {
            System.out.println("O primeiro é maior. ");
        } else if (segundo > primeiro && segundo > terceiro) {
            System.out.println("O segundo é maior.");
        } else {
            System.out.println("O terceiro é maior");
        }

        scanner.close();
    }
}
