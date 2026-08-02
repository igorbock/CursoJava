// Crie um método chamado addElement que recebe dois argumentos:

// Um HashSet de Strings (set)
// Uma String (element) para adicionar
// O método deve adicionar o elemento fornecido ao conjunto e, em seguida, imprimir o conjunto atualizado.

import java.util.HashSet;
import java.util.Scanner;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;

public class adding_an_element {
    public static void addElement(HashSet<String> set, String element) {
        // Escreva seu código aqui
        set.add(element);
        System.out.println(set);
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Lê a string JSON representando um HashSet (ex: ["Apple","Banana"])
        String setString = scanner.nextLine();
        // Lê o elemento a ser adicionado (ex: "Cherry")
        String element = scanner.nextLine();
        
        Type setType = new TypeToken<HashSet<String>>(){}.getType();
        HashSet<String> set = new Gson().fromJson(setString, setType);
        
        addElement(set, element);
    }
}