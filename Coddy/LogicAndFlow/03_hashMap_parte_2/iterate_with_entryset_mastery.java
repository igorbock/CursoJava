// Neste desafio, você aplicará seu conhecimento de iteração com entrySet() para encontrar e exibir o produto com a maior quantidade.

// Crie um método chamado printMostStockedProduct que recebe um HashMap<String, Integer> (onde as chaves são nomes de produtos e os valores são quantidades) como entrada e realiza as seguintes operações:

// Iterar sobre o inventário usando entrySet() para encontrar o produto com a maior quantidade.
// Imprimir o produto com a maior quantidade no formato:

// Most Stocked Product: <product name>, Quantity: <quantity>

// Se o inventário estiver vazio, imprimir:

// No products in inventory.

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;

public class iterate_with_entryset_mastery {
    public static void printMostStockedProduct(HashMap<String, Integer> inventory) {
        // Escreva seu código aqui usando entrySet()
        if (inventory.isEmpty()) {
            System.out.println("No products in inventory.");
        } else {
            int quantity = 0;
            String name = "";
            for (Map.Entry<String, Integer> entry : inventory.entrySet()) {
                if (entry.getValue() > quantity) {
                    quantity = entry.getValue();
                    name = entry.getKey();
                }
            }
            System.out.println("Most Stocked Product: " + name + ", Quantity: " + quantity);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Leia a string JSON de entrada representando o HashMap de inventário
        String inventoryString = scanner.nextLine();

        // Converte a string JSON para HashMap<String, Integer>
        Type mapType = new TypeToken<HashMap<String, Integer>>(){}.getType();
        HashMap<String, Integer> inventory = new Gson().fromJson(inventoryString, mapType);

        printMostStockedProduct(inventory);
    }
}
