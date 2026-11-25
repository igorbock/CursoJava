// TODO: Crie uma classe PayPal que implementa Payable

class PayPal implements Payable {
    // TODO: Adicione um campo email (String)
    private String email;
    
    // TODO: Crie um construtor para inicializar email
    public PayPal(String email) {
        this.email = email;
    }
    
    // TODO: Implemente o método pay
    // Formato de retorno: "Paid [amount] via PayPal account [email]"
    // Lembre-se de formatar amount com duas casas decimais
    public String pay(double amount) {
        return "Paid " + String.format("%.2f", amount) + " via PayPal account " + this.email;
    }
}
