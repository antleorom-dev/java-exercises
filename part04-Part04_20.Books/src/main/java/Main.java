import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Book> informationList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        while (true){
            
            System.out.println("Title: ");
            String title = scanner.nextLine();
            
            if(title.isEmpty()){
                break;
            }
            
            System.out.println("Pages: ");
            int pages = Integer.valueOf(scanner.nextLine());
            
            System.out.println("Publication year: ");
            int publicationYear = Integer.valueOf(scanner.nextLine());
            
            System.out.println();
            
            informationList.add(new Book(title, pages, publicationYear));
            
        }
            
        System.out.println("What information will be printed?");
        String userRequest = scanner.nextLine();
        
        for(Book information : informationList){
            if(userRequest.equalsIgnoreCase("everything")){
                System.out.println(information);
            }
            
            if(userRequest.equalsIgnoreCase("name")){
                System.out.println(information.getTitle());
            }
        
        }       
        
    }
}
