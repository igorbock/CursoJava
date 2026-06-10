// Escreva um programa que recebe uma entrada, um número double.

// Use um laço while para dividir a entrada por 2 enquanto o número for maior ou igual a 3.5.

// Imprima o primeiro número que for menor que 3.5.

import java.util.Scanner;

public class while_loop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Write your code below
        double number = scanner.nextDouble();
        while (number >= 3.5) {
            number /= 2;
        }
        System.out.print(number);

        scanner.close();
    }
}
