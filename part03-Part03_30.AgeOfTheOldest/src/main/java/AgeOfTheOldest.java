
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true){
        String input = scanner.nextLine();
        
        if (input.isEmpty()){
            break;
        }
        
        String[] pieces = input.split(",");
        
        for (String number : pieces){
            System.out.println(pieces.length - 1);
        }
        
        }

        
        
    }
}
