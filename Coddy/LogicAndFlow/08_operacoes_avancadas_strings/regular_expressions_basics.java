// Crie um método chamado validateInput que recebe dois argumentos:

// Uma String (text) para validar
// Uma String (type) que especifica o tipo de validação
// O método deve validar o texto com base nestes tipos:

// "number": deve conter apenas dígitos (0-9)
// "word": deve conter apenas letras (a-z ou A-Z)
// "email": deve conter @ e pelo menos um caractere antes dele
// "phone": deve conter exatamente 10 dígitos
// As mensagens de retorno devem ser:

// Se text for null: retorne "Invalid input"
// Se type for inválido: retorne "Invalid type"
// Se a validação passar: retorne "Valid"
// Se a validação falhar: retorne "Invalid"

public class regular_expressions_basics {
    public static String validateInput(String text, String type) {
        // Escreva seu código aqui
        if (text == null) {
            return "Invalid input";
        }
        if (type == null) {
            return "Invalid type";
        }
        
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String type = scanner.nextLine();
        
        if (text.equals("null")) text = null;
        System.out.println(validateInput(text, type));
    }
}
