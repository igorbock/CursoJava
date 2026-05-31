// Você está criando um calculador simples de pontuação de jogo. 
// Defina os valores iniciais para score e bonus para que o jogador alcance o status "High Score".

// As regras de pontuação são:

// score inicial deve estar entre 80 e 100 (inclusivos)
// bonus inicial deve estar entre 10 e 20 (inclusivos)
// O jogador alcança o status "High Score" se:
// pontuação acima de 90 E bônus acima de 15, OU
// pontuação acima de 85 E bônus acima de 18
// Encontre pelo menos duas combinações diferentes de valores de score e bonus que resultarão no status "High Score"!

public class if_statement_mastery {
    public static void main(String[] args) {
        // Initialize your values here
        int score = 92;
        int bonus = 19;
        
        // Don't modify the code below
        String status = "Regular Score";
        
        if (score >= 80 && score <= 100 && bonus >= 10 && bonus <= 20) {
            if ((score > 90 && bonus > 15) || (score > 85 && bonus > 18)) {
                status = "High Score";
            }
        } else {
            status = "Invalid Values";
        }
        
        System.out.println("Status: " + status);
    }
}
