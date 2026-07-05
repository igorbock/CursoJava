// Crie um verificador de nome de usuário com três métodos que usam métodos de String:

// Crie o método checkLength que:

// Recebe uma String de nome de usuário
// Retorna mensagem no formato:
// Username length: 8
// Long enough: true
// (Suficientemente longo significa comprimento >= 6)

// Crie o método checkStart que:

// Recebe uma String de nome de usuário
// Verifica se começa com "user_" ou "admin_"
// Retorna mensagem no formato:
// Starts with user_: true
// Starts with admin_: false
// Crie o método modifyUsername que:

// Recebe uma String de nome de usuário
// Obtém os primeiros 5 caracteres usando substring
// Converte para maiúsculas
// Retorna mensagem no formato:
// First 5 chars: admin
// Uppercase: ADMIN

public class string_methods_part_1_mastery {
    // Write your methods here
    public static String checkLength(String username) {
        int length = username.length();
        boolean longEnough = length >= 6;
        return "Username length: " + length + "\nLong enough: " + longEnough;
    }

    public static String checkStart(String username) {
        boolean startsWithUser = username.startsWith("user_");
        boolean startsWithAdmin = username.startsWith("admin_");
        return "Starts with user_: " + startsWithUser + "\nStarts with admin_: " + startsWithAdmin;
    }

    public static String modifyUsername(String username) {
        String first5Chars = username.substring(0, 5);
        String uppercase = first5Chars.toUpperCase();
        return "First 5 chars: " + first5Chars + "\nUppercase: " + uppercase;
    }

    public static void main(String[] args) {
        // Test with this username
        String username = "user_123admin";
        
        System.out.println("Length Check:");
        System.out.println(checkLength(username));
        
        System.out.println("\nPrefix Check:");
        System.out.println(checkStart(username));
        
        System.out.println("\nModified Username:");
        System.out.println(modifyUsername(username));
    }
}
