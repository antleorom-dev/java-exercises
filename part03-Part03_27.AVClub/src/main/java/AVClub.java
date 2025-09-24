
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        while (true) {

            String input = reader.nextLine();

            if (input.isEmpty()) {
                break;
            }

            String[] pieces = input.split(" ");

            for (String word : pieces){
                if(word.contains("av")){
                    System.out.println(word);
                }
            }
            
            
        }

    }
}
