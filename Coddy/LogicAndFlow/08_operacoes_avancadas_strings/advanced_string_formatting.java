// Crie um método chamado formatData que aceite quatro argumentos:

// Uma String (name) para o nome de um produto
// Um double (price) para o preço do produto
// Um inteiro (quantity) para a quantidade
// Uma String (format) para o tipo de formato da saída
// O método deve formatar os dados com base nestes tipos:

// "basic": retornar "ITEM: {name}, PRICE: ${price}"
// "detailed": retornar "PRODUCT: {name}\nPRICE: ${price}\nQUANTITY: {quantity}"
// "total": retornar "TOTAL FOR {quantity}x {name}: ${total}" (total = price * quantity). Todos os preços devem ser formatados com exatamente 2 casas decimais.
// Mensagem de retorno:

// Se alguma entrada for nula ou o formato for inválido: retornar "Invalid input"

import java.util.Scanner;

public class advanced_string_formatting {
    public static String formatData(String name, double price, int quantity, String format) {
        // Escreva seu código aqui
        if (name == null || price < 0 || quantity < 0 || format == null) {
            return "Invalid input";
        }
        if (format.equals("basic")) {
            return String.format("ITEM: %s, PRICE: $%.2f", name, price);
        } else if (format.equals("detailed")) {
            return String.format("PRODUCT: %s\nPRICE: $%.2f\nQUANTITY: %d", name, price, quantity);
        } else if (format.equals("total")) {
            double total = price * quantity;
            return String.format("TOTAL FOR %dx %s: $%.2f", quantity, name, total);
        } else {
            return "Invalid input";
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        double price = Double.parseDouble(scanner.nextLine());
        int quantity = Integer.parseInt(scanner.nextLine());
        String format = scanner.nextLine();
        
        if (name.equals("null")) name = null;
        if (format.equals("null")) format = null;
        
        System.out.println(formatData(name, price, quantity, format));
    }
}
