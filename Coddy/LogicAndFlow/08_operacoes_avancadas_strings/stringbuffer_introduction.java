// Crie um método chamado modifyText que recebe três argumentos:

// Uma String (text) para modificar
// Uma String (target) para encontrar
// Uma String (replacement) pela qual substituir o target
// O método deve:

// Criar um StringBuffer com o texto de entrada
// Substituir a primeira ocorrência de target por replacement
// Adicionar um ponto de exclamação ao final
// Retornar a string final
// As mensagens de retorno devem ser:

// Se qualquer entrada for null: retornar "Invalid input"
// Se o target não for encontrado: retornar o texto original com um ponto de exclamação
// Para uma operação bem-sucedida: retornar o texto modificado

import java.util.Scanner;

public class stringbuffer_introduction {
    public static String modifyText(String text, String target, String replacement) {
        // Escreva seu código aqui
        if (text == null || target == null || replacement == null) {
            return "Invalid input";
        }
        StringBuffer sb = new StringBuffer(text);
        int index = sb.indexOf(target);
        if (index != -1) {
            sb.replace(index, index + target.length(), replacement);
        }
        sb.append("!");
        return sb.toString();
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String target = scanner.nextLine();
        String replacement = scanner.nextLine();
        
        if (text.equals("null")) text = null;
        if (target.equals("null")) target = null;
        if (replacement.equals("null")) replacement = null;
        
        System.out.println(modifyText(text, target, replacement));
    }
}
