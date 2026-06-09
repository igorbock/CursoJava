// Adicione as operações aritméticas básicas (adição, subtração, multiplicação e divisão) em num1 e num2. 
// Armazene os resultados em variáveis nomeadas sum, difference, product e quotient, respectivamente. 
// Imprima os resultados no console usando System.out.println no seguinte formato:

// Sum: [sum]
// Difference: [difference]
// Product: [product]
// Quotient: [quotient]

import java.util.Scanner;

public class basic_operations {
    public static void main(String[] args) {
        System.out.println("Calculator App");

        Scanner scanner = new Scanner(System.in);
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();

        double sum = num1 + num2;
        double difference = num1 - num2;
        double product = num1 * num2;
        double quotient = num1 / num2;

        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);

        scanner.close();
    }
}
