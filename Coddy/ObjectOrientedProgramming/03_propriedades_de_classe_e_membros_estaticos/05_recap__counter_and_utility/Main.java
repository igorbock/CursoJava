import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int count = scanner.nextInt();
        
        // TODO: Use os métodos estáticos de MathUtils para calcular e imprimir:
        // - Square: [value]
        // - Cube: [value]
        // - Circle area (radius=[number]): [value] (formatado para 2 casas decimais)
        int squareValue = MathUtils.square(number);
        int cubeValue = MathUtils.cube(number);
        double circleValue = MathUtils.circleArea(number);
        System.out.println("Square: " + squareValue);
        System.out.println("Cube: " + cubeValue);
        System.out.println("Circle area (radius=" + number + "): " + String.format("%.2f", circleValue));
        
        // TODO: Crie a quantidade 'count' de objetos Counter
        // Para cada Counter criado, imprima: Counter [id] created
        for (int i = 0; i < count; i++) {
            Counter counter = new Counter();
            System.out.println("Counter " + counter.getId() + " created");
        }
        
        // TODO: Imprima o número total de contadores criados
        // Total counters: [count]    
        System.out.println("Total counters: " + Counter.getTotalCount());
    }
}
