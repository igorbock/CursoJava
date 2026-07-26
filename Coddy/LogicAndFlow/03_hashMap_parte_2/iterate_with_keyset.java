// Crie um método chamado printInventoryKeySet que aceita um HashMap (onde as chaves são nomes de produtos e os valores são quantidades) de uma string JSON lida via Scanner.
// Seu método deve iterar sobre o HashMap usando o método keySet() e imprimir cada par chave-valor no formato:

// Product: <product name>, Quantity: <quantity>

import java.util.HashMap;
import java.util.Scanner;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;

public class iterate_with_keyset {
    public static void printInventoryKeySet(HashMap<String, Integer> inventory) {
        // Escreva seu código aqui usando keySet()
        for (String product : inventory.keySet()) {
            int quantity = inventory.get(product);
            System.out.println("Product: " + product + ", Quantity: " + quantity);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Leia a string JSON de entrada representando o HashMap do inventário
        String inventoryString = scanner.nextLine();

        // Converta a string JSON para HashMap<String, Integer>
        Type mapType = new TypeToken<HashMap<String, Integer>>(){}.getType();
        HashMap<String, Integer> inventory = new Gson().fromJson(inventoryString, mapType);

        printInventoryKeySet(inventory);
    }
}
