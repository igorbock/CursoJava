// Escreva um método chamado modifyMap que modifica um HashMap fornecido com base em condições específicas.

// Recebe um HashMap chamado data onde:
// As chaves são do tipo String.
// Os valores são do tipo Integer.
// Recebe uma String key.
// Recebe um Integer newValue.
// O método deve retornar o HashMap atualizado seguindo o seguinte:

// Se a chave existir em data e tiver o mesmo valor que newValue, use replace() mas aumente o valor em 1.
// Se a chave existir mas tiver um valor diferente, remova-a.
// Se a chave não existir, adicione-a com newValue.

// --- Módulos para converter string de hashmap para hashmap ---
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
// -----------------------------
import java.util.HashMap;
import java.util.Scanner;

public class modifying_dictionaries {
    public static HashMap<String, Integer> modifyMap(HashMap<String, Integer> data, String key, int newValue) {
        // Escreva seu código aqui
        if (data.containsKey(key) && data.containsValue(newValue)) {
            data.replace(key, newValue + 1);
        } else if(data.containsKey(key) && data.containsValue(newValue) == false) {
            data.remove(key);
        } else if(data.containsKey(key) == false) {
            data.put(key, newValue);
        }

        return data;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String hashMapString = scanner.nextLine();
        String key = scanner.nextLine();
        int newValue = scanner.nextInt();

        // Converte String de HashMap para HashMap
        Type mapType = new TypeToken<HashMap<String, Integer>>(){}.getType();
        HashMap<String, Integer> data = new Gson().fromJson(hashMapString, mapType);

        HashMap<String, Integer> result = modifyMap(data, key, newValue);
        System.out.println(new Gson().toJson(result));
    }
}
