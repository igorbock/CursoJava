Vamos criar uma calculadora de formas que reúne todos os conceitos de polimorfismo que você aprendeu neste capítulo. Você criará uma classe abstrata Shape com subclasses concretas e, em seguida, usará o polimorfismo para calcular e exibir áreas de maneira uniforme.

Você organizará seu código em quatro arquivos:

Shape.java: crie uma classe abstrata que sirva como base para todas as formas. Toda forma tem um campo name (String). Inclua um construtor para inicializá-lo, um método getter getName() e um método abstrato getArea() que retorne um double. Adicione também um método describe() que retorne: [name]: [area] (em que area é formatada com 2 casas decimais usando String.format("%.2f", getArea())).
Circle.java: crie uma classe concreta que estenda Shape. Os círculos têm um campo radius (double). Use super para passar "Circle" como nome. Implemente getArea() para retornar a área usando Math.PI * radius * radius.
Rectangle.java: crie outra classe concreta que estenda Shape. Os retângulos têm os campos width e height (ambos double). Passe "Rectangle" como nome para o construtor da classe pai. Implemente getArea() para retornar width multiplicado por height.
Main.java: crie uma calculadora de formas que demonstre o polimorfismo em ação. Você receberá três entradas: um raio para o círculo, uma largura e uma altura para o retângulo.
Crie um Circle e um Rectangle e, em seguida, armazene-os em um array de referências Shape. Percorra o array e, para cada forma, imprima sua descrição usando o método describe().

Após o loop, calcule e imprima a área total de todas as formas no formato: Total area: [sum] (também formatada com 2 casas decimais). Use um loop separado ou um acumulador para somar as áreas chamando getArea() em cada referência de forma.

Você receberá três entradas: o raio do círculo (double), a largura do retângulo (double) e a altura do retângulo (double).

Sua saída deve exibir três linhas — uma descrição para cada forma, seguida pela área total. Observe como você pode tratar diferentes formas de maneira uniforme por meio do tipo abstrato Shape, enquanto cada forma calcula sua área à sua própria maneira!