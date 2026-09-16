// Melhore o programa para exibir:

// Número total de palavras
// Número de palavras únicas
// Cada palavra com sua contagem e sua porcentagem do total, uma linha por palavra, em ordem alfabética (um TreeMap mantém suas chaves ordenadas; se você usar um HashMap, ordene as chaves antes de imprimir)
// Por exemplo:

// Entrada:

// Coddy!
// Saída esperada:

// Total words: 1
// Unique words: 1
// Word statistics:
// coddy: 1 (100.00%)
// REQUIRED OUTPUT FORMAT: [Your translated content here]

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class advanced_statistics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        // TreeMap mantém as chaves ordenadas automaticamente (alfabética)
        Map<String, Integer> wordCounts = new TreeMap<>();

        String[] sentences = text.split("\\.");
        for (String sentence : sentences) {
            sentence = sentence.trim();
            if (sentence.isEmpty()) continue;

            String[] parts = sentence.split("\\s+");
            for (String original : parts) {
                // Remove pontuação e coloca em minúsculas
                String processed = original
                        .replaceAll("[^a-zA-Z0-9]", "")
                        .toLowerCase();

                // Se virar string vazia (ex.: só pontuação), ignora
                if (processed.isEmpty()) continue;

                wordCounts.put(processed, wordCounts.getOrDefault(processed, 0) + 1);
            }
        }

        int totalWords = wordCounts.values().stream().mapToInt(Integer::intValue).sum();

        System.out.println("Total words: " + totalWords);
        System.out.println("Unique words: " + wordCounts.size());
        System.out.println("Word statistics:");

        for (Map.Entry<String, Integer> entry : wordCounts.entrySet()) {
            double percentage = (double) entry.getValue() / totalWords * 100.0;
            System.out.printf("%s: %d (%.2f%%)%n", entry.getKey(), entry.getValue(), percentage);
        }

        scanner.close();
    }
}
