// Escreva um programa que recebe duas entradas, números. Os números de entrada são os argumentos do método. 

// Crie um método que recebe dois argumentos, calcula o produto deles e o imprime, nomeie o método como quiser.

// Chame o método com os números de entrada.

// Nota! No seu código, escreva o método antes das instruções de chamada/execução dele.

import java.util.Scanner;

public class method_parameters {
    public static void multiply(int x, int y) {
        int product = x * y;
        System.out.print(product);
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        // Call the method with a and b as arguments
        multiply(a, b);

        scanner.close();
    }
}
