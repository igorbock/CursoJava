Complete a classe StockItem, que mantém sua quantidade e seu preço privados e os expõe somente por meio de métodos.

O construtor armazena o nome, a quantidade e o preço
totalValue() retorna a quantidade multiplicada pelo preço
setPrice(double price) só aplica a alteração e retorna true quando o preço é maior que 0; caso contrário, mantém o preço inalterado e retorna false
sell(int amount) retorna Sold amount e reduz a quantidade quando há estoque suficiente; caso contrário, retorna Out of stock e não altera nada