
public class YourFirstAccount {

    public static void main(String[] args) {
        
        
        Account tonisAccount = new Account ("Toni´s account", 100);
        
        System.out.println("Initial state: " + tonisAccount);
        
        tonisAccount.deposit(20);
        System.out.println("The balance of Toni´s Account is now: " + tonisAccount);        

    }
}
