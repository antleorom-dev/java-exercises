
import java.util.ArrayList;
import java.util.Scanner;
import java.util.jar.Attributes.Name;

public class Items {

    public static void main(String[] args) {
        // implement here your program that uses the class Item
        ArrayList<Item> items = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
            
            while (true){
                
                System.out.println("Enter a name. Empty name will stop:");
                String name = scanner.nextLine();
                if (name.isEmpty()){
                    break;
                }
                
                items.add(new Item(name));
                
            }
            
                System.out.println();
                for (Item item : items){
                    System.out.println(item);
                    
                }

    }
}
