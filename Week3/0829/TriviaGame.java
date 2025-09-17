import java.util.Scanner;

public class TriviaGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score = 0;
        
        //q1
        System.out.println("How do you say hello in Spanish?");
        String answer = sc.next();
        if( answer.equals("Hola")){
            score++;
            System.out.println("good job!");  
        } else {
            System.out.println("sorry, wrong answer");
        }

        // q2
        System.out.print("What are the colors in a rainbow in order: ");
        String expectedAns2 = "red orange yellow green blue indigo violet";
        sc.nextLine();
        String userAns2 = sc.nextLine();
        if (userAns2.strip().toLowerCase().equals(expectedAns2)) {
            score++;
            System.out.println("You got it right, nice job!");
        } else {
            System.out.println("The answer was " + expectedAns2);
        }

        // q3
        System.out.println("What year did the first man land on the moon?");
        answer = sc.next();
        if( answer.equals("1969")){
            score = score + 1;
            System.out.println("good job!");
        } else {
            System.out.println("sorry, wrong answer");
        }


        // q4
        System.out.print("What is the smallest country in the world: ");
        String expectedAns4 = "Vatican City";
        sc.nextLine();
        String userAns4 = sc.nextLine();
        if (userAns4.strip().toLowerCase().equals(expectedAns4)) {
            score++;
            System.out.println("You got it right, nice job!");
        } else {
            System.out.println("The answer was " + expectedAns4);
        }

        //q5
        System.out.println("What is the largest planet in our solar system?");
        answer = sc.next();
        if (answer.equals("Jupiter")) {
            score++;
            System.out.println("good job!");
        } else {
            System.out.println("sorry, wrong answer");
        }

        // q6
        System.out.print("what is the next number in the sequence : ");
        String expectedAns6 = "1 4 9 16 25";
        String userAns6 = sc.nextLine();
        if (userAns6.strip().toLowerCase().equals(expectedAns4)) {
            score++;
            System.out.println("You got it right, nice job!");
        } else {
            System.out.println("The answer was " + expectedAns4);
        }

        System.out.println("your score was " + score);
        
    }
}
