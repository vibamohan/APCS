import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Profile p1 = new Profile("Emma", 15, "Science", "art", "ice cream");
        Profile p2 = new Profile("John", 67, "History", "reading", "pizza");
        Profile p3 = new Profile("Sam", 69, "Math", "art", "ice cream");

        while (true) {
            // asks the user which profile they wnat to edit and uses a switch to get that profile 
            System.out.println("Which profile do you want to change (0 (to quit), 1, 2, 3): ");
            int choice = scanner.nextInt();
            Profile pc = switch (choice) {
                case 0 -> null;
                case 1 -> p1;
                case 2 -> p2;
                case 3 -> p3;
                default -> p1;
            };

            // uses the sentinel null to exit the program on getting 0
            if (pc == null) {
                System.out.println("Thank you for using the profile program");
                System.exit(0);
            }

            // takes input from the user to update profiles
            System.out.print("enter a name for your profile: ");
            String name = scanner.next();

            System.out.print("\n enter the age: ");
            int age = scanner.nextInt();
            scanner.nextLine();

            System.out.print("\n enter a favorite food (pizza/ice cream): ");
            String food = scanner.nextLine();

            System.out.print("\n enter a favorite subject (math/history/science): ");
            String subject = scanner.next();

            System.out.print("\n enter a favorite hobby (reading/art): ");
            String hobby = scanner.next();

            pc.updateProfile(name, age, subject, hobby, food);
            System.out.println();
            pc.printInfo();
            System.out.println();
        }
    }
}
