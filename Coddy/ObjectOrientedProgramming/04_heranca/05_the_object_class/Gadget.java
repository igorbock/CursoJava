// TODO: Criar a classe Gadget
// Esta classe deve ter:
// - Campos privados: name (String) e year (int)
// - Um construtor que inicializa ambos os campos
// - Métodos getter: getName() e getYear()
// - NÃO sobrescreva nenhum método de Object - queremos o comportamento padrão

class Gadget {
    // TODO: Declarar campos privados
    private String name;
    private int year;

    // TODO: Criar construtor
    public Gadget(String name, int year) {
        this.name = name;
        this.year = year;
    }

    // TODO: Criar métodos getter
    public String getName() {
        return this.name;
    }

    public int getYear() {
        return this.year;
    }
}
