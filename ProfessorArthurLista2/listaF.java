package ProfessorArthurLista2;

import java.util.Scanner;
public class listaF {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int numero = 1; numero <= 7; numero++) {
            for (int multiplicador = 1; multiplicador<= 5; multiplicador++){
                System.out.println(numero + "x" + multiplicador + "=" + (numero * multiplicador));
            }
        }
       
        scanner.close();
    }
}
