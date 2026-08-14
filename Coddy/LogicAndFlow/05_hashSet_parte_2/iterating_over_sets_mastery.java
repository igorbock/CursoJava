// Neste desafio, você aplicará seus conhecimentos sobre iterar sobre um HashSet usando um loop for-each, mas com uma condição adicional para contar os elementos enquanto os imprime.

// Crie um método chamado printSetWithCount que recebe um HashSet de Strings (set) como entrada e executa as seguintes operações:

// Itere sobre o conjunto usando um loop for-each e imprima cada elemento em uma linha separada.
// Conte o número de elementos no conjunto enquanto itera.
// Após imprimir todos os elementos, imprima a contagem total no formato:

// Total elements: <number>

// O texto exato é Apple.

import java.util.HashSet;
import java.util.Scanner;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;


public class iterating_over_sets_mastery {
    public static void printSetWithCount(HashSet<String> set) {
        // Escreva seu código aqui usando um loop for-each
        int count = 0;
        for (String word : set) {
            System.out.println(word);
            count++;
        }
        System.out.printf("Total elements: %d", count);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Leia uma string JSON representando um HashSet de strings, veja as instruções para um exemplo
        String setString = scanner.nextLine();

        Type setType = new TypeToken<HashSet<String>>(){}.getType();
        HashSet<String> mySet = new Gson().fromJson(setString, setType);

        printSetWithCount(mySet);
    }
}
