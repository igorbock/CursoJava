// Crie um método chamado printSet que recebe um HashSet de strings como entrada e imprime cada elemento em uma linha separada.

// Detalhes:

// O método deve usar um loop for-each simples para iterar sobre o conjunto.
// Cada elemento deve ser impresso em sua própria linha.
// O texto exato é Apple.

import java.util.HashSet;
import java.util.Scanner;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;

public class iterating_over_sets {
    public static void printSet(HashSet<String> set) {
        // Escreva seu código aqui usando um loop for-each
        for (String word : set) {
            System.out.println(word);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Leia uma string JSON representando um HashSet de strings, veja as instruções para um exemplo
        String setString = scanner.nextLine();

        Type setType = new TypeToken<HashSet<String>>(){}.getType();
        HashSet<String> mySet = new Gson().fromJson(setString, setType);

        printSet(mySet);
    }
}
