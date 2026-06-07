// Crie a lógica para determinar o tipo de ingresso e o preço.

// Estas variáveis já estão definidas:
// age (idade do cliente)
// time (horário da sessão no formato de 24 horas, ex.: 1430 para 14:30)
// isHoliday (booleano indicando se é feriado)
// Defina as variáveis ticketType e price com base nestas condições:
// Para crianças (idade < 13):
// "CHILD" ingresso
// Preço base $8
// Adicione $2 se for feriado
// Para adolescentes (idade 13-17):
// "TEEN" ingresso
// Preço base $12
// Adicione $3 se for feriado
// Para adultos (idade 18-59):
// "ADULT" ingresso
// Preço base $15
// Adicione $5 se for feriado
// Subtraia $3 se o horário da sessão for antes de 1700 (17h)
// Para idosos (idade 60 ou mais):
// "SENIOR" ingresso
// Preço base $10
// Sem acréscimo de feriado
// Subtraia $2 se o horário da sessão for antes de 1700 (17h)

import java.util.Scanner;

public class if_else_mastery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int age = scanner.nextInt();
        int time = scanner.nextInt();       // 24-hour format
        boolean isHoliday = scanner.nextBoolean();

        // Your code to determine ticket type and price
        String ticketType;
        int price;

        // Check age ranges: CHILD (under 13), TEEN (13-17), ADULT (18-59), SENIOR (60+)
        if (age < 13) {
            ticketType = "CHILD";
            price = 8;
            if (isHoliday) {
                price += 2; // Add $2 on holidays for CHILD
            }
        } else if (age >= 13 && age <= 17) {
            ticketType = "TEEN";
            price = 12;
            if (isHoliday) {
                price += 3; // Add $3 on holidays for TEEN
            }
        } else if (age >= 18 && age <= 59) {
            ticketType = "ADULT";
            price = 15;
            if (isHoliday) {
                price += 5; // Add $5 on holidays for ADULT
            }
            if (time < 1700) {
                price -= 3; // Subtract $3 for matinee for ADULT
            }
        } else { // age >= 60
            ticketType = "SENIOR";
            price = 10;
            if (time < 1700) {
                price -= 2; // Subtract $2 for matinee for SENIOR
            }
        }
        // For ADULT: add $5 on holidays; subtract $3 for matinee (time < 1700)
        // For TEEN: add $3 on holidays
        // For CHILD: add $2 on holidays
        // For SENIOR: subtract $2 for matinee (time < 1700)


        // Don't modify the code below
        System.out.println("Customer Age: " + age);
        System.out.println("Show Time: " + time);
        System.out.println("Holiday? " + isHoliday);
        System.out.println("-------------------");
        System.out.println("Ticket Type: " + ticketType);
        System.out.println("Final Price: $" + price);

        scanner.close();
    }
}
