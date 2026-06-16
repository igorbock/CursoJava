// Escreva um programa que obtém um número dinâmico de valores de entrada.

// A primeira entrada é um número que representa o número de valores de entrada que o seguem. Os próximos valores de entrada são números inteiros.

// No final, imprima a soma de todos os números de entrada (não incluindo a primeira entrada).

 

// Por exemplo,

// Entrada:

// 3
// 1
// 5
// 6
// Saída esperada: 12

// Explicação:

//  1 + 5 + 6 = 12, e há exatamente 3 números seguindo o primeiro número de entrada (3).

import java.util.Scanner;

public class recap_dynamic_input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Write your code below
        int first = scanner.nextInt();
        int total = 0;
        for (int i = 1; i <= first; i++) {
            int value = scanner.nextInt();
            total += value;
        }
        System.out.print(total);

        scanner.close();
    }
}
