
import java.util.ArrayList;

public class Sum {

    public static int sum(ArrayList<Integer> numbers) {
        int total = 0;
        for (int number : numbers) {
            total += number;
        }
        return total;
    }

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(2);
        numbers.add(6);
        numbers.add(-1);
        System.out.println(sum(numbers)); // imprime 10

        numbers.add(5);
        numbers.add(1);
        System.out.println(sum(numbers)); // imprime 16

    }
}
