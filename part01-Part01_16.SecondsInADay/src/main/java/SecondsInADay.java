
import java.util.Scanner;

public class SecondsInADay {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many days would you like to convert to seconds?");
        int integer = Integer.valueOf(scanner.nextLine());
        int calculation = integer * 86400;
        System.out.println(calculation);
        
        
    }
}
