// Escreva um programa que obtém uma entrada String do usuário.

// O programa deve imprimir "T" se a entrada for igual a "1" e "F" caso contrário.

// Dica: No Java, use .equals() para comparar Strings em vez de ==, pois == verifica a igualdade de 
// referência e pode não funcionar corretamente para comparação de Strings.

import java.util.Scanner;

public class recap_true_or_false {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Write your code below
        String input = scanner.nextLine();
        if(input.equals("1")){
            System.out.printf("T");
        } else {
            System.out.printf("F");
        }
        scanner.close();
    }
}
