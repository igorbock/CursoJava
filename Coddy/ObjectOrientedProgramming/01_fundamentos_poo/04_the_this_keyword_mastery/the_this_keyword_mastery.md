Uma Wallet tem um proprietário e um saldo. Complete a classe para que uma carteira possa transferir dinheiro para outra.

O construtor armazena o proprietário e o saldo inicial
transferTo(Wallet other, double amount) move amount desta carteira para other e, em seguida, retorna owner sent amount to otherOwner
Se amount for maior que o saldo desta carteira, não altere nada e retorne Failed: insufficient funds