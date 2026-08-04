// Crie um método chamado checkSet que recebe um HashSet de Strings como entrada. O método deve imprimir duas linhas:

// "Empty: <true/false>" indicando se o conjunto está vazio.
// "Size: <number>" indicando o número de elementos no conjunto.

import java.util.HashSet;
import java.util.Scanner;

public class empty_and_size {
public static void checkSet(HashSet<String> set) {
        // Escreva seu código aqui
        System.out.println("Empty: " + set.isEmpty());
        System.out.println("Size: " + set.size());
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Leia a string JSON representando um HashSet (ex.: ["Apple","Banana"])
        String setString = scanner.nextLine();
        
        Type setType = new TypeToken<HashSet<String>>(){}.getType();
        HashSet<String> set = new Gson().fromJson(setString, setType);
        
        checkSet(set);
    }
}
