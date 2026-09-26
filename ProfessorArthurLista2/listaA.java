package ProfessorArthurLista2;

import java.util.ArrayList;
import java.util.Scanner;

public class listaA {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayList<Double> notas = new ArrayList<>();

        System.out.println("Digite sua primeira nota: ");
        Double nota1 = scanner.nextDouble();

        System.out.println("Digite sua segunda nota: ");
        Double nota2 = scanner.nextDouble();

        System.out.println("Digite sua terceira nota: ");
        Double nota3 = scanner.nextDouble();

        System.out.println("Digite sua quarta nota: ");
        Double nota4 = scanner.nextDouble();

        System.out.println("Digite sua quinta nota: ");
        Double nota5 = scanner.nextDouble();

        System.out.println();

        notas.add(nota1);
        notas.add(nota2);
        notas.add(nota3);
        notas.add(nota4);
        notas.add(nota5);

        System.out.println("Quantidade de elementos" + notas.size());

        Double primeiro = notas.get(0);
        Double ultimo = notas.get(notas.size() -1);

        System.out.println("Primeiro numero: " + primeiro);
        System.out.println("Ultimo numero: " + ultimo);

        if (primeiro > ultimo) {
            System.out.println("O primeiro numero é maior que o ultimo.");
        } else {
            System.out.println("O primeiro numero não é maior que o ultimo. ");
        }

        if (primeiro > 0 && ultimo > 0) {
            System.out.println("O primeiro e o ultimo numero são Positivos");
        } else {
            System.out.println("O primeiro e/ou Ultimo numero não são positivos.");
        }

        scanner.close();
    }
}