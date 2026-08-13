// Crie um método chamado checkSubsetSuperset que recebe dois HashSets de strings como entrada:

// setA e setB
// O método deve:

// Verifique se setA é um subconjunto de setB usando containsAll(), e imprima:

// setA is a subset of setB: <true/false>
// Verifique se setB é um superconjunto de setA (esta é a mesma verificação), e imprima:

// setB is a superset of setA: <true/false>

import java.util.HashSet;
import java.util.Scanner;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;

public class subsets_and_supersets {
    public static void checkSubsetSuperset(HashSet<String> setA, HashSet<String> setB) {
        // Escreva seu código aqui
        boolean isASubsetB = setB.containsAll(setA);
        System.out.println("setA is a subset of setB: " + isASubsetB);
        System.out.println("setB is a superset of setA: " + isASubsetB);
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Leia a string JSON para setA (ex.: ["apple","banana"])
        String setAString = scanner.nextLine();
        // Leia a string JSON para setB (ex.: ["apple","banana","cherry"])
        String setBString = scanner.nextLine();
        
        Type setType = new TypeToken<HashSet<String>>(){}.getType();
        HashSet<String> setA = new Gson().fromJson(setAString, setType);
        HashSet<String> setB = new Gson().fromJson(setBString, setType);
        
        checkSubsetSuperset(setA, setB);
    }
}
