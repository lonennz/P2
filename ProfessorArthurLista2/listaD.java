package ProfessorArthurLista2;

import java.util.HashMap;
import java.util.Scanner;

public class listaD {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        HashMap<String, String> aluno = new HashMap<>();

        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite sua idade: ");
        String idade = scanner.nextLine();

        System.out.print("Sua cidade: ");
        String cidade = scanner.nextLine();

        System.out.print("Digite sua nota: ");
        String nota = scanner.nextLine();

        aluno.put("nome", nome);
        aluno.put("idade", idade);
        aluno.put("cidade", cidade);
        aluno.put("nota", nota);

        System.out.println("Quantidade de campos preenchidos: " + aluno.size());

        if (aluno.containsKey("nota")) {
            System.out.println("A chave nota existe.");
        }

        float notaAluno = Float.parseFloat(nota);

        if (notaAluno >= 7) {
            System.out.println("Aprovado");
        } else if (notaAluno >= 5) {
            System.out.println("Recuperação");
        } else {
            System.out.println("Reprovado");
        }

        System.out.println("\n Dados do Aluno: ");
        System.out.println("Nome: " + aluno.get("nome"));
        System.out.println("Idade: " + aluno.get("idade"));
        System.out.println("Cidade: " + aluno.get("cidade"));
        System.out.println("Nota: " + aluno.get("nota"));

        scanner.close();
    }
}
