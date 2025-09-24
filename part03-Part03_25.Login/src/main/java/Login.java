
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Enter a username:");
        String name = reader.nextLine();
        System.out.println("Enter a password:");
        String password = reader.nextLine();

        String savedname = "alex";
        String savedpass = "sunshine";
        String savedname2 = "emma";
        String savedpass2 = "haskell";

        if ((name.equals(savedname) && password.equals(savedpass)) || (name.equals(savedname2) && password.equals(savedpass2))) {
            System.out.println("You have successfully logged in!");
        } else {
            System.out.println("Incorrect username or password!");
        }

    }
}
