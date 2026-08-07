// Crie um método chamado unionSets que recebe dois HashSets de inteiros como entrada, calcula a união deles e imprime no formato:

// Union: [1, 2, 3]

import java.util.HashSet;
import java.util.Scanner;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;

public class math__union_of_hashsets {
    public static void unionSets(HashSet<Integer> set1, HashSet<Integer> set2) {
        // Escreva seu código aqui
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
        
        unionSets(set1, set2);
    }
}
