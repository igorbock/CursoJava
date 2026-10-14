Vamos criar um sistema completo de BankAccount que reúne tudo o que você aprendeu sobre encapsulamento, modificadores de acesso, getters, setters e a palavra-chave final.

Você criará dois arquivos para organizar seu código:

BankAccount.java: projete uma classe de conta bancária segura que proteja dados financeiros confidenciais:
Um número de conta imutável que nunca pode ser alterado depois que a conta é criada
Um saldo privado que começa em 0.0 e só pode ser modificado por meio de métodos controlados
Um nome do titular privado que pode ser obtido, mas não alterado diretamente
Um construtor que recebe o número da conta e o nome do titular
Um getter para o número da conta
Um getter para o nome do titular
Um getter para o saldo
Um método deposit(double amount) que adiciona ao saldo somente se o valor for positivo, retornando true em caso de sucesso ou false se for rejeitado
Um método withdraw(double amount) que subtrai do saldo somente se o valor for positivo E houver fundos suficientes, retornando true em caso de sucesso ou false se for rejeitado
Um método getAccountSummary() que retorna: "Account [accountNumber] | Owner: [ownerName] | Balance: $[balance]" (saldo formatado com 2 casas decimais)
Main.java: crie uma BankAccount e realize uma série de transações. Você receberá cinco entradas: número da conta, nome do titular, valor do depósito, primeiro valor de saque e segundo valor de saque. Imprima quatro linhas:
O resultado do depósito: Deposit: true ou Deposit: false
O resultado do primeiro saque: Withdraw 1: true ou Withdraw 1: false
O resultado do segundo saque: Withdraw 2: true ou Withdraw 2: false
O resumo final da conta
Você receberá cinco entradas, nesta ordem: accountNumber (String), ownerName (String), depositAmount (double), withdrawAmount1 (double), withdrawAmount2 (double).

Para formatar o saldo com 2 casas decimais, você pode usar String.format("%.2f", balance).