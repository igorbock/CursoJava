// Você recebe um código que obtém como entrada dois números n1 e n2 e uma string de um único caractere op.

// Nota: aprenderemos nas próximas aulas como obter entrada do usuário, por enquanto, não mexa nas três primeiras linhas.

// Os valores possíveis para op são +, -, / e *

// Sua tarefa é definir a variável result com base nas condições:

// se op for +, defina result como n1 + n2.
// se op for -, defina result como n1 - n2.
// se op for /, defina result como n1 / n2.
// se op for *, defina result como n1 * n2.
 
// Importante: No Java, strings não podem ser comparadas com ==. Para comparar uma string, use o método .equals() em vez disso. 
// Por exemplo, para verificar se op é +, escreva: op.equals("+")

import java.util.Scanner;

public class recap_if_else {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Don't change this line
        int n1 = scanner.nextInt(); // Don't change this line
        int n2 = scanner.nextInt(); // Don't change this line
        scanner.nextLine(); // Don't change this line
        String op = scanner.nextLine(); // Don't change this line
        
        // Write your code below
        double result = 0;
        if (op.equals("+")) {
            result = n1 + n2;
        } else if (op.equals("-")) {
            result = n1 - n2;
        } else if (op.equals("/")) {
            result = n1 / n2;
        } else if (op.equals("*")) {
            result = n1 * n2;
        }
        
        System.out.println(result);

        scanner.close();
    }
}