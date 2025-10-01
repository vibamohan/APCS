
import java.util.Scanner;


public class Runner {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Scanner scanner = new Scanner(System.in);
        animal.printInfo();

        System.out.print("Enter a type of animal: ");
        String type = scanner.next();
        System.out.println("Enter an age for that animal: ");
        int age = scanner.nextInt();

        Animal userAnimal = new Animal(type, age);
        userAnimal.printInfo();
    }
}
