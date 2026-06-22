import java.util.Scanner;

public class recap_validation_function {
    public static boolean is_valid(String username, String password) {
        // Write your code below
        if (username.equals("user")) {
            if (password.equals("qweasd")) {
                return true;
            }
        }
        else if (username.equals("admin")) {
            return true;
        }

        return false;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String user = scanner.nextLine();
        String pass = scanner.nextLine();
        boolean res = is_valid(user, pass);
        System.out.println(res);

        scanner.close();
    }
}
