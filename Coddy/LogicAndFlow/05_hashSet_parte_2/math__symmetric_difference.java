// Crie um método chamado symmetricDifference que recebe dois HashSets de inteiros como entrada, calcula sua diferença simétrica e a imprime no formato:

// Symmetric Difference: [elements]

import java.util.HashSet;
import java.util.Scanner;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;

public class math__symmetric_difference {
    public static void symmetricDifference(HashSet<Integer> set1, HashSet<Integer> set2) {
        // Escreva seu código aqui
        HashSet<Integer> difference1 = new HashSet<>(set1);
        difference1.removeAll(set2);
        HashSet<Integer> difference2 = new HashSet<>(set2);
        difference2.removeAll(set1);
        difference1.addAll(difference2);
        System.out.println("Symmetric Difference: " + difference1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Lê a string JSON para o primeiro conjunto (ex: [1,2,3])
        String set1String = scanner.nextLine();
        // Lê a string JSON para o segundo conjunto (ex: [2,3,4])
        String set2String = scanner.nextLine();

        Type setType = new TypeToken<HashSet<Integer>>(){}.getType();
        HashSet<Integer> set1 = new Gson().fromJson(set1String, setType);
        HashSet<Integer> set2 = new Gson().fromJson(set2String, setType);

        symmetricDifference(set1, set2);
    }
}
