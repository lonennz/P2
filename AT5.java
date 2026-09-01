import java.util.Scanner;

public class AT5 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        System.out.print("Distancia percorrida: ");
        Double distancia = entrada.nextDouble();

        System.out.print("Litros consumido: ");
        Double litros = entrada.nextDouble();

        System.out.print("Preço por litro: ");
        Double preçolitro = entrada.nextDouble();

        boolean dadosValidos = distancia > 0
                             && litros > 0
                             && litros != 0
                             && distancia != 0;
    if (dadosValidos) {
        double consumomedio = distancia / litros;
        double custoTotal = litros * preçolitro;
        double custoPorkm = custoTotal / distancia;

        System.out.println("Consumo medio: " + consumomedio);
        System.out.println("Custo total: " + custoTotal);
        System.out.println("Custo por KM" + custoPorkm);
    } else {
        System.out.println("Dados invalidos.");
    }
     entrada.close();                   
    }    
}
