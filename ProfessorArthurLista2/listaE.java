package ProfessorArthurLista2;
import java.util.Scanner;

public class listaE {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    for (int i = 0; i < 3; i++) {
        System.out.print("Digite a nota: ");
        double nota = scanner.nextDouble();

        if (nota >=7) {
            System.out.println("Aprovado. ");
            
        } else if (nota >=4) {
            System.out.println("Recuperação. ");
        } else {
            System.out.println("Reprovado. ");
        }
        }

        scanner.close();
    }
    }
