
import java.util.Scanner;

public class Password {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Password?");
        String pass = reader.nextLine();
        
        if (pass.equals("Caput Draconis")){
            System.out.println("Welcome!");
        } else if (pass.equals("Wattlebird")){
            System.out.println("Off with you!");
        }
        
        



    }
}
