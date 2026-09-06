// Crie um método chamado tokenizeText que recebe dois argumentos:

// Uma String (text) para tokenizar
// Uma String (delimiter) para dividir
// O método deve:

// Criar um StringTokenizer com o texto e o delimitador fornecidos
// Retornar uma string contendo a contagem de tokens seguida por cada token em uma nova linha
// As mensagens de retorno devem ser:

// Se text for null: retornar "Invalid text"
// Se delimiter for null: use espaço como delimitador
// Formato: "Token count: X\nToken: token1\nToken: token2\n..."

import java.util.Scanner;
import java.util.StringTokenizer;

public class string_tokenizer {
    public static String tokenizeText(String text, String delimiter) {
        // Escreva seu código aqui
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String delimiter = scanner.nextLine();
        
        if (text.equals("null")) text = null;
        if (delimiter.equals("null")) delimiter = null;
        
        System.out.println(tokenizeText(text, delimiter));
    }
}