// Neste desafio, você aplicará seu conhecimento de métodos HashMap para modificar e resetar um HashMap.

// Crie um método chamado modifyAndResetHashMap que recebe um HashMap<String, Integer> chamado data como entrada e realiza as seguintes operações:

// Verifique se o HashMap está vazio e imprima:

// Is empty: true  

// ou

// Is empty: false  

// Imprima o tamanho do HashMap:

// Size: X  

// (onde X é o número de pares chave-valor em data)

// Adicione um novo par chave-valor ("Reset", 0) ao HashMap.
// Se a chave "Reset" já existir, não a modifique.
// Imprima o tamanho atualizado do HashMap:

// Size after modification: Y  

// (onde Y é o novo tamanho)

// Limpe o HashMap e verifique se está vazio novamente. Imprima:

// Is empty after clear: true  

// --- Módulos para converter string de hashmap para hashmap ---
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
// -----------------------------
import java.util.HashMap;
import java.util.Scanner;

public class hashmap_methods_mastery {
    public static void modifyAndResetHashMap(HashMap<String, Integer> data) {
        // Escreva seu código aqui
        System.out.printf("Is empty: %s\n", data.isEmpty());
        System.out.printf("Size: %d\n", data.size());
        if (data.containsKey("Reset") == false) {
            data.put("Reset", 0);
        }
        System.out.printf("Size after modification: %d\n", data.size());
        data.clear();
        System.out.printf("Is empty after clear: %s\n", data.isEmpty());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String hashMapString = scanner.nextLine();

        // Converter String de HashMap para HashMap
        Type mapType = new TypeToken<HashMap<String, Integer>>(){}.getType();
        HashMap<String, Integer> data = new Gson().fromJson(hashMapString, mapType);

        modifyAndResetHashMap(data);
    }
}
