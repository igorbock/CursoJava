// Neste desafio, você aplicará seu conhecimento de a operação de interseção (retainAll()) em HashSets, mas com uma condição adicional.

// Crie um método chamado intersectionWithSubsetCheck que recebe dois HashSets de Integers (set1 e set2) como entrada e realiza as seguintes operações:

// Calcule a interseção de set1 e set2 usando retainAll().
// Imprima o conjunto de interseção no formato:

// Intersection: [elements]

// Verifique se a interseção está vazia. Se estiver, imprima:

// No common elements.

// Verifique se a interseção é igual a set1 ou set2 (significando que um conjunto está inteiramente dentro do outro):
// Se a interseção for igual a set1, imprima:

// Set 1 is fully contained in Set 2

// Se a interseção for igual a set2, imprima:

// Set 2 is fully contained in Set 1

// Se nenhum estiver totalmente contido no outro, imprima:

// Partial intersection

import java.util.HashSet;
import java.util.Scanner;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;

public class math__intersection_of_hashset_mastery {
    public static void intersectionWithSubsetCheck(HashSet<Integer> set1, HashSet<Integer> set2) {
        // Escreva seu código aqui
        HashSet<Integer> intersectionSet = new HashSet<>(set1);
        intersectionSet.retainAll(set2);

        System.out.println("Intersection: " + intersectionSet);

        if (intersectionSet.isEmpty()) {
            System.out.println("No common elements.");
        } else if (intersectionSet.equals(set1)) {
            System.out.println("Set 1 is fully contained in Set 2");
        } else if (intersectionSet.equals(set2)) {
            System.out.println("Set 2 is fully contained in Set 1");
        } else {
            System.out.println("Partial intersection");
        }
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
        
        intersectionWithSubsetCheck(set1, set2);
    }
}
