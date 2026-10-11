import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double celsiusInput = scanner.nextDouble();
        
        // TODO: Criar um objeto Temperature
        Temperature temperature = new Temperature();
        
        // TODO: Usar o setter para definir o valor celsius
        temperature.setCelsius(celsiusInput);
        
        // TODO: Imprimir se a temperatura é válida (formato: "Valid: true" ou "Valid: false")
        System.out.println("Valid: " + temperature.isValid());
        
        // TODO: Imprimir o equivalente em Fahrenheit (formato: "Fahrenheit: X.X")
        // Hint: Use String.format("%.1f", value) para uma casa decimal
        double value = temperature.getFahrenheit();
        System.out.println("Fahrenheit: " + String.format("%.1f", value));
    }
}