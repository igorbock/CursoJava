Complete a classe Ticket, que encadeia quatro construtores sobrecarregados com this() para que nenhuma lógica de atribuição seja repetida.

Ticket(String eventName, double price, boolean vip) é o construtor base que atribui os três campos
Ticket(String eventName, double price) encadeia-se a ele com vip false
Ticket(String eventName) encadeia-se ao construtor de dois parâmetros com o preço 20.0
Ticket() encadeia-se ao construtor de um parâmetro com eventName General Admission
getFinalPrice() retorna price multiplicado por 1.5 quando vip é true; caso contrário, retorna price