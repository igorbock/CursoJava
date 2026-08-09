// Neste desafio, você aplicará seu conhecimento de a operação de união (addAll()) em HashSets, mas com uma condição adicional.

// Crie um método chamado unionWithSubsetCheck que recebe dois HashSets de Integers (set1 e set2) como entrada e realiza as seguintes operações:

// Verifique se set1 é um subconjunto de set2 ou se set2 é um subconjunto de set1 usando o método containsAll().
// Se set1 for um subconjunto de set2, imprima:

// Set 1 is a subset of Set 2

// Se set2 for um subconjunto de set1, imprima:

// Set 2 is a subset of Set 1

// Se nenhum for subconjunto do outro, imprima:

// No subset relation

// Calcule a união de set1 e set2 usando addAll().
// Imprima o conjunto união no formato:

// Union: [elements]

import java.util.HashSet;
import java.util.Scanner;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;

public class math__union_of_hashsets_mastery {
    public static void unionWithSubsetCheck(HashSet<Integer> set1, HashSet<Integer> set2) {
        // Escreva seu código aqui
        if (set2.containsAll(set1)) {
            System.out.println("Set 1 is a subset of Set 2");
        } else if (set1.containsAll(set2)) {
            System.out.println("Set 2 is a subset of Set 1");
        } else {
            System.out.println("No subset relation");
        }

        HashSet<Integer> unionSet = new HashSet<>(set1);
        unionSet.addAll(set2);
        System.out.println("Union: " + unionSet);
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Lê a string JSON representando o primeiro conjunto (ex.: [1,2])
        String set1String = scanner.nextLine();
        // Lê a string JSON representando o segundo conjunto (ex.: [2,3])
        String set2String = scanner.nextLine();

        Type setType = new TypeToken<HashSet<Integer>>(){}.getType();
        HashSet<Integer> set1 = new Gson().fromJson(set1String, setType);
        HashSet<Integer> set2 = new Gson().fromJson(set2String, setType);
        
        unionWithSubsetCheck(set1, set2);
    }
}
