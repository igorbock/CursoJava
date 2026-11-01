Vamos criar um sistema de pedidos de produtos que demonstra o encadeamento de construtores tanto dentro de uma classe quanto em uma hierarquia de herança. Você verá como this() encadeia construtores na mesma classe, enquanto super() encadeia construtores da classe pai.

Você criará três arquivos para organizar seu código:

Product.java: Crie uma classe pai que represente qualquer produto em uma loja. Ela deve ter:
Campos privados para name (String) e price (double)
Um construtor principal que receba name e price, inicialize os campos e exiba: Product constructor: [name]
Um segundo construtor que receba apenas name e encadeie com o construtor principal usando this(name, 0.0) para definir um preço padrão de 0.0
Métodos getName() e getPrice() para acessar os campos
Electronics.java: Crie uma subclasse que estenda Product e adicione informações sobre a garantia:
Um campo privado para warrantyYears (int)
Um construtor principal que receba name, price e warrantyYears — use super(name, price) para inicializar a classe pai, depois defina a garantia e exiba: Electronics constructor: [warrantyYears] year warranty
Um segundo construtor que receba apenas name e price, encadeando com o construtor principal por meio de this(name, price, 1) para fornecer uma garantia padrão de 1 ano
Um terceiro construtor que receba apenas name, encadeando com o segundo construtor por meio de this(name, 0.0)
Um método getDetails() que retorne: [name] - $[price] ([warrantyYears] year warranty)
Main.java: Demonstre o encadeamento de construtores em ação. Você receberá três entradas: um nome de produto (String), o preço (double) e os anos de garantia (int). Crie um objeto Electronics usando os três parâmetros e, em seguida, exiba o resultado de getDetails().
Você receberá três entradas: o nome do produto, o preço e os anos de garantia.

Formate o preço em getDetails() para exibir 2 casas decimais usando String.format("%.2f", price). Observe atentamente a saída — você verá as mensagens dos construtores aparecerem em ordem, mostrando como o encadeamento flui da classe pai para a classe filha!