import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Give me a first name: ");
        String first = sc.next();
        System.out.println("Hello " + first);

        System.out.println("Give me your full name: ");
        sc.nextLine();
        String fullName = sc.nextLine();
        System.out.println("Hi " + fullName);
    }
}
