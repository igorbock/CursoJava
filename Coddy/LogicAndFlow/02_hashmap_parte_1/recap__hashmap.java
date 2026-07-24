// Crie um método chamado processHashMap que recebe um HashMap<String, Integer> e um array de operações String, e então executa as seguintes ações:

// 1. Operação GET

// Formato: "GET key"
// Ação:
// Se a chave existir: Imprima o valor
// Se a chave não existir: Imprima "Not found"
// 2. Operação CHECK

// Formato: "CHECK key"
// Ação:
// Se a chave existir: Imprima "Exists"
// Se a chave não existir: Imprima "Not found"
// 3. Operação MODIFY

// Formato: "MODIFY key targetValue"
// Ação:
// Se a chave existir E seu valor atual for igual a targetValue: Use replace() para atualizar o valor para targetValue + 1
// Se a chave existir MAS seu valor atual for diferente de targetValue: Use remove() para deletar a chave
// Se a chave não existir: Use put() para adicioná-la com targetValue como seu valor
// Nota: NÃO imprima nada durante as operações MODIFY
// Saída Final:

// Após processar todas as operações, o método deve retornar o HashMap modificado. O método main o imprimirá no formato JSON.

// --- Módulos para converter string de hashmap para hashmap ---
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
// -----------------------------
import java.util.HashMap;
import java.util.Scanner;

public class recap__hashmap {
    public static HashMap<String, Integer> processHashMap(HashMap<String, Integer> data, String[] operations) {
        // Escreva seu código aqui
        for (int i = 0; i < operations.length; i++) {
            String command = operations[i].split(" ")[0];
            String key = operations[i].split(" ")[1];
            if (command.equals("GET")) {
                if (data.containsKey(key)) {
                    System.out.println(data.get(key));
                } else {
                    System.out.println("Not found");
                }
            } else if (command.equals("CHECK")) {
                if (data.containsKey(key)) {
                    System.out.println("Exists");
                } else {
                    System.out.println("Not found");
                }
            } else if (command.equals("MODIFY")) {
                int targetValue = Integer.parseInt(operations[i].split(" ")[2]);
                if (data.containsKey(key) && data.get(key) == targetValue) {
                    data.replace(key, targetValue + 1);
                } else if (data.containsKey(key) && data.get(key) != targetValue) {
                    data.remove(key);
                } else if (data.containsKey(key) == false) {
                    data.put(key, targetValue);
                }
            }
        }
        return data;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String hashMapString = scanner.nextLine();
        String operationsString = scanner.nextLine();

        // Convert String of HashMap to HashMap
        Type mapType = new TypeToken<HashMap<String, Integer>>(){}.getType();
        HashMap<String, Integer> data = new Gson().fromJson(hashMapString, mapType);

        // Convert String of Array to Array
        String[] operations = new Gson().fromJson(operationsString, String[].class);

        HashMap<String, Integer> result = processHashMap(data, operations);
        System.out.println(new Gson().toJson(result));
    }
}
