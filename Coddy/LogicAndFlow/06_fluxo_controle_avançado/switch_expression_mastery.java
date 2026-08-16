import java.util.Scanner;

public class switch_expression_mastery {
    public static String getMealType(int hour, boolean abbreviated) {
        // Escreva seu código aqui
        String mealType = switch(hour) {
            case 5, 6, 7, 8, 9, 10 -> !abbreviated ? "BREAKFAST" : "BKT";
            case 11, 12, 13, 14, 15 -> !abbreviated ? "LUNCH" : "LCH";
            case 16, 17, 18, 19, 20, 21 -> !abbreviated ? "DINNER" : "DNR";
            default -> !abbreviated ? "SNACK" : "SNK";
        };
        return mealType;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hour = Integer.parseInt(scanner.nextLine());
        boolean abbreviated = Boolean.parseBoolean(scanner.nextLine());
        
        System.out.println(getMealType(hour, abbreviated));
    }
}
