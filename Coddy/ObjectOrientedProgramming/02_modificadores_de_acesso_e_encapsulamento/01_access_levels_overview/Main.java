import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Ler as entradas
        String studentId = scanner.nextLine();
        String name = scanner.nextLine();
        int grade = Integer.parseInt(scanner.nextLine());
        String school = scanner.nextLine();
        
        // TODO: Criar um objeto Student com os valores de entrada
        Student student = new Student(studentId, name, grade, school);
        
        // TODO: Imprimir o campo school diretamente (acessível porque é public)
        System.out.println(student.school);
        
        // TODO: Imprimir o resultado de getInfo() para mostrar todas as informações do estudante
        System.out.println(student.getInfo());
        
    }
}
