// Crie um programa que verifica se um número é positivo, negativo ou zero usando o operador ternário. O programa deve:

// Receber um inteiro como entrada do usuário.
// Usar o operador ternário para determinar se o número é positivo, negativo ou zero.
// Imprimir o resultado no formato: "The number is [positive/negative/zero]".

import java.util.Scanner;

public class ternary_operator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        String result = "";
        
        // Write your code below
        result = (number > 0) ? "positive" : (number < 0) ? "negative" : "zero";
        
        System.out.println("The number is " + result);
        scanner.close();
    }
}
