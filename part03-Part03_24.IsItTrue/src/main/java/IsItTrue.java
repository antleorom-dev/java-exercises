
import java.util.Scanner;

public class IsItTrue {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        String word = "true";
        System.out.println("Give a string:");
        String palabrita = reader.nextLine();
        
        if (palabrita.equals(word)){
            System.out.println("You got it right!");
        } else {
            System.out.println("Try again!");
        }
        
    }
}
