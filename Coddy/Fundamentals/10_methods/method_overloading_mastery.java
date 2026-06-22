// Crie um programa que calcula a área de diferentes formas usando sobrecarga de métodos. 
// Crie três versões de um método chamado calculateArea:

// Método que calcula a área de um quadrado:
// Recebe um parâmetro inteiro (comprimento do lado)
// Retorna a área como um inteiro
// Exemplo: calculateArea(5) retorna 25
// Método que calcula a área de um retângulo:
// Recebe dois parâmetros inteiros (comprimento e largura)
// Retorna a área como um inteiro
// Exemplo: calculateArea(4, 6) retorna 24
// Método que calcula a área de um círculo:
// Recebe um parâmetro double (raio)
// Retorna a área como um double (use 3.14 para pi)
// Exemplo: calculateArea(2.5) retorna 19.625
// Cada método deve imprimir seu cálculo neste formato:

// Square area with side 5: 25
// Rectangle area with length 4 and width 6: 24
// Circle area with radius 2.5: 19.625

public class method_overloading_mastery {

    public static int calculateArea(int x) {
        return x * x;
    }

    public static int calculateArea(int x, int y) {
        return x * y;
    }

    public static double calculateArea(double x) {
        return 3.14 * (x * x);
    }

    public static void main(String[] args) {
        // Test your methods with these exact values
        int a = calculateArea(5);           // square
        int b = calculateArea(4, 6);     // rectangle
        double c = calculateArea(2.5);     // circle

        System.out.printf("Square area with side 5: %d\n", a);
        System.out.printf("Rectangle area with length 4 and width 6: %d\n", b);
        System.out.printf("Circle area with radius 2.5: %.3f\n", c);
    }
}
