// Crie um método chamado keyChecker que recebe dois argumentos:

// Um HashMap chamado randomValues onde as chaves são strings aleatórias e os valores são valores aleatórios.
// Um array keys representando chaves de string.
// O método deve retornar o número de chaves do array que existem no HashMap

// --- Módulos para converter string de hashmap para hashmap ---
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
// -----------------------------
import java.util.HashMap;
import java.util.Scanner;

public class check_if_key_exists {
    public static int keyChecker(HashMap<String, Integer> randomValues, String[] keys) {
        // Escreva seu código abaixo
        int count = 0;
        for (int i = 0; i < keys.length; i++) {
            if (randomValues.containsKey(keys[i])) {
                count += 1;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String hashMapString = scanner.nextLine();
        String arrayString = scanner.nextLine();

        // Converter String de HashMap para HashMap
        Type mapType = new TypeToken<HashMap<String, Integer>>(){}.getType();
        HashMap<String, Integer> randomValues = new Gson().fromJson(hashMapString, mapType);

        // Converter String de Array para Array
        String[] keys = new Gson().fromJson(arrayString, String[].class);

        int result = keyChecker(randomValues, keys);
        System.out.println(result);
    }
}
