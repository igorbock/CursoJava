// Você está criando um simulador simples de conta de poupança. O programa deve simular quantos anos leva para 
// atingir uma meta de poupança com juros compostos.

// Regras:

// Comece com um saldo inicial de $1000
// Cada ano:
// Adicione $500 ao saldo
// Adicione 5% de juros ao saldo total
// Continue até que o saldo atinja ou exceda $5000
// Imprima o saldo de cada ano da seguinte forma:

// Year 1: $1575.00
// Year 2: $2178.75
// Year 3: $2812.69
// ...
// No final, imprima quantos anos levou

public class while_loop_mastery {
    public static void main(String[] args) {
        // Initialize variables
        double balance = 1000.00;
        double yearlyDeposit = 500.00;
        double interestRate = 0.05;
        double targetAmount = 5000.00;
        int years = 0;
        
        // Write your while loop here
        while (balance <= targetAmount) {
            balance += yearlyDeposit;
            var value = balance * interestRate;
            years += 1;
            balance += value;
            System.out.printf("Year %d: $%.2f", years, balance);
        }

        
        // Don't modify the code below
        System.out.println("------------------------");
        System.out.println("Goal reached in " + years + " years!");
        System.out.printf("Final balance: $%.2f", balance);
    }
}
