package Problem1Exception;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ShoppingCart {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int quantity = 0;
        boolean isValid = false;

        while (!isValid) {
            try {
                System.out.print("Enter quantity of items to add (1-50): ");
                quantity = sc.nextInt();

                if (quantity < 1 || quantity > 50) {
                    throw new IllegalArgumentException("Wrong value, try with an int between 1 and 50.");
                }

                isValid = true;
                System.out.println("Successfully added " + quantity + " items to your cart!");

            } catch (InputMismatchException e) {
                System.out.println("Invalid input! Please enter a whole number.");
                sc.next();
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }

        sc.close();
    }
}