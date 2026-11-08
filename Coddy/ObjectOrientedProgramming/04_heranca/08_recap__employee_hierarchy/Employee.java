// Classe base para todos os funcionários
class Employee {
    // TODO: Declare campos protegidos para name (String) e salary (double)
    private String name;
    private double salary;

    // TODO: Crie um construtor que inicialize name e salary
    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    // TODO: Crie o método getName() que retorna o nome
    public String getName() {
        return this.name;
    }

    // TODO: Crie o método getSalary() que retorna o salário
    public double getSalary() {
        return this.salary;
    }

    // TODO: Crie o método getDetails() que retorna: "[name] earns $[salary]"
    // Use String.format("%.2f", salary) para formatação
    public String getDetails() {
        return String.format("%s earns $%.2f", this.name, this.salary);
    }

    // TODO: Crie o método work() que imprime: "[name] is working"
    public void work() {
        System.out.println(this.name + " is working");
    }
}
