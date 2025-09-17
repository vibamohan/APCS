import java.util.Scanner;
public class Quiz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //menu
        System.out.println("Select an option");
        System.out.println("1. Math");
        System.out.println("2. History");
        System.out.println("3. Art");  
        int subject = sc.nextInt();    
        

        int score = 0;
        if (subject == 1) {
            System.out.println("This is the math section: \n");
            System.out.print("What is the area of a trapezoid with base lengths 3 and 5, and height of 2: ");
            double ans = sc.nextDouble();
            if (ans == 8) {
                score++;
                System.out.println("correct!");
            } else {
                System.out.println("incorrect :(");
            }

            System.out.print("\n If the first numbers of a sequence are 1 2 4 8 16, what is the 7th term: ");
            ans = sc.nextDouble();
            if (ans == 64) {
                score++;
                System.out.println("correct!");
            } else {
                System.out.println("incorrect :(");
            }

            System.out.print("\n The ratio of cats to dogs is 3:5. If there are 15 cats, how many dogs are there: ");
            ans = sc.nextDouble();
            if (ans == 25) {
                score++;
                System.out.println("correct!");
            } else {
                System.out.println("incorrect :(");
            }


        }

        if (subject ==2) {
            System.out.println("This is the history section");
            System.out.println("Who explored the Americas in 1492?");
            String ans = sc.nextLine();
            if( ans.equals("Columbus")) {
                score++;
                System.out.println("correct");
            } else {
                System.out.println("incorrect");
            }

            System.out.println("What was the name of the system used by Spaniards to organize labor in the Americas?");
            ans = sc.nextLine();
            if (ans.equals("Encomienda")) {
                System.out.println("correct");
            } else {
                System.out.println("incorrect");
            }

            System.out.println("What was the name of the first English settlement in Virginia?");
            ans = sc.nextLine();
            if (ans.equals("Jamestown")) {
                score++;
                System.out.println("correct");
            } else {
                System.out.println("incorrect");
            }
        } 
        
        if (subject == 3) {
            System.out.println("This subject is art, where you will guess the image \n");
            System.out.println("        .      *       .        *\n" + //
                                "   *       .        *       .       .\n" + //
                                "      *        *        .        *\n" + //
                                "  *      .      *        .      *\n" + //
                                "      .    *          *       .    \n" + //
                                "     *     .       *       *\n" + //
                                " .        *       .        *      .\n" + //
                                "        *       .       *       .\n" + //
                                "   *   .      *    .   *      .\n" + //
                                "       ~~~    ~~~     ~~~\n" + //
                                "    ~~~~~~~ ~~~~~~~ ~~~~~~~\n" + //
                                "  ~~~~~~~~~~  ~~~~~~~~~ ~~~~~\n" + //
                                "     ||||||      ||||||\n" + //
                                "     ||||||      ||||||\n" + //
                                "     ||||||      ||||||\n" + //
                                "     ||||||      ||||||");
            System.out.println("what is this mostly made of (singular): ");
            String ans = sc.next();
            if (ans.toLowerCase().equals("star")) {
                System.out.println("correct!");
                score++;
            } else {
                System.out.println("incorrect :(");
            }

            System.out.println("         ___     _,.--.,_\n" + //
                                "      .-~   ~--\"~-.   ._ \"-.\n" + //
                                "     /      ./_    Y    \"-. \\\n" + //
                                "    Y       :~     !         Y\n" + //
                                "    lq p    |     /         .|\n" + //
                                " _   \\. .-, l    /          |j\n" + //
                                "()\\___) |/   \\_/\";          !\n" + //
                                " \\._____.-~\\  .  ~\\.      ./\n" + //
                                "            Y_ Y_ . \"vr\"~  T\n" + //
                                "            (  (    |L    j   -Row\n" + //
                                "            [nn[nn..][nn..]\n" + //
                                "        ~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("what animal is this: ");
            ans = sc.next();
            if (ans.strip().toLowerCase().equals("elephant")) {
                System.out.println("correct!");
                score++;
            } else {
                System.out.println("incorrect :(");
            }

            System.out.println("       ___\n" + //
                                "     o|* *|o\n" + //
                                "     o|* *|o\n" + //
                                "     o|* *|o\n" + //
                                "      \\===/\n" + //
                                "       |||\n" + //
                                "       |||\n" + //
                                "       |||\n" + //
                                "       |||\n" + //
                                "    ___|||___\n" + //
                                "   /   |||   \\\n" + //
                                "  /    |||    \\\n" + //
                                " |     |||     |\n" + //
                                "  \\   (|||)   /\n" + //
                                "   |   |||   |\n" + //
                                "  /    |||    \\\n" + //
                                " /     |||     \\\n" + //
                                "/      |||      \\\n" + //
                                "|     [===]     |\n" + //
                                " \\             /\n" + //
                                "  '.         .'\n" + //
                                "    '-------'");
            System.out.print("what type of instrument is this (2 words): ");
            sc.nextLine();
            ans = sc.nextLine();
            if (ans.equals("acoustic guitar")) {
                score++;
                System.out.println("correct!");
            } else {
                System.out.println("incorrect :(");
            }
        }
        System.out.println("Your final score is " + score);

    }
}
