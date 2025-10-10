
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class IsItInTheFile {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String fileName = scanner.nextLine();

        System.out.println("Search for:");
        String searchedFor = scanner.nextLine();
        
        boolean found = false;
        
        try (Scanner fileScanner = new Scanner(Paths.get(fileName))){
        while (fileScanner.hasNextLine()){
            
            String line = fileScanner.nextLine();
            
            if(line.equalsIgnoreCase(searchedFor)){
                found = true;
                break;
            }
            
            
        }
            
        
            if (found){
                System.out.println("Found!");
            } else {
                
                System.out.println("Not found.");
            }
        
        
        } catch (Exception e) {
            System.out.println("Reading the file" + fileName + " failed.");
        }
      

    }
}
