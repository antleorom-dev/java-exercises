
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // implement here a program, that first reads user input
        ArrayList<Integer> list = new ArrayList<>();

        while (true) {
            int number = Integer.valueOf(scanner.nextLine());
            if (number == -1) {
                break;
            }

            list.add(number);

        }
        int sum = 0;
        for (int num : list) {
            sum += num;
        }

        double average = 1.0 * sum / list.size();
        System.out.println("Average: " + average);
    }
}
