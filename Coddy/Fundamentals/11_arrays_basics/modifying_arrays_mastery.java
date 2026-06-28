// Crie um programa que gerencia as notas de um estudante. Crie três métodos que modificam arrays de maneiras diferentes:

// Crie o método improveGrade que:
// Recebe um array de inteiros e um índice
// Aumenta a nota naquele índice em 5 pontos
// Se a nova nota for superior a 100, defina-a como 100
// Exemplo: improveGrade([70, 85, 90], 0) altera o array para [75, 85, 90]
// Crie o método replaceFailingGrade que:
// Recebe um array de inteiros
// Substitui qualquer nota abaixo de 60 por 60
// Exemplo: replaceFailingGrade([55, 80, 45]) altera o array para [60, 80, 60]
// Crie o método addBonusPoints que:
// Recebe um array de inteiros
// Adiciona 2 pontos a todas as notas
// Exemplo: addBonusPoints([88, 92, 95]) altera o array para [90, 94, 97]
// Imprima o array após cada modificação neste formato:

// After improving grade: [75, 85, 90]
// After replacing failing: [60, 85, 60]
// After adding bonus: [62, 87, 62]

public class modifying_arrays_mastery {
    // Write your methods here
    public static void improveGrade(int[] arr, int index) {
        arr[index] += 5;
        if (arr[index] > 100) {
            arr[index] = 100;
        }
    }

    public static void replaceFailingGrade(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 60) {
                arr[i] = 60;
            }
        }
    }

    public static void addBonusPoints(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] += 2;
        }
    }
    
    public static void main(String[] args) {
        // Test your methods with these values
        int[] grades = {70, 85, 55};
        
        improveGrade(grades, 0);
        System.out.print("After improving grade: [");
        for (int i = 0; i < grades.length; i++) {
            System.out.print(grades[i]);
            if (i < grades.length - 1) System.out.print(", ");
        }
        System.out.println("]");
        
        replaceFailingGrade(grades);
        System.out.print("After replacing failing: [");
        for (int i = 0; i < grades.length; i++) {
            System.out.print(grades[i]);
            if (i < grades.length - 1) System.out.print(", ");
        }
        System.out.println("]");
        
        addBonusPoints(grades);
        System.out.print("After adding bonus: [");
        for (int i = 0; i < grades.length; i++) {
            System.out.print(grades[i]);
            if (i < grades.length - 1) System.out.print(", ");
        }
        System.out.println("]");
    }
}