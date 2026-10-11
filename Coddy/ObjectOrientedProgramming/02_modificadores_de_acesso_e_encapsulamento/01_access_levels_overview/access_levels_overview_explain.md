# Visão Geral dos Níveis de Acesso

Modificadores de acesso controlam de onde campos e métodos podem ser acessados. O Java possui quatro níveis de controle de acesso.

| Modificador | Mesma Classe | Mesmo Pacote | Subclasse | Em qualquer lugar |
|---|---|---|---|---|
| `private` | Sim | Não | Não | Não |
| default (sem palavra-chave) | Sim | Sim | Não | Não |
| `protected` | Sim | Sim | Sim | Não |
| `public` | Sim | Sim | Sim | Sim |

```java
public class BankAccount {
    private double balance;      // Apenas esta classe
    String accountType;          // Padrão: apenas o mesmo pacote
    protected String owner;      // Mesmo pacote + subclasses
    public String bankName;      // Acessível em qualquer lugar
}
```

**`private`** é o mais restritivo — use-o para dados internos que nunca devem ser acessados diretamente. **`public`** é o mais aberto — use-o para métodos que outras classes precisam chamar.

Quando você não especifica nenhum modificador, o Java usa o acesso **padrão** (também chamado de acesso privado do pacote). Isso permite acesso somente dentro do mesmo pacote.

```java
class Helper {        // Classe de acesso padrão
    void assist() {}  // Método de acesso padrão
}
```

Escolha o nível de acesso mais restritivo que ainda permita que seu código funcione. Isso protege seus dados e torna seu código mais fácil de manter.