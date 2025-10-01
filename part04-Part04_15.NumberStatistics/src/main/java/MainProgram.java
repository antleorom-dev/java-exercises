import java.util.Scanner;

public class MainProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Statistics allNumbers = new Statistics();   // 1º suma de todos
        Statistics evenNumbers = new Statistics();  // 2º suma de pares
        Statistics oddNumbers = new Statistics();   // 3º suma de impares

        System.out.println("Enter numbers:");

        while (true) {
            int number = Integer.valueOf(scanner.nextLine());

            if (number == -1) {
                break; // parar cuando el usuario escriba -1
            }

            // siempre añadimos a todos
            allNumbers.addNumber(number);

            // comprobamos si es par o impar
            if (number % 2 == 0) {
                evenNumbers.addNumber(number);
            } else {
                oddNumbers.addNumber(number);
            }
        }

        // mostramos resultados
        System.out.println("Sum: " + allNumbers.sum());
        System.out.println("Sum of even numbers: " + evenNumbers.sum());
        System.out.println("Sum of odd numbers: " + oddNumbers.sum());
    }
}
