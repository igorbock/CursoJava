// Crie um método chamado checkMultipleElements que recebe:

// Um HashSet de Strings (set)
// Uma ArrayList de Strings (elements) para verificar
// Para cada elemento na lista, imprima true se o elemento existir no conjunto, caso contrário, imprima false.

// Exemplo de Entrada:

// set = ["Apple", "Banana", "Cherry"]
// elements = ["Banana", "Grapes", "Apple"]

import java.util.HashSet;
import java.util.ArrayList;
import java.util.Scanner;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;

public class checking_if_an_element_exists_mastery {
    public static void checkMultipleElements(HashSet<String> set, ArrayList<String> elements) {
        // Escreva seu código aqui
        for (String element : elements) {
            if (set.contains(element)) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String setString = scanner.nextLine();
        String listString = scanner.nextLine();

        Type setType = new TypeToken<HashSet<String>>(){}.getType();
        HashSet<String> set = new Gson().fromJson(setString, setType);

        Type listType = new TypeToken<ArrayList<String>>(){}.getType();
        ArrayList<String> elements = new Gson().fromJson(listString, listType);

        checkMultipleElements(set, elements);
    }
}
