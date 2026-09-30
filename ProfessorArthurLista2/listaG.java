package ProfessorArthurLista2;

import java.util.Scanner;

public class listaG {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma frase: ");
        String frase = scanner.nextLine();

        int vogais = 0;
        int espacos = 0;
        int numeros = 0;
        int especiais = 0;

        String fraseMinuscula = frase.toLowerCase();

        for (int i = 0; i < frase.length(); i++) {
            char c = fraseMinuscula.charAt(i);

            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                vogais++;
            } else if (c == ' ') {
                espacos++;
            } else if (c >= '0' && c <= '9') {
                numeros++;
            } else if (!(c >= 'a' && c <= 'z') && !(c >= '0' && c <= '9')) {
                especiais++;
            }
        }
        
        System.out.println("Vogais: " + vogais);
        System.out.println("Espacos: " + espacos);
        System.out.println("Numeros: " + numeros);
        System.out.println("Especiais: " + especiais);

        scanner.close();
    }
}
