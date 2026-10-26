class Counter {
    // TODO: Crie uma variável estática privada para rastrear o total de instâncias
    private static int total;

    // TODO: Crie uma variável de instância privada 'id' para um identificador único
    private int id;

    // TODO: Crie um construtor que:
    // - Incremente a contagem total
    // - Atribua a contagem atual como o id desta instância
    public Counter() {
        total += 1;
        this.id = total;
    }
    
    // TODO: Crie um método getId() que retorne o id único deste contador
    public int getId() {
        return this.id;
    }
    
    // TODO: Crie um método estático getTotalCount() que retorne o total de objetos Counter criados
    public static int getTotalCount() {
        return total;
    }
}
