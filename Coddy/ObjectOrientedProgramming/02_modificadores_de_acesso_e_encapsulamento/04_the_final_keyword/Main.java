import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Leia as entradas
        String studentId = scanner.nextLine();
        String name = scanner.nextLine();
        int enrollmentYear = scanner.nextInt();
        scanner.nextLine(); // consuma a quebra de linha
        String newName = scanner.nextLine();
        
        // TODO: Crie um objeto Student com os valores iniciais
        Student student = new Student(studentId, name, enrollmentYear);
        
        // TODO: Imprima as informações do estudante antes da alteração do nome
        System.out.println(student.getInfo());
        
        // TODO: Atualize o nome do estudante usando o setter
        student.setName(newName);
        
        // TODO: Imprima as informações do estudante após a alteração do nome
        System.out.println(student.getInfo());
    }
}
