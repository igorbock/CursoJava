// Crie um método chamado processTime que receba quatro argumentos:

// Uma String (timeStr) no formato "HH:mm"
// Um inteiro (amount) a ser adicionado ou subtraído
// Uma String (unit) que seja "hours" ou "minutes"
// Uma String (operation) que seja "add" ou "subtract"
// O método deve:

// Analisar a string de hora de entrada
// Executar a operação especificada
// Retornar informações formatadas sobre o resultado
// As mensagens retornadas devem ser:

// Se o formato da hora for inválido: retornar "Invalid time format"
// Se a unidade for inválida: retornar "Invalid unit"
// Se a operação for inválida: retornar "Invalid operation"
// Em caso de sucesso: retornar "Original: [time], New: [new_time]"

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class localtime_operations {
    public static String processTime(String timeStr, int amount, String unit, String operation) {
        // Escreva seu código aqui
        if (!timeStr.matches("\\d{2}:\\d{2}")) {
            return "Invalid time format";
        }
        String[] parts = timeStr.split(":");
        int hour = Integer.parseInt(parts[0]);
        int minute = Integer.parseInt(parts[1]);
        try {
            LocalTime.of(hour, minute);
        } catch (Exception e) {
            return "Invalid time format";
        }
        if (!unit.equals("hours") && !unit.equals("minutes")) {
            return "Invalid unit";
        }
        if (!operation.equals("add") && !operation.equals("subtract")) {
            return "Invalid operation";
        }
        try {
            LocalTime newTime = LocalTime.parse(timeStr, DateTimeFormatter.ofPattern("HH:mm"));
            if (unit.equals("hours")) {
                if (operation.equals("add")) {
                    newTime = newTime.plusHours(amount);
                } else {
                    newTime = newTime.minusHours(amount);
                }
            } else {
                if (operation.equals("add")) {
                    newTime = newTime.plusMinutes(amount);
                } else {
                    newTime = newTime.minusMinutes(amount);
                }
            }
            return String.format("Original: %s, New: %s", timeStr, newTime.format(DateTimeFormatter.ofPattern("HH:mm")));
        } catch (DateTimeParseException e) {
            return "Invalid time format";
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String timeStr = scanner.nextLine();
        int amount = Integer.parseInt(scanner.nextLine());
        String unit = scanner.nextLine();
        String operation = scanner.nextLine();
        
        System.out.println(processTime(timeStr, amount, unit, operation));
    }
}
