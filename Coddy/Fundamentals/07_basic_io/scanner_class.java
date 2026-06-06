// Escreva um programa que obtém entrada do usuário (o nome dele), e então exibe Hello, seguido pelo 
// nome inserido pelo usuário.

// Por exemplo, se o usuário digitar Bob, a saída esperada é Hello, Bob.

// Você precisará:

// Criar um objeto Scanner para ler a entrada.
// Solicitar que o usuário digite o nome dele usando exatamente: Enter your name:
// Ler o nome do usuário usando o método apropriado do Scanner.
// Imprimir Hello, e a variável armazenada no final.

import java.util.Scanner;

public class scanner_class {
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter their name
        System.out.print("Enter your name: ");
        
        // Read the user's name
        String name = scanner.nextLine();
        
        // Print the greeting message
        System.out.printf("Hello, %s", name);
    }
}
