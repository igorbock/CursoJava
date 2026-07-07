// Crie um método chamado compareStrings que recebe duas strings como entrada e realiza as seguintes comparações:

// Verifica se as duas strings são iguais usando equals e imprime o resultado.
// Verifica se as duas strings são iguais (ignorando maiúsculas e minúsculas) usando equalsIgnoreCase e imprime o resultado.
// Compara as duas strings usando compareTo e imprime o resultado.
// Compara as duas strings (ignorando maiúsculas e minúsculas) usando compareToIgnoreCase e imprime o resultado.
// Exemplo de saída para as strings de entrada HELLO e hello:

// HELLO equals hello: false
// HELLO equalsIgnoreCase hello: true
// HELLO compareTo hello: -32
// HELLO compareToIgnoreCase hello: 0

import java.util.Scanner;

public class string_comparison_1 {
    public static void compareStrings(String str1, String str2) {
        // Write your code here
        
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        compareStrings(str1, str2);
    }
}
