// Você recebe um código que armazena uma string aleatória como entrada em uma variável chamada rnd.

// Imprima no console "The input is: " e a string aleatória que está dentro da variável rnd.

// Verifique os casos de teste para exemplos!

import java.util.Scanner;

public class formatting_output {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String rnd = scanner.nextLine();
        
        // Write your code below
        System.out.printf("The input is: %s", rnd);

        scanner.close();
    }
}
