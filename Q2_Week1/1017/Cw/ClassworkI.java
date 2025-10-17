import java.util.Scanner;

public class ClassworkI {
    public static void main(String[] args) {
        // Loop 1: Count 1 to 12
        for (int i = 1; i <= 12; i++) {
            System.out.print(i + " ");
        }
        System.out.println("\n");

        // Loop 2: Count 5 to 31
        for (int i = 5; i <= 31; i++) {
            System.out.print(i + " ");
        }
        System.out.println("\n");

        // Loop 3: Count 39 to 21 (descending)
        for (int i = 39; i >= 21; i--) {
            System.out.print(i + " ");
        }
        System.out.println("\n");

        // Loop 4: Count 2 to 20 by 2
        for (int i = 2; i <= 20; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println("\n");

        // Loop 5: Count 15 to -10 by 5
        for (int i = 15; i >= -10; i -= 5) {
            System.out.print(i + " ");
        }
        System.out.println("\n");

        Scanner scanner = new Scanner(System.in);

        // Loop 6: Ask user for number > 1 and count from 1 to that number
        System.out.print("Enter a number greater than 1: ");
        int num1 = scanner.nextInt();
        for (int i = 1; i <= num1; i++) {
            System.out.print(i + " ");
        }
        System.out.println("\n");

        // Loop 7: Ask user for number < 10 and count from 50 down
        System.out.print("Enter a number less than 10: ");
        int num2 = scanner.nextInt();
        for (int i = 50; i >= num2; i--) {
            System.out.print(i + " ");
        }
        System.out.println("\n");

        // Loop 8: Ask user for number > 20 and what to count by
        System.out.print("Enter a number greater than 20: ");
        int num3 = scanner.nextInt();
        System.out.print("Enter what to count by: ");
        int step = scanner.nextInt();

        for (int i = 0; i <= num3; i += step) {
            System.out.print(i + " ");
        }
        if (num3 % step != 0 && num3 > 0) {
            // If it doesn't land exactly, end on highest before passing
            System.out.print((num3 / step) * step + " ");
        }
        System.out.println("\n");

        // Loop 9: Ask user for number > 1 and calculate summation
        System.out.print("Enter a number greater than 1 for summation: ");
        int num4 = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i <= num4; i++) {
            sum += i;
        }
        System.out.println("The summation from 1 to " + num4 + " is " + sum);
    }
}
