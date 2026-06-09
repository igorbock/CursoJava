// Modifique a saída para que ela sempre imprima um valor double com duas casas decimais. 
// Para fazer isso, use o formato %.2f dentro do método printf:

// int num = 0;
// System.out.printf("number: %.2f", num);
// Adicione \n no final da string, isso adiciona uma nova linha:

// System.out.printf("number: %.2f\n", num);

import java.util.Scanner;

public class formatted_output {
    public static void main(String[] args) {
        System.out.println("Calculator App");

        Scanner scanner = new Scanner(System.in);
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();

        double sum = num1 + num2;
        double difference = num1 - num2;
        double product = num1 * num2;
        double quotient = num1 / num2;

        System.out.printf("Sum: %.2f\n", sum);
        System.out.printf("Difference: %.2f\n", difference);
        System.out.printf("Product: %.2f\n", product);
        System.out.printf("Quotient: %.2f\n", quotient);

        scanner.close();
    }
}
