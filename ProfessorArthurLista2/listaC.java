package ProfessorArthurLista2;

import java.util.ArrayList;
import java.util.Scanner;

public class listaC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        ArrayList<String> tarefas =  new ArrayList<>();

        tarefas.add("Pagar Contas");
        tarefas.add("Fazer compras");
        tarefas.add("Estudar Python");
        tarefas.add("Lavar Louças");
        tarefas.add("Exercicios");

        System.out.println("Tarefa 0: " + tarefas.get(0));
        System.out.println("Tarefa 1: " + tarefas.get(1));
        System.out.println("Tarefa 2: " + tarefas.get(2));
        System.out.println("Tarefa 3: " + tarefas.get(3));
        System.out.println("Tarefa 4: " + tarefas.get(4));

        System.out.println();

        System.out.println("(R) Remover por nome. ");
        System.out.println("(P) Remover por posição. ");
        System.out.println("(C) Clear. ");
        System.out.println("(S) Sair. ");

        String opcao = scanner.nextLine();

        if (opcao.equals("R")) {
            System.out.println("Digite o nome da tarefa: ");
            String tarefa = scanner.nextLine();

            if (tarefas.contains(tarefa)) {
                tarefas.remove(tarefa);
            } else {
                System.out.println("Tarefa não encontrada.");
            }
        } else if (opcao.equals("P")) {
            System.out.println("Digite a posição: ");
            int posicao = scanner.nextInt();

            if (posicao >= 0 && posicao < tarefas.size()) {
                tarefas.remove(posicao);
            } else {
                System.out.println("Posição invalida.");
            }
        } else if (opcao.equals("C")) {
            System.out.println("Tem deseja que você quer limpar? S/N: ");
            String confirmacao = scanner.nextLine();
            
            if (confirmacao.equals("S")) {
                tarefas.clear();
            }
        } else if (opcao.equals("S")) {
            System.out.println("Sistema encerrado.");
        }

        System.out.println("Lista atualizada: " + tarefas);
        System.out.println("Quantidade de elementos: " + tarefas.size());

        scanner.close();
    }
}
