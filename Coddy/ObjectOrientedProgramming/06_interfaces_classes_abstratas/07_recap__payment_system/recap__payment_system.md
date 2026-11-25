Vamos criar um sistema completo de processamento de pagamentos que reúne tudo o que você aprendeu sobre interfaces neste capítulo. Você criará um sistema flexível no qual diferentes métodos de pagamento podem ser processados uniformemente por meio de uma interface comum.

Você organizará seu código em cinco arquivos:

Payable.java: Defina a interface principal que todos os métodos de pagamento devem implementar. Ela deve declarar um único método pay(double amount) que retorna uma String descrevendo a ação de pagamento.
CreditCard.java: Crie uma classe que implemente Payable e represente pagamentos com cartão de crédito. Um CreditCard tem um campo cardNumber (String) que armazena os últimos 4 dígitos. Inclua um construtor para inicializá-lo. O método pay deve retornar: Paid [amount] using Credit Card ending in [cardNumber]
PayPal.java: Crie outra classe que implemente Payable para pagamentos via PayPal. Uma conta do PayPal tem um campo email (String). Inclua um construtor para inicializá-lo. O método pay deve retornar: Paid [amount] via PayPal account [email]
PaymentProcessor.java: Crie uma classe processadora que possa lidar com qualquer objeto Payable. Ela deve ter um método processPayment(Payable paymentMethod, double amount) que chama o método pay do método de pagamento e retorna o resultado. Isso demonstra como as interfaces permitem o comportamento polimórfico: a processadora não precisa saber qual é o tipo específico de pagamento!
Main.java: Reúna tudo. Você receberá três entradas: um número de cartão (últimos 4 dígitos), um endereço de e-mail e um valor de pagamento. Crie um PaymentProcessor e use-o para processar pagamentos tanto com um CreditCard quanto com uma conta do PayPal para o valor informado. Imprima cada resultado em uma linha separada.
Você receberá três entradas: os últimos 4 dígitos do número do cartão (String), o e-mail do PayPal (String) e o valor do pagamento (double).

Formate os valores com duas casas decimais na saída. Observe como o mesmo PaymentProcessor lida com tipos de pagamento completamente diferentes por meio do poder das interfaces!