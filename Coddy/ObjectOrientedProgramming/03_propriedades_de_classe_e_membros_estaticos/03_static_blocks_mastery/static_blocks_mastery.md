Complete a classe PriceTable, que usa três blocos estáticos para criar uma lista de preços de assinatura uma única vez, quando a classe é carregada. Cada bloco depende dos valores definidos pelo bloco anterior.

O primeiro bloco estático exibe "Loading price table...", define totalTiers como 4 e cria tierPrices como um array desse tamanho
O segundo bloco estático preenche tierPrices para que o nível i (começando em 1) custe i * 25 e, em seguida, exibe "Price table ready"
O terceiro bloco estático define cheapestPrice como a primeira entrada de tierPrices
priceForTier(int tier) retorna tierPrices[tier - 1]