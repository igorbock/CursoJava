// Crie uma função chamada createFieldNotes que recebe animals e observations como seus parâmetros.

// Como um naturalista curioso explorando a margem de um rio, você tem registrado observações sobre a vida selvagem local. Sua tarefa é criar uma entrada de anotação de campo formatada a partir de seus dados brutos.

// A função deve combinar os nomes dos animais com suas observações correspondentes, numerar cada entrada e adicionar um cabeçalho e um rodapé simples às anotações. Se nenhuma observação foi feita (ou seja, os arrays estão vazios), a função deve retornar uma mensagem indicando isso.

// Parâmetros:

// animals (String[]): Um array contendo nomes de animais de rio.
// observations (String[]): Um array contendo breves observações sobre cada animal.
// A função retorna uma String representando as anotações de campo formatadas.

// As anotações de campo devem ser formatadas da seguinte forma:

// Comece com o cabeçalho: "Riverbank Wildlife Observations:"
// Para cada par de animal e observação, crie uma entrada numerada: "[number]. [animal]: [observation]"
// Termine com o rodapé: "End of observations."
// Se os arrays estiverem vazios, retorne "No observations made today."
// Nota: Garanta a capitalização e pontuação corretas em sua saída.

public class naturalists_field_notes_formatter_java {
    public static String createFieldNotes(String[] animals, String[] observations) {
        // Escreva o código aqui
        String message = "Riverbank Wildlife Observations:\n";
        for (int i = 0; i < animals.length; i++) {
            message += i+1 + ". " + animals[i] + ": " + observations[i] + "\n";
        }
        message += "End of observations.";
        return message;
    }
}
