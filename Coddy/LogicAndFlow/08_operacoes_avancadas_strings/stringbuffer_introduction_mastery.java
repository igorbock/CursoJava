// Crie um método chamado processText que recebe quatro argumentos:

// Uma String (text) para modificar
// Uma String (target) para encontrar
// Uma String (replacement) para substituir target
// Um int (operations) número de operações a realizar
// O método deve:

// Criar um StringBuffer com o texto de entrada
// Com base no parâmetro operations:
// Se operations = 1: Substituir todas as ocorrências de target por replacement
// Se operations = 2: Substituir todas as ocorrências e inverter toda a string
// Se operations = 3: Substituir todas as ocorrências, inverter a string e converter para maiúsculas
// Adicionar um ponto de exclamação no final
// Retornar a string final
// As mensagens de retorno devem ser:

// Se qualquer entrada de string for null: return "Invalid input"
// Se operations for menor que 1 ou maior que 3: return "Invalid operation"
// Se target não for encontrado: retornar o texto original modificado de acordo com o número de operations
// Para operação bem-sucedida: retornar o texto modificado

import java.util.Scanner;

public class stringbuffer_introduction_mastery {
    public static String processText(String text, String target, String replacement, int operations) {
        // Escreva seu código aqui
        if (text == null || target == null || replacement == null) {
            return "Invalid input";
        }
        if (operations < 1 || operations > 3) {
            return "Invalid operation";
        }
        StringBuffer sb = new StringBuffer(text);
        switch (operations) {
            case 1:
                sb.replace(0, sb.length(), text.replace(target, replacement));
                sb.append("!");
                break;
            case 2:
                sb.replace(0, sb.length(), text.replace(target, replacement));
                sb.reverse();
                sb.append("!");
                break;
            case 3:
                sb.replace(0, sb.length(), text.replace(target, replacement));
                sb.reverse();
                sb.append("!");
                break;
        }
        if (operations == 3) {
            return sb.toString().toUpperCase();
        }
        return sb.toString();
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String target = scanner.nextLine();
        String replacement = scanner.nextLine();
        int operations = scanner.nextInt();
        
        if (text.equals("null")) text = null;
        if (target.equals("null")) target = null;
        if (replacement.equals("null")) replacement = null;
        
        System.out.println(processText(text, target, replacement, operations));
    }
}
