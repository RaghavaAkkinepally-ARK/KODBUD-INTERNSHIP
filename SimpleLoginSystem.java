import java.util.Scanner;

public class SimpleLoginSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Dummy credentials
        String correctUsername = "admin";
        String correctPassword = "admin123";

        System.out.print("Enter username: ");
        String username = sc.nextLine();

        System.out.print("Enter password: ");
        String password = sc.nextLine();

        if (username.equals(correctUsername) && password.equals(correctPassword)) {
            System.out.println("Login successful. Welcome, " + username + "!");
        } else {
            System.out.println("Login failed. Invalid username or password.");
        }

        sc.close();
    }
}
