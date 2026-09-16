import java.util.Scanner;
public class EX1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();

        System.out.print("==== Seu cadastro ====");

        System.out.print(nome);
        System.out.print(idade);

        int idadefutura = idade + 1;
        
        System.out.println("Sua idade daqui a 1 ano: " + idadefutura);

        
        scanner.close();
    } 
}
