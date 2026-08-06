// Neste desafio, você aplicará seu conhecimento de isEmpty() e size() para comparar dois HashSets.
// Crie um método chamado compareSets que recebe dois HashSets de Strings (set1 e set2) como entrada e realiza as seguintes operações:
// Verifique se set1 está vazio e imprima:
// Set 1 Empty: <true/false>
// Verifique se set2 está vazio e imprima:
// Set 2 Empty: <true/false>
// Imprima o tamanho de set1 no formato:
// Set 1 Size: <number>
// Imprima o tamanho de set2 no formato:
// Set 2 Size: <number>
// Compare os tamanhos de ambos os conjuntos. Se forem iguais, imprima:
// Same Size: true
// Caso contrário, imprima:
// Same Size: false

import java.util.HashSet;
import java.util.Scanner;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;

public class empty_and_size_mastery {
    public static void compareSets(HashSet<String> set1, HashSet<String> set2) {
        // Escreva seu código aqui
        System.out.println("Set 1 Empty: " + set1.isEmpty());
        System.out.println("Set 2 Empty: " + set2.isEmpty());
        System.out.println("Set 1 Size: " + set1.size());
        System.out.println("Set 2 Size: " + set2.size());
        System.out.println("Same Size: " + (set1.size() == set2.size()));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Leia a string JSON representando dois HashSets (ex.: ["Apple","Banana"])
        String set1String = scanner.nextLine();
        String set2String = scanner.nextLine();
        
        Type setType = new TypeToken<HashSet<String>>(){}.getType();
        HashSet<String> set1 = new Gson().fromJson(set1String, setType);
        HashSet<String> set2 = new Gson().fromJson(set2String, setType);
        
        compareSets(set1, set2);
    }
}
