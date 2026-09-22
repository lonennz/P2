import java.util.Scanner;
public class EX12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor da compra: ");
        double valorCompra = scanner.nextDouble();

        double percentualDesconto;
        double valorDesconto;
        double valorFinal;

        if (valorCompra <= 100) {
            percentualDesconto = 0;
        } else if (valorCompra <= 500) {
            percentualDesconto = 10;
        } else {
            percentualDesconto = 20;
        }

        valorDesconto = valorCompra * percentualDesconto / 100;
        valorFinal = valorCompra - valorDesconto;

        System.out.println("Valor original: " + valorCompra);
        System.out.println("Percentual Desconto: " + percentualDesconto);
        System.out.println("Valor com desconto: " + valorDesconto);
        System.out.println("Valor final da compra: " + valorFinal);

        scanner.close();
    }
}
