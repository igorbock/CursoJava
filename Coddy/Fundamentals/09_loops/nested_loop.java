// Escreva um programa que imprima um retângulo de asteriscos (*) com uma largura e altura dadas.

// Entrada: Dois inteiros: width e height

// Por exemplo:

// Se width = 5 e height = 3, a saída deve ser:

// *****
// *****
// *****
// Se width = 4 e height = 6, a saída deve ser:

// ****
// ****
// ****
// ****
// ****
// ****

import java.util.Scanner;

public class nested_loop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int width = scanner.nextInt();
        int height = scanner.nextInt();
        // Write your code below
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
        scanner.close();
    }
}
