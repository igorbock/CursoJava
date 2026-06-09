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
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();

        System.out.println("First number: " + num1);
        System.out.println("Second number: " + num2);

        scanner.close();
    }
}
