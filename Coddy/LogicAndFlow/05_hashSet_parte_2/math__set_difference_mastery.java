// Neste desafio, você aplicará seu conhecimento de diferença de conjuntos (removeAll()) para comparar ambas as diferenças direcionais entre dois conjuntos.

// Crie um método chamado twoWaySetDifference que recebe dois HashSets de Integers (set1 e set2) como entrada e realiza as seguintes operações:

// Calcule a diferença set1 - set2 (elementos em set1 mas não em set2).
// Imprima o resultado no formato:

// Difference (Set 1 - Set 2): [elements]

// Calcule a diferença set2 - set1 (elementos em set2 mas não em set1).
// Imprima o resultado no formato:

// Difference (Set 2 - Set 1): [elements]

// Se ambas as diferenças estiverem vazias, imprima:

// No difference between sets.

import java.util.HashSet;
import java.util.Scanner;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;

public class math__set_difference_mastery {
    public static void twoWaySetDifference(HashSet<Integer> set1, HashSet<Integer> set2) {
        // Escreva seu código aqui
        set1.removeAll(set2);
        set2.removeAll(set1);
        if(set1.isEmpty() && set2.isEmpty()) {
            System.out.println("No difference between sets.");
        } else {
            System.out.println("Difference (Set 1 - Set 2): " + set1);
            System.out.println("Difference (Set 2 - Set 1): " + set2);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Leia a string JSON representando o primeiro conjunto (ex.: [1,2,3])
        String set1String = scanner.nextLine();
        // Leia a string JSON representando o segundo conjunto (ex.: [2,3,4])
        String set2String = scanner.nextLine();

        Type setType = new TypeToken<HashSet<Integer>>(){}.getType();
        HashSet<Integer> set1 = new Gson().fromJson(set1String, setType);
        HashSet<Integer> set2 = new Gson().fromJson(set2String, setType);

        twoWaySetDifference(set1, set2);
    }
}
