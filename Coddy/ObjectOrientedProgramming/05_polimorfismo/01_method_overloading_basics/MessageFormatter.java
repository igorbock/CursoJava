class MessageFormatter {
    
    // TODO: Criar o método format que recebe apenas uma message
    // Deve retornar a message envolvida em colchetes: [message]
    public String format(String message) {
        return "[" + message + "]";
    }
    
    // TODO: Criar o método format que recebe uma message e repeatCount
    // Deve retornar a message repetida repeatCount vezes, separada por espaços
    public String format(String message, int repeatCount) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < repeatCount; i++) {
            result.append(message);
            if (i < repeatCount - 1) {
                result.append(" ");
            }
        }
        return result.toString();
    }
    
    // TODO: Criar o método format que recebe uma message e prefix
    // Deve retornar: prefix: message
    public String format(String message, String prefix) {
        return prefix + ": " + message;
    }

    // TODO: Criar o método format que recebe uma message, prefix, e suffix
    // Deve retornar: prefix: message (suffix)
    public String format(String message, String prefix, String suffix) {
        return prefix + ": " + message + " (" + suffix + ")";
    }

}
