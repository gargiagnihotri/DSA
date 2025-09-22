import java.util.Scanner;  // needed for user input

public class sum {
    public static void main(String[] args) {
        // Create a Scanner object for reading input
        Scanner sc = new Scanner(System.in);

        // Ask for name
        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        // Ask for two numbers
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        // Calculate sum
        int sum = num1 + num2;

        // Print results
        System.out.println("\nHello " + name + "!");
        System.out.println("The sum of " + num1 + " and " + num2 + " is " + sum);
        sc.close();
    }
}