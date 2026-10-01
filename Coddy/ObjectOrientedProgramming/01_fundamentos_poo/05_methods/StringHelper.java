public class StringHelper {
    private String text;
    
    public StringHelper(String text) {
        this.text = text;
    }
    
    // TODO: Crie um método toUpperCase() que retorna this.text em maiúsculas
    // Dica: use this.text.toUpperCase()
    public String toUpperCase() {
        return this.text.toUpperCase();
    }
    
    // TODO: Crie um método getLength() que retorna o comprimento de this.text como um int
    // Dica: use this.text.length()
    public int getLength() {
        return this.text.length();
    }
    
    // TODO: Crie um método contains(String word) que retorna true/false se this.text contém a palavra
    // Dica: use this.text.contains(word)
    public boolean contains(String word) {
        return this.text.contains(word);
    }
    
    // TODO: Crie um método repeat(int times) que retorna this.text repetido 'times' vezes
    // Cada repetição seguida de um espaço
    // Dica: use um loop for e concatenação de strings
    public String repeat(int times) {
        StringBuilder repeatedText = new StringBuilder();
        for (int i = 0; i < times; i++) {
            repeatedText.append(this.text);
            if (i < times - 1) {
                repeatedText.append(" ");
            }
        }
        return repeatedText.toString();
    }
}