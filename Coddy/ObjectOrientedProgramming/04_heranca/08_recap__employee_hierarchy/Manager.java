// Classe Manager que estende Employee
class Manager extends Employee {
    // TODO: Declare um campo para teamSize (int)
    private int teamSize;

    // TODO: Crie um construtor que receba name, salary e teamSize
    // Use super() para inicializar os campos da classe pai
    public Manager(String name, double salary, int teamSize) {
        super(name, salary);
        this.teamSize = teamSize;
    }

    // TODO: Sobrescreva o método work() para imprimir: "[name] is managing a team of [teamSize]"
    @Override
    public void work() {
        System.out.println(super.getName() + " is managing a team of " + this.teamSize);
    }

    // TODO: Crie o método getManagerDetails() que retorna:
    // "Manager: [name] earns $[salary], Team size: [teamSize]"
    // Use String.format("%.2f", salary) para formatação
    public String getManagerDetails() {
        return String.format("Manager: %s earns $%.2f, Team size: %d", super.getName(), super.getSalary(), this.teamSize);
    }
}
