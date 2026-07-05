// Crie um programa que processa informações de cursos. Crie três métodos que lidam com diferentes aspectos do processamento de strings:

// Crie o método formatCourseInfo que:

// Recebe uma string de curso como "MATH101:Algebra:Monday,Wednesday:9AM"
// Divide por ":" e retorna string formatada:
// Course Code: MATH101
// Course Name: Algebra
// Days: Monday,Wednesday
// Time: 9AM
// Crie o método createCourseList que:

// Recebe um array de códigos de cursos: ["MATH101", "ENG202", "HIST101"]
// Cria uma lista separada por vírgulas e retorna:
// Available Courses: MATH101, ENG202, HIST101
// Crie o método formatSchedule que:
// Recebe string de dias: "Monday,Wednesday,Friday"
// Divide por vírgula e junta com " | "
// Retorna: "Monday | Wednesday | Friday"

public class string_methods_part_2_mastery {
    // Write your methods here
    public static String formatCourseInfo(String courseInfo) {
        String[] parts = courseInfo.split(":");
        return "Course Code: " + parts[0] + "\n" +
               "Course Name: " + parts[1] + "\n" +
               "Days: " + parts[2] + "\n" +
               "Time: " + parts[3];
    }
    
    public static String createCourseList(String[] courseCodes) {
        return "Available Courses: " + String.join(", ", courseCodes);
    }

    public static String formatSchedule(String days) {
        String[] dayArray = days.split(",");
        return String.join(" | ", dayArray);
    }

    public static void main(String[] args) {
        // Test data
        String courseInfo = "MATH101:Algebra:Monday,Wednesday:9AM";
        String[] courseCodes = {"MATH101", "ENG202", "HIST101"};
        String days = "Monday,Wednesday,Friday";
        
        // Test your methods
        System.out.println("Course Information:");
        System.out.println(formatCourseInfo(courseInfo));
        
        System.out.println("\nCourse List:");
        System.out.println(createCourseList(courseCodes));
        
        System.out.println("\nSchedule Format:");
        System.out.println(formatSchedule(days));
    }
}
