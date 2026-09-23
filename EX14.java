import java.util.Scanner;

public class EX14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu peso em kg: ");
        double peso = scanner.nextDouble();

        System.out.print("Digite sua altura em metros: ");
        double altura = scanner.nextDouble();

        if (peso <= 0 && altura <= 0) {
            System.out.println("Peso e altura inválidos.");
        } else if (peso <= 0) {
            System.out.println("Peso inválido.");
        } else if (altura <= 0) {
            System.out.println("Altura inválida.");
        } else {
            double imc = peso / (altura * altura);
            System.out.println("Seu IMC é: " + imc);

            if (imc < 18.5) {
                System.out.println("Você está abaixo do peso.");
            } else if (imc < 25) {
                System.out.println("Você está com o peso normal.");
            } else if (imc < 30) {
                System.out.println("Você está com sobrepeso.");
            } else {
                System.out.println("Você está obeso.");
            }
        }

        scanner.close();
    }
}
