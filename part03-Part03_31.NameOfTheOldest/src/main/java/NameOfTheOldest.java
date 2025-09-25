
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String oldestName = "";
        int oldestAge = -1;

        while (true) {
            String name = scanner.nextLine();

            if (name.isEmpty()) {
                break;
            }

            String[] pieces = name.split(",");
            String totalName = pieces[0];
            int age = Integer.valueOf(pieces[1]);

            if (age > oldestAge) {
                oldestAge = age;
                oldestName = totalName;

            }

        }

        System.out.println("Name of the oldest: " + oldestName);

    }
}
