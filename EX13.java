import java.util.Scanner;
public class EX13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do usuario: ");
        String usuario = scanner.nextLine();

        System.out.print("Digite a senha do usuario: ");
        String senha = scanner.nextLine();
 

        if (usuario.equals("admin123") && senha.equals("1234")) {
            System.out.println("login realizado com sucesso. ");
        } else {
            System.out.println("Usuario ou senha está incorreto.");
        }

        scanner.close();
    }
}
