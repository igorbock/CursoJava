// Crie um método chamado processHashSet que aceite três argumentos:

// Um HashSet<Object> (set)
// Um Object (input) para processar
// Uma String (operation) especificando a operação a ser realizada
// Usando instruções if/else e os métodos do HashSet que você já aprendeu, o método deve retornar uma String baseada na operation:

// "add": adiciona input ao conjunto. Retorna "Added successfully" se for adicionado com sucesso, ou "Element already exists" se já estiver no conjunto.
// "remove": remove input do conjunto. Retorna "Removed successfully" se for removido com sucesso, ou "Element not found" se não estiver no conjunto.
// "find": retorna "Found at index: [index]" se o conjunto contiver input (onde [index] é a posição do elemento na ordem de iteração), caso contrário "Element not found".
// "count": retorna "Number of integers: [count]", onde [count] é o número de inteiros no conjunto.
// Valide as entradas primeiro:

// Se set for null: retorna "Invalid set".
// Se operation for null ou não for uma das quatro acima: retorna "Invalid operation".
// Para a operação "find", se input for null: retorna "Cannot find null".

import java.util.HashSet;
import java.util.Scanner;

public class recap__hashset {
    public static String processHashSet(HashSet<Object> set, Object input, String operation) {
        // Escreva seu código aqui
        if (set == null) {
            return "Invalid set";
        }
        if (operation == null) {
            return "Invalid operation";
        }
        if (!operation.equals("add") && !operation.equals("remove") && !operation.equals("find") && !operation.equals("count")) {
            return "Invalid operation";
        }
        if (operation.equals("find") && input == null) {
            return "Cannot find null";
        }
        if (operation.equals("add")) {
            if (set.contains(input)) {
                return "Element already exists";
            } else {
                set.add(input);
                return "Added successfully";
            }
        } else if (operation.equals("remove")) {
            if (set.contains(input)) {
                set.remove(input);
                return "Removed successfully";
            } else {
                return "Element not found";
            }
        } else if (operation.equals("find")) {
            int index = 0;
            for (Object obj : set) {
                if (obj.equals(input)) {
                    return "Found at index: " + index;
                }
                index++;
            }
            return "Element not found";
        } else if (operation.equals("count")) {
            int count = 0;
            for (Object obj : set) {
                if (obj instanceof Integer) {
                    count++;
                }
            }
            return "Number of integers: " + count;
        }
        return "";
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Ler o conjunto inicial
        String[] items = scanner.nextLine().split(",");
        HashSet<Object> set = new HashSet<>();
        if (!items[0].equals("empty")) {
            for (String item : items) {
                // Tentar analisar como inteiro primeiro
                try {
                    set.add(Integer.parseInt(item));
                } catch (NumberFormatException e) {
                    set.add(item);
                }
            }
        }
        
        // Ler a entrada
        String inputStr = scanner.nextLine();
        Object input;
        try {
            input = Integer.parseInt(inputStr);
        } catch (NumberFormatException e) {
            input = inputStr;
        }
        
        // Ler a operação
        String operation = scanner.nextLine();
        
        System.out.println(processHashSet(set, input, operation));
    }
}
