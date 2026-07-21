// Crie um método chamado updateInventory que recebe três argumentos:

// Um HashMap chamado inventory onde:
// As chaves representam nomes de produtos (String).
// Os valores representam quantidades (Integer).
// Uma string productName representando o produto a ser verificado e atualizado.
// Um inteiro quantityToAdd representando a quantidade de estoque a ser adicionada.
// Operações a Realizar
// Verifique se o produto existe no inventário usando containsKey().
// Se ele existir, aumente sua quantidade por quantityToAdd.
// Se ele não existir, adicione o produto ao inventário com quantityToAdd como sua quantidade inicial.
// Imprima o inventário atualizado no formato JSON. A instrução de impressão JSON já é fornecida para você no final do método — concentre-se em implementar a lógica containsKey() acima dela.
// Nota sobre a Saída JSON
// A linha System.out.println(new Gson().toJson(inventory)); converte o HashMap em uma string JSON e a imprime. Gson é uma biblioteca que serializa objetos Java no formato JSON. Você não precisa modificar esta linha — ela já está pré-escrita no código inicial.

import java.util.HashMap;
import java.util.Scanner;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;

public class check_if_key_exists_mastery {
    public static void updateInventory(HashMap<String, Integer> inventory, String productName, int quantityToAdd) {
        // Escreva seu código aqui:
        // Se productName já existir no inventário, adicione quantityToAdd ao seu valor atual.
        // Se productName não existir, adicione-o com quantityToAdd como seu valor.
        if (inventory.containsKey(productName)) {
            int oldValue = inventory.get(productName);
            inventory.replace(productName, oldValue + quantityToAdd);
        } else {
            inventory.put(productName, quantityToAdd);
        }

        // Imprime o inventário atualizado como JSON — não remova esta linha
        System.out.println(new Gson().toJson(inventory));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inventoryString = scanner.nextLine();
        String productName = scanner.nextLine();
        int quantityToAdd = scanner.nextInt();

        // Converte a string JSON para HashMap
        Type mapType = new TypeToken<HashMap<String, Integer>>(){}.getType();
        HashMap<String, Integer> inventory = new Gson().fromJson(inventoryString, mapType);

        updateInventory(inventory, productName, quantityToAdd);
    }
}
