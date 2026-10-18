class StringUtils {
    // TODO: Crie um método estático countVowels que recebe uma String
    // e retorna a contagem de vogais (a, e, i, o, u - sem diferenciar maiúsculas de minúsculas)
    public static int countVowels(String word) {
        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            char letter = Character.toLowerCase(word.charAt(i));
            if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') {
                count++;
            }
        }
        return count;
    } 
    
    // TODO: Crie um método estático reverse que recebe uma String
    // e retorna a versão invertida dela
    public static String reverse(String word) {
        StringBuilder reversed = new StringBuilder(word);
        return reversed.reverse().toString();
    }
    
    
    // TODO: Crie um método estático isPalindrome que recebe uma String
    // e retorna true se ela for lida da mesma forma de frente para trás e de trás para frente
    // (comparação sem diferenciar maiúsculas de minúsculas)
    public static boolean isPalindrome(String word) {
        String reversed = reverse(word);
        return word.equalsIgnoreCase(reversed);
    }
    
}
