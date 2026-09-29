package ProfessorRodrigo;

public class A3 {
    public static void main(String[] args) {
        // Criando um estudante usando o construtor
        A2 aluno1 = new A2("Carlos", 85.5);
        
        // Exibindo a nota conceitual dele (A, B, C, D ou F)
        System.out.println("O aluno " + aluno1.getName() + " ficou com o conceito: " + aluno1.getLetterGrade());
    }
}

