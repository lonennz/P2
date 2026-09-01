import java.util.Scanner;

public class AT4 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        System.out.print("Nota 1: ");
        Double nota1 = entrada.nextDouble();

        System.out.print("Peso 1: ");
        Double peso1 = entrada.nextDouble();

        System.out.print("Nota 2: ");
        Double nota2 = entrada.nextDouble();

        System.out.print("Peso 2: ");
        Double peso2 = entrada.nextDouble();

        System.out.print("Nota 3: ");
        Double nota3 = entrada.nextDouble();

        System.out.print("Peso 3: ");
        Double peso3 = entrada.nextDouble();

        double media = (nota1 * peso1 + nota2 * peso2 + nota3 * peso3) / (peso1 + peso2 + peso3);

        boolean aprovado = media >= 7;
        boolean recuperacao = media >= 5 && media < 7;
        boolean reprovado = media < 5;

        System.out.println("Media: " + media);
        System.out.println("Aprovado: " + aprovado);
        System.out.println("Recuperacao: " + recuperacao);
        System.out.println("Reprovado: " + reprovado);

        entrada.close();

    }
}
