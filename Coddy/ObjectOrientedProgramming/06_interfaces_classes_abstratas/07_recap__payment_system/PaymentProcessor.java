// TODO: Crie uma classe PaymentProcessor

class PaymentProcessor {
    // TODO: Implemente o método processPayment
    // Deve aceitar um objeto Payable e um valor double
    // Chame o método pay do método de pagamento e retorne o resultado
    public String processPayment(Payable payable, double amount) {
        return payable.pay(amount);
    }
}
