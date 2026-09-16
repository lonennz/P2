import java.util.Scanner;
public class EX7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um numero inteiro: ");
        Double numero = scanner.nextDouble();

        if (numero % 2 == 0) {
            System.out.println("O numero é par.");
        } else {
            System.out.println("O numero é impar.");
        }

        scanner.close();
    }
}
