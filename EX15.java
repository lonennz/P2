import java.util.Scanner;

public class EX15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a distância da viagem em km: ");
        double distancia = scanner.nextDouble();

        System.out.print("Digite o consumo médio do carro em km/L: ");
        double consumoMedio = scanner.nextDouble();

        System.out.print("Digite o preço da gasolina por litro: ");
        double preco = scanner.nextDouble();

        if (distancia <= 0 && consumoMedio <= 0 && preco <= 0) {
            System.out.println("Distância, consumo médio e preço inválidos.");
        } else if (distancia <= 0) {
            System.out.println("Distância inválida.");
        } else if (consumoMedio <= 0) {
            System.out.println("Consumo médio inválido.");
        } else if (preco <= 0) {
            System.out.println("Preço inválido.");
        } else {
            double litrosNecessarios = distancia / consumoMedio;
            double custoViagem = litrosNecessarios * preco;

            System.out.println("Litros necessários: " + litrosNecessarios + " L");
            System.out.println("Custo total da viagem: R$ " + custoViagem);
        }

        scanner.close();
    }
}

