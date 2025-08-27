import java.util.Scanner;

public class Age {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age;
        System.out.println("Please enter your birth year: ");
        int year = sc.nextInt();
        age = 2025 - year;

        System.out.println("Please enter your birth month (as a number): ");
        int month = sc.nextInt();

        if(month > 8) {
            age = age - 1;
        }
        
        System.out.println("You are " + age + " years old.");
    }
}
