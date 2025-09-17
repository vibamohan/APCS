import java.util.Scanner;

public class Formulas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. volume of a sphere");
        System.out.println("2. 60-30-90");
        System.out.println("3. pythagorean");
        System.out.println("4. arithmetic term");
        System.out.println("5. distance formula");
        String choice = sc.next();

        
        if (choice.equals("1")) {
            System.out.println("volume of a sphere");
            System.out.println("what is the radius?");
            double radius = sc.nextDouble();
            double pi = 3.14;
            double volume = (4.0/3.0)*pi*radius*radius*radius;
            System.out.println("volume is  " + volume);
        } else if (choice.equals("2")) {
            System.out.println("60-30-90 triangle");
            System.out.println("what is the value of the short leg?");
            double shortleg = sc.nextDouble();
            double longleg = Math.sqrt(3.0) * shortleg;
            System.out.println("long leg is " + longleg);
            double hypotenuse = shortleg * 2.0;
            System.out.println("hypotenus is " +hypotenuse);
        } else if (choice.equals("3")) {
            System.out.println("pythagorean therom");
            System.out.println("what is the value of one of the legs?");
            double leg1 = sc.nextDouble();
            System.out.println("what is the value of the other leg?");
            double leg2 = sc.nextDouble();
            double hyp = Math.sqrt(leg2 * leg2 + leg1 * leg1);
            System.out.println("hypotenuse is " + hyp);
            
        }
        
        else if (choice.equals("4")) {
            System.out.println("\n Arithmetic term calculator");
            System.out.print("What is the first term: ");
            double a = sc.nextDouble();
            System.out.print("What is the common difference: ");
            double commonDiff = sc.nextDouble();
            System.out.print("What term would you like to calculate: ");
            double term = sc.nextDouble();

            double ans = a + commonDiff * (term - 1);
            System.out.println();
            System.out.println("Term " + term + " is " + term);
        }
        // formula 5
        else if (choice.equals("5")) {
            System.out.println("\n Distance calculator");
            System.out.print("What is x1: ");
            double x1 = sc.nextDouble();
            System.out.print("What is y1: ");
            double y1 = sc.nextDouble();
            System.out.print("What is x2: ");
            double x2 = sc.nextDouble();
            System.out.print("What is y2: ");
            double y2 = sc.nextDouble();

            double ans = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
            System.out.println();
            System.out.println("Distance between your 2 points was " + ans);
        }
        // should never happen
        else {
            System.out.println("No formula matched given input, please enter a number from 1 to 5");
        }


    }
}