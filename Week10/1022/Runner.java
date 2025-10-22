import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Selection s = new Selection();

        System.out.println("Available Zip Codes:");
        System.out.println("94040 - Mountain View");
        System.out.println("94115 - San Francisco");
        System.out.println("95051 - Santa Clara");
        System.out.println("95129 - San Jose");
        System.out.println("94607 - Oakland");
        System.out.println("95035 - Milpitas");
        System.out.println();

        System.out.print("Enter your grade score: ");
        int grade = input.nextInt();
        s.gradeCalculator(grade);

        boolean run = true;
        while (run) {
            System.out.print("\nEnter a zip code: ");
            int zip = input.nextInt();

            String city1 = s.zipCode1(zip);
            String city2 = s.zipCode2(zip);

            System.out.println("Using if-else: " + city1);
            System.out.println("Using switch: " + city2);

            System.out.print("Do you want to continue? (yes/no): ");
            String answer = input.next().toLowerCase();

            if (!answer.equals("yes")) {
                run = false;
            }
        }

        System.out.println("Program ended.");
        input.close();
    }
}
