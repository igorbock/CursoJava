// Modifique o programa anterior para limpar cada palavra, removendo a pontuação e convertendo para letras minúsculas. Imprima tanto a palavra original quanto a processada.

// Por exemplo

// Entrada:

// Coddy
// Expected Output:
// Original[0,0]: Coddy
// Processed[0,0]: coddy

import java.util.Scanner;

public class word_processing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        
        String[] sentences = text.split("\\.");
        String[][] textArray = new String[sentences.length][];
        
        // Escreva seu código aqui
        for (int i = 0; i < sentences.length; i++) {
            textArray[i] = sentences[i].trim().split(" ");
        }
        for (int i = 0; i < textArray.length; i++) {
            for (int j = 0; j < textArray[i].length; j++) {
                String original = textArray[i][j];

                // Remove pontuação (mantém letras e números) e coloca em minúsculas
                String processed = original.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

                System.out.println("Original[" + i + "," + j + "]: " + original);
                System.out.println("Processed[" + i + "," + j + "]: " + processed);
            }
        }
    }
}
