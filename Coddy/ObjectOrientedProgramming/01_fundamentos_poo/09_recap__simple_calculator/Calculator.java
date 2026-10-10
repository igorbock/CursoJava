public class Calculator {
    // TODO: Criar campos privados:
    // - name (String)
    // - memory (double)
    // - operationCount (int)
    private String name;
    private  double memory;
    private int operationCount;
    
    // TODO: Criar um construtor com o parâmetro name
    // Definir name, memory = 0, operationCount = 0
    // Usar a palavra-chave 'this'
    public Calculator(String name) {
        this.name = name;
        this.memory = 0;
        this.operationCount = 0;
    }
    
    // TODO: Criar um construtor padrão
    // Encadear para o outro construtor com name = "Default"
    public Calculator()
    {
        this("Default");
    }
    
    // TODO: Criar getters: getName(), getMemory(), getOperationCount()
    public String getName() {
        return this.name;
    }
    public double getMemory() {
        return this.memory;
    }
    public int getOperationCount() {
        return this.operationCount;
    }
    
    // TODO: Criar add(double a, double b) - retorna a soma
    // Armazenar o resultado em memory, incrementar operationCount
    public double add(double a, double b) {
        this.memory = a + b;
        this.operationCount += 1;
        return this.memory;
    }
    
    // TODO: Criar subtract(double a, double b) - retorna a diferença
    // Incrementar operationCount
    public double subtract(double a, double b) {
        this.operationCount += 1;
        return a - b;
    }
    
    // TODO: Criar multiply(double a, double b) - retorna o produto
    // Incrementar operationCount
    public double multiply(double a, double b) {
        this.operationCount += 1;
        return a * b;
    }
    
    // TODO: Criar divide(double a, double b) - retorna o quociente
    // Retornar 0 se b for 0, incrementar operationCount
    public double divide(double a, double b) {
        this.operationCount += 1;
        if (b == 0) {
            return 0;
        } else {
            return a / b;
        }
    }
    
    // TODO: Criar power(double base, double exponent) - retorna base^exponent
    // Usar Math.pow(), incrementar operationCount
    public double power(double base, double exponent) {
        this.operationCount += 1;
        return Math.pow(base, exponent);
    }
}