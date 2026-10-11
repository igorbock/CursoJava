class Password {
    // TODO: Declarar campo privado para armazenar a senha
    private String password;

    // TODO: Declarar campo privado para o requisito de comprimento mínimo
    private int minLength;

    // TODO: Criar construtor que recebe o requisito de comprimento mínimo
    public Password(int minLength) {
        this.minLength = minLength;
    }
    
    // TODO: Criar método setPassword que valida e define a senha
    // Retornar true se a senha atender ao comprimento mínimo, false caso contrário
    public boolean setPassword(String password) {
        int length = password.length();
        if (length >= minLength) {
            this.password = password;
            return true;
        } else {
            this.password = "";
            return false; 
        }
    }
    
    // TODO: Criar método getMaskedPassword que retorna asteriscos em vez da senha real
    // Nunca exponha a senha real!
    public String getMaskedPassword() {
        int length = this.password.length();
        return "*".repeat(length);
    }
    
    // TODO: Criar método checkPassword que compara a tentativa com a senha armazenada
    public boolean checkPassword(String password) {
        if (getLength() == 0) {
            return false;
        }
        if (password.equals(this.password)) {
            return true;
        } else {
            return false;
        }
    }
    
    // TODO: Criar método getLength que retorna o comprimento da senha (ou 0 se não estiver definida)
    public int getLength() {
        if (this.password == null) {
            return 0;
        }
        return this.password.length();
    }
}
