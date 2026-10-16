Complete a classe Pallet para um armazém. O armazém tem uma capacidade fixa de 100 caixas compartilhada por todos os pallets e uma contagem compartilhada das caixas armazenadas atualmente. Cada pallet também rastreia seu próprio id e quantas caixas ele contém.

O construtor armazena o id e as caixas e adiciona essas caixas ao espaço compartilhado utilizado
remove(int count) retira count caixas deste pallet e do espaço compartilhado utilizado e, em seguida, retorna "Removed " + count + " boxes from " + id
O método estático getRemainingCapacity() retorna a capacidade do armazém menos o espaço compartilhado utilizado