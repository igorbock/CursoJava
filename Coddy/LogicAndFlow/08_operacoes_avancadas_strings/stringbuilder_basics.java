// Crie um método chamado buildPhrase que recebe três argumentos:

// Uma String (start) para o início da frase
// Uma String (middle) para a parte do meio
// Uma String (end) para o final
// O método deve:

// Criar um StringBuilder com a string de início
// Adicionar um espaço e a string do meio
// Adicionar um espaço e a string do final
// Adicionar um ponto de exclamação no final
// Retornar a string final
// As mensagens de retorno devem ser:

// Se qualquer entrada for null: retornar "Invalid input"
// Para operação bem-sucedida: retornar a frase construída

import java.util.Scanner;

public class stringbuilder_basics {
    public static String buildPhrase(String start, String middle, String end) {
        // Escreva seu código aqui
        if (start == null || middle == null || end == null) {
            return "Invalid input";
        }
        StringBuilder sb = new StringBuilder(start);
        sb.append(" " + middle);
        sb.append(" " + end + "!");
        return sb.toString();
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String start = scanner.nextLine();
        String middle = scanner.nextLine();
        String end = scanner.nextLine();
        
        if (start.equals("null")) start = null;
        if (middle.equals("null")) middle = null;
        if (end.equals("null")) end = null;
        
        System.out.println(buildPhrase(start, middle, end));
    }
}
