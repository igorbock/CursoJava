// Crie um método chamado checkElement que recebe dois argumentos:

// Um HashSet de Strings (set)
// Uma String (element) para verificar
// O método deve imprimir true se o elemento existir no conjunto, e false caso contrário.

import java.util.HashSet;
import java.util.Scanner;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;

public class checking_if_an_element_exists {
    public static void checkElement(HashSet<String> set, String element) {
        // Escreva seu código aqui
        if (set.contains(element)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String setString = scanner.nextLine();
        String element = scanner.nextLine();
        
        Type setType = new TypeToken<HashSet<String>>(){}.getType();
        HashSet<String> set = new Gson().fromJson(setString, setType);
        
        checkElement(set, element);
    }
}
