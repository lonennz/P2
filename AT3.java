import java.util.Scanner;
public class AT3 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        System.out.print("Temperatura em Celsius: ");
        double Celsius = entrada.nextDouble();

        double fahrenheit = Celsius * 9 / 5 + 32;

        System.out.println("Temperatura em Fahrenheit: " + fahrenheit);

        entrada.close();
    }
}
