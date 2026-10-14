Vamos criar um sistema de inventário de Book que rastreia tanto os detalhes de cada livro quanto o número total de livros em toda a sua coleção usando variáveis de instância e estáticas.

Você criará dois arquivos para organizar seu código:

Book.java: Crie uma classe Book que rastreie as informações individuais dos livros e também mantenha a contagem de todos os livros já criados:
Uma variável de instância title (String) - exclusiva de cada livro
Uma variável de instância price (double) - exclusiva de cada livro
Uma variável estática totalBooks (int) - compartilhada entre todos os objetos Book, rastreando quantos livros foram criados
Um construtor que recebe o título e o preço e incrementa a contagem total de livros
Um getter getTitle() para o título
Um getter getPrice() para o preço
Um método estático getTotalBooks() que retorna o número total de livros criados
Main.java: Crie vários objetos Book e demonstre como o contador estático rastreia todas as instâncias. Você receberá três títulos de livros e três preços como entradas. Depois de criar os três livros, imprima quatro linhas:
O título e o preço de cada livro no formato: [title]: $[price] (preço formatado com 2 casas decimais)
O número total de livros usando o método estático: Total books: [count]
Você receberá seis entradas na seguinte ordem: title1, price1, title2, price2, title3, price3.

Lembre-se de acessar o método estático por meio do nome da classe (Book.getTotalBooks()), em vez de por meio de uma instância de objeto. Para formatar os preços, use String.format("%.2f", price).