# Getters e Setters

Getters e setters são métodos que fornecem acesso controlado a campos privados. Um **getter** recupera o valor de um campo, enquanto um **setter** o modifica.

A convenção de nomenclatura segue um padrão comum: prefixo **`get`** ou **`set`** seguido pelo nome do campo com a primeira letra em maiúscula.

```java
public class Product {
    private String name;
    private double price;

    // Getter para name
    public String getName() {
        return name;
    }

    // Setter para name
    public void setName(String name) {
        this.name = name;
    }

    // Getter para price
    public double getPrice() {
        return price;
    }

    // Setter com validação
    public void setPrice(double price) {
        if (price >= 0) {
            this.price = price;
        }
    }
}
```

O verdadeiro poder dos setters é a capacidade de adicionar lógica de validação. No exemplo acima, **`setPrice`** aceita apenas valores não negativos, protegendo o objeto de dados inválidos.

Para campos **`boolean`**, getters normalmente usam o prefixo **`is`** em vez de **`get`**:

```java
private boolean active;

public boolean isActive() {
    return active;
}
```

Você também pode criar campos de apenas leitura fornecendo apenas um getter, ou campos de apenas escrita fornecendo apenas um setter. Isso lhe dá um controle refinado sobre como o código externo interage com os dados do seu objeto.