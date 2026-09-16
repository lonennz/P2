import java.util.Scanner;
public class EX3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um numero inteiro: ");
        int numero = scanner.nextInt();

        int antecessor = numero - 1;
        int sucessor = numero  + 1;
        int dobro = numero + 2;
        int triplo = numero + 3;

        System.out.println("Seu antecessor é: " + antecessor);
        System.out.println("Seu sucessor é: " + sucessor);
        System.out.println("Seu dobro é: " + dobro);
        System.out.println("Seu triplo é: " + triplo);

        scanner.close();
    }
}
