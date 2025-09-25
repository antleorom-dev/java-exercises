
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String longestName = "";
        int totalYears = 0;
        int count = 0;

        while (true) {

            String input = scanner.nextLine();
            if (input.isEmpty()) {
                break;
            }

            String[] pieces = input.split(",");
            
            String name = pieces[0];
            int year = Integer.valueOf(pieces[1]);
            
            if (name.length() > longestName.length()){
                longestName = name;
            }
            
            totalYears += year;
            count++;            
        }
            
        double average = (double) totalYears / count;
       
        System.out.println("Longest name: " + longestName);
        System.out.println("Average of the birth years: " + average);
        
    }
}
