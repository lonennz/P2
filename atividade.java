import java.util.Scanner;
public class atividade {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner (System.in);

        System.out.print("Digite seu nome: ");
        String nome = entrada.nextLine();

        System.out.print("Digite sua idade: ");
        int idade = entrada.nextInt();

        System.out.print("Digite sua altura: ");
        double altura = entrada.nextDouble();

        System.out.print("Digite seu peso: ");
        double peso = entrada.nextDouble();

        System.out.print("Nota da primeira prova: ");
        double nota = entrada.nextDouble();

        System.out.print("Nota da segunda prova: ");
        double prova = entrada.nextDouble();

        System.out.print("Quantidade de faltas: ");
        int faltas = entrada.nextInt();

        System.out.println("===== CADASTRO DO ALUNO =====");
        
        System.out.println(nome);
        System.out.println(idade);
        System.out.println(altura);
        System.out.println(peso);
        System.out.println(nota);
        System.out.println(prova);
        System.out.println(faltas);

        System.out.println("===== RESULTADOS =====");

        double media = (nota + prova) / 2;
        double IMC = peso / (altura * altura);
        int idadefutura = idade + 5;
        double somaNotas = nota + prova;

        System.out.println("Media: " + media);
        System.out.println("IMC: " + IMC);
        System.out.println("Idade daqui 5 anos: " + idadefutura);
        System.out.println("Soma das duas provas: " + somaNotas);
        System.out.println("Possui mais de 10 faltas: " + (faltas>10));
        System.out.println("media maior que 7: " + (media>7));
    }
}
