import java.util.Scanner;
public class EX5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um numero inteiro: ");
        Double numero = scanner.nextDouble();

        if (numero > 0) {

            System.out.println("POSITIVO.");

        } else if (numero < 0) {
            
                System.out.println("NEGATIVO.");
        } else {
            System.out.println("O numero é zero.");
        }

        scanner.close();
    }
}
