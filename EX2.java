import java.util.Scanner;
public class EX2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("largura do retangulo: ");
        Double largura = scanner.nextDouble();

        System.out.print("Altura do retangulo: ");
        Double altura = scanner.nextDouble();

        double area = largura * largura;
        double perimetro = 2 * (largura + altura);

        System.out.print(largura);
        System.out.println(altura);

        System.out.print("A area do retangulo é: " + area);
        System.out.print("O perimetro do retangulo é: " + perimetro);

        

        scanner.close();
    }
}
