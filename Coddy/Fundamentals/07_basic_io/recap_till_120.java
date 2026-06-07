// Escreva um programa que obtenha a idade do usuário como entrada.

// O programa deve imprimir o número de anos faltantes years till 120 (em um formato específico, mostrado abaixo).

// Por exemplo, para a entrada 25, a saída esperada é "95 years till 120".

import java.util.Scanner;

public class recap_till_120 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Write your code below
        int year = scanner.nextInt();
        int result = 120 - year;

        System.out.printf("%d years till 120", result);

        scanner.close();
    }
}
