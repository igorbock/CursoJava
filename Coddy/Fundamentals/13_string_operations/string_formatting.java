// Crie um método chamado createFormattedString que recebe os seguintes argumentos:

// Uma string productName.
// Um inteiro quantity.
// Um double unitPrice.
// O método deve retornar uma string formatada que combina esses valores no seguinte formato:

// Product: [productName], Quantity: [quantity], Unit Price: [unitPrice]
// Formate o unitPrice com cinco casas decimais, o quantity com uma casa decimal (converta-o para double).

// Por exemplo, se productName for "laptop", quantity for 3, e unitPrice for 1299.9999, o método deve retornar:

// Product: laptop, Quantity: 3.0, Unit Price: 1299.99990
// Para extrair o primeiro caractere mantendo-o no tipo String em vez de tipo char, use: str.substring(0,1)

import java.util.Scanner;

public class string_formatting {
    public static String createFormattedString(String productName, int quantity, double unitPrice) {
        // Write your code here
        String formattedString = String.format("Product: %s, Quantity: %.1f, Unit Price: %.5f", productName, (double) quantity, unitPrice);
        return formattedString;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String product = scanner.nextLine();
        int qty = scanner.nextInt();
        double price = scanner.nextDouble();
        String formattedString = createFormattedString(product, qty, price);
        System.out.println(formattedString);
    }
}
