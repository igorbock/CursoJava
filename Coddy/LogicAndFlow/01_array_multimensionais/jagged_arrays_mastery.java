// Crie um rastreador de notas de alunos que usa arrays irregulares para armazenar notas de diferentes disciplinas, onde cada aluno pode cursar um número diferente de disciplinas. Crie um método que constrói e processa tal sistema de notas.

// Crie um método processGrades que recebe dois parâmetros:
// numStudents - número de alunos
// subjectsPerStudent - array contendo quantas disciplinas cada aluno cursa
// Retorna um array irregular onde:
// Cada linha representa um aluno
// O comprimento de cada linha corresponde ao número de disciplinas que aquele aluno cursa
// Preencha cada elemento com uma nota calculada usando esta fórmula: (studentIndex + 1) × 10 + (subjectIndex + 1)

// Explicação da fórmula:

// studentIndex: o índice da linha do array (0, 1, 2, ...)
// subjectIndex: o índice da coluna dentro daquela linha (0, 1, 2, ...)

// Exemplo:

// Aluno 0, Disciplina 0: (0 + 1) × 10 + (0 + 1) = 11
// Aluno 0, Disciplina 1: (0 + 1) × 10 + (1 + 1) = 12
// Aluno 1, Disciplina 0: (1 + 1) × 10 + (0 + 1) = 21

public class jagged_arrays_mastery {
    public static int[][] processGrades(int numStudents, int[] subjectsPerStudent) {
        // Verificar se a entrada é válida
        // Criar array irregular baseado no número de alunos
        // Para cada aluno:
        //   - Criar linha com comprimento correspondente à contagem de disciplinas deles
        //   - Preencher com notas usando a fórmula: (studentNum + 1) * 10 + subjectNum
        if (numStudents == 0 || subjectsPerStudent.length == 0) {
            return new int[0][];
        }
        
        int[][] grades = new int[numStudents][];
        
        for (int i = 0; i < numStudents; i++) {
            grades[i] = new int[subjectsPerStudent[i]];
            for (int j = 0; j < subjectsPerStudent[i]; j++) {
                grades[i][j] = (i + 1) * 10 + (j + 1);
            }
        }
        
        return grades;
    }
}
