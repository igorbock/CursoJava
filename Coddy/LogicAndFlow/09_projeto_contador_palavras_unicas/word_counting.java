// Adicione uma funcionalidade de contagem de palavras ao programa. Use um HashMap para armazenar e contar as frequências das palavras. Imprima a contagem de cada palavra exclusiva.

// Por exemplo:

// Entrada:

// Coddy
// Saída esperada:

// Word counts:
// coddy: 1

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class word_counting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        String[] sentences = text.split("\\.");
        String[][] textArray = new String[sentences.length][];

        HashMap<String, Integer> wordCounts = new HashMap<>();

        for (int i = 0; i < sentences.length; i++) {
            textArray[i] = sentences[i].trim().split(" ");
        }

        for (int i = 0; i < textArray.length; i++) {
            for (int j = 0; j < textArray[i].length; j++) {

                String original = textArray[i][j];

                // Remove pontuação e coloca em minúsculas
                String processed = original
                        .replaceAll("[^a-zA-Z0-9]", "")
                        .toLowerCase();

                // Adiciona ou incrementa a palavra
                wordCounts.put(
                    processed,
                    wordCounts.getOrDefault(processed, 0) + 1
                );
            }
        }

        System.out.println("Word counts:");

        for (Map.Entry<String, Integer> entry : wordCounts.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        scanner.close();
    }
}
