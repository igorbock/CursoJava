// Crie um programa que imprima uma agenda de eventos personalizada. Crie e use estes três métodos:

// Crie um método chamado printHeader() que imprima:

// =================
// Event Schedule
// =================
// Crie um método chamado printEvent() que imprima:

// >> Main Event <<
// Time: 7:00 PM
// Location: Hall A
// Crie um método chamado printFooter() que imprima:

// =================
// Thank You!
// =================
// O programa deve imprimir uma agenda completa chamando estes métodos na ordem correta:

// Cabeçalho primeiro
// Detalhes do evento três vezes
// Rodapé por último

public class declaring_methods_mastery {
    // Write your methods here
    public static void printHeader() {
        System.out.println("=================");
        System.out.println("Event Schedule");
        System.out.println("=================");
    }

    public static void printEvent() {
        System.out.println(">> Main Event <<");
        System.out.println("Time: 7:00 PM");
        System.out.println("Location: Hall A");
    }

    public static void printFooter() {
        System.out.println("=================");
        System.out.println("Thank You!");
        System.out.println("=================");
    }

    public static void main(String[] args) {
        // Call the methods in correct order
        printHeader();
        printEvent();
        printEvent();
        printEvent();
        printFooter();
    }
}
