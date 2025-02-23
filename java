Prob 1 : Write a program that takes an integer, then a string, then a char from the user and prints them in the screen.
  ans:
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int integer = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        String string = scanner.nextLine();
        char character = scanner.next().charAt(0);
        
        System.out.println(integer);
        System.out.println(string);
        System.out.println(character);
        
        scanner.close();
    }
}
