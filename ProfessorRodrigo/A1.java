package ProfessorRodrigo;

import java.util.Locale;
import java.util.Scanner;

public class A1 {
     public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Constantes e Variáveis
        final double PI = 3.14159;
        int expoente = 2;

        System.out.print("Digite o raio (em metros): ");
        double raio = scanner.nextDouble();

        // Potência equivalente a math.pow()
        double resultado = Math.pow(raio, expoente);

        double area = PI * resultado;
        double perimetro = 2 * PI * raio;

        // Saída simples
        System.out.println("Área: " + area);
        System.out.println("Perímetro: " + perimetro);
        System.out.println();

        // ============================================================
        // GRUPO 1: Troca de ponto por vírgula + Unicode
        // ============================================================

        System.out.println("--- Grupo 1: Manipulação 'Manual' (.replace + Unicode) ---");

        String areaBr = String.format("%.2f", area).replace(".", ",");
        String perimetroBr = String.format("%.2f", perimetro).replace(".", ",");

        // \u00B2 = ²
        // \u00B9 = ¹
        System.out.println("Área: " + areaBr + " m\u00B2");
        System.out.println("Perímetro: " + perimetroBr + " m\u00B9");
        System.out.println();

        // Unicode diretamente
        System.out.println("Área (unidade²): " + areaBr + " m\u00B2");
        System.out.println("Perímetro (unidade¹): " + perimetroBr + " m\u00B9");
        System.out.println();

        // ============================================================
        // GRUPO 2: Formatação Regional (Locale)
        // ============================================================

        System.out.println("--- Grupo 2: Formatação Regional (Locale) ---");
        System.out.println();


        Locale.setDefault(Locale.forLanguageTag("pt-BR"));

        String areaLocale = String.format("%.2f", area);
        String perimetroLocale = String.format("%.2f", perimetro);

        System.out.println("Área (Locale): " + areaLocale + " m\u00B2");
        System.out.println("Perímetro (Locale): " + perimetroLocale + " m\u00B9");

        scanner.close();
    }
}

