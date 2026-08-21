// Neste desafio, você aplicará seu conhecimento de correspondência de padrões com instanceof para processar diferentes tipos de valores com condições estendidas.

// Crie um método chamado processExtendedValue que recebe um argumento:

// Um Object (value) que pode ser de diferentes tipos
// O método deve usar correspondência de padrões com instanceof para processar o valor e retornar uma string com base nessas regras:

// Se for um Integer:
// Se for par, retorne "Even Number: " seguido do valor triplicado.
// Se for ímpar, retorne "Odd Number: " seguido do valor dobrado.
// Se for uma String:
// Se o comprimento for maior que 5, retorne "Long Text: " seguido do valor em minúsculas.
// Caso contrário, retorne "Short Text: " seguido do valor em maiúsculas.
// Se for um Boolean:
// Se for true, retorne "Boolean: Yes"
// Se for false, retorne "Boolean: No"
// Para qualquer outro tipo: retorne "Unsupported Type"

import java.util.Scanner;

public class pattern_matching_mastery {
    public static String processExtendedValue(Object value) {
        // Escreva seu código aqui usando correspondência de padrões
        if (value instanceof Integer i) {
            if (i % 2 == 0) {
                return "Even Number: " + (i * 3);
            } else {
                return "Odd Number: " + (i * 2);
            }
        }
        if (value instanceof String s) {
            if (s.length() > 5) {
                return "Long Text: " + s.toLowerCase();
            } else {
                return "Short Text: " + s.toUpperCase();
            }
        }
        if (value instanceof Boolean b) {
            if (b) {
                return "Boolean: Yes";
            } else {
                return "Boolean: No";
            }
        }
        return "Unsupported Type";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String type = scanner.nextLine();
        String inputValue = scanner.nextLine();
        
        Object value = switch(type) {
            case "Integer" -> Integer.parseInt(inputValue);
            case "String" -> inputValue;
            case "Boolean" -> Boolean.parseBoolean(inputValue);
            default -> inputValue;
        };
        
        System.out.println(processExtendedValue(value));
    }
}
