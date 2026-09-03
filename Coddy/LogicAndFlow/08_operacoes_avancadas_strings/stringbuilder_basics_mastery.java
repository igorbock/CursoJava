// Neste desafio, você aplicará seus conhecimentos de StringBuilder para construir uma mensagem personalizada com base na entrada do usuário.

// Crie um método chamado buildMessage que receba quatro argumentos:

// Uma String (greeting): Representa a saudação inicial.
// Uma String (name): Representa o nome de uma pessoa.
// Uma String (action): Representa uma ação que está sendo realizada.
// Um boolean (excited): Determina se a mensagem deve ser entusiasmada ou não.
// O método deve:

// Verificar valores null: Se qualquer entrada for null, retorne "Invalid input".
// Usar StringBuilder para construir a mensagem no formato:

// greeting, name is action.

// Exemplo: "Hello, Alice is learning Java."
// Se excited for true, adicione um ponto de exclamação "!" ao final.

import java.util.Scanner;

public class stringbuilder_basics_mastery {
    public static String buildMessage(String greeting, String name, String action, boolean excited) {
        // Escreva seu código aqui usando StringBuilder
        if (greeting == null || name == null || action == null) {
            return "Invalid input";
        }

        StringBuilder sb = new StringBuilder();
        if (greeting != null) {
            sb.append(greeting);
        }
        if (name != null) {
            sb.append(", ").append(name);
        }
        if (action != null) {
            sb.append(" is ").append(action);
        }
        if (excited) {
            sb.append(".").append("!");
        }
        else {
            sb.append(".");
        }
        return sb.toString();
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String greeting = scanner.nextLine();
        String name = scanner.nextLine();
        String action = scanner.nextLine();
        boolean excited = Boolean.parseBoolean(scanner.nextLine());
        
        if (greeting.equals("null")) greeting = null;
        if (name.equals("null")) name = null;
        if (action.equals("null")) action = null;
        
        System.out.println(buildMessage(greeting, name, action, excited));
    }
}
