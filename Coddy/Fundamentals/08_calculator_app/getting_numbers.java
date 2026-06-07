// Modifique o código fornecido para obter dois números do usuário e armazená-los em variáveis chamadas num1 e num2. 
// Use a classe Scanner e seu método nextDouble() para ler os números. 
// Após obter os números, imprima-os no console usando System.out.println para verificar a entrada no seguinte formato:

// First number: ...
// Second number: ...
// Não esqueça! Importe a biblioteca Scanner no topo do seu programa para poder usá-la:

import java.util.Scanner;

public class getting_numbers {
    public static void main(String[] args) {
        System.out.println("Calculator App");

        Scanner scanner = new Scanner(System.in);
        float num1 = scanner.nextFloat();
        float num2 = scanner.nextFloat();

        System.out.printf("First number: %f", num1);
        System.out.println();
        System.out.printf("Second number: %f", num2);

        scanner.close();
    }
}
