// Crie um método chamado getCapital que recebe dois argumentos:

// Um HashMap chamado capitals onde as chaves são nomes de países (strings) e os valores são nomes de cidades capitais (strings).
// Uma string country representando o nome de um país.
// O método deve retornar a cidade capital do país dado acessando o capitals HashMap. Se o país não for encontrado no HashMap, retorne "Not found".

// --- Módulos para converter string de hashmap em hashmap ---
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
// -----------------------------
import java.util.HashMap;
import java.util.Scanner;

public class accessing_values {
    public static String getCapital(HashMap<String, String> capitals, String country) {
        // Escreva seu código abaixo
        String result = capitals.get(country);
        if (result == null || result.isEmpty()) {
            return "Not found";
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String hashMapString = scanner.nextLine();
        String country = scanner.nextLine();

        // Converter String de HashMap em HashMap
        Type mapType = new TypeToken<HashMap<String, String>>(){}.getType();
        HashMap<String, String> countryCapitals = new Gson().fromJson(hashMapString, mapType);

        String result = getCapital(countryCapitals, country);
        System.out.println(result);
    }
}
