// Crie um método chamado getDayType que recebe dois argumentos:

// Um inteiro (day) representando um dia da semana (1-7)
// Um booleano (abbreviated) que determina o formato de retorno
// O método deve usar uma expressão switch para retornar o tipo de dia:

// Para dias 1-5 (Segunda a Sexta-feira): retorne "WORKDAY" se não abreviado, ou "WKD" se abreviado
// Para dias 6-7 (Sábado e Domingo): retorne "WEEKEND" se não abreviado, ou "WKND" se abreviado
// Para qualquer outro número: retorne "INVALID" se não abreviado, ou "INV" se abreviado

import java.util.Scanner;

public class switch_expression {
    public static String getDayType(int day, boolean abbreviated) {
        // Escreva seu código aqui
        String dayType = switch(day) {
            case 1, 2, 3, 4, 5 -> !abbreviated ? "WORKDAY" : "WKD";
            case 6, 7 -> !abbreviated ? "WEEKEND" : "WKND";
            default -> !abbreviated ? "INVALID" : "INV";
        };
        return dayType;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int day = Integer.parseInt(scanner.nextLine());
        boolean abbreviated = Boolean.parseBoolean(scanner.nextLine());
        
        System.out.println(getDayType(day, abbreviated));
    }
}
