import java.util.Scanner;

public class AT1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("===== CALCULO DE DESCONTO =====");

        System.out.print("Preço do produto: ");
        double Preço = entrada.nextDouble();

        System.out.print("Desconto: ");
        Double des = entrada.nextDouble();

        double V_des = ((Preço * des) /100);
        double p_final = (Preço - V_des);
        System.out.println();

        System.out.println("===== Resultados =====");
        System.out.println("Preço do produto: " + p_final);

        entrada.close();

    }
}
