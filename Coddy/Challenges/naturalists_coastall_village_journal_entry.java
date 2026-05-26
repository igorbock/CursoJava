// Crie uma função chamada createJournalEntry que recebe int marineSpecies, int birdSpecies e int currentDay 
// como seus parâmetros.

// A função deve gerar uma entrada de diário de campo para um naturalista explorando uma vila costeira. 
// Ela formatará as informações em uma entrada de diário concisa, usando formatação de string e operadores 
// básicos de incremento/decremento.

// A entrada do diário deve incluir as seguintes informações:

// O próximo dia da expedição (current day + 1)
// O número total de espécies observadas (soma das espécies marinhas e de aves)
// Um detalhamento das espécies marinhas e de aves
// Uma mensagem de status baseada no número total de espécies observadas:
// Se o total de espécies for menor que 5: "Quiet day"
// Se o total de espécies estiver entre 5 e 10: "Productive day"
// Se o total de espécies for maior que 10: "Extraordinary day"
// Parâmetros:

// marineSpecies (int): O número de espécies marinhas observadas naquele dia
// birdSpecies (int): O número de espécies de aves avistadas naquele dia
// currentDay (int): O dia atual da expedição
// A função retorna uma string formatada representando a entrada do diário.

// Exemplo do formato esperado:

// Day 4: 
// Total species observed: 8
// Marine species: 3
// Bird species: 5
// Status: Productive day
// Use a formatação de string para criar a entrada do diário e operadores de incremento/decremento para ajustar a 
// contagem de dias e calcular os totais. Sua solução deve ter entre 10 e 19 linhas de código.

public class naturalists_coastall_village_journal_entry {
    public static String createJournalEntry(int marineSpecies, int birdSpecies, int currentDay) {
        // Write code here
        int day = ++currentDay;
        int totalSpecies = marineSpecies + birdSpecies;
        String status;
        if (totalSpecies < 5) {
            status = "Quiet day";
        } else if (totalSpecies >= 5 && totalSpecies <= 10) {
            status = "Productive day";
        } else {
            status = "Extraordinary day";
        }
        String string_return = "Day " + day + ": \nTotal species observed: " + totalSpecies + "\nMarine species: " + marineSpecies + "\nBird species: " + birdSpecies + "\nStatus: " + status;
        return string_return;
    }
}