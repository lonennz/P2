import java.util.Scanner;
public class EX8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro numero: ");
        Double primeiro = scanner.nextDouble();

        System.out.print("Digite o segundo numero: ");
        Double segundo = scanner.nextDouble();

        System.out.println("Escolha a operação desejada: ");
        System.out.println("1 - SOMA. ");
        System.out.println("2 - Subtração. ");
        System.out.println("3 - Multiplicação. ");
        System.out.println("4 - Divisão. ");
        System.out.println("Escolha a opção: ");
        
        int operação = scanner.nextInt();

        if (operação == 1) {
            System.out.println("Resultado: " + (primeiro + segundo));
        } else if (operação == 2) {
            System.out.println("Resultado: " + (primeiro - segundo));
        } else if (operação == 3) {
            System.out.println("Resultado: " + (primeiro * segundo));
        } else if (operação == 4) {
            System.out.println("Resultado: " + (primeiro / segundo));
        } else {
            System.out.println("Operação invalida.");
        }

        scanner.close();
    }
}
