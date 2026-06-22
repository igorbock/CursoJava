// Cada caso de teste tem três entradas.

// A primeira entrada indica quantas vezes fazer iterações, e as duas últimas entradas são números nos quais faremos operações.

// Crie um método que recebe dois argumentos e retorna o maior número dos dois. Se ambos forem iguais, retorne um deles.

// Itere iterations vezes e para cada iteração faça:

// Chame o método com num1, num2, e salve o resultado em uma variável.
// Divida o maior número dos dois por 2, e então substitua a variável original maior pelo novo valor do resultado.
// imprima o novo valor.  
// Continue fazendo isso até que o programa tenha iterado iterations vezes ou um dos números seja menor que 2.
// Nota: você já tem o esqueleto do código!

import java.util.Scanner;

public class return_types {
    public static double bigger(double arg1, double arg2) {
        // Complete the method
        
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int iterations = scanner.nextInt();
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();

        for (int i = 0; i < iterations; i++) {
            // Write your code below
            
        }
        
    }
}
