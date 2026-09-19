// Crie um método chamado processDateTime que aceite quatro argumentos:

// Uma String (dateTimeStr) no formato "yyyy-MM-dd HH:mm"
// Um inteiro (amount) para adicionar ou subtrair
// Uma String (unit) que seja "hours", "days" ou "months"
// Uma String (operation) que seja "add" ou "subtract"
// O método deve:

// Analisar a string de data e hora de entrada
// Realizar a operação especificada
// Retornar informações formatadas sobre o resultado
// As mensagens retornadas devem ser:

// Se o formato for inválido: retorne "Invalid date time format"
// Se a unidade for inválida: retorne "Invalid unit"
// Se a operação for inválida: retorne "Invalid operation"
// Em caso de sucesso: retorne "Original: [datetime], New: [new_datetime], Day: [day_name]"

import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class localdatetime_usage {
    public static String processDateTime(String dateTimeStr, int amount, String unit, String operation) {
        // Escreva seu código aqui
        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
            LocalDateTime dateTime = LocalDateTime.parse(dateTimeStr, formatter);
            LocalDateTime newDateTime;
            
            if (!unit.equals("hours") && !unit.equals("days") && !unit.equals("months")) {
                return "Invalid unit";
            }
            
            switch (operation.toLowerCase()) {
                case "add":
                    newDateTime = switch(unit) {
                        case "hours" -> dateTime.plusHours(amount);
                        case "days" -> dateTime.plusDays(amount);
                        case "months" -> dateTime.plusMonths(amount);
                        default -> dateTime;
                    };
                    break;
                case "subtract":
                    newDateTime = switch(unit) {
                        case "hours" -> dateTime.minusHours(amount);
                        case "days" -> dateTime.minusDays(amount);
                        case "months" -> dateTime.minusMonths(amount);
                        default -> dateTime;
                    };
                    break;
                default:
                    return "Invalid operation";
            }
            
            return String.format("Original: %s, New: %s, Day: %s", 
                dateTime.format(formatter),
                newDateTime.format(formatter),
                newDateTime.getDayOfWeek());
                
        } catch (DateTimeParseException e) {
            return "Invalid date time format";
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String dateTimeStr = scanner.nextLine();
        int amount = Integer.parseInt(scanner.nextLine());
        String unit = scanner.nextLine();
        String operation = scanner.nextLine();
        
        System.out.println(processDateTime(dateTimeStr, amount, unit, operation));
    }
}
