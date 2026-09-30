package ProfessorArthurLista2;

import java.util.Scanner;
public class listaF {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero inteiro: ");
        int inteiro = scanner.nextInt();

        System.out.println("Tabuada do " + inteiro + ':');

            for (int multiplicador = 1; multiplicador<= 10; multiplicador++){
                System.out.println(inteiro + "x" + multiplicador + "=" + (inteiro * multiplicador));
            }
            scanner.close();
        }
    }

