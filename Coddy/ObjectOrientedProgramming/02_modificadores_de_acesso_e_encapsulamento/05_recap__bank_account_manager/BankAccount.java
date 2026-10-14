class BankAccount {
    // TODO: Declare um número de conta imutável (final)
    private final String accountNumber;

    // TODO: Declare um saldo privado inicializado com 0.0
    private double balance = 0.0;
    
    // TODO: Declare um nome de proprietário privado
    private String ownerName;
    
    // TODO: Crie um construtor que receba accountNumber e ownerName
    public BankAccount(String accountNumber, String ownerName) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
    }
    
    // TODO: Crie um getter para o número da conta
    public String getAccountNumber() {
        return this.accountNumber;
    }
    
    // TODO: Crie um getter para o nome do proprietário
    public String getOwnerName() {
        return this.ownerName;
    }
    
    // TODO: Crie um getter para o saldo
    public double getBalance() {
        return this.balance;
    }
    
    // TODO: Crie um método de depósito que retorne true se o valor for positivo, false caso contrário
    // Adicione ao saldo apenas se o valor for positivo
    public boolean setBalance(double amount) {
        if (amount > 0) {
            this.balance += amount;
            return true;
        } else {
            return false;
        }
    }
    
    // TODO: Crie um método de saque que retorne true se o valor for positivo E se existirem fundos suficientes
    // Subtraia do saldo apenas se as condições forem atendidas
    public boolean withdraw(double amount) {
        if (amount > 0 && this.balance >= amount) {
            this.balance -= amount;
            return true;
        } else {
            return false;
        }
    }
    
    // TODO: Crie o método getAccountSummary
    // Formato de retorno: "Account [accountNumber] | Owner: [ownerName] | Balance: $[balance]"
    // Use String.format("%.2f", balance) para formatar o saldo com 2 casas decimais
    public String getAccountSummary() {
        return "Account " + this.accountNumber + " | Owner: " + this.ownerName + " | Balance: $" + String.format("%.2f", this.balance);
    }
}
