Vamos criar um sistema de inventário de produtos que exibe informações significativas sobre os itens usando implementações personalizadas de toString(). Você criará uma classe Product que substitui o método padrão toString() para fornecer uma representação clara e legível de cada produto.

Você organizará seu código em dois arquivos:

Product.java: Crie uma classe que represente um item do inventário. Cada Product tem três campos privados: name (String), price (double) e quantity (int). Inclua um construtor que inicialize os três campos. Substitua o método toString() para retornar uma string formatada exatamente neste formato: Product[name=X, price=Y, quantity=Z], em que X, Y e Z são os valores reais dos campos. O preço deve ser exibido como um número simples (não é necessária nenhuma formatação especial).
Main.java: Dê vida à sua classe Product criando e exibindo produtos. Você receberá três entradas: um nome de produto (String), um preço (double) e uma quantidade (int). Crie um Product com esses valores e, em seguida, simplesmente imprima o objeto do produto diretamente usando System.out.println(). Graças ao seu método toString() substituído, isso exibirá automaticamente as informações formatadas do produto em vez da saída padrão enigmática!
Você receberá três entradas: o nome do produto (String), o preço (double) e a quantidade (int).

Observe como imprimir o objeto diretamente chama automaticamente o seu método toString(). É isso que torna a depuração e o registro de informações muito mais fáceis em aplicações reais!