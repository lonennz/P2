package ProfessorArthurLista2;

import java.util.Scanner;
import java.util.ArrayList;

public class listaH {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);

        ArrayList<Double> notas = new ArrayList<>();

        System.out.println("Selecione quantas notas serão informadas: ");
        int quantidade = scanner.nextInt();

        double soma = 0;
        double maior = 0;
        double menor = 10;
        int aprovados = 0;

        for (int i = 0; i < quantidade; i++) {

            System.out.println("Digite a nota: " + (i + 1) + ":");
            double nota = scanner.nextDouble();

            notas.add(nota);

            soma = soma + nota;

            if (nota > maior) {

                maior = nota;

            } if (nota < menor) {

                menor = nota;

            } if (nota >= 7) {
                aprovados++;
            }
        }

            double media = soma / quantidade;

            System.out.println("Notas: " + notas);
            System.out.println("Media: " + media);
            System.out.println("Maior nota: " + maior);
            System.out.println("Menor notas: " + menor);
            System.out.println("Aprovados: " + aprovados);


            scanner.close();
    }
}
