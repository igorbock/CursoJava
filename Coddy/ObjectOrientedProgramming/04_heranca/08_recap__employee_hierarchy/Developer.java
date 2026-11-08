// Classe Developer que estende Employee
class Developer extends Employee {
    // TODO: Declare um campo para language (String)
    private String language;
    
    // TODO: Crie um construtor que aceite name, salary e language
    // Use super() para inicializar os campos da classe pai
    public Developer(String name, double salary, String language) {
        super(name, salary);
        this.language = language;
    }

    // TODO: Sobrescreva o método work() para imprimir: "[name] is coding in [language]"
    @Override
    public void work() {
        System.out.println(super.getName() + " is coding in " + this.language);
    }

    // TODO: Crie o método getDeveloperDetails() que retorna:
    // "Developer: [name] earns $[salary], Language: [language]"
    // Use String.format("%.2f", salary) para formatação
    public String getDeveloperDetails() {
        return String.format("Developer: %s earns $%.2f, Language: %s", super.getName(), super.getSalary(), this.language);
    }
}
