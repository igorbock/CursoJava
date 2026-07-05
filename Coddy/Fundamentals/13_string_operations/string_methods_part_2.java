// Escreva um programa que recebe duas entradas: uma string de texto e um caractere delimitador. 
// O programa deve substituir todos os espaços simples (" ") no texto pelo delimitador especificado e 
// imprimir a string modificada.

import java.util.Arrays;
import java.util.Scanner;

public class string_methods_part_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String delimiter = scanner.nextLine();
        // Write your code below
        String modifiedText = text.replace(" ", delimiter);
        System.out.println(modifiedText);
        scanner.close();
    }
}
