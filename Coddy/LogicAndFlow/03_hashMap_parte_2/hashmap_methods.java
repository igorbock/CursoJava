// Crie um método chamado testHashMapMethods que recebe um HashMap chamado data como entrada. O método deve realizar as seguintes operações:

// Verifique se o HashMap está vazio e imprima:

// Is empty: true ou Is empty: false

// Obtenha o número de mapeamentos chave-valor e imprima:

// Size: X(onde X é o tamanho do HashMap).

// Remova todos os mapeamentos do HashMap usando clear().
// Verifique se o HashMap está vazio novamente após limpar e imprima:

// Is empty after clear: true

// --- Módulos para converter string de hashmap em hashmap ---
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
// -----------------------------
import java.util.HashMap;
import java.util.Scanner;

public class hashmap_methods {
    public static void testHashMapMethods(HashMap<String, Integer> data) {
        // Escreva seu código aqui
        System.out.printf("Is empty: %s", data.isEmpty());
        System.out.printf("Size: %d", data.size());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String hashMapString = scanner.nextLine();

        // Converter String de HashMap em HashMap
        Type mapType = new TypeToken<HashMap<String, Integer>>(){}.getType();
        HashMap<String, Integer> data = new Gson().fromJson(hashMapString, mapType);

        testHashMapMethods(data);
    }
}
