import java.util.Scanner;

public class MathProblem {
   public static void main(String[] args) {
        // Menu
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a choice ");
        System.out.println("1. Area of a circle");
        System.out.println("2. Volume of a cube");
        System.out.println("3. Volume of a cone");
        System.out.println("4. Pythagorean");
        System.out.println("5. IROC");
        System.out.println();
        System.out.print("-> ");
        int num = sc.nextInt();

        if (num == 1) {
            System.out.println("If the radius of a circle is 3, what is the area?(pi = 3.14)");
            double answer = sc.nextDouble();
            if( answer == 28.26){
                System.out.println("correct");
            } else {
                System.out.println("incorrect");
            }
            

        } else if (num == 2) {
            System.out.println("If the height is 4, the base is 5, and the width is 7, what is the volume of the cube?");
            double answer = sc.nextDouble();
            if( answer == 140){
                System.out.println("correct");
            } else {
                System.out.println("incorrect");
            }
            
            
        } else if (num == 3) {
            System.out.println("If the radius is 7, and the height it 10, what is the volume of the cone?");
            double answer = sc.nextDouble();
            if (answer == 512.866666667) {
                System.out.println("correct");
            } else {
                System.out.println("incorrect");
            }

        } else if (num == 4) {
            System.out.print("If one leg of a right triangle has length 5 and the other has a length 12, what is the hypotenuse: ");
            double answer = sc.nextDouble();
            if (answer == 13) {
                System.out.println("correct!");
            } else {
                System.out.println("incorrect :(");
            }
            
        } else if (num == 5) {
            System.out.print("What is the slope of the line if it has the points (1, 3) and (5, 5) ");
            double answer = sc.nextDouble();
            if (answer == 0.5) {
                System.out.println("correct!");
            } else {
                System.out.println("incorrect :(");
            }
            
        } else {
            // should never happen
            System.out.println("Your choice was not valid");
        }
        
    
        
   } 
}
