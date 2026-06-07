// Você está criando um gerador de recibo de loja. Use printf para exibir preços com exatamente 2 casas decimais.

// Crie um recibo com os seguintes itens:

// Uma camiseta por $19.99
// Uma calça jeans por $45.50
// Um chapéu por $12.00
// Requisitos:

// Use printf para exibir todos os preços com exatamente 2 casas decimais
// Calcule e exiba o subtotal, o imposto (8%) e o total final
// Use %.2f para todos os valores em dólares
// Exemplo de Saída:

// STORE RECEIPT
// -------------
// T-shirt: $19.99
// Jeans: $45.50
// Hat: $12.00
// -------------
// Subtotal: $77.49
// Tax (8%): $6.20
// Total: $83.69

public class formatting_output_mastery {
    public static void main(String[] args) {
        // Item information
        String item1 = "T-shirt";
        String item2 = "Jeans";
        String item3 = "Hat";
        double price1 = 19.99;
        double price2 = 45.50;
        double price3 = 12.00;
        
        // Calculate totals
        double subtotal = price1 + price2 + price3;
        double tax = subtotal * 0.08;
        double total = subtotal + tax;
        
        // Create receipt
        System.out.println("STORE RECEIPT");
        System.out.println("-------------");
        System.out.printf("%s: $%.2f", item1, price1);
        System.out.println();
        System.out.printf("%s: $%.2f", item2, price2);
        System.out.println();
        System.out.printf("%s: $%.2f", item3, price3);
        System.out.println();
        System.out.println("-------------");
        System.out.printf("Subtotal: $%.2f", subtotal);
        System.out.println();
        System.out.printf("Tax (8%%): $%.2f", tax);
        System.out.println();
        System.out.printf("Total: $%.2f", total);
    }
}
