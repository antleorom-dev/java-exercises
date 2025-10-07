
import java.util.ArrayList;
import java.util.Scanner;

public class NumberOfStrings {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<StringList> word = new ArrayList<>();
        
        while (true){
            System.out.println("Give a string:");
            String string = scanner.nextLine();
            
            if(string.equalsIgnoreCase("end")){
                break;
            }
            
            word.add(new StringList(string));
            
            
        }
            
            System.out.println(word.size());
        
    }
}
