// Crie um método chamado removeElement que recebe dois argumentos:

// Um HashSet de Strings (set)
// Uma String (element) para remover
// O método deve remover o elemento especificado do conjunto e, em seguida, imprimir o conjunto atualizado.

import java.util.HashSet;
import java.util.Scanner;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;

public class removing_an_element {
    public static void removeElement(HashSet<String> set, String element) {
        // Escreva seu código aqui
        set.remove(element);
        System.out.println(set);
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String setString = scanner.nextLine();
        String element = scanner.nextLine();
        
        Type setType = new TypeToken<HashSet<String>>(){}.getType();
        HashSet<String> set = new Gson().fromJson(setString, setType);
        
        removeElement(set, element);
    }
}