package ProfessorArthurLista2;

import java.util.ArrayList;
import java.util.Scanner;

public class listaB {
    public static void main(String[] args) {
      
        Scanner scanner = new Scanner(System.in);
        ArrayList<Float> precos = new ArrayList<>();

        System.out.print("Digite o primeiro preço: ");
        float preco1 = scanner.nextFloat();

        System.out.print("Digite o segundo preço: ");
        float preco2 = scanner.nextFloat();

        System.out.print("Digite o terceiro preço: ");
        float preco3 = scanner.nextFloat();

        System.out.println();

        precos.add(preco1);
        precos.add(preco2);
        precos.add(preco3);

        System.out.println("Lista atual: " + precos );
        System.out.println("Quantidade de itens: " + precos.size());

        System.out.print("Digite o quarto preço: ");
        float preco4 = scanner.nextFloat();

        System.out.print("Digite a posição: (0, 1, 2 ou 3): ");
        int posicao = scanner.nextInt();

        precos.add(posicao, preco4);

        System.out.println("Lista final: " + precos);
        System.out.println("Quantidade de itens finais: " + precos.size());

        scanner.close();
    }
}