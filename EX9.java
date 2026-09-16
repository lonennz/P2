import java.util.Scanner;
public class EX9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite sua idade: ");
        Double idade = scanner.nextDouble();

        if (idade >= 0 && idade <= 12) {
            System.out.println("Criança.");
        } else if (idade >= 12 && idade <= 17) {
            System.out.println("Adolescente.");
        } else if (idade >= 18 && idade <= 59) {
            System.out.println("Adulto. ");
        } else if (idade >= 60) {
            System.out.println("Idoso. ");
        } else {
            System.out.println("Idade Invalida. ");
        }

        scanner.close();
    }
}
