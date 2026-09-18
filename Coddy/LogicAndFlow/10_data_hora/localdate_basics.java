// Crie um método chamado processDate que receba três argumentos:

// Uma String (dateStr) no formato "yyyy-MM-dd"
// Um inteiro (days) para adicionar ou subtrair
// Uma String (operation) que seja "add" ou "subtract"
// O método deve:

// Analisar a string de data de entrada
// Adicionar ou subtrair o número especificado de dias
// Retornar informações formatadas sobre o resultado
// As mensagens retornadas devem ser:

// Se o formato da data for inválido: retorne "Invalid date format"
// Se a operação for inválida: retorne "Invalid operation"
// Em caso de sucesso: retorne "Original: [date], New: [new_date], Day of week: [day_name]"

import java.time.LocalDate;
import java.util.Scanner;

public class localdate_basics {
    public static String processDate(String dateStr, int days, String operation) {
        // Escreva seu código aqui
        if (!dateStr.matches("\\d{4}-\\d{2}-\\d{2}")) {
            return "Invalid date format";
        }
        String[] parts = dateStr.split("-");
        int year = Integer.parseInt(parts[0]);
        int month = Integer.parseInt(parts[1]);
        int day = Integer.parseInt(parts[2]);
        try {
            LocalDate.of(year, month, day);
        } catch (Exception e) {
            return "Invalid date format";
        }
        if (!operation.equals("add") && !operation.equals("subtract")) {
            return "Invalid operation";
        }
        LocalDate newDate = LocalDate.parse(dateStr);
        if (operation.equals("add")) {
            newDate = newDate.plusDays(days);
        } else {
            newDate = newDate.minusDays(days);
        }
        String dayOfWeek = newDate.getDayOfWeek().toString();
        return String.format("Original: %s, New: %s, Day of week: %s", dateStr, newDate.toString(), dayOfWeek);
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String dateStr = scanner.nextLine();
        int days = Integer.parseInt(scanner.nextLine());
        String operation = scanner.nextLine();
        
        System.out.println(processDate(dateStr, days, operation));
    }
}
