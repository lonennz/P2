package ProfessorArthurLista2;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;

public class listaI {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayList<HashMap<String, Object>> alunos = new ArrayList<>();

        System.out.println("Digite quantos alunos serão cadastrados: ");
        int quantidade = scanner.nextInt();

        for (int i = 0; i < quantidade; i++) {

            HashMap<String, Object> aluno = new HashMap<>();

            System.out.println("Digite o nome do aluno: ");
            String nome = scanner.next();

            System.out.println("Digite a idade do aluno: ");
            int idade = scanner.nextInt();

            System.out.println("Digite o curso do aluno: ");
            String curso = scanner.next();

            System.out.println("Digite a nota do aluno: ");
            Double nota = scanner.nextDouble();

            aluno.put("nome", nome);
            aluno.put("idade", idade);
            aluno.put("curso", curso);
            aluno.put("nota", nota);

            alunos.add(aluno);
        }

        double soma = 0;
        double maiorNota = 0;
        double menorNota = 10;

        String nomeMaior = "";
        String nomeMenor = "";

        int maioresDeIdade = 0;

        HashMap<String, Integer> cursos = new HashMap<>();

        for (HashMap<String, Object> aluno : alunos) {

            String nome = (String) aluno.get("nome");
            int idade = (int) aluno.get("idade");
            String curso = (String) aluno.get("curso");
            double nota = (double) aluno.get("nota");

            soma = soma + nota;

            if (nota >= 6) {
                System.out.println("Aprovado: " + nome);
            }

            if (nota > maiorNota) {
                maiorNota = nota;
                nomeMaior = nome;
            }

            if (nota < menorNota) {
                menorNota = nota;
                nomeMenor = nome;
            }

            if (idade >= 18) {
                maioresDeIdade++;
            }

            if (cursos.containsKey(curso)) {
                cursos.put(curso, cursos.get(curso) + 1);
            } else {
                cursos.put(curso, 1);
            }
        }

        double media = soma / quantidade;

        System.out.println();
        System.out.println("==== RELATORIOS ====");

        System.out.println("Media da turma: " + media);

        System.out.println("Aluno com maior nota: " + nomeMaior);
        System.out.println("Maior nota: " + maiorNota);

        System.out.println("Aluno com menor nota: " + nomeMenor);
        System.out.println("Menor nota: " + menorNota);

        System.out.println("Quantidade de alunos maiores de idade: "
                + maioresDeIdade);

        System.out.println("Quantidade de alunos por curso:");

        for (String nomeCurso : cursos.keySet()) {
            System.out.println(nomeCurso + ": " + cursos.get(nomeCurso));
        }

        scanner.close();
    }
}