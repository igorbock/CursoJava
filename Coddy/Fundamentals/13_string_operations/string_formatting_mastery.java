// Você está criando um sistema de boletim escolar. O sistema precisa formatar diferentes tipos de informações do aluno usando String.format().

// Inicialize estas variáveis com os seguintes valores:
// studentName = "john smith"
// studentId = 123
// mathGrade = 92.5555
// scienceGrade = 88.7777
// englishGrade = 95.1111
// attendance = 0.8523
// Crie três strings formatadas:
// headerInfo: Formate as informações do aluno:
// O nome deve ser capitalizado (primeira letra de cada palavra)
// ID deve ser preenchido com zeros à esquerda para 5 dígitos Formato: "Student: [NAME], ID: [00123]"
// gradesInfo: Formate as notas:
// Todas as notas devem mostrar exatamente 2 casas decimais Formato: "Math: [92.56], Science: [88.78], English: [95.11]"
// attendanceInfo: Formate a frequência:
// Mostre a frequência como porcentagem com 1 casa decimal Formato: "Attendance: [85.2]%"

public class string_formatting_mastery {
    public static void main(String[] args) {
        // Initialize variables - don't modify these!
        String studentName = "john smith";
        int studentId = 123;
        double mathGrade = 92.5555;
        double scienceGrade = 88.7777;
        double englishGrade = 95.1111;
        double attendance = 0.8523;
        
        // Create your formatted strings
        String headerInfo = String.format("Student: %s, ID: %05d", capitalizeName(studentName), studentId);
        String gradesInfo = String.format("Math: %.2f, Science: %.2f, English: %.2f", mathGrade, scienceGrade, englishGrade);
        String attendanceInfo = String.format("Attendance: %.1f%%", attendance * 100);
        
        // Don't modify the code below
        System.out.println("STUDENT REPORT CARD");
        System.out.println("------------------");
        System.out.println(headerInfo);
        System.out.println(gradesInfo);
        System.out.println(attendanceInfo);
    }

    private static String capitalizeName(String studentName) {
        String[] words = studentName.split(" ");
        StringBuilder capitalized = new StringBuilder();
        for (String word : words) {
            capitalized.append(Character.toUpperCase(word.charAt(0)))
                       .append(word.substring(1))
                       .append(" ");
        }
        return capitalized.toString().trim();
    }
}
