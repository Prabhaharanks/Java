import java.util.Scanner;

public class NumberProgram {
    public static void main(String[] args) {
      
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double number = scanner.nextDouble();
        scanner.close();
        double doubledNumber = number * 2;

        System.out.println("The doubled number is: " + doubledNumber);
    }
}
