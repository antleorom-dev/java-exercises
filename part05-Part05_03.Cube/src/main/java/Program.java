
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give an integer: ");
        int integer = Integer.valueOf(scanner.nextLine());
                Cube cubo = new Cube(integer);

        System.out.println(cubo.volume());
        System.out.println(cubo.toString());
        // Experiment with your program here
    }
}
