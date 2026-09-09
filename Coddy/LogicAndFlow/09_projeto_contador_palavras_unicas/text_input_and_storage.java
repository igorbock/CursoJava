// Crie um programa que leia texto do usuário e o armazene em uma matriz 2D. O texto pode conter múltiplas sentenças separadas por pontos. Imprima cada palavra no formato "Word[row,col]: word".

// Para armazenar palavras em uma matriz 2D, precisamos dividir cada sentença em palavras:

// String[][] textArray = new String[sentences.length][];
// for (int i = 0; i < sentences.length; i++) {
//    textArray[i] = sentences[i].trim().split(" ");
// }

import java.util.Scanner;

public class text_input_and_storage {
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
                System.out.println("Word[" + i + "," + j + "]: " + textArray[i][j]);
            }
        }
    }
}
