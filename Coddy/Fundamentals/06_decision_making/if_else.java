// Você recebe um código que obtém como entrada um número que indica a velocidade do vento 
// e o armazena em uma variável chamada wind.

// Nota: aprenderemos nas próximas lições como obter entrada do usuário, atualmente apenas 
// não toque na primeira linha.

// Sua tarefa é inicializar a variável status com base nas condições:
// "Calm" se wind for menor que 8,
// "Breeze" se wind estiver entre 8 e 31 (incluindo 8 e 31).
// "Gale" se wind estiver entre 32 e 63 (incluindo 32 e 63)
// "Storm" caso contrário

import java.util.Scanner;

public class if_else {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int wind = scanner.nextInt(); // Don't change this line
        String status = "unset";
        // Type your code below
        if (wind < 8) {
            status = "Calm";
        } else if (wind >= 8 && wind <= 31) {
            status = "Breeze";
        } else if (wind >= 32 && wind <= 63) {
            status = "Gale";
        } else {
            status = "Storm";
        }
        
        // Don't change the line below
        System.out.println("status = " + status);
        scanner.close(); // Closing the scanner after use
    }
}