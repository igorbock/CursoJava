// Crie uma função chamada createRanchSchedule que recebe morningTasks e eveningTasks como seus parâmetros.

// A função deve combinar as tarefas da manhã e da noite em um cronograma diário formatado para uma fazendeira em uma fazenda de gado remota.

// Siga estes passos para criar o cronograma:

// Concatene os arrays morningTasks e eveningTasks.
// Crie uma string formatada representando o cronograma diário.
// Numere cada tarefa e prefixe-a com "Morning:" ou "Evening:" com base no seu array original.
// Adicione um cabeçalho e um rodapé ao cronograma.
// Parâmetros:

// morningTasks (String[]): Um array de strings representando as tarefas da manhã.
// eveningTasks (String[]): Um array de strings representando as tarefas da noite.
// A função retorna uma String contendo o cronograma diário formatado.

public class ranchwomans_daily_schedule_formatter_java {
    public static String createRanchSchedule(String[] morningTasks, String[] eveningTasks) {
        // Escreva o código aqui
        StringBuilder schedule = new StringBuilder();
        schedule.append("=== Daily Ranch Schedule ===\n\n");
        int init = 1;

        for (int i = 0; i < morningTasks.length; i++) {
            schedule.append(init++).append(". Morning: ").append(morningTasks[i]).append("\n");
        }

        for (int i = 0; i < eveningTasks.length; i++) {
            schedule.append(init++).append(". Evening: ").append(eveningTasks[i]).append("\n");
        }

        schedule.append("\n=== End of Schedule ===");
        return schedule.toString();
    }
}
