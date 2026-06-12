// Escreva um programa Java que usa um loop do-while para fazer o seguinte:

// Inicialize uma variável sum para 0.
// Inicialize uma variável number para 1.
// Em cada iteração, adicione number a sum.
// Incremente number por 2 em cada iteração (ou seja, 1, 3, 5, ...).
// imprima number e sum:
// Sum is: [The sum value]
// Num is: [The number value]
// Continue o loop enquanto number for menor ou igual a 50.
// Imprima o valor final de sum após o loop terminar: Final Sum: [The final sum value]

public class do_while_loop {
    public static void main(String[] args) {
        // Initialize variables
        int sum = 0;
        int number = 1;

        // Your code here
        do { 
            sum += number;
            number += 2;
            System.out.printf("Sum is: %d\n", sum);
            System.out.printf("Num is: %d\n", number);
        } while (number <= 50);

        // Print the final sum
        System.out.println("Final Sum: " + sum);
    }
}