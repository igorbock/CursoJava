// Neste desafio, você aplicará seu conhecimento de iteração com keySet() para filtrar e exibir itens específicos do inventário.
// Crie um método chamado printFilteredInventoryKeySet que recebe um HashMap<String, Integer> (onde as chaves são nomes de produtos e os valores são quantidades) como entrada e realiza as seguintes operações:
// Itere sobre o inventário usando keySet() e imprima apenas produtos com uma quantidade maior que 20 no formato:
// Product: <product name>, Quantity: <quantity>
// Se nenhum produto atender à condição, imprima:
// No products with quantity greater than 20.

import java.util.HashMap;
import java.util.Scanner;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;

public class iterate_with_keyset_mastery {
    public static void printFilteredInventoryKeySet(HashMap<String, Integer> inventory) {
        // Escreva seu código aqui usando keySet()
        HashMap<String, Integer> clone = new HashMap<>();
        for (String product : inventory.keySet()) {
            int quantity = inventory.get(product);
            if (quantity > 20) {
                clone.put(product, quantity);
            }
        }
        if (clone.isEmpty()) {
            System.out.println("No products with quantity greater than 20.");
        } else {
            for (String product : clone.keySet()) {
                int quantity = clone.get(product);
                System.out.println("Product: " + product + ", Quantity: " + quantity);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Lê a string JSON de entrada representando o HashMap do inventário
        String inventoryString = scanner.nextLine();

        // Converte a string JSON para HashMap<String, Integer>
        Type mapType = new TypeToken<HashMap<String, Integer>>(){}.getType();
        HashMap<String, Integer> inventory = new Gson().fromJson(inventoryString, mapType);

        printFilteredInventoryKeySet(inventory);
    }
}
