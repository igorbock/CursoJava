import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Ler as entradas
        String managerName = scanner.nextLine();
        double managerSalary = scanner.nextDouble();
        int teamSize = scanner.nextInt();
        scanner.nextLine(); // consumir a quebra de linha
        String developerName = scanner.nextLine();
        String language = scanner.nextLine();
        
        // O salário do desenvolvedor é fixado em 75000.0
        double developerSalary = 75000.0;
        
        // TODO: Criar um objeto Manager com managerName, managerSalary e teamSize
        Manager manager = new Manager(managerName, managerSalary, teamSize);

        // TODO: Criar um objeto Developer com developerName, developerSalary e language
        Developer developer = new Developer(developerName, developerSalary, language);
        
        // TODO: Imprimir os detalhes do gerente usando getManagerDetails()
        System.out.println(manager.getManagerDetails());
        
        // TODO: Chamar o método work() do gerente
        manager.work();

        // TODO: Imprimir os detalhes do desenvolvedor usando getDeveloperDetails()
        System.out.println(developer.getDeveloperDetails());

        // TODO: Chamar o método work() do desenvolvedor
        developer.work();
    }
}
