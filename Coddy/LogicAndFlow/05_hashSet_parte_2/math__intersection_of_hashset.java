// Crie um método chamado intersectionSets que recebe dois HashSets de inteiros como entrada, calcula a 
// interseção deles e imprime no formato:

// Intersection: [2]

import java.util.HashSet;
import java.util.Scanner;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;

public class math__intersection_of_hashset {
    public static void intersectionSets(HashSet<Integer> set1, HashSet<Integer> set2) {
        // Escreva seu código aqui
        HashSet<Integer> intersectionSet = new HashSet<>(set1);
        intersectionSet.retainAll(set2);
        System.out.println("Intersection: " + intersectionSet);
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Leia a string JSON para o primeiro conjunto (ex.: [1,2])
        String set1String = scanner.nextLine();
        // Leia a string JSON para o segundo conjunto (ex.: [2,3])
        String set2String = scanner.nextLine();
        
        Type setType = new TypeToken<HashSet<Integer>>(){}.getType();
        HashSet<Integer> set1 = new Gson().fromJson(set1String, setType);
        HashSet<Integer> set2 = new Gson().fromJson(set2String, setType);
        
        intersectionSets(set1, set2);
    }
}
