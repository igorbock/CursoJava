// Você está imprimindo uma lista de compras com números de itens, mas quer pular certos números "azarados" (4, 13 e 17). Crie um programa que:

// Imprime itens de 1 a 20 neste formato exato:

// Item #1: Get this item!
// Item #2: Get this item!
// Item #3: Get this item!
// Quando chegar aos números 4, 13 ou 17:
// Imprima: Skipping unlucky number: [number]
// Use continue para pular a impressão da mensagem regular do item
// Continue para o próximo número
// Exemplo de saída para os números 3-5:

// Item #3: Get this item!
// Skipping unlucky number: 4
// Item #5: Get this item!

public class continue_mastery {
    public static void main(String[] args) {
        // Write your loop here
        for (int i = 1; i <= 20; i++) {
            if (i == 4 || i == 13 || i == 17) {
                System.out.printf("Skipping unlucky number: %d\n", i);
                continue;
            }
            System.out.printf("Item #%d: Get this item!\n", i);
        }
    }
}
