import java.util.Scanner;

public class AT2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("===== CALCULO MEDIA =====");

        System.out.print("Primeira nota: ");
        Double n1 = scanner.nextDouble();
        System.out.print("Segunda nota: ");
        Double n2 = scanner.nextDouble();
        System.out.print("Terceira nota: ");
        Double n3 = scanner.nextDouble();

        double media = ((n1 + n2 + n3) / 3);
        System.out.println();

        System.out.println("===== RESULTADO =====");
        System.out.println("Sua Media é: " + media);

        boolean aprovada = media >= 7;
        System.out.println("Aprovada: " + aprovada);

        scanner.close();
    }
}
