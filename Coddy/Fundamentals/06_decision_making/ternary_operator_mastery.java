// Você está criando um sistema simples de notas para alunos. O sistema deve determinar tanto uma nota em letra quanto uma mensagem de status usando operadores ternários.

// Dada a pontuação de um aluno:

// Determine a nota em letra usando estas faixas:
// 90-100: "A"
// 80-89: "B"
// 70-79: "C"
// 60-69: "D"
// Abaixo de 60: "F"
// Determine a mensagem de status:
// nota "A": "Excellent!"
// nota "B" ou "C": "Good job!"
// nota "D": "You need to study more"
// nota "F": "Please see the teacher"
// Use apenas operadores ternários (sem declarações if-else)!

// Importante: Em Java, Strings devem ser comparadas usando .equals(), não ==. Por exemplo, para verificar se grade é igual a "A", escreva grade.equals("A") em vez de grade == "A". Use esta abordagem ao construir sua expressão ternária message.

public class ternary_operator_mastery {
    public static void main(String[] args) {
        // Don't modify these lines
        int score = 85;  // This will be different in each test
        String grade = "";
        String message = "";
        
        // Write your ternary operators here
        grade = (score >= 90) ? "A" : (score >= 80) ? "B" : (score >= 70) ? "C" : (score >= 60) ? "D" : "F";
        message = grade.equals("A") ? "Excellent!" : (grade.equals("B") || grade.equals("C")) ? "Good job!" : (grade.equals("D")) ? "You need to study more" : "Please see the teacher";

        // Don't modify the code below
        System.out.println("Student Score: " + score);
        System.out.println("Grade: " + grade);
        System.out.println("Message: " + message);
    }
}
