// TODO: Crie uma classe CreditCard que implementa Payable

class CreditCard implements Payable {
    // TODO: Adicione um campo cardNumber (String) para os últimos 4 dígitos
    private String cardNumber;

    // TODO: Crie um construtor para inicializar cardNumber
    public CreditCard(String cardNumber) {
        this.cardNumber = cardNumber;
    }
    
    // TODO: Implemente o método pay
    // Return format: "Paid [amount] using Credit Card ending in [cardNumber]"
    // Lembre-se de formatar amount com duas casas decimais
    public String pay(double amount) {
        return "Paid " + String.format("%.2f", amount) + " using Credit Card ending in " + this.cardNumber;
    }
}
