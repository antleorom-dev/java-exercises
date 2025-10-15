
public class Program {

    public static void main(String[] args) {
        // This is simply an empty main method where you are
        // free to experiment with your Book class.
        // An example that you can use for testing:
        Book HarryPotter = new Book("JKRowling","Harry Potter", 223);
        
        System.out.println(HarryPotter.getAuthor());
        System.out.println(HarryPotter.getName());
        System.out.println(HarryPotter.getPages());
        System.out.println(HarryPotter.toString());
//        Book b = new Book("J. K. Rowling", "Harry Potter and the Sorcerer's Stone", 223);
//        System.out.println(b);

    }
}
