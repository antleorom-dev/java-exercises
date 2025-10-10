
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class NumbersFromAFile {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("File? ");
        String fileName = scanner.nextLine();

        System.out.println("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());

        System.out.println("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());

        int count = 0;

        try ( Scanner fileScanner = new Scanner(Paths.get(fileName))) {

            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();

                if (line.isEmpty()) {
                    continue;
                }

                int number = Integer.valueOf(line);

                if (number >= lowerBound && number <= upperBound) {
                    count++;
                }

            }

            System.out.println("Numbers: " + count);

        } catch (Exception e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }
    }

}
