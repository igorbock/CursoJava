// Crie um método chamado findWords que recebe dois argumentos:

// Uma String (text) para pesquisar em
// Uma String (word) para encontrar
// O método deve:

// Usar Pattern e Matcher para encontrar todas as ocorrências da palavra
// Retornar uma string contendo as posições onde a palavra foi encontrada
// As posições devem ser separadas por espaços
// As mensagens de retorno devem ser:

// Se qualquer entrada for null: return "Invalid input"
// Se a palavra não for encontrada: return "Not found"
// Se encontrada: return positions (e.g., "4 10 15")

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class pattern_matching_with_regex {
    public static String findWords(String text, String word) {
        // Escreva seu código aqui
        if (text == null || word == null) {
            return "Invalid input";
        }
        Pattern pattern = Pattern.compile(Pattern.quote(word));
        Matcher matcher = pattern.matcher(text);
        StringBuilder positions = new StringBuilder();
        
        while (matcher.find()) {
            positions.append(matcher.start()).append(" ");
        }
        
        if (positions.length() == 0) {
            return "Not found";
        }
        
        return positions.toString().trim();
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String word = scanner.nextLine();
        
        if (text.equals("null")) text = null;
        if (word.equals("null")) word = null;
        
        System.out.println(findWords(text, word));
    }
}
