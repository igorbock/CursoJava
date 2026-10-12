Complete a classe Ticket para uma bilheteria de shows. Cada ingresso tem um nome de evento e um preço base que ficam bloqueados para sempre assim que o ingresso é criado, e cada ingresso adiciona uma taxa de serviço fixa de 2 que nunca pode mudar. Somente o número de ingressos vendidos pode aumentar depois.

O construtor armazena o nome do evento e o preço base
sell(int count) adiciona count ao número de ingressos vendidos e retorna "Sold " + count + " tickets"
totalRevenue() retorna (basePrice + serviceFee) * ticketsSold