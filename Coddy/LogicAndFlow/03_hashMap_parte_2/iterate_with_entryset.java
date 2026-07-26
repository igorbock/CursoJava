// Crie um método chamado printInventoryEntrySet que aceita um HashMap (com nomes de produtos como chaves e quantidades 
// como valores) a partir de uma string JSON lida via Scanner. Seu método deve iterar sobre o HashMap 
// usando o método entrySet() e imprimir cada par chave-valor no formato:

// Product: <nome do produto>, Quantity: <quantidade>

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;

public class iterate_with_entryset {
    public static void printInventoryEntrySet(HashMap<String, Integer> inventory) {
        // Escreva seu código aqui usando entrySet()
        for (Map.Entry<String, Integer> entry : inventory.entrySet()) {
            System.out.println("Product: " + entry.getKey() + ", Quantity: " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inventoryString = scanner.nextLine();

        // Converte a string JSON para HashMap<String, Integer>
        Type mapType = new TypeToken<HashMap<String, Integer>>(){}.getType();
        HashMap<String, Integer> inventory = new Gson().fromJson(inventoryString, mapType);

        printInventoryEntrySet(inventory);
    }
}
