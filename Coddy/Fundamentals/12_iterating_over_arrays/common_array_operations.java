import java.util.Scanner;

public class common_array_operations {
    public static double[] calculateStats(int[] arr) {
        // Write your code here
        double sum = 0;
        for (double number : arr) {
            sum += number;
        }
        double average = sum / arr.length;
        double max = arr[0];
        double min = arr[0];
        for (double number : arr) {
            if (number > max) {
                max = number;
            }
            if (number < min) {
                min = number;
            }
        }
        return new double[]{sum, average, max, min};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String[] arrString = text.split(",");
        int[] numbers = new int[arrString.length];
        for (int i = 0; i < arrString.length; i++) {
           numbers[i] = Integer.parseInt(arrString[i]);
        }
        double[] stats = calculateStats(numbers);
        System.out.println("Sum: " + stats[0]);
        System.out.println("Average: " + stats[1]);
        System.out.println("Maximum: " + stats[2]);
        System.out.println("Minimum: " + stats[3]);
        scanner.close();
    }
}
