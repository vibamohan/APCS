import java.util.*;
import javax.swing.*;

public class Runner {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter 1 for day or 2 for night:");
    int dayChoice = sc.nextInt();
    boolean isDay = (dayChoice == 1);

    System.out.println("Enter weather: 1 for sunny, 2 for cloudy, 3 for rainy:");
    int weatherChoice = sc.nextInt();
    String weather =
        switch (weatherChoice) {
          case 1 -> "sunny";
          case 2 -> "cloudy";
          case 3 -> "rainy";
          default -> "sunny";
        };

    JFrame frame = new JFrame("Eiffel Tower Scenery");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.add(new Scenery(isDay, weather));
    frame.pack();
    frame.setVisible(true);
  }
}
